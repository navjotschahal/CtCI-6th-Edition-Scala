//> using scala "3.7.0"

@main def hello: Unit =
  println("Hello world!")
  println(msg)

def msg = 
  s"""I was compiled with:
     |  - Scala 3 compiler: ${scala.util.Properties.versionString}
     |  - Standard library: ${scala.util.Properties.versionNumberString}
     |""".stripMargin
