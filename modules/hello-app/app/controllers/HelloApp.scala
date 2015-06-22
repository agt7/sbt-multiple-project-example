package controllers

import play.api._
import play.api.mvc._
import utils.RichString._

object HelloApp extends Controller {

  def index = Action {
    Ok("Hello scala blog ".utilMethod)
  }

}
