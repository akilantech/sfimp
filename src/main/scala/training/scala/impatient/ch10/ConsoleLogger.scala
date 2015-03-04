package training.scala.impatient.ch10

/**
 * Created by akilan on 4/3/15.
 */
trait ConsoleLogger extends Logged {

  override def log(msg:String ) ={
    println( msg )
  }

}
