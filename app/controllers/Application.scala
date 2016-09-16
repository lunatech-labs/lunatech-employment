package controllers

import javax.inject.Inject

import models.{Candidate}
import play.api.i18n.MessagesApi
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}
import services.CandidateRepo

import scala.concurrent.ExecutionContext

class Application @Inject()(candidateRepo: CandidateRepo, configuration: play.api.Configuration)
                           (implicit ec: ExecutionContext) extends Controller {

  def main = Action {
    print("Hello World!")
    Ok(views.html.index())
  }

  /**
    * A REST endpoint that gets all the candidates as JSON.
    */
  def all() = Action.async {
    candidateRepo.all().map { candidate =>
      Ok(Json.toJson(candidate))
    }
  }

  def editCandidate = Action {
    Ok(views.html.editCandidate("Your new application is ready."))
  }


  /**
    * Display the paginated list of candidates.
    * @param page Current page number (starts from 0)
    */

  def listOfCandidate(page: Int, city: String) = Action.async { implicit r =>

    // Interpretation:- PageSize is total candiadates per page
    val pageSize = 10

   /* INT, INT, STRING -> Future[Seq[T]]
    * Interp. Database call to return list of candidates
    */
    val candidatePageFuture = candidateRepo.list(page, pageSize, city)

    candidatePageFuture.map { candidates =>
      Ok(views.html.candidates(candidates, city))
    }

  }



}
