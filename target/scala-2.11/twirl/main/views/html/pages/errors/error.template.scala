
package views.html.pages.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(error: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>


<body>

<p>HELLO, nice ERROR IS :  """),_display_(/*9.29*/error),format.raw/*9.34*/(""" """),format.raw/*9.35*/("""</p>

</body>

</html>
"""))
      }
    }
  }

  def render(error:String): play.twirl.api.HtmlFormat.Appendable = apply(error)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (error) => apply(error)

  def ref: this.type = this

}


}

/**/
object error extends error_Scope0.error
              /*
                  -- GENERATED --
                  DATE: Fri Sep 02 13:48:35 CEST 2016
                  SOURCE: /Users/aniket/Development/lunatech-employment/app/views/pages/errors/error.scala.html
                  HASH: 1b0d423e8fe00fb66de439950ccd4978c58f651a
                  MATRIX: 540->1|650->16|677->17|765->79|790->84|818->85
                  LINES: 20->1|25->1|26->2|33->9|33->9|33->9
                  -- GENERATED --
              */
          