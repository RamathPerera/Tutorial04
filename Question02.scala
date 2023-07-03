object Question02 extends App{
  printf("Enter Number : ")
  var number = scala.io.StdIn.readInt()

  def CheckNumber(num: Int) = num match {
    case n if n < 0 => "Negative"
    case n if n == 0 => "Zero"
    case n if n % 2 == 0 => "Even"
    case _ => "Odd"
  }

  println(CheckNumber(number))
}
