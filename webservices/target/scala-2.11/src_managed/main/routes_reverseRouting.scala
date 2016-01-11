// @SOURCE:/Users/percivalslucena/loja/webservices/conf/routes
// @HASH:337ae5a2dbc2615a5f6943b5b461347f536cd4c4
// @DATE:Mon Jan 11 12:29:59 BRST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {


// @LINE:13
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def deleteBook(id:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "Book/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:7
def getBook(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Book/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:6
def getBooks(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Book")
}
                        

// @LINE:9
def saveBook(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "Book")
}
                        

// @LINE:10
def newBook(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "BookNew")
}
                        

}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:13
class ReverseAssets {


// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def deleteBook : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteBook",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "Book/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:7
def getBook : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getBook",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Book/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:6
def getBooks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getBooks",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Book"})
      }
   """
)
                        

// @LINE:9
def saveBook : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveBook",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Book"})
      }
   """
)
                        

// @LINE:10
def newBook : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newBook",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookNew"})
      }
   """
)
                        

}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {


// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def deleteBook(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteBook(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteBook", Seq(classOf[String]), "DELETE", """""", _prefix + """Book/$id<[^/]+>""")
)
                      

// @LINE:7
def getBook(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getBook(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getBook", Seq(classOf[String]), "GET", """""", _prefix + """Book/$id<[^/]+>""")
)
                      

// @LINE:6
def getBooks(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getBooks(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getBooks", Seq(), "GET", """ Home page""", _prefix + """Book""")
)
                      

// @LINE:9
def saveBook(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveBook(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "saveBook", Seq(), "POST", """""", _prefix + """Book""")
)
                      

// @LINE:10
def newBook(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newBook(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newBook", Seq(), "GET", """""", _prefix + """BookNew""")
)
                      

}
                          
}
        
    