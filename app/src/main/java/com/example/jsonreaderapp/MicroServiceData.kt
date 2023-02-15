package ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model

import java.io.Serializable

data class MicroServiceData(
    val success: TroubleshootFailureSuccessData,
    val failure: TroubleshootFailureSuccessData,
    val failureNextAttempt: TroubleshootFailureSuccessData?,
    val loadingMessage: String = ""
) : Serializable