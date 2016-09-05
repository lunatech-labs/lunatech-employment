
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>

<html lang="en"><head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>"""),_display_(/*18.13*/title),format.raw/*18.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*19.50*/routes/*19.56*/.Assets.versioned("stylesheets/bootstrap-theme.min.css")),format.raw/*19.112*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*20.50*/routes/*20.56*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*20.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*21.50*/routes/*21.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*23.55*/routes/*23.61*/.Assets.versioned("images/favicon.png")),format.raw/*23.100*/("""">
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*24.66*/("""" type="text/javascript"></script>


</head>

    <body>

        <nav class="navbar navbar-inverse navbar-fixed-top" style="background: white;">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#"><img style="width: 60%" src=""""),_display_(/*40.84*/routes/*40.90*/.Assets.versioned("images/Lunatech_Logo_Line_RGB_Pos_A.png")),format.raw/*40.150*/(""""></a>
                </div>

            </div>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 col-md-2 sidebar">
                    <ul class="nav nav-sidebar">
                        <li class="active"><a href=""""),_display_(/*50.54*/controllers/*50.65*/.routes.Application.main()),format.raw/*50.91*/("""">
                            List candidates Rotterdam<span class="sr-only">(current)</span></a></li>
                        <li><a href="#">List candidates Montévrain</a></li>
                        <li><a href=""""),_display_(/*53.39*/controllers/*53.50*/.routes.Application.editCandidate),format.raw/*53.83*/("""">New candidate</a></li>

                    </ul>
                    <ul class="nav nav-sidebar">
                        <li><a href="#">List recruiters Rotterdam</a></li>
                        <li><a href="#">List recruiters Montévrain</a></li>
                        <li><a href="#">Add recruiters</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">
                        <li><a href="#">Analytics</a></li>
                        <li><a href="#">Export</a></li>
                    </ul>

                </div>
                """),_display_(/*67.18*/content),format.raw/*67.25*/("""
            """),format.raw/*68.13*/("""</div>
        </div>

            <!-- Bootstrap core JavaScript
    ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
        <script src="../../dist/js/bootstrap.min.js"></script>
            <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
        <script src="../../assets/js/vendor/holder.min.js"></script>
            <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>


    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Aug 31 17:45:25 CEST 2016
                  SOURCE: /Users/aniket/Development/lunatech-employment/app/views/main.scala.html
                  HASH: abb6906a1caa3fb25bb27385af33db422958903c
                  MATRIX: 779->255|904->285|932->287|1368->696|1394->701|1479->759|1494->765|1572->821|1651->873|1666->879|1738->929|1817->981|1832->987|1894->1028|1979->1086|1994->1092|2055->1131|2103->1152|2118->1158|2180->1199|2953->1945|2968->1951|3050->2011|3369->2303|3389->2314|3436->2340|3681->2558|3701->2569|3755->2602|4355->3175|4383->3182|4424->3195
                  LINES: 25->7|30->7|32->9|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|46->23|46->23|46->23|47->24|47->24|47->24|63->40|63->40|63->40|73->50|73->50|73->50|76->53|76->53|76->53|90->67|90->67|91->68
                  -- GENERATED --
              */
          