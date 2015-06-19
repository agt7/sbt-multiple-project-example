package controllers

import play.api._
import play.api.mvc._

class HelloApp extends Controller {

  def index = Action {
    Ok("Hello scala blog")
  }

}
