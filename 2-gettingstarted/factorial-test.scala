def factorial(n: Int): Int =
  def go(n: Int, acc: Int): Int =
    if n <= 0 then acc
    else go(n - 1, n * acc)
 
  go(n, 1)

@main def RunMyThing: Unit =
  val fac = factorial(10)
  println("My thing: " + fac.toString)