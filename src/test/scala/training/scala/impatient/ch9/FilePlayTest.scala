package training.scala.impatient.ch9

import org.scalatest.FunSuite

/**
 * Created by akilan on 15/2/15.
 */
class FilePlayTest extends FunSuite {

  test ("reverseFileContent"){
    val filePlay = new FilePlay()
    assert("tnetnoc_yrartibra" === filePlay.reverseFileContent("src/test/resources/test.txt"))
  }

  test ("readTestFile") {
     val filePlay = new FilePlay()
     assert("arbitrary_content" === filePlay.readTestFile)
   }


}
