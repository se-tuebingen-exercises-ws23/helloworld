import scala.io.StdIn.readLine

@main
def sayHello = {
  println("Hey there, what's your name? (please press <Enter> after entering your name)")

  val name = readLine()

  val greeting =
    s"""Hi there, ${name}, nice to see you!
      |
      |Seems like you have all dependencies set up correctly!
      |Apparently, this application is running on ${os} with JDK ${jdkVersion}!
      |""".stripMargin

  println(greeting)
}


def jdkVersion = System.getProperty("java.version")

def os = System.getProperty("os.name")
