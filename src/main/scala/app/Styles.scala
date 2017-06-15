package app

import CssSettings._

object Styles extends StyleSheet.Inline {
  import dsl._

  val mainFont = fontFace("mainFont")(
    _.src("local(Tahoma)")
      .fontStretch.ultraCondensed
      .fontWeight._200
  )

  val appHeader = style(
    backgroundColor.rgb(34, 34, 34),
    height(150 px),
    padding(20 px),
    color.white
  )

  val appLogo = style(
    height(80 px)
  )

  val appIntro = style(
    fontSize.large
  )

  val app = style(
    textAlign.center,
    fontFamily(mainFont)
  )

  val body = style(
    margin(0 px),
    padding(0 px)
  )
}
