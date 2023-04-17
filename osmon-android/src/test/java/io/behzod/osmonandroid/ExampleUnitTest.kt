package io.behzod.osmonandroid

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
  @Test
  fun addition_isCorrect() {
    val expect = ""

    expect.toBeBlank()
  }

  @Test
  fun checkIfCharacterIsEmpty() {
    expect(10) {
      that {
        isEqualTo(10)
      }
    }
  }
}
