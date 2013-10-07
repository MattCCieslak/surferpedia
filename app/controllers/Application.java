package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Page1;
import views.html.Stephanie;
import views.html.Jeff;
import views.html.Kanoa;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns the stephanie page.
   * @return the stephanie page.
   */
  public static Result stephanie() {
    return ok(Stephanie.render("Stephanie Gilmore's page"));
    
  }
  
  /**
   * Returns the jeff page.
   * @return the jeff page.
   */
  public static Result jeff() {
    return ok(Jeff.render("Jeff Hakman's page"));
    
  }
  
  /**
   * Returns the kanoa page.
   * @return the kanoa page.
   */
  public static Result kanoa() {
    return ok(Kanoa.render("Kanoa Igarashi's page"));
    
  }
  
}
