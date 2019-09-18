package org.saswata.toylog

trait ToyLogger {
  def log(level: Level, message: String): Unit
  def log(level: Level, message: String, cause: Throwable): Unit

  // TODO
  def enable(level: Level): Boolean = ???
  def disable(level: Level): Boolean = ???
  def subscribe(appender: Appender): Boolean = ???
  def unsubscribe(appender: Appender): Boolean = ???
}

class DefaultLogger(origin: String, appenders: Seq[Appender]) extends ToyLogger {

  override def log(level: Level, message: String): Unit = {
    notify(level, message)
  }

  override def log(level: Level, message: String, cause: Throwable): Unit = {
    notify(level, message, Some(cause))
  }

  private def eligibleAppenders(level: Level): Seq[Appender] = {
    appenders.filter(_.minLevel <= level)
  }

  private def notify(level: Level, message: String, cause: Option[Throwable] = None): Unit = {
    val event = LogEvent(level, origin, message, cause)
    eligibleAppenders(level).foreach(it => it.accept(event))
  }
}

trait ToyLoggable {
  protected val logger: ToyLogger = new DefaultLogger(getClass.getName, ToyLoggerConfig.appenders)
}
