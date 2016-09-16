package services

import javax.inject.{Inject, Singleton}

import play.api.Logger
import models.{Page, _}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.driver.JdbcProfile

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class CandidateRepo @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._


  private class CandidateTable(tag: Tag) extends Table[Candidate](tag, "candidate") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    /** The columns */
    def initialContactDate = column[String]("initialContactDate")

    def firstName = column[String]("firstName")

    def lastName = column[String]("lastName")

    def recruiter = column[String]("recruiter")

    def cv = column[String]("cv")

    def level = column[String]("level")

    def skillSet = column[String]("skillSet")

    def language = column[String]("language")

    def nationality = column[String]("nationality")

    def first = column[String]("first")

    def second = column[String]("second")

    def third = column[String]("third")

    def startdate = column[String]("startdate")

    def notes = column[String]("notes")

    def location = column[String]("location")

    def * = (id.?, initialContactDate, firstName, lastName, recruiter, cv, level, skillSet, language, nationality, first, second, third, startdate, notes, location) <> ((Candidate.apply _).tupled, Candidate.unapply)
  }


  private val candidates = TableQuery[CandidateTable]


  def insert(candidate: Candidate): Future[Candidate] = {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    val insertQuery = candidates returning candidates.map(_.id) into ((p, id) => p.copy(id = Some(id)))
    val action = insertQuery += candidate
    db.run(action)
  }

  def all(): Future[Seq[Candidate]] = {
    db.run(candidates.sortBy(_.initialContactDate).result)
  }

  def findByLocation(location: String): Future[Seq[Candidate]] = {
    // Logger.debug("DEBUG findByLocation -------> = " + location)
    db.run(candidates.filter(_.location === location).result)
  }

  def countByLocation(location: String): Future[Int] = {
    db.run(candidates.filter(_.location === location).length.result)
  }

  def count(): Future[Int] = {
    db.run(candidates.length.result)
  }


  def findById(id: Long): Future[Option[Candidate]] = {
    //Logger.debug("ID = " + id)
    db.run(candidates.filter(_.id === id).result.headOption)
  }

  def delete(id: Long): Future[Int] = {
    val action = candidates.filter(_.id === id).delete
    db.run(action)
  }


  /**
    * Return a page of Candidate .
    *
    * @param page     Page to display
    * @param pageSize Number of Candidates per page
    */
  def list(page: Int = 0, pageSize: Int, city: String): Future[Page[(Candidate)]] = {

    val offset = pageSize * page
    val query = candidates.filter(_.location === city.toLowerCase)
      .drop(offset)
      .take(pageSize)

    for {
      totalRows <- countByLocation(city)
      list = query.result.map { rows => rows.collect { case candidate => candidate } }
      result <- db.run(list)
    } yield Page(result, page, offset, totalRows)

  }
}