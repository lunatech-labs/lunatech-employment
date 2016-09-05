
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aniket/Development/lunatech-employment/conf/routes
// @DATE:Wed Aug 31 17:45:25 CEST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def editCandidate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.editCandidate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit"})
        }
      """
    )
  
    // @LINE:10
    def listCandidate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.listCandidate",
      """
        function(office0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("office", encodeURIComponent(office0)) + "/candidates"})
        }
      """
    )
  
    // @LINE:6
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
