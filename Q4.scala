package package1

object Q4 {
def main(args:Array[String]): Unit = {

  println(isEven(4))
  println(isEven(7))

  println(isOdd(4))
  println(isOdd(7))


  def isEven(n: Int): Boolean = {
    if (n == 0) {
      true
    } else if (n == 1) {
      false
    } else if (n < 0) {
      isEven(-n)
    } else {
      isEven(n - 2)
    }
  }

  def isOdd(n: Int): Boolean = {
    if (n == 0) {
      false
    } else if (n == 1) {
      true
    } else if (n < 0) {
      isOdd(-n)
    } else {
      isOdd(n - 2)
    }
  }



}
}
