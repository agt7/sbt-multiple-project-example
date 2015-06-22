package utils

import scala.language.implicitConversions

case class RichString(s: String) {

  def utilMethod: String = {
    s ++ "use util methods"
  }

}

object RichString {
    implicit def stringToRich(s: String): RichString = RichString(s)
}
