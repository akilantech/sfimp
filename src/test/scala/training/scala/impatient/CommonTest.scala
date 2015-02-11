package training.scala.impatient
import org.scalatest._

/**
 * Created by akilan on 1/2/15.
 */
class CommonTest extends FunSuite {

  import training.scala.impatient.ch6._

  test("Account new sequence")   {
      assert( 1 == Account.newSequence )
  }

  test("Account object ")  {
      val account = Account(115)
      assert( 115 == account.initialBalance)
  }

}
