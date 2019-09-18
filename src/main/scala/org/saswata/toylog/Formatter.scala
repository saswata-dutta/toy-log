package org.saswata.toylog

import java.io.PrintWriter
import java.io.StringWriter

trait Formatter {
  def format(event: LogEvent): String
}

object LogLineFormatter extends Formatter {
  override def format(event: LogEvent): String = {
    val sw = new StringWriter()
    val pw = new PrintWriter(sw)

    pw.println(s"${event.timestamp} | ${event.origin} | ${event.level.name} | ${event.message}")
    event.cause.foreach(it => it.printStackTrace(pw))
    pw.close()
    sw.close()

    sw.toString
  }
}
