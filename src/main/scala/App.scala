import org.saswata.service.{Bar, Foo}
import org.saswata.toylog.Level._
import org.saswata.toylog.ToyLoggable

object App extends ToyLoggable {
  
  def main(args: Array[String]): Unit = {
    logger.log(INFO, "this is from main")
    Foo.foo()
    (new Bar).bar()
    logger.log(FATAL, "end all")
  }

}
