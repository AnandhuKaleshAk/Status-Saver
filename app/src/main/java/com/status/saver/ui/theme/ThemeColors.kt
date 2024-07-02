package com.status.saver.ui.theme

import androidx.compose.ui.graphics.Color


sealed  class ThemesColors(
    val primary: Color,
    val secondary:Color,
    val onSecondary:Color,
    val background: Color,
    val surface: Color,
    val iconColor:Color,
    val onBackground:Color,
    val tertiary:Color,
    val onTertiary:Color,
    val onPopupBgColor:Color

    ){

    data object Dark: ThemesColors(
         Black, Black, LightBrown,Black, Black, Green, Black, LightBlack, White, LightBlack
    )
    data object Light : ThemesColors(
       Green, White, Black, Green, Green, Green, LightWhite, Green, White, LightGrey
    )


}