package package1

object Q6 {
  def main(args:Array[String]): Unit = {
    val n = 10
    val fibNumbers = fibonacci(n)
    fibNumbers.foreach(println)

  }
    def fibonacci(n: Int): List[Int] = {
      def fibonacciHelper(n: Int): List[Int] = {
        if (n <= 0) {
          Nil
        } else if (n == 1) {
          List(0)
        } else if (n == 2) {
          List(0, 1)
        } else {
          val fibList = fibonacciHelper(n - 1)
          val nextFib = fibList(n - 2) + fibList(n - 3)
          fibList :+ nextFib
        }
      }

      fibonacciHelper(n)
    }



  }


