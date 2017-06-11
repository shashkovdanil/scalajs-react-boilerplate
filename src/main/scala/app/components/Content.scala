package app.components

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._
import scalacss.ScalaCssReact._

object Content {
  val component =
    ScalaComponent.builder[Unit]("Content")
      .renderStatic(<.p(
        app.Styles.appIntro,
        "To get started, edit ",
        <.code("app/components/Main.scala"),
        " and save and reload page."))
      .build
  def apply() = component()
}
