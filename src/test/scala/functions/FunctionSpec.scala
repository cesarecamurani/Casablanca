package functions

import org.scalatest.{FunSuite, Matchers}
import functions.Functions._
class FunctionSpec extends FunSuite with Matchers {

  test("Write a function") {
    squared(4) shouldBe 16
    multiply(6, 30) shouldBe 180
  }

  test("Imperative vs functional") {
    sumUpImperative(List(1, 2, 3, 4)) shouldBe 10
    sumUpFunctional(List(1, 2, 3, 4)) shouldBe 10

    sumUpImperative(List(1, 2, 3, 4)) shouldBe sumUpFunctional(List(1, 2, 3, 4))
  }

  test("apply functions to list") {
    List(2, 4, 6).map(num => ???) shouldBe List(4, 16, 36)
  }

  test("Square each element and sum up the list") {
    List(2, 4, 6)
      .map(num => num*num) shouldBe List(4, 16, 36)
  }

  test("What about null?") {
    thisMightBeNull(5) shouldBe Some(5)
    thisMightBeNull(6) shouldBe None

    //can you get the value out of the option
    thisMightBeNull(5) shouldBe 5
  }

  //Challenges
  test("Square each element and sum it up in one iteration") {
    ???
  }
}
