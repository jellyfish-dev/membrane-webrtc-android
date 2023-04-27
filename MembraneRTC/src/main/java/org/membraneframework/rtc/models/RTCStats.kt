package org.membraneframework.rtc.models

import java.math.BigInteger

data class QualityLimitationDurations(
    val bandwidth: Double,
    val cpu: Double,
    val none: Double,
    val other: Double
)

data class RTCOutboundStats(
    val kind: String? = "",
    val rid: String? = "",
    val bytesSent: BigInteger? = BigInteger("0"),
    val targetBitrate: Double? = 0.0,
    val packetsSent: Long? = 0,
    val framesEncoded: Long? = 0,
    val framesPerSecond: Double? = 0.0,
    val frameWidthHeightRatio: Double? = 0.0,
    val qualityLimitationDurations: QualityLimitationDurations?
)

data class RTCInboundStats(
    val kind: String? = "",
    val jitter: Double? = 0.0,
    val packetsLost: Int? = 0,
    val packetsReceived: Long? = 0,
    val bytesReceived: BigInteger? = BigInteger("0"),
    val framesReceived: Int? = 0,
    val frameWidthHeightRatio: Double? = 0.0,
    val framesPerSecond: Double? = 0.0,
    val framesDropped: Long? = 0
)
