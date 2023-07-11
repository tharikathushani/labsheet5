package package1

object Q1 {
  //main function
  def main(args: Array[String]): Unit = {
    println(prime(5))
    println(prime(8))
  }

//is prime function
    def isPrime(n: Int, divisor: Int = 2): Boolean = {
      if (n <= 2) {
        return n == 2
      }

      if (n % divisor == 0) {
        return false
      }

      if (divisor * divisor > n) {
        return true
      }

      isPrime(n, divisor + 1)
    }


//prime function
    def prime(n: Int): Boolean = {
      if (n <= 1) {
        false
      }
       else {
        isPrime(n)
      }
    }


}