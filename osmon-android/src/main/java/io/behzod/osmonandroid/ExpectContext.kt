package io.behzod.osmonandroid

class ExpectContext<T>(val actual: T) {
  infix fun isEqualTo(expected: T) {
    if (actual != expected) {
      failure("Expected '$expected', but got '$actual")
    }
  }
}

class Expect<T>(val actual: T) {
  infix fun that(block: ExpectContext<T>.() -> Unit) {
    val expectContext = ExpectContext(actual)
    expectContext.block()
  }
}

fun <T> expect(actual: T, block: Expect<T>.() -> Unit) {
  val expectBuilder = Expect(actual)
  expectBuilder.block()
}
