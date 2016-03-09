// @SOURCE:/Users/percivalslucena/loja/webservices/conf/routes
// @HASH:779cf2da771102fffb3c59806c43b660d0e0d5e2
// @DATE:Wed Mar 09 17:32:32 BRT 2016


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
private[this] lazy val controllers_Assets_at0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_ApiHelpController_getResources1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api-docs"))))
private[this] lazy val controllers_ApiHelpController_getResources1_invoker = createInvoker(
controllers.ApiHelpController.getResources,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApiHelpController", "getResources", Nil,"GET", """""", Routes.prefix + """api-docs"""))
        

// @LINE:13
private[this] lazy val controllers_ApiHelpController_getResource2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api-docs/api/produto"))))
private[this] lazy val controllers_ApiHelpController_getResource2_invoker = createInvoker(
controllers.ApiHelpController.getResource(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ApiHelpController", "getResource", Seq(classOf[String]),"GET", """""", Routes.prefix + """api-docs/api/produto"""))
        

// @LINE:17
private[this] lazy val controllers_CarrinhoController_getCarrinho3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Carrinho/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_CarrinhoController_getCarrinho3_invoker = createInvoker(
controllers.CarrinhoController.getCarrinho(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "getCarrinho", Seq(classOf[String]),"GET", """""", Routes.prefix + """Carrinho/$email<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_CarrinhoController_addCarrinho4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Carrinho/add/"),DynamicPart("email", """[^/]+""",true),StaticPart("/"),DynamicPart("produto", """[^/]+""",true))))
private[this] lazy val controllers_CarrinhoController_addCarrinho4_invoker = createInvoker(
controllers.CarrinhoController.addCarrinho(fakeValue[String], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "addCarrinho", Seq(classOf[String], classOf[Long]),"GET", """""", Routes.prefix + """Carrinho/add/$email<[^/]+>/$produto<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_CarrinhoController_removeCarrinho5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Carrinho/remove/"),DynamicPart("email", """[^/]+""",true),StaticPart("/"),DynamicPart("produto", """[^/]+""",true))))
private[this] lazy val controllers_CarrinhoController_removeCarrinho5_invoker = createInvoker(
controllers.CarrinhoController.removeCarrinho(fakeValue[String], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "removeCarrinho", Seq(classOf[String], classOf[Long]),"GET", """""", Routes.prefix + """Carrinho/remove/$email<[^/]+>/$produto<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_ProdutoController_getProduto6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_getProduto6_invoker = createInvoker(
controllers.ProdutoController.getProduto(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProduto", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Produto/$id<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_ProdutoController_getProdutos7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto"))))
private[this] lazy val controllers_ProdutoController_getProdutos7_invoker = createInvoker(
controllers.ProdutoController.getProdutos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProdutos", Nil,"GET", """""", Routes.prefix + """Produto"""))
        

// @LINE:24
private[this] lazy val controllers_ProdutoController_saveProduto8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto"))))
private[this] lazy val controllers_ProdutoController_saveProduto8_invoker = createInvoker(
controllers.ProdutoController.saveProduto(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "saveProduto", Nil,"POST", """""", Routes.prefix + """Produto"""))
        

// @LINE:26
private[this] lazy val controllers_UsuarioController_getUsuario9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_getUsuario9_invoker = createInvoker(
controllers.UsuarioController.getUsuario(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuario", Seq(classOf[String]),"GET", """""", Routes.prefix + """Usuario/$email<[^/]+>"""))
        

// @LINE:27
private[this] lazy val controllers_UsuarioController_getUsuarios10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario"))))
private[this] lazy val controllers_UsuarioController_getUsuarios10_invoker = createInvoker(
controllers.UsuarioController.getUsuarios(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuarios", Nil,"GET", """""", Routes.prefix + """Usuario"""))
        

// @LINE:28
private[this] lazy val controllers_UsuarioController_saveUsuario11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario"))))
private[this] lazy val controllers_UsuarioController_saveUsuario11_invoker = createInvoker(
controllers.UsuarioController.saveUsuario(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "saveUsuario", Nil,"POST", """""", Routes.prefix + """Usuario"""))
        

// @LINE:32
private[this] lazy val controllers_Assets_at12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Assets.at(path:String = "/public", file:String = "index.html")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api-docs""","""controllers.ApiHelpController.getResources"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api-docs/api/produto""","""controllers.ApiHelpController.getResource(path:String = "/api/produto")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Carrinho/$email<[^/]+>""","""controllers.CarrinhoController.getCarrinho(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Carrinho/add/$email<[^/]+>/$produto<[^/]+>""","""controllers.CarrinhoController.addCarrinho(email:String, produto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Carrinho/remove/$email<[^/]+>/$produto<[^/]+>""","""controllers.CarrinhoController.removeCarrinho(email:String, produto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto/$id<[^/]+>""","""controllers.ProdutoController.getProduto(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto""","""controllers.ProdutoController.getProdutos()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto""","""controllers.ProdutoController.saveProduto()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario/$email<[^/]+>""","""controllers.UsuarioController.getUsuario(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario""","""controllers.UsuarioController.getUsuarios()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario""","""controllers.UsuarioController.saveUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Assets_at0_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at0_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:8
case controllers_ApiHelpController_getResources1_route(params) => {
   call { 
        controllers_ApiHelpController_getResources1_invoker.call(controllers.ApiHelpController.getResources)
   }
}
        

// @LINE:13
case controllers_ApiHelpController_getResource2_route(params) => {
   call(Param[String]("path", Right("/api/produto"))) { (path) =>
        controllers_ApiHelpController_getResource2_invoker.call(controllers.ApiHelpController.getResource(path))
   }
}
        

// @LINE:17
case controllers_CarrinhoController_getCarrinho3_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_CarrinhoController_getCarrinho3_invoker.call(controllers.CarrinhoController.getCarrinho(email))
   }
}
        

// @LINE:18
case controllers_CarrinhoController_addCarrinho4_route(params) => {
   call(params.fromPath[String]("email", None), params.fromPath[Long]("produto", None)) { (email, produto) =>
        controllers_CarrinhoController_addCarrinho4_invoker.call(controllers.CarrinhoController.addCarrinho(email, produto))
   }
}
        

// @LINE:19
case controllers_CarrinhoController_removeCarrinho5_route(params) => {
   call(params.fromPath[String]("email", None), params.fromPath[Long]("produto", None)) { (email, produto) =>
        controllers_CarrinhoController_removeCarrinho5_invoker.call(controllers.CarrinhoController.removeCarrinho(email, produto))
   }
}
        

// @LINE:22
case controllers_ProdutoController_getProduto6_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProdutoController_getProduto6_invoker.call(controllers.ProdutoController.getProduto(id))
   }
}
        

// @LINE:23
case controllers_ProdutoController_getProdutos7_route(params) => {
   call { 
        controllers_ProdutoController_getProdutos7_invoker.call(controllers.ProdutoController.getProdutos())
   }
}
        

// @LINE:24
case controllers_ProdutoController_saveProduto8_route(params) => {
   call { 
        controllers_ProdutoController_saveProduto8_invoker.call(controllers.ProdutoController.saveProduto())
   }
}
        

// @LINE:26
case controllers_UsuarioController_getUsuario9_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_UsuarioController_getUsuario9_invoker.call(controllers.UsuarioController.getUsuario(email))
   }
}
        

// @LINE:27
case controllers_UsuarioController_getUsuarios10_route(params) => {
   call { 
        controllers_UsuarioController_getUsuarios10_invoker.call(controllers.UsuarioController.getUsuarios())
   }
}
        

// @LINE:28
case controllers_UsuarioController_saveUsuario11_route(params) => {
   call { 
        controllers_UsuarioController_saveUsuario11_invoker.call(controllers.UsuarioController.saveUsuario())
   }
}
        

// @LINE:32
case controllers_Assets_at12_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     