// @SOURCE:/Users/percivalslucena/loja/webservices/conf/routes
// @HASH:337ae5a2dbc2615a5f6943b5b461347f536cd4c4
// @DATE:Mon Jan 11 12:29:59 BRST 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_getBooks0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Book"))))
private[this] lazy val controllers_Application_getBooks0_invoker = createInvoker(
controllers.Application.getBooks(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getBooks", Nil,"GET", """ Home page""", Routes.prefix + """Book"""))
        

// @LINE:7
private[this] lazy val controllers_Application_getBook1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Book/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_getBook1_invoker = createInvoker(
controllers.Application.getBook(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getBook", Seq(classOf[String]),"GET", """""", Routes.prefix + """Book/$id<[^/]+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_deleteBook2_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Book/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteBook2_invoker = createInvoker(
controllers.Application.deleteBook(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteBook", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """Book/$id<[^/]+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_saveBook3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Book"))))
private[this] lazy val controllers_Application_saveBook3_invoker = createInvoker(
controllers.Application.saveBook(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "saveBook", Nil,"POST", """""", Routes.prefix + """Book"""))
        

// @LINE:10
private[this] lazy val controllers_Application_newBook4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookNew"))))
private[this] lazy val controllers_Application_newBook4_invoker = createInvoker(
controllers.Application.newBook(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newBook", Nil,"GET", """""", Routes.prefix + """BookNew"""))
        

// @LINE:13
private[this] lazy val controllers_Assets_at5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Book""","""controllers.Application.getBooks()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Book/$id<[^/]+>""","""controllers.Application.getBook(id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Book/$id<[^/]+>""","""controllers.Application.deleteBook(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Book""","""controllers.Application.saveBook()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookNew""","""controllers.Application.newBook()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_getBooks0_route(params) => {
   call { 
        controllers_Application_getBooks0_invoker.call(controllers.Application.getBooks())
   }
}
        

// @LINE:7
case controllers_Application_getBook1_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_getBook1_invoker.call(controllers.Application.getBook(id))
   }
}
        

// @LINE:8
case controllers_Application_deleteBook2_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_deleteBook2_invoker.call(controllers.Application.deleteBook(id))
   }
}
        

// @LINE:9
case controllers_Application_saveBook3_route(params) => {
   call { 
        controllers_Application_saveBook3_invoker.call(controllers.Application.saveBook())
   }
}
        

// @LINE:10
case controllers_Application_newBook4_route(params) => {
   call { 
        controllers_Application_newBook4_invoker.call(controllers.Application.newBook())
   }
}
        

// @LINE:13
case controllers_Assets_at5_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     