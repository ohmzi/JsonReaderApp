package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class IssueDetails(
    var title: String = "",
    var subtitle: String = "",
    var showConnectionDetailsOption: Boolean = false,
    var proposedActionSectionTitle: String = "",
    var componentCTAs: ArrayList<ComponentCTA> = arrayListOf(),
    var informationBox: InformationBox? = null

) : Serializable {
    constructor() : this(
        title = "",
        subtitle = "",
        showConnectionDetailsOption = false,
        proposedActionSectionTitle = "",
        componentCTAs = ArrayList(),
        informationBox = null
    )
}
