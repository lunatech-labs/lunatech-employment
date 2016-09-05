
package views.html.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object helloWorld_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class helloWorld extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( name : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main(name)/*3.12*/{_display_(Seq[Any](format.raw/*3.13*/("""

    """),_display_(/*5.6*/if(name == "Erik")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/(""" """),format.raw/*5.27*/("""<p>Hallo</p> """)))}/*5.42*/else/*5.47*/{_display_(Seq[Any](format.raw/*5.48*/("""<p>Bonjour</p> """)))}),format.raw/*5.64*/("""


""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


}

/**/
object helloWorld extends helloWorld_Scope0.helloWorld
              /*
                  -- GENERATED --
                  DATE: Wed Aug 31 13:08:20 CEST 2016
                  SOURCE: /Users/aniket/Development/lunatech-employment/app/views/pages/helloWorld.scala.html
                  HASH: 47d14858afab63ae3561e6ef1f3002a4893bec2e
                  MATRIX: 543->1|654->17|682->20|700->30|738->31|770->38|796->56|835->58|863->59|895->74|907->79|945->80|991->96|1024->100
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5|29->5|29->5|29->5|29->5|29->5|29->5|32->8
                  -- GENERATED --
              */
          