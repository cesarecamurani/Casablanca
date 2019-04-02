package types

object Functions {

  case class MyNumber(value: Int) {
    def add(number: MyNumber):MyNumber =
      MyNumber(value + number.value)

  }

  case class Place(name: String)

  def addItUpInts(ints: List[Int]): Int = ints.sum

  def addItUpString(ints: List[String]): String = ints.mkString("")

  def addItUp(i: Int, i1: Int): Int = i+i1*2

  def addItUp(i: MyNumber, i1: MyNumber): MyNumber =
    MyNumber(i.value).add(i1)

  def addItUp(i: String, i1: String): String = i+i1

  def thisMightBeNull(value: Int): MyNumber = if (value % 2 == 0) null else MyNumber(value)
}
