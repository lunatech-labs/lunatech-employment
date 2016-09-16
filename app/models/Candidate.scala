package models

import org.joda.time.DateTime
import play.api.libs.json.Json
import java.time

case class Candidate(id: Option[Long],
                     initialContactDate: String,
                     firstName: String,
                     lastName: String,
                     recruiter: String,
                     cv: String,
                     level: String,
                     skillSet: String,
                     language: String,
                     nationality: String,
                     first: String,
                     second: String,
                     third: String,
                     startdate: String,
                     notes: String,
                     location: String
                    )


object Candidate {
  implicit val formatter = Json.format[Candidate]
}



