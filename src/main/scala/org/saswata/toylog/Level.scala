package org.saswata.toylog

final case class Level(level: Int, name: String) extends Ordered[Level] {
  override def compare(that: Level): Int = level.compare(that.level)
}

object Level {
  val FATAL = Level(100, "FATAL")
  val ERROR = Level(80, "ERROR")
  val WARN = Level(60, "WARN")
  val INFO = Level(50, "INFO")
  val DEBUG = Level(30, "DEBUG")
  val TRACE = Level(10, "TRACE")
}
