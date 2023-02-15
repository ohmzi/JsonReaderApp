package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class Header(
    val title: String = "",
    val subtitle: String = "",
    val eta: String = "",
    val moreAbout: ComponentCTA? = null,
) : Serializable