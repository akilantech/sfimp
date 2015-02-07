package training.scala.impatient.ch6

/**
 * Created by akilan on 1/2/15.
 */
class Account {

}


object Account {

  private var lastNumber = 0

  def newSequence = { lastNumber = lastNumber + 1
                      lastNumber }


}
