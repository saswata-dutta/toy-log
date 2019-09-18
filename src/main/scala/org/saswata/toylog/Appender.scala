package org.saswata.toylog

trait Appender {
  def minLevel: Level
  def formatter: Formatter
  def accept(event: LogEvent): Unit
}
