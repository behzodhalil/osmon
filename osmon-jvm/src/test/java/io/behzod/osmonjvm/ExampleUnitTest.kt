package io.behzod.osmonjvm

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
    val str1 = "String"
    val str2 = "String"

    str1 toEquals str2
  }
}
