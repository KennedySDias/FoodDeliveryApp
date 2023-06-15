package br.com.fooddeliveryapp.design_system.theme.base.dark

import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Immutable
import br.com.fooddeliveryapp.design_system.theme.BorderRadius
import br.com.fooddeliveryapp.design_system.theme.Elevation
import br.com.fooddeliveryapp.design_system.theme.MotionDuration
import br.com.fooddeliveryapp.design_system.theme.Padding
import br.com.fooddeliveryapp.design_system.theme.Sizing
import br.com.fooddeliveryapp.design_system.theme.TextStyle
import br.com.fooddeliveryapp.design_system.theme.base.DesignSystem

@Immutable
object DesignSystemDark : DesignSystem {
    override val color = darkColorScheme()
    override val typography = TextStyle
    override val borderRadius = BorderRadius
    override val elevation = Elevation
    override val motionDuration = MotionDuration
    override val sizing = Sizing
    override val padding = Padding
}
