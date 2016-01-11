// @SOURCE:/Users/percivalslucena/loja/webservices/conf/routes
// @HASH:84628e065021ddb79075c45ff2aa3e214f6c9ccc
// @DATE:Mon Jan 11 18:50:53 BRST 2016


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
private[this] lazy val controllers_ProdutoController_getProduto0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_getProduto0_invoker = createInvoker(
controllers.ProdutoController.getProduto(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProduto", Seq(classOf[Long]),"GET", """ Home page""", Routes.prefix + """Produto/$id<[^/]+>"""))
        

// @LINE:7
private[this] lazy val controllers_ProdutoController_getProdutos1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto"))))
private[this] lazy val controllers_ProdutoController_getProdutos1_invoker = createInvoker(
controllers.ProdutoController.getProdutos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProdutos", Nil,"GET", """""", Routes.prefix + """Produto"""))
        

// @LINE:8
private[this] lazy val controllers_ProdutoController_saveProduto2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto"))))
private[this] lazy val controllers_ProdutoController_saveProduto2_invoker = createInvoker(
controllers.ProdutoController.saveProduto(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "saveProduto", Nil,"POST", """""", Routes.prefix + """Produto"""))
        

// @LINE:10
private[this] lazy val controllers_UsuarioController_getUsuario3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_getUsuario3_invoker = createInvoker(
controllers.UsuarioController.getUsuario(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuario", Seq(classOf[String]),"GET", """""", Routes.prefix + """Usuario/$email<[^/]+>"""))
        

// @LINE:11
private[this] lazy val controllers_UsuarioController_getUsuarios4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario"))))
private[this] lazy val controllers_UsuarioController_getUsuarios4_invoker = createInvoker(
controllers.UsuarioController.getUsuarios(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuarios", Nil,"GET", """""", Routes.prefix + """Usuario"""))
        

// @LINE:12
private[this] lazy val controllers_UsuarioController_saveUsuario5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario"))))
private[this] lazy val controllers_UsuarioController_saveUsuario5_invoker = createInvoker(
controllers.UsuarioController.saveUsuario(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "saveUsuario", Nil,"POST", """""", Routes.prefix + """Usuario"""))
        

// @LINE:16
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto/$id<[^/]+>""","""controllers.ProdutoController.getProduto(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto""","""controllers.ProdutoController.getProdutos()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto""","""controllers.ProdutoController.saveProduto()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario/$email<[^/]+>""","""controllers.UsuarioController.getUsuario(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario""","""controllers.UsuarioController.getUsuarios()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario""","""controllers.UsuarioController.saveUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ProdutoController_getProduto0_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProdutoController_getProduto0_invoker.call(controllers.ProdutoController.getProduto(id))
   }
}
        

// @LINE:7
case controllers_ProdutoController_getProdutos1_route(params) => {
   call { 
        controllers_ProdutoController_getProdutos1_invoker.call(controllers.ProdutoController.getProdutos())
   }
}
        

// @LINE:8
case controllers_ProdutoController_saveProduto2_route(params) => {
   call { 
        controllers_ProdutoController_saveProduto2_invoker.call(controllers.ProdutoController.saveProduto())
   }
}
        

// @LINE:10
case controllers_UsuarioController_getUsuario3_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_UsuarioController_getUsuario3_invoker.call(controllers.UsuarioController.getUsuario(email))
   }
}
        

// @LINE:11
case controllers_UsuarioController_getUsuarios4_route(params) => {
   call { 
        controllers_UsuarioController_getUsuarios4_invoker.call(controllers.UsuarioController.getUsuarios())
   }
}
        

// @LINE:12
case controllers_UsuarioController_saveUsuario5_route(params) => {
   call { 
        controllers_UsuarioController_saveUsuario5_invoker.call(controllers.UsuarioController.saveUsuario())
   }
}
        

// @LINE:16
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     