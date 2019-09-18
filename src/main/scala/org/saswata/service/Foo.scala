package org.saswata.service

import org.saswata.toylog.Level._
import org.saswata.toylog.ToyLogger
import org.saswata.toylog.ToyLoggable


object Foo extends ToyLoggable {

  def foo(): Unit = {
    logger.log(TRACE, "from Foo.foo() called")
    logger.log(WARN, "this is from Foo.foo()")
    logger.log(DEBUG, "another from Foo.foo()")
  }
}
