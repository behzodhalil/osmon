package io.behzodhalil.osmondsl

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
  @Test
  fun addition_isCorrect() {
    expect(actual = 1) {
      check {
        exists()
        positive()
      }
    }
  }
}
