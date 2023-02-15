package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class Footer(
    val componentCTAs: ArrayList<ComponentCTA> = arrayListOf()
) : Serializable