package br.com.fooddeliveryapp.design_system.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import br.com.fooddeliveryapp.design_system.theme.base.DesignSystem
import br.com.fooddeliveryapp.design_system.theme.base.LocalBorderRadius
import br.com.fooddeliveryapp.design_system.theme.base.LocalColorScheme
import br.com.fooddeliveryapp.design_system.theme.base.LocalElevation
import br.com.fooddeliveryapp.design_system.theme.base.LocalMotionDuration
import br.com.fooddeliveryapp.design_system.theme.base.LocalSizing
import br.com.fooddeliveryapp.design_system.theme.base.LocalSpacingInset
import br.com.fooddeliveryapp.design_system.theme.base.LocalTypography
import br.com.fooddeliveryapp.design_system.theme.base.dark.DarkColors
import br.com.fooddeliveryapp.design_system.theme.base.dark.DesignSystemDark
import br.com.fooddeliveryapp.design_system.theme.base.light.DesignSystemLight
import br.com.fooddeliveryapp.design_system.theme.base.light.LightColors

@Composable
fun AppTheme(
    context: DesignSystem = systemContext(),
    content: @Composable() () -> Unit
) {
    CompositionLocalProvider(
        LocalColorScheme provides context.color,
        LocalTypography provides context.typography,
        LocalBorderRadius provides context.borderRadius,
        LocalElevation provides context.elevation,
        LocalMotionDuration provides context.motionDuration,
        LocalSizing provides context.sizing,
        LocalSpacingInset provides context.padding,
    ) {
        val colors = if (context is DesignSystemLight) {
            LightColors
        } else {
            DarkColors
        }

        MaterialTheme(
            colorScheme = colors,
            content = content
        )
    }
}

@Composable
internal fun systemContext(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
): DesignSystem {
    return if (isDarkTheme) {
        DesignSystemDark
    } else {
        DesignSystemLight
    }
}

object AppTheme {
    val color: ColorScheme
        @Composable
        get() = LocalColorScheme.current

    val typography: TextStyle
        @Composable
        get() = LocalTypography.current

    val borderRadius: BorderRadius
        @Composable
        get() = LocalBorderRadius.current

    val elevation: Elevation
        @Composable
        get() = LocalElevation.current

    val motionDuration: MotionDuration
        @Composable
        get() = LocalMotionDuration.current

    val sizing: Sizing
        @Composable
        get() = LocalSizing.current

    val padding: Padding
        @Composable
        get() = LocalSpacingInset.current
}