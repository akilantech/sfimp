package training.scala.impatient.ch9

import scala.io.Source

/**
 * Created by akilan on 15/2/15.
 */
class FilePlay {

  def wordsExceedsLength(length: Int, fileName: String) = {
     Source.fromFile(fileName).mkString.split("\\s+").filter( _.length>length )
  }

  def readTestFile = {
    val fileString = Source.fromFile("src/test/resources/test.txt")
    fileString.mkString
  }

  def reverseFileContent(fileName:String) ={
    val fileString = Source.fromFile(fileName)
    fileString.mkString.reverse
  }


}
