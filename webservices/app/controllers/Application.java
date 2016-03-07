package controllers;

import play.*;
import play.mvc.*;

public class Application extends Controller {

  /*
  * Define any extra CORS headers needed for option requests (see http://enable-cors.org/server.html for more info)
  */
  public static Result preflight(String all) {
    response().setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
    response().setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, X-Custom-Header");
    return ok();
  }

}