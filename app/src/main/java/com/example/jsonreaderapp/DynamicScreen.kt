package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class DynamicScreen(
    val requestingCode: String,
    val codeDescription: String,
    val firstScreenCode: String,
    val screens: ArrayList<Screen>
) : Serializable

