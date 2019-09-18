package org.saswata.toylog

import java.io.PrintStream

class StreamAppender(val minLevel: Level, val formatter: Formatter, out: PrintStream) extends Appender {
  override def accept(event: LogEvent): Unit = {
    out.println(formatter.format(event))
  }
}
