package org.saswata.service

import org.saswata.toylog.Level._
import org.saswata.toylog.ToyLogger
import org.saswata.toylog.ToyLoggable


class Bar extends ToyLoggable {

  def bar(): Unit = {
    logger.log(INFO, "Bar.bar() called")
    logger.log(ERROR, "Error in bar", new IllegalArgumentException("Must print stack"))
  }

}
