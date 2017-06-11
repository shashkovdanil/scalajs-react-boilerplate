package app.components

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._
import scalacss.ScalaCssReact._

object Header {
  val component =
    ScalaComponent.builder[Unit]("Header")
      .renderStatic(<.div(
        app.Styles.appHeader,
        <.img(
          app.Styles.appLogo,
          ^.src := "app/logo/scala-js-logo.svg"),
        <.img(
          app.Styles.appLogo,
          ^.src := "app/logo/react-logo.svg"),
        <.h2("Welcome to Scala.js and React")
      ))
      .build
  def apply() = component()
}
