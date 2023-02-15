package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class ImageContent(
    val title: String? = null,
    val subtitle: String? = null,
    val image: String? = null,
    val informationBox: InformationBox? = null
) : Serializable