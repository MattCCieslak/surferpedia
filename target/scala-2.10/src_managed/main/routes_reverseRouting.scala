// @SOURCE:/home/matt/workspace/surferpedia/conf/routes
// @HASH:8021a5d355b9e5ce5ff67fdd7c462e876eef5719
// @DATE:Sun Oct 06 18:29:56 HST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

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
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def page1(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "page1")
}
                                                

// @LINE:10
def kanoa(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "kanoa")
}
                                                

// @LINE:8
def stephanie(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "stephanie")
}
                                                

// @LINE:9
def jeff(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jeff")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
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
    

// @LINE:7
def page1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.page1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "page1"})
      }
   """
)
                        

// @LINE:10
def kanoa : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kanoa",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kanoa"})
      }
   """
)
                        

// @LINE:8
def stephanie : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.stephanie",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stephanie"})
      }
   """
)
                        

// @LINE:9
def jeff : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jeff",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jeff"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
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
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def page1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.page1(), HandlerDef(this, "controllers.Application", "page1", Seq(), "GET", """""", _prefix + """page1""")
)
                      

// @LINE:10
def kanoa(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kanoa(), HandlerDef(this, "controllers.Application", "kanoa", Seq(), "GET", """""", _prefix + """kanoa""")
)
                      

// @LINE:8
def stephanie(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.stephanie(), HandlerDef(this, "controllers.Application", "stephanie", Seq(), "GET", """""", _prefix + """stephanie""")
)
                      

// @LINE:9
def jeff(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jeff(), HandlerDef(this, "controllers.Application", "jeff", Seq(), "GET", """""", _prefix + """jeff""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    