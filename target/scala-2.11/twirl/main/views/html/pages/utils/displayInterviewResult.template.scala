
package views.html.pages.utils

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object displayInterviewResult_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class displayInterviewResult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[InterviewResult,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(interviewResult: InterviewResult):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/{interviewResult match { case Undefined(d) => <span style="color: black" class="glyphicon glyphicon-question-sign" aria-hidden="true"> @d.toString </span>
case Passed(d) => <span style="color: green" class="glyphicon glyphicon-ok" aria-hidden="true"> </span>
case Failed(d,r) => <span style="color: red" class="glyphicon glyphicon-remove" aria-hidden="true"> </span>
case _ => <span style="color: black" class="glyphicon glyphicon-question-sign" aria-hidden="true"> </span>
}}),format.raw/*7.3*/("""
"""))
      }
    }
  }

  def render(interviewResult:InterviewResult): play.twirl.api.HtmlFormat.Appendable = apply(interviewResult)

  def f:((InterviewResult) => play.twirl.api.HtmlFormat.Appendable) = (interviewResult) => apply(interviewResult)

  def ref: this.type = this

}


}

/**/
object displayInterviewResult extends displayInterviewResult_Scope0.displayInterviewResult
              /*
                  -- GENERATED --
                  DATE: Fri Sep 02 16:36:12 CEST 2016
                  SOURCE: /Users/aniket/Development/lunatech-employment/app/views/pages/utils/displayInterviewResult.scala.html
                  HASH: fab367877cbc7c7cb3b46f2f28f528febd9f7a06
                  MATRIX: 582->1|711->35|739->38|1234->514
                  LINES: 20->1|25->1|27->3|31->7
                  -- GENERATED --
              */
          