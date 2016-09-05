
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Awesome index page")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""

    """),format.raw/*5.5*/("""<p>HTML content</p>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Aug 31 12:54:28 CEST 2016
                  SOURCE: /Users/aniket/Development/lunatech-employment/app/views/index.scala.html
                  HASH: bc1e5085de4c24b9e3f5c4f085495235aedce5d5
                  MATRIX: 520->1|616->3|644->6|678->32|717->34|749->40
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5
                  -- GENERATED --
              */
          