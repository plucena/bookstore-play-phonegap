// @SOURCE:/Users/percivalslucena/loja/webservices/conf/routes
// @HASH:70332043391e284873755a27d96f1f5266424237
// @DATE:Wed Jan 13 14:34:28 BRST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
package controllers {

// @LINE:9
class ReverseCarrinhoController {


// @LINE:9
def getCarrinho(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Carrinho/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
class ReverseProdutoController {


// @LINE:13
def saveProduto(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "Produto")
}
                        

// @LINE:12
def getProdutos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Produto")
}
                        

// @LINE:11
def getProduto(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Produto/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:21
class ReverseAssets {


// @LINE:21
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseUsuarioController {


// @LINE:17
def saveUsuario(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "Usuario")
}
                        

// @LINE:15
def getUsuario(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Usuario/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:16
def getUsuarios(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Usuario")
}
                        

}
                          
}
                  


// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseCarrinhoController {


// @LINE:9
def getCarrinho : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CarrinhoController.getCarrinho",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Carrinho/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
class ReverseProdutoController {


// @LINE:13
def saveProduto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.saveProduto",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Produto"})
      }
   """
)
                        

// @LINE:12
def getProdutos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.getProdutos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Produto"})
      }
   """
)
                        

// @LINE:11
def getProduto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.getProduto",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Produto/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:21
class ReverseAssets {


// @LINE:21
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseUsuarioController {


// @LINE:17
def saveUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.saveUsuario",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Usuario"})
      }
   """
)
                        

// @LINE:15
def getUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.getUsuario",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Usuario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:16
def getUsuarios : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.getUsuarios",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Usuario"})
      }
   """
)
                        

}
              
}
        


// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
package controllers.ref {


// @LINE:9
class ReverseCarrinhoController {


// @LINE:9
def getCarrinho(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CarrinhoController.getCarrinho(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "getCarrinho", Seq(classOf[String]), "GET", """""", _prefix + """Carrinho/$email<[^/]+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
class ReverseProdutoController {


// @LINE:13
def saveProduto(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.saveProduto(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "saveProduto", Seq(), "POST", """""", _prefix + """Produto""")
)
                      

// @LINE:12
def getProdutos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.getProdutos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProdutos", Seq(), "GET", """""", _prefix + """Produto""")
)
                      

// @LINE:11
def getProduto(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.getProduto(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProduto", Seq(classOf[Long]), "GET", """""", _prefix + """Produto/$id<[^/]+>""")
)
                      

}
                          

// @LINE:21
class ReverseAssets {


// @LINE:21
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseUsuarioController {


// @LINE:17
def saveUsuario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.saveUsuario(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "saveUsuario", Seq(), "POST", """""", _prefix + """Usuario""")
)
                      

// @LINE:15
def getUsuario(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.getUsuario(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuario", Seq(classOf[String]), "GET", """""", _prefix + """Usuario/$email<[^/]+>""")
)
                      

// @LINE:16
def getUsuarios(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.getUsuarios(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuarios", Seq(), "GET", """""", _prefix + """Usuario""")
)
                      

}
                          
}
        
    