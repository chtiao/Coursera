object progfun_worksheet {
  1+2

  def sqrtIter(guess: Double, x: Double): Double = if (isGood(guess, x)) guess else sqrtIter(improve(guess, x), x)

  def isGood(guess: Double, x: Double): Boolean = (guess * guess - x) < 0.001 && (guess * guess - x) > -0.001

  def improve(guess: Double, x: Double): Double = (guess + x / guess) / 2

  def sqrt(x: Double): Double = sqrtIter(2, x)

  sqrt(2)
}