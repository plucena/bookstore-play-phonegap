// @SOURCE:/Users/percivalslucena/loja/webservices/conf/routes
// @HASH:0a2b0e9da4fda74e66eb039aa3b5c96dc1f693ab
// @DATE:Wed Jan 13 14:47:31 BRST 2016


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


// @LINE:9
private[this] lazy val controllers_CarrinhoController_getCarrinho0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Carrinho/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_CarrinhoController_getCarrinho0_invoker = createInvoker(
controllers.CarrinhoController.getCarrinho(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "getCarrinho", Seq(classOf[String]),"GET", """""", Routes.prefix + """Carrinho/$email<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_CarrinhoController_addCarrinho1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Carrinho/add/"),DynamicPart("email", """[^/]+""",true),StaticPart("/"),DynamicPart("produto", """[^/]+""",true))))
private[this] lazy val controllers_CarrinhoController_addCarrinho1_invoker = createInvoker(
controllers.CarrinhoController.addCarrinho(fakeValue[String], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "addCarrinho", Seq(classOf[String], classOf[Long]),"GET", """""", Routes.prefix + """Carrinho/add/$email<[^/]+>/$produto<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_ProdutoController_getProduto2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_getProduto2_invoker = createInvoker(
controllers.ProdutoController.getProduto(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProduto", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Produto/$id<[^/]+>"""))
        

// @LINE:13
private[this] lazy val controllers_ProdutoController_getProdutos3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto"))))
private[this] lazy val controllers_ProdutoController_getProdutos3_invoker = createInvoker(
controllers.ProdutoController.getProdutos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProdutos", Nil,"GET", """""", Routes.prefix + """Produto"""))
        

// @LINE:14
private[this] lazy val controllers_ProdutoController_saveProduto4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Produto"))))
private[this] lazy val controllers_ProdutoController_saveProduto4_invoker = createInvoker(
controllers.ProdutoController.saveProduto(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "saveProduto", Nil,"POST", """""", Routes.prefix + """Produto"""))
        

// @LINE:16
private[this] lazy val controllers_UsuarioController_getUsuario5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_getUsuario5_invoker = createInvoker(
controllers.UsuarioController.getUsuario(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuario", Seq(classOf[String]),"GET", """""", Routes.prefix + """Usuario/$email<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_UsuarioController_getUsuarios6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario"))))
private[this] lazy val controllers_UsuarioController_getUsuarios6_invoker = createInvoker(
controllers.UsuarioController.getUsuarios(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuarios", Nil,"GET", """""", Routes.prefix + """Usuario"""))
        

// @LINE:18
private[this] lazy val controllers_UsuarioController_saveUsuario7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Usuario"))))
private[this] lazy val controllers_UsuarioController_saveUsuario7_invoker = createInvoker(
controllers.UsuarioController.saveUsuario(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "saveUsuario", Nil,"POST", """""", Routes.prefix + """Usuario"""))
        

// @LINE:22
private[this] lazy val controllers_Assets_at8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Carrinho/$email<[^/]+>""","""controllers.CarrinhoController.getCarrinho(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Carrinho/add/$email<[^/]+>/$produto<[^/]+>""","""controllers.CarrinhoController.addCarrinho(email:String, produto:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto/$id<[^/]+>""","""controllers.ProdutoController.getProduto(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto""","""controllers.ProdutoController.getProdutos()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Produto""","""controllers.ProdutoController.saveProduto()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario/$email<[^/]+>""","""controllers.UsuarioController.getUsuario(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario""","""controllers.UsuarioController.getUsuarios()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Usuario""","""controllers.UsuarioController.saveUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:9
case controllers_CarrinhoController_getCarrinho0_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_CarrinhoController_getCarrinho0_invoker.call(controllers.CarrinhoController.getCarrinho(email))
   }
}
        

// @LINE:10
case controllers_CarrinhoController_addCarrinho1_route(params) => {
   call(params.fromPath[String]("email", None), params.fromPath[Long]("produto", None)) { (email, produto) =>
        controllers_CarrinhoController_addCarrinho1_invoker.call(controllers.CarrinhoController.addCarrinho(email, produto))
   }
}
        

// @LINE:12
case controllers_ProdutoController_getProduto2_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProdutoController_getProduto2_invoker.call(controllers.ProdutoController.getProduto(id))
   }
}
        

// @LINE:13
case controllers_ProdutoController_getProdutos3_route(params) => {
   call { 
        controllers_ProdutoController_getProdutos3_invoker.call(controllers.ProdutoController.getProdutos())
   }
}
        

// @LINE:14
case controllers_ProdutoController_saveProduto4_route(params) => {
   call { 
        controllers_ProdutoController_saveProduto4_invoker.call(controllers.ProdutoController.saveProduto())
   }
}
        

// @LINE:16
case controllers_UsuarioController_getUsuario5_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_UsuarioController_getUsuario5_invoker.call(controllers.UsuarioController.getUsuario(email))
   }
}
        

// @LINE:17
case controllers_UsuarioController_getUsuarios6_route(params) => {
   call { 
        controllers_UsuarioController_getUsuarios6_invoker.call(controllers.UsuarioController.getUsuarios())
   }
}
        

// @LINE:18
case controllers_UsuarioController_saveUsuario7_route(params) => {
   call { 
        controllers_UsuarioController_saveUsuario7_invoker.call(controllers.UsuarioController.saveUsuario())
   }
}
        

// @LINE:22
case controllers_Assets_at8_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     