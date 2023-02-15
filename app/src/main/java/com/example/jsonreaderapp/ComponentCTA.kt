package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class ComponentCTA(
    var ctaTitle: String = "",
    var ctaSubtitle: String? = null,
    var type: String = "",
    var value: String = "",
    var isMajorCTA: Boolean? = true,
    var paramInput: String? = null,
    var iconUrl: String? = null,
) : Serializable
