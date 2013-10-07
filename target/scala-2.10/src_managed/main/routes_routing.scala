// @SOURCE:/home/matt/workspace/surferpedia/conf/routes
// @HASH:8021a5d355b9e5ce5ff67fdd7c462e876eef5719
// @DATE:Sun Oct 06 18:29:56 HST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_page11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("page1"))))
        

// @LINE:8
private[this] lazy val controllers_Application_stephanie2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stephanie"))))
        

// @LINE:9
private[this] lazy val controllers_Application_jeff3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jeff"))))
        

// @LINE:10
private[this] lazy val controllers_Application_kanoa4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("kanoa"))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """page1""","""controllers.Application.page1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stephanie""","""controllers.Application.stephanie()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jeff""","""controllers.Application.jeff()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kanoa""","""controllers.Application.kanoa()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_page11(params) => {
   call { 
        invokeHandler(controllers.Application.page1(), HandlerDef(this, "controllers.Application", "page1", Nil,"GET", """""", Routes.prefix + """page1"""))
   }
}
        

// @LINE:8
case controllers_Application_stephanie2(params) => {
   call { 
        invokeHandler(controllers.Application.stephanie(), HandlerDef(this, "controllers.Application", "stephanie", Nil,"GET", """""", Routes.prefix + """stephanie"""))
   }
}
        

// @LINE:9
case controllers_Application_jeff3(params) => {
   call { 
        invokeHandler(controllers.Application.jeff(), HandlerDef(this, "controllers.Application", "jeff", Nil,"GET", """""", Routes.prefix + """jeff"""))
   }
}
        

// @LINE:10
case controllers_Application_kanoa4(params) => {
   call { 
        invokeHandler(controllers.Application.kanoa(), HandlerDef(this, "controllers.Application", "kanoa", Nil,"GET", """""", Routes.prefix + """kanoa"""))
   }
}
        

// @LINE:13
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     