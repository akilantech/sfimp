val numPattern = """\s+ADJUSTMENT-.*\|+\s+""".r

val matches = numPattern.findAllIn(" ADJUSTMENT-12| 99 bottles, 98 bottles").toArray

import training.scala.impatient.ch10._


val savingsAccount = new SavingsAccount(100) with ConsoleLogger

savingsAccount.withDraw(200)

val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
egg.translate(10, -10)
egg.grow(10, 20)


val f : String => String = {case "ping" => "pong" }




