package app.components

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._
import scalacss.ScalaCssReact._

object Main {
  val component = ScalaComponent.builder[Unit]("Main")
    .renderStatic(<.div(
      app.Styles.app,
      Header(),
      Content()))
    .build
  def apply() = component()
}
