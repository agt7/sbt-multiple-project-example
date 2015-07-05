package controllers

import play.api.mvc._
import utils.RichString._

object HelloPlayApp extends Controller {

  def index = Action {
    Ok("Hello play app! ".addNowDateTime())
  }

}
