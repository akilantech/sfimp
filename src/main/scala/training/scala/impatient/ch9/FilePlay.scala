package training.scala.impatient.ch9

/**
 * Created by akilan on 15/2/15.
 */
class FilePlay {

  import scala.io.Source


  def readTestFile = {
    val fileString = Source.fromFile("src/test/resources/test.txt")
    fileString.mkString
  }


}
