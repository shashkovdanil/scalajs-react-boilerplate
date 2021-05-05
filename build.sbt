import org.scalajs.linker.interface.ModuleInitializer
lazy val root = (project in file("."))
  .settings(
    name := "Scala.js React boilerplate",
    scalaVersion := "2.13.5",
    version := "0.0.2"
  )
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

scalaJSUseMainModuleInitializer := true
Compile / scalaJSModuleInitializers +=
  ModuleInitializer.mainMethod("app.App", "main")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "1.1.0",
  "com.github.japgolly.scalajs-react" %%% "core" % "1.7.7",
  "com.github.japgolly.scalacss" %%% "core" % "0.7.0",
  "com.github.japgolly.scalacss" %%% "ext-react" % "0.7.0"
)

Compile / npmDependencies ++= Seq(
  "react" -> "16.13.1",
  "react-dom" -> "16.13.1"
)
