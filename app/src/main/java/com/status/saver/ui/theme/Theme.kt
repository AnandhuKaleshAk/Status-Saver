package com.status.saver.ui.theme

import android.app.Activity
import android.content.res.Resources.Theme
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = ThemesColors.Dark.primary,
    onPrimary = ThemesColors.Dark.background,
    surface = ThemesColors.Dark.surface,
    background = ThemesColors.Dark.background,
    secondary = ThemesColors.Dark.secondary,
    onSecondary = ThemesColors.Dark.onSecondary,
    tertiary = ThemesColors.Dark.iconColor,
    onBackground = ThemesColors.Dark.onBackground,
    onSurface = ThemesColors.Dark.tertiary,
    onTertiary = ThemesColors.Dark.onTertiary,
    primaryContainer = ThemesColors.Dark.onPopupBgColor

    )



private val LightColorScheme = lightColorScheme(
    primary = ThemesColors.Light.primary,
    onPrimary = ThemesColors.Light.background,
    surface = ThemesColors.Light.surface,
    background = ThemesColors.Light.background,
    secondary = ThemesColors.Light.secondary,
    onSecondary = ThemesColors.Light.onSecondary,
    tertiary = ThemesColors.Light.iconColor,
    onBackground = ThemesColors.Light.onBackground,
    onSurface = ThemesColors.Light.tertiary,
    onTertiary = ThemesColors.Light.onTertiary,
    primaryContainer = ThemesColors.Light.onPopupBgColor
)

@Composable
fun StatusSaverTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }


    MaterialTheme(
      colorScheme = colorScheme,
      typography = Typography,
      content = content
    )
}