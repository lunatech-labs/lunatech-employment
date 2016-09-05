
package controllers

import play.api._
import javax.inject._

import models.{Candidate, CandidateData, Recruiter}
import models.Candidate._
import play.api.mvc._


// THIS IS THE MAIN CLASS OF YOUR APPLICATION

@Singleton
class Application @Inject() extends Controller {

  def main = Action {
    Ok(views.html.index())

  }

  def editCandidate = Action {
    Ok(views.html.pages.editCandidate("Your new application is ready."))
  }

  def listCandidate(officeLocation : String) = Action {

    // fetch list of candidates based on officeLocation from the database

    //val candidateList :  List[Candidate] = List(CandidateData.candidate1,CandidateData.candidate2)

    val candidateList :  List[Candidate] =  { if(officeLocation == "Paris".toLowerCase()) List(CandidateData.candidate1,CandidateData.candidate3 )
                          else List(CandidateData.candidate2) }

    val recruiter = Recruiter("UPS")

    Ok(views.html.pages.candidates(officeLocation, candidateList, recruiter))

  }


}
