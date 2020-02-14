package example


object Hello extends Greeting with App {
  println(greeting)

  def myProcedure = { 
    42 == 42 
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
