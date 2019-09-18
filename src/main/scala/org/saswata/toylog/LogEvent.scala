package org.saswata.toylog

case class LogEvent(
    level: Level,
    origin: String,
    message: String,
    cause: Option[Throwable] = None,
    timestamp: Long = System.currentTimeMillis()
)
