package utils

import org.joda.time.DateTime

case class RichString(s: String) {

  def addNowDateTime(): String = s ++ DateTime.now.toString("yyyy-MM-dd hh:mm:ss.sss")

}

object RichString {
    implicit def stringToRich(s: String): RichString = RichString(s)
}
