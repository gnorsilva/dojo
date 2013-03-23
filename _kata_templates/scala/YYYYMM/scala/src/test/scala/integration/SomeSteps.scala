package integration

import cucumber.api.scala.{ScalaDsl, EN}
import org.scalatest.matchers.ShouldMatchers

class SomeSteps extends ScalaDsl with EN with ShouldMatchers {

  private var givenCalled = false
  private var whenCalled = false

  Given("""^A SBT project$""") {
    givenCalled = true
  }

  When("""^I run the cucumber goal$""") {
    whenCalled = true
  }

  Then("""^Cucumber is executed against my features and step definitions$""") {
    givenCalled should equal (true)
    whenCalled should equal (true)
  }
}