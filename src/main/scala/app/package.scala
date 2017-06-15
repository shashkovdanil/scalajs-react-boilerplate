package object app {

  // This allows Scala.JS to choose dev settings during fastOptJS, and prod settings during fullOptJS.
  val CssSettings = scalacss.devOrProdDefaults

}
