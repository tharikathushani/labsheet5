package package1

object Q2 {
  def main(args: Array[String]): Unit = {
   println(primeSeq(10))

  }

  def isPrime(num: Int, divisor: Int = 2): Boolean = {
    if (num <= 1) {
      false
    } else if (divisor * divisor > num) {
      true
    } else if (num % divisor == 0) {
      false
    } else {
      isPrime(num, divisor + 1)
    }
  }

  def primeSeq(n: Int, current: Int = 2): Unit = {
    if (current < n) {
      if (isPrime(current)) {
        println(current)
      }
      primeSeq(n, current + 1)
    }
  }



}

