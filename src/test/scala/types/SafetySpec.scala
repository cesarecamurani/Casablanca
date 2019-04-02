package types

import org.scalatest.{FunSuite, Matchers}
import types.Functions._


class SafetySpec extends FunSuite with Matchers {

  test("When is a number not a number?") {
    1 shouldBe new Integer(1)
    1 shouldBe 1.toDouble
    1 == "1"
    1 == MyNumber(1)
  }

  test("Make the following in Scala") {
    addItUpInts(List(1, 2, 3, 4, 5)) shouldBe 15
    addItUpString(List("hello", "What", "Will", "happen")) shouldBe "helloWhatWillhappen"
  }

  test("Add my number together") {
    MyNumber(1).add(MyNumber(2)) shouldBe MyNumber(3)
  }

  test("One function Different types") {
    addItUp(1, 2) shouldBe 5
    addItUp("Hello", " there") shouldBe "Hello there"



//    addItUp(MyNumber(1), MyNumber(2)) shouldBe MyNumber(3)
  }

  test("Not all objects are equal even if the types and values look the same") {

    val london = new Place("London")
    val london1 = new Place("London")
    val casablanca = new Place("Casablanca")

    london shouldBe london
    london should not be casablanca

    // Fix this!
    london == london1
  }

  test("What about null") {
    thisMightBeNull(5) shouldBe MyNumber(5)
    thisMightBeNull(6) shouldBe null
  }

}