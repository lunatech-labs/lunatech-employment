
package views.html.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editCandidate_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editCandidate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Edit candidate")/*12.24*/ {_display_(Seq[Any](format.raw/*12.26*/("""

  """),format.raw/*14.3*/("""<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">Nicolas Leroux (senior developer) <small><span class="label label-warning">Outside EU</span> <span class="label label-info">Offer made</span></small></h1>
  </div>

  <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 form">
    <div class="form-group ">
      <ul class="wizard" style="font-size: 10pt; ">
        <li class="selected"><a style="color: white" href="">Interview (12/01/2016)</a></li>
        <li class="selected"><a style="color: white" href="">Interview (12/01/2016)</a></li>
        <li class="" style="background-color:red"><a style="color: white" href="">Interview (12/01/2016)</a></li>

      </ul>
    </div>
  </div>


    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 form">
      <div class="form-group ">
          <label for="fullname">Full name</label>
          <input id="fullname" name="fullname" type="text" class="form-control"
              value=""
              placeholder="Candidate's name" required="" autofocus="" />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>

      <div class="form-group">
          <label for="email">Email</label>
          <div class="input-group">
            <span class="input-group-addon">@</span>
            <input id="email" name="email" type="text" class="form-control"
              value=""
              placeholder="Candidate's email" required=""  />
          </div>
          <!-- <span class="help-block"> Username is required </span> -->
      </div>

      <div class="form-group ">
          <label for="Position">Position</label>
          <input id="Position" name="Position" type="text" class="form-control"
              value=""
              placeholder="Position" required="" autofocus="" />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>

      <div class="form-group">
          <label for="Notes">Notes</label>
          <textarea id="Notes" name="Notes" type="text" class="form-control"
              value=""
              placeholder="Notes" required=""  ></textarea>
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 form">
      <div style="color: #777; font-size:8pt; position:relative; bottom: -20px">Personal info</div>
      <hr>
    </div>

    <div class="col-sm-4 col-sm-offset-3 col-md-5 col-md-offset-2 ">

      <div class="form-group">
          <label for="phone">Phone number</label>
          <input id="phone" name="phone" type="text" class="form-control"
              value=""
              placeholder="Candidate's phone number" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>
    <div class="col-sm-4 col-md-5 ">

      <div class="form-group">
          <label for="birthdate">Birthdate</label>
          <input id="birthdate" name="birthdate" type="text" class="form-control"
              value=""
              placeholder="Birthdate" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-4 col-sm-offset-3 col-md-5 col-md-offset-2 ">

      <div class="form-group">
          <label for="skype">Skype</label>
          <input id="skype" name="skype" type="text" class="form-control"
              value=""
              placeholder="Candidate's Skype" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-4 col-md-5 ">

      <div class="form-group">
          <label for="Nationality">Nationality</label>
          <input id="Nationality" name="Nationality" type="text" class="form-control"
              value=""
              placeholder="Nationality" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-4 col-sm-offset-3 col-md-5 col-md-offset-2 ">

      <div class="form-group">
          <label for="Marital">Marital status</label>
          <input id="Marital" name="skype" type="text" class="form-control"
              value=""
              placeholder="Candidate's Marital status" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-4 col-md-5 ">

      <div class="form-group">
          <label for="country">Current country</label>
          <input id="country" name="country" type="text" class="form-control"
              value=""
              placeholder="Current country" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 form">
      <hr>
    </div>

    <div class="col-sm-4 col-sm-offset-3 col-md-5 col-md-offset-2 ">

      <div class="form-group">
          <label for="Recruiter">Recruiter</label>
          <input id="Recruiter" name="Recruiter" type="text" class="form-control"
              value=""
              placeholder="Recruiter" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>


    <div class="col-sm-4 col-md-5 ">

      <div class="form-group">
          <label for="date_first_cv">Date first apparition CV</label>
          <input id="date_first_cv" name="date_first_cv" type="text" class="form-control"
              value=""
              placeholder="Date first apparition CV" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>
    <div class="col-sm-4 col-sm-offset-3 col-md-5 col-md-offset-2 ">

      <div class="form-group">
          <label for="salary">Desired salary</label>
          <input id="salary" name="salary" type="text" class="form-control"
              value=""
              placeholder="Desired salary" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 form">
      <div style="color: #777; font-size:8pt; position:relative; bottom: -20px">Education</div>
      <hr>
    </div>

    <div class="col-sm-2 col-sm-offset-3 col-md-2 col-md-offset-2 ">

      <div class="form-group form">
          <label for="experience">Work experience</label>
          <input id="experience" name="experience" type="text" class="form-control"
              value=""
              placeholder="Number of years" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 form">
    </div>


    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 ">

      <div class="form-group">
          <label for="Degree">Degrees</label>
          <textarea id="Degree" name="Degree" type="text" class="form-control"
              value=""
              placeholder="Degrees" required=""  ></textarea>
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 ">

      <div class="form-group">
          <label for="Degree">Certifications</label>
          <textarea id="Degree" name="Degree" type="text" class="form-control"
              value=""
              placeholder="Degrees" required=""  ></textarea>
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    </div>

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 form">
      <div style="color: #777; font-size:8pt; position:relative; bottom: -20px">Languages</div>
      <hr>
    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 ">

      <div class="form-group">
          <ul class="list-group">
            <li class="list-group-item"><b>English</b><br>
              <input type="checkbox">  Native
              <input type="checkbox">  Fluent
              <input type="checkbox">  Basic

            </li>
            <li class="list-group-item"><b>French</b><br>
              <input type="checkbox">  Native
              <input type="checkbox">  Fluent
              <input type="checkbox">  Basic

            </li>
            <li class="list-group-item"><b>Dutch</b><br>
              <input type="checkbox">  Native
              <input type="checkbox">  Fluent
              <input type="checkbox">  Basic

            </li>
            <li class="list-group-item"><input type="text"><br>
              <input type="checkbox">  Native
              <input type="checkbox">  Fluent
              <input type="checkbox">  Basic

            </li>
            <li class="list-group-item"><input type="text"><br>
              <input type="checkbox">  Native
              <input type="checkbox">  Fluent
              <input type="checkbox">  Basic

            </li>
          </ul>




      </div>
    </div>

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 form">
      <div style="color: #777; font-size:8pt; position:relative; bottom: -20px">Interviews</div>
      <hr>
    </div>

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 ">

        <div class="form-group">
            <label for="interviewdate">First interview date</label>
            <input id="interviewdate" name="interviewdate" type="text" class="form-control"
                value=""
                placeholder="First interview date" required=""  />
            <!-- <span class="help-block"> Username is required </span> -->
        </div>
      <div class="form-group">
          <label for="interview">First interview notes</label>
          <textarea id="interview" name="interview" type="text" class="form-control"
              value=""
              placeholder="First interview's notes" required=""  ></textarea>
          <!-- <span class="help-block"> Username is required </span> -->
          <div class="radio">
    <label>
      <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
      Pass
    </label>
  </div>
  <div class="radio">
    <label>
      <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
      Failed
    </label>
  </div>
  </div>
</div>

  <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 ">
    <hr>
      <div class="form-group">
          <label for="interviewdate">Second interview date</label>
          <input id="interviewdate" name="interviewdate" type="text" class="form-control"
              value=""
              placeholder="Second interview date" required=""  />
          <!-- <span class="help-block"> Username is required </span> -->
      </div>
    <div class="form-group">
        <label for="interview">Second interview notes</label>
        <textarea id="interview" name="interview" type="text" class="form-control"
            value=""
            placeholder="Second interview's notes" required=""  ></textarea>
        <!-- <span class="help-block"> Username is required </span> -->
        <div class="radio">
  <label>
    <input type="radio" name="optionsRadios2" id="optionsRadios1" value="option1" checked>
    Pass
  </label>
</div>
<div class="radio">
  <label>
    <input type="radio" name="optionsRadios2" id="optionsRadios2" value="option2">
    Failed
  </label>
</div>
</div>
</div>


<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 ">
  <hr>
    <div class="form-group">
        <label for="interviewdate">Third interview date</label>
        <input id="interviewdate" name="interviewdate" type="text" class="form-control"
            value=""
            placeholder="Third interview date" required=""  />
        <!-- <span class="help-block"> Username is required </span> -->
    </div>
  <div class="form-group">
      <label for="interview">Third interview notes</label>
      <textarea id="interview" name="interview" type="text" class="form-control"
          value=""
          placeholder="Third interview's notes" required=""  ></textarea>
      <!-- <span class="help-block"> Username is required </span> -->
      <div class="radio">
<label>
  <input type="radio" name="optionsRadios2" id="optionsRadios1" value="option1" checked>
  Pass
</label>
</div>
<div class="radio">
<label>
  <input type="radio" name="optionsRadios2" id="optionsRadios2" value="option2">
  Failed
</label>
</div>
</div>
</div>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 ">

      <div class="form-group">
        <button type="submit" class="btn btn-default">Cancel</button>

        <button type="submit" class="btn btn-info">Save</button>
      </div>


</div>
""")))}),format.raw/*367.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object editCandidate extends editCandidate_Scope0.editCandidate
              /*
                  -- GENERATED --
                  DATE: Wed Aug 31 12:25:02 CEST 2016
                  SOURCE: /Users/aniket/Development/lunatech-employment/app/views/pages/editCandidate.scala.html
                  HASH: f690bb1254e3e03ac59424e4e5707872eaf552f2
                  MATRIX: 638->95|750->112|779->308|807->310|838->332|878->334|909->338|13864->13263
                  LINES: 23->5|28->5|30->11|31->12|31->12|31->12|33->14|386->367
                  -- GENERATED --
              */
          