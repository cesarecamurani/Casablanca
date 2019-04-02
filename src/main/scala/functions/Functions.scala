package functions

object Functions {

  def squared(v: Int)= v*v


  def multiply(x: Int, y: Int): Int = x*y

  val sumUpImperative: List[Int] => Int = { nums =>
    var curr = 0
    for (i <- 0 to nums.size - 1) {
      curr += nums(i)
    }
    curr
  }

  def sumUpFunctional: List[Int] => Int = { nums =>
    var curr = 0
    for (i <- 0 until nums.size ) {
      curr += nums(i)
    }
    curr
  }

  def thisMightBeNull(value: Int): Option[Int] =
    if (value % 2 == 0) None
    else Some(value)

}

