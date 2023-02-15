package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class Screen(
    val screenCode: String = "",
    val templateId: String = "",
    val footer: Footer? = null,
    val header: Header? = null,
    val issueDetails: IssueDetails? = null,
    val components: ArrayList<Component> = arrayListOf(),
    val microServiceData: MicroServiceData? = null
) : Serializable