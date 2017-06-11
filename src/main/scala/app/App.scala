package app

import app.components.Main

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import scalacss.Defaults._
import scalacss.ScalaCssReact._

object App extends JSApp {
  def main(): Unit = {
    Styles.addToDocument()
    Main().renderIntoDOM(document.getElementById("root"))
  }
}
