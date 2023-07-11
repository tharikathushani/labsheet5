package package1

object Q5 {
  def main(args:Array[String]): Unit = {
    println(sumEven(10))
  }
  def sumEven(n: Int): Int = {
    if (n <= 0) {
      0
    } else if (n % 2 == 0) {
      n + sumEven(n - 2)
    } else {
      sumEven(n - 1)
    }
  }



}
