val numPattern = """\s+ADJUSTMENT-.*\|+\s+""".r

val matches = numPattern.findAllIn(" ADJUSTMENT-12| 99 bottles, 98 bottles").toArray

import training.scala.impatient.ch10._


val savingsAccount = new SavingsAccount(100) with ConsoleLogger

savingsAccount.withDraw(200)


