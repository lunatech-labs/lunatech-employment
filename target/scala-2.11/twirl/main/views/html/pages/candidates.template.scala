
package views.html.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object candidates_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class candidates extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[Candidate],Recruiter,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*5.2*/(city: String, candidateList: List[Candidate], recruiter: Recruiter):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.70*/("""

"""),format.raw/*11.3*/("""
"""),_display_(/*12.2*/main(s"Candidates $city" )/*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""

"""),format.raw/*14.1*/("""<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">Candidates """),_display_(/*15.41*/city),format.raw/*15.45*/("""</h1>
    <div class="sub-header"><a href="">Displaying 1 - 10 out of 54 candidates</a></div>
    <nav>
        <ul class="pagination">
            <li class="disabled">
                <a href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <li class="active"><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li>
                <a href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Initial contact date</th>
                <th>Name</th>
                <th>Recruiter</th>
                <th>CV</th>
                <th>Level</th>
                <th>Skill set</th>
                <th>Language</th>
                <th>EU</th>


              """),format.raw/*53.18*/("""

                """),_display_(/*55.18*/candidateList/*55.31*/.headOption.map/*55.46*/ { candidate =>_display_(Seq[Any](format.raw/*55.61*/("""
                    """),_display_(/*56.22*/utils/*56.27*/.displayInterviewSteps(candidate.interviewProcess)),format.raw/*56.77*/("""
                """)))}),format.raw/*57.18*/("""

                """),format.raw/*59.17*/("""<th>Start date</th>
                <th>Note</th>
            </tr>
            </thead>
            <tbody>
            """),_display_(/*64.14*/candidateList/*64.27*/.map/*64.31*/{ candidate =>_display_(Seq[Any](format.raw/*64.45*/("""
            """),format.raw/*65.13*/("""<tr>
                <td>"""),_display_(/*66.22*/candidate/*66.31*/.dateOfFirstApplication),format.raw/*66.54*/("""</td>"""),format.raw/*66.85*/("""
                """),format.raw/*67.17*/("""<td><a>"""),_display_(/*67.25*/candidate/*67.34*/.firstName),format.raw/*67.44*/("""</a></td> """),format.raw/*67.75*/("""
                """),format.raw/*68.17*/("""<td><a>"""),_display_(/*68.25*/recruiter/*68.34*/.companyName),format.raw/*68.46*/("""</a></td> """),format.raw/*68.77*/("""
                """),format.raw/*69.17*/("""<td><a>"""),_display_(/*69.25*/candidate/*69.34*/.cv),format.raw/*69.37*/("""</a></td> """),format.raw/*69.80*/("""

                """),format.raw/*71.17*/("""<td>"""),_display_(/*71.22*/candidate/*71.31*/.seniority),format.raw/*71.41*/("""</td>  """),format.raw/*71.77*/("""

                """),format.raw/*73.17*/("""<td>
                        <ul>
                    """),_display_(/*75.22*/for(skill <- candidate.skillSet) yield /*75.54*/ {_display_(Seq[Any](format.raw/*75.56*/("""
                        """),format.raw/*76.25*/("""<li><b>"""),_display_(/*76.33*/skill/*76.38*/.name),format.raw/*76.43*/("""</b>: """),_display_(/*76.50*/skill/*76.55*/.level),format.raw/*76.61*/("""</li>
                    """)))}),format.raw/*77.22*/("""
                        """),format.raw/*78.25*/("""</ul>
                </td>


                <td>"""),_display_(/*82.22*/candidate/*82.31*/.education.spokenLanguages.mkString(", ")),format.raw/*82.72*/("""</td> """),format.raw/*82.95*/("""

                """),format.raw/*84.17*/("""<td>"""),_display_(/*84.22*/candidate/*84.31*/.currentCountry),format.raw/*84.46*/("""</td>

                """),_display_(/*86.18*/candidate/*86.27*/.interviewProcess.steps.map/*86.54*/ { step =>_display_(Seq[Any](format.raw/*86.64*/("""
                    """),format.raw/*87.21*/("""<td style="text-align: center">"""),_display_(/*87.53*/utils/*87.58*/.displayInterviewResult(step.resultOfInterview)),format.raw/*87.105*/("""</td>
                """)))}),format.raw/*88.18*/("""



                """),format.raw/*92.17*/("""<td>"""),_display_(/*92.22*/candidate/*92.31*/.startDate),format.raw/*92.41*/("""</td>
                <td>"""),_display_(/*93.22*/candidate/*93.31*/.notes),format.raw/*93.37*/("""</td>-->
            </tr>
            """)))}),format.raw/*95.14*/("""

            """),format.raw/*97.13*/("""</tbody>
        </table>


    </div>
</div>

""")))}),format.raw/*104.2*/("""
"""))
      }
    }
  }

  def render(city:String,candidateList:List[Candidate],recruiter:Recruiter): play.twirl.api.HtmlFormat.Appendable = apply(city,candidateList,recruiter)

  def f:((String,List[Candidate],Recruiter) => play.twirl.api.HtmlFormat.Appendable) = (city,candidateList,recruiter) => apply(city,candidateList,recruiter)

  def ref: this.type = this

}


}

/*
* This template takes a single argument, a String containing a
* message to display.
*/
object candidates extends candidates_Scope0.candidates
              /*
                  -- GENERATED --
                  DATE: Mon Sep 05 10:26:53 CEST 2016
                  SOURCE: /Users/aniket/Development/lunatech-employment/app/views/pages/candidates.scala.html
                  HASH: 24491269f58dc6a3a1547210f14de39902acb7ca
                  MATRIX: 655->92|818->160|847->352|875->354|910->380|950->382|979->384|1116->494|1141->498|2286->1747|2332->1766|2354->1779|2378->1794|2431->1809|2480->1831|2494->1836|2565->1886|2614->1904|2660->1922|2809->2044|2831->2057|2844->2061|2896->2075|2937->2088|2990->2114|3008->2123|3052->2146|3085->2177|3130->2194|3165->2202|3183->2211|3214->2221|3252->2252|3297->2269|3332->2277|3350->2286|3383->2298|3421->2329|3466->2346|3501->2354|3519->2363|3543->2366|3581->2409|3627->2427|3659->2432|3677->2441|3708->2451|3743->2487|3789->2505|3871->2560|3919->2592|3959->2594|4012->2619|4047->2627|4061->2632|4087->2637|4121->2644|4135->2649|4162->2655|4220->2682|4273->2707|4351->2758|4369->2767|4431->2808|4465->2831|4511->2849|4543->2854|4561->2863|4597->2878|4648->2902|4666->2911|4702->2938|4750->2948|4799->2969|4858->3001|4872->3006|4941->3053|4995->3076|5043->3096|5075->3101|5093->3110|5124->3120|5178->3147|5196->3156|5223->3162|5294->3202|5336->3216|5415->3264
                  LINES: 23->5|28->5|30->11|31->12|31->12|31->12|33->14|34->15|34->15|69->53|71->55|71->55|71->55|71->55|72->56|72->56|72->56|73->57|75->59|80->64|80->64|80->64|80->64|81->65|82->66|82->66|82->66|82->66|83->67|83->67|83->67|83->67|83->67|84->68|84->68|84->68|84->68|84->68|85->69|85->69|85->69|85->69|85->69|87->71|87->71|87->71|87->71|87->71|89->73|91->75|91->75|91->75|92->76|92->76|92->76|92->76|92->76|92->76|92->76|93->77|94->78|98->82|98->82|98->82|98->82|100->84|100->84|100->84|100->84|102->86|102->86|102->86|102->86|103->87|103->87|103->87|103->87|104->88|108->92|108->92|108->92|108->92|109->93|109->93|109->93|111->95|113->97|120->104
                  -- GENERATED --
              */
          