// @SOURCE:/Users/percivalslucena/loja/webservices/conf/routes
// @HASH:779cf2da771102fffb3c59806c43b660d0e0d5e2
// @DATE:Wed Mar 09 17:32:32 BRT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:32
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:13
// @LINE:8
// @LINE:6
package controllers {

// @LINE:32
// @LINE:6
class ReverseAssets {


// @LINE:32
// @LINE:6
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:6
case (file) if file == "index.html" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "index.html")))
  Call("GET", _prefix)
                                         
// @LINE:32
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:24
// @LINE:23
// @LINE:22
class ReverseProdutoController {


// @LINE:24
def saveProduto(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "Produto")
}
                        

// @LINE:23
def getProdutos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Produto")
}
                        

// @LINE:22
def getProduto(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Produto/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:13
// @LINE:8
class ReverseApiHelpController {


// @LINE:8
def getResources(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "api-docs")
}
                        

// @LINE:13
def getResource(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/api/produto")))
   Call("GET", _prefix + { _defaultPrefix } + "api-docs/api/produto")
}
                        

}
                          

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseCarrinhoController {


// @LINE:17
def getCarrinho(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Carrinho/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:19
def removeCarrinho(email:String, produto:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Carrinho/remove/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[Long]].unbind("produto", produto))
}
                        

// @LINE:18
def addCarrinho(email:String, produto:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Carrinho/add/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[Long]].unbind("produto", produto))
}
                        

}
                          

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseUsuarioController {


// @LINE:28
def saveUsuario(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "Usuario")
}
                        

// @LINE:26
def getUsuario(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Usuario/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:27
def getUsuarios(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Usuario")
}
                        

}
                          
}
                  


// @LINE:32
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:13
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:32
// @LINE:6
class ReverseAssets {


// @LINE:32
// @LINE:6
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (file == """ + implicitly[JavascriptLitteral[String]].to("index.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:24
// @LINE:23
// @LINE:22
class ReverseProdutoController {


// @LINE:24
def saveProduto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.saveProduto",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Produto"})
      }
   """
)
                        

// @LINE:23
def getProdutos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.getProdutos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Produto"})
      }
   """
)
                        

// @LINE:22
def getProduto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.getProduto",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Produto/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:8
class ReverseApiHelpController {


// @LINE:8
def getResources : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApiHelpController.getResources",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api-docs"})
      }
   """
)
                        

// @LINE:13
def getResource : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApiHelpController.getResource",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api-docs/api/produto"})
      }
   """
)
                        

}
              

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseCarrinhoController {


// @LINE:17
def getCarrinho : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CarrinhoController.getCarrinho",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Carrinho/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:19
def removeCarrinho : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CarrinhoController.removeCarrinho",
   """
      function(email,produto) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Carrinho/remove/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("produto", produto)})
      }
   """
)
                        

// @LINE:18
def addCarrinho : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CarrinhoController.addCarrinho",
   """
      function(email,produto) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Carrinho/add/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("produto", produto)})
      }
   """
)
                        

}
              

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseUsuarioController {


// @LINE:28
def saveUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.saveUsuario",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Usuario"})
      }
   """
)
                        

// @LINE:26
def getUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.getUsuario",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Usuario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:27
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
        


// @LINE:32
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:13
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:32
// @LINE:6
class ReverseAssets {


// @LINE:6
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:24
// @LINE:23
// @LINE:22
class ReverseProdutoController {


// @LINE:24
def saveProduto(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.saveProduto(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "saveProduto", Seq(), "POST", """""", _prefix + """Produto""")
)
                      

// @LINE:23
def getProdutos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.getProdutos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProdutos", Seq(), "GET", """""", _prefix + """Produto""")
)
                      

// @LINE:22
def getProduto(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.getProduto(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "getProduto", Seq(classOf[Long]), "GET", """""", _prefix + """Produto/$id<[^/]+>""")
)
                      

}
                          

// @LINE:13
// @LINE:8
class ReverseApiHelpController {


// @LINE:8
def getResources(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApiHelpController.getResources(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ApiHelpController", "getResources", Seq(), "GET", """""", _prefix + """api-docs""")
)
                      

// @LINE:13
def getResource(path:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApiHelpController.getResource(path), HandlerDef(this.getClass.getClassLoader, "", "controllers.ApiHelpController", "getResource", Seq(classOf[String]), "GET", """""", _prefix + """api-docs/api/produto""")
)
                      

}
                          

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseCarrinhoController {


// @LINE:17
def getCarrinho(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CarrinhoController.getCarrinho(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "getCarrinho", Seq(classOf[String]), "GET", """""", _prefix + """Carrinho/$email<[^/]+>""")
)
                      

// @LINE:19
def removeCarrinho(email:String, produto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CarrinhoController.removeCarrinho(email, produto), HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "removeCarrinho", Seq(classOf[String], classOf[Long]), "GET", """""", _prefix + """Carrinho/remove/$email<[^/]+>/$produto<[^/]+>""")
)
                      

// @LINE:18
def addCarrinho(email:String, produto:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CarrinhoController.addCarrinho(email, produto), HandlerDef(this.getClass.getClassLoader, "", "controllers.CarrinhoController", "addCarrinho", Seq(classOf[String], classOf[Long]), "GET", """""", _prefix + """Carrinho/add/$email<[^/]+>/$produto<[^/]+>""")
)
                      

}
                          

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseUsuarioController {


// @LINE:28
def saveUsuario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.saveUsuario(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "saveUsuario", Seq(), "POST", """""", _prefix + """Usuario""")
)
                      

// @LINE:26
def getUsuario(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.getUsuario(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuario", Seq(classOf[String]), "GET", """""", _prefix + """Usuario/$email<[^/]+>""")
)
                      

// @LINE:27
def getUsuarios(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.getUsuarios(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "getUsuarios", Seq(), "GET", """""", _prefix + """Usuario""")
)
                      

}
                          
}
        
    