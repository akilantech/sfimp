val numPattern = """\s+ADJUSTMENT-.*\|+\s+""".r

val matches = numPattern.findAllIn(" ADJUSTMENT-12| 99 bottles, 98 bottles").toArray

