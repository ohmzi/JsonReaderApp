package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class Component(
    val componentUniqueId: String = "",
    val componentTitle: String = "",
    val componentSubtitle: String = "",
    val componentDetails: String = "",
    val componentType: String = "",
    val imageContents: ArrayList<ImageContent> = arrayListOf(),
    val componentCTAs: ArrayList<ComponentCTA> = arrayListOf(),
    val informationBox: InformationBox? = null
) : Serializable