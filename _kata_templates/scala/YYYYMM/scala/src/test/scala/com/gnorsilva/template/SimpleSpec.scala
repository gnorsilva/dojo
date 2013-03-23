package com.gnorsilva.template

import org.scalatest.{WordSpec, FunSuite}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class SimpleSpec extends WordSpec with ShouldMatchers {

  "Something" should {
    val something: Something = new Something

    "know the truth" in {
      something.know_the_truth should equal(true)
    }
  }

}