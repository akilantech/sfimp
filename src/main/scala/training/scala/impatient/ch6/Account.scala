package training.scala.impatient.ch6

/**
 * Created by akilan on 1/2/15.
 */
class Account private (val id: Int, val initialBalance: Double)  {

}


object Account {

  private var lastNumber = 0

  def newSequence = { lastNumber = lastNumber + 1
                      lastNumber }

  def apply(amount :Double ) = {
    new Account(newSequence,amount)
  }

}
