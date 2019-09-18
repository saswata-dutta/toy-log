package org.saswata.toylog

import java.io.{File, PrintStream}

import org.saswata.toylog.Level._

object ToyLoggerConfig {

  val appenders: Seq[Appender] = Seq(
    new StreamAppender(WARN, LogLineFormatter, System.out),
    new StreamAppender(ERROR, LogLineFormatter, System.err),
    new StreamAppender(TRACE, LogLineFormatter, new PrintStream(new File("all.log"))),
    new StreamAppender(FATAL, LogLineFormatter, new PrintStream(new File("fatal.log")))
  )
}
