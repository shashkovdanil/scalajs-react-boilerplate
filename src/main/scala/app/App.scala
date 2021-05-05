package app

import app.CssSettings._
import app.components.Main
import org.scalajs.dom.document
import scalacss.ScalaCssReact._

object App extends App {
  def main(): Unit = {
    Styles.addToDocument()
    Main().renderIntoDOM(document.getElementById("root"))
  }
}
