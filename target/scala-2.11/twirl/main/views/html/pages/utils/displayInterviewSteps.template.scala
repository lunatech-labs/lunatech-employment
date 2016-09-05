
package views.html.pages.utils

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object displayInterviewSteps_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class displayInterviewSteps extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[InterviewType,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(interviewType : InterviewType):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*2.1*/("""<th> """),_display_(/*2.7*/interviewType/*2.20*/.label.toString),format.raw/*2.35*/("""</th>"""))
      }
    }
  }

  def render(interviewType:InterviewType): play.twirl.api.HtmlFormat.Appendable = apply(interviewType)

  def f:((InterviewType) => play.twirl.api.HtmlFormat.Appendable) = (interviewType) => apply(interviewType)

  def ref: this.type = this

}


}

/**/
object displayInterviewSteps extends displayInterviewSteps_Scope0.displayInterviewSteps
              /*
                  -- GENERATED --
                  DATE: Fri Sep 02 15:58:14 CEST 2016
                  SOURCE: /Users/aniket/Development/lunatech-employment/app/views/pages/utils/displayInterviewSteps.scala.html
                  HASH: b5a39d3353578ec007e945dde12c08faa74a8dd2
                  MATRIX: 578->1|704->32|731->33|762->39|783->52|818->67
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2
                  -- GENERATED --
              */
          