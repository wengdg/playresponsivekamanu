package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Pueo;
import views.html.Aukahi;
import views.html.V6;
import views.html.About;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render());
  }

  /**
   * Returns the Pueo page.
   * @return The resulting Pueo page.
   */
  public static Result pueo() {
    return ok(Pueo.render());
  }

    /**
     * Returns the Aukahi page.
     * @return The resulting Aukahi page.
     */
  public static Result aukahi() {
    return ok(Aukahi.render());
  }

  /**
   * Returns the V6 Kamanu page.
   * @return The resulting V6 Kamanu page.
   */
  public static Result v6() {
    return ok(V6.render());
  }

  /**
   * Returns the about page.
   * @return The resulting about page.
   */
  public static Result about() {
    return ok(About.render());
  }
}
