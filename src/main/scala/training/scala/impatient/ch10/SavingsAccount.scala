package training.scala.impatient.ch10

import training.scala.impatient.ch6.Account

/**
 * Created by akilan on 4/3/15.
 */
class SavingsAccount extends Account with Logged {

  def withDraw(amount: Double ) ={
      if( amount > initialBalance ){ log("Insufficient balance")}
  }
}
