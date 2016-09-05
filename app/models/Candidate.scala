package models


import org.joda.time.DateTime

import java.io.File

case class Candidate(id: Option[Int],
                     firstName: String,
                     lastName: String,
                     contactDetails: ContactDetails,
                     maritialStatus: String,
                     dob: DateTime,
                     nationality: String,
                     currentCountry: String,
                     position: String,
                     seniority: Option[String],
                     notes: Option[String],
                     officeLocation: String,
                     dateOfFirstApplication: DateTime,
                     desiredSalary: Double,
                     skillSet: List[Skill],
                     cv: Option[File],
                     interviewProcess: InterviewProcess,
                     startDate: Option[DateTime],
                     education: Education

                    )

// Interview Process could be different for different office location.
// e.g Paris office has 4 interview steps e.g First, Technical 1, Technical 2 and Final
// but Rotterdam office could have only 3 steps. e.g First, Technical and Final
case class InterviewProcess(steps: Seq[Interview], location: String)

//case class Interview(interviewDate: DateTime, completed: Boolean, resultOfInterview: InterviewResult, interviewType: InterviewType)
case class Interview(completed: Boolean, resultOfInterview: InterviewResult, interviewType: InterviewType)

// interview could be of type "first","Technical 1", "Technical 2", "Final"
case class InterviewType(label: String)

trait InterviewResult {
  def scheduledDate: DateTime

  def reason: Option[String]
}

case class Undefined(scheduledDate: DateTime) extends InterviewResult {
  val reason = None
}

case class Passed(scheduledDate: DateTime) extends InterviewResult {
  val reason = None
}

case class Failed(scheduledDate: DateTime, reason: Option[String]) extends InterviewResult

case class ContactDetails(phoneNumber: String, skype: String, email: String)

case class Recruiter(companyName: String)

case class Education(yearsOfExp: Double, degrees: List[String], certifications: List[String], spokenLanguages: List[String])

sealed trait SkillLevel

case object Beginner extends SkillLevel

case object Intermediate extends SkillLevel

case object Advanced extends SkillLevel

case object Expert extends SkillLevel

case class Skill(name: String, level: SkillLevel)



// This object contains test dataset
object CandidateData {

// Temp dataset

  val interview1 = Interview(true, Passed(new DateTime()), InterviewType("first"))
  val interview2 = Interview(false, Passed(new DateTime()), InterviewType("technical"))
  val interview3 = Interview(true, Failed(new DateTime(), Some("not a real java developer")), InterviewType("final"))

  val interviewStepsParis = Seq(interview1, interview2, interview3)
  val interviewStepsRotterdam = Seq(interview2, interview3)

  //Education(yearsOfExp: Double, degrees: List[String], certifications: List[String], spokenLanguages: List[String])
  val edu1 = Education(1.5, List("bachelor of eng", "Masters"), List("java"), List("English", "Hindi", "Marathi"))
  val edu2 = Education(10.0, List("bachelors", "Masters"), List("OCP", "Lightbend"), List("English", "Dutch"))

  val interviewProcessRotterdam = InterviewProcess(interviewStepsRotterdam, "Rotterdam")

  val interviewProcessParis = InterviewProcess(interviewStepsParis, "Paris")

  val candidate1 = Candidate(None,
    "aniket",
    "kakde",
    ContactDetails("0619953031", "aniketk", "arkakde@gmail.com"),
    "umarried",
    new DateTime(DateTime.parse("1988-08-16")),
    "Indian",
    "France",
    "Java Developer",
    Some("Junior"),
    Some("Hello notes"),
    "paris",
    new DateTime(DateTime.parse("2012-08-16")),
    35000,
    List(Skill("Java", Intermediate), Skill("Scala", Beginner), Skill("PlayFramework", Beginner), Skill("AngularJS", Intermediate)),
    None,
    interviewProcessParis,
    Some(new DateTime(DateTime.parse("2012-08-16"))),
    edu1
  )


  val candidate2 = Candidate(None,
    "Erik",
    "Janseen",
    ContactDetails("0619953031", "erik", "erik@gmail.com"),
    "umarried",
    new DateTime(DateTime.parse("1978-08-16")),
    "Dutch",
    "Holland",
    "Team Leader",
    Some("Senior"),
    Some("Hello notes"),
    "rotterdam",
    new DateTime(DateTime.parse("2012-08-16")),
    45000,
    List(Skill("Scala", Expert)),
    None,
    interviewProcessRotterdam,
    Some(new DateTime(DateTime.parse("2012-08-16"))),
    edu2
  )


  val candidate3 = Candidate(None,
    "Joshua",
    "Kal",
    ContactDetails("0619953031", "josh", "josh@gmail.com"),
    "umarried",
    new DateTime(DateTime.parse("1988-08-16")),
    "Spain",
    "France",
    "Scala Developer",
    Some("Medior"),
    Some("Hello notes"),
    "paris",
    new DateTime(DateTime.parse("2012-08-16")),
    35000,
    List(Skill("Java", Intermediate), Skill("Scala", Beginner), Skill("PlayFramework", Beginner), Skill("AngularJS", Intermediate)),
    None,
    interviewProcessParis,
    Some(new DateTime(DateTime.parse("2012-08-16"))),
    edu1
  )


}





