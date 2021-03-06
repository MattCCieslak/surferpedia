// @SOURCE:C:/Users/Diana/Desktop/surferpedia/conf/routes
// @HASH:30f01c3ef2f729baf92cd795c516e2520a7733c9
// @DATE:Wed Oct 09 11:01:39 HST 2013


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
        

// @LINE:11
private[this] lazy val controllers_Application_jake5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jake"))))
        

// @LINE:12
private[this] lazy val controllers_Application_laird6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("laird"))))
        

// @LINE:13
private[this] lazy val controllers_Application_carissa7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("carissa"))))
        

// @LINE:17
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """page1""","""controllers.Application.page1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stephanie""","""controllers.Application.stephanie()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jeff""","""controllers.Application.jeff()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kanoa""","""controllers.Application.kanoa()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jake""","""controllers.Application.jake()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """laird""","""controllers.Application.laird()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """carissa""","""controllers.Application.carissa()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:11
case controllers_Application_jake5(params) => {
   call { 
        invokeHandler(controllers.Application.jake(), HandlerDef(this, "controllers.Application", "jake", Nil,"GET", """""", Routes.prefix + """jake"""))
   }
}
        

// @LINE:12
case controllers_Application_laird6(params) => {
   call { 
        invokeHandler(controllers.Application.laird(), HandlerDef(this, "controllers.Application", "laird", Nil,"GET", """""", Routes.prefix + """laird"""))
   }
}
        

// @LINE:13
case controllers_Application_carissa7(params) => {
   call { 
        invokeHandler(controllers.Application.carissa(), HandlerDef(this, "controllers.Application", "carissa", Nil,"GET", """""", Routes.prefix + """carissa"""))
   }
}
        

// @LINE:17
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     