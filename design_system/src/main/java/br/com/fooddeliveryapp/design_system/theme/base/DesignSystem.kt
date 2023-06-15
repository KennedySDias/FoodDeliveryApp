package br.com.fooddeliveryapp.design_system.theme.base

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Immutable
import br.com.fooddeliveryapp.design_system.theme.BorderRadius
import br.com.fooddeliveryapp.design_system.theme.Elevation
import br.com.fooddeliveryapp.design_system.theme.MotionDuration
import br.com.fooddeliveryapp.design_system.theme.Padding
import br.com.fooddeliveryapp.design_system.theme.Sizing
import br.com.fooddeliveryapp.design_system.theme.TextStyle

@Immutable
interface DesignSystem {
    val color: ColorScheme
    val typography: TextStyle
    val borderRadius: BorderRadius
    val elevation: Elevation
    val motionDuration: MotionDuration
    val sizing: Sizing
    val padding: Padding
}
