package training.scala.impatient
import org.scalatest._

/**
 * Created by akilan on 1/2/15.
 */
class CommonTest extends FlatSpec with Matchers {

  import training.scala.impatient.ch6._

  "Account new sequence" should "return" in {

    assert( 1 == Account.newSequence )

  }

  "Account object "  should "create" in {
      val account = Account(115)
      assert( 0 == account.initialBalance)
  }

}
