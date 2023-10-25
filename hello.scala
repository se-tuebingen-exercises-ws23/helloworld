import scala.io.StdIn.readLine

trait Messages {
  val welcome: String
}

object EN extends Messages {
  val welcome = "Hey there, what's your name?! (please press <ENTER> after entering your name)"
}

@main
def sayHello = {
  println(EN.welcome)

  val name = readLine()

  val greeting =
    s"""Hello there, ${name}, nice to see you
      |
      |Seems like you have all dependencies set up correctly!
      |Apparently, this application is running on ${os} with JDK ${jdkVersion}!
      |""".stripMargin

  println(greeting)
}


def jdkVersion = System.getProperty("java.version")

def os = System.getProperty("os.name")
