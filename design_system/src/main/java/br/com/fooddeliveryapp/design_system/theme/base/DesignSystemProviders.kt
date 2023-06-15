package br.com.fooddeliveryapp.design_system.theme.base

import androidx.compose.runtime.staticCompositionLocalOf
import br.com.fooddeliveryapp.design_system.theme.BorderRadius
import br.com.fooddeliveryapp.design_system.theme.Elevation
import br.com.fooddeliveryapp.design_system.theme.MotionDuration
import br.com.fooddeliveryapp.design_system.theme.Padding
import br.com.fooddeliveryapp.design_system.theme.Sizing
import br.com.fooddeliveryapp.design_system.theme.TextStyle
import br.com.fooddeliveryapp.design_system.theme.base.light.LightColors

val LocalColorScheme = staticCompositionLocalOf {
    LightColors
}

val LocalTypography = staticCompositionLocalOf {
    TextStyle
}

val LocalBorderRadius = staticCompositionLocalOf {
    BorderRadius
}

val LocalElevation = staticCompositionLocalOf {
    Elevation
}

val LocalMotionDuration = staticCompositionLocalOf {
    MotionDuration
}

val LocalSizing = staticCompositionLocalOf {
    Sizing
}

val LocalSpacingInset = staticCompositionLocalOf {
    Padding
}