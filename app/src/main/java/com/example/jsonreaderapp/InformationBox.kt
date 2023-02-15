package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

class InformationBox(
    val title: String? = null,
    val bottomSheetTitle: String? = null,
    val value: String? = null,
    val iconUrl: String? = null,
    val isChatOrCallCtaVisible: Boolean? = true,
) : Serializable {
    constructor() : this(
        title = null,
        bottomSheetTitle = null,
        value = null,
        iconUrl = null,
        isChatOrCallCtaVisible = false
    )
}