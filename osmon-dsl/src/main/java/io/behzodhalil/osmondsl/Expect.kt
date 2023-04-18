package io.behzodhalil.osmondsl

class Expect<T : Any?>(private val actual: T) {
  infix fun check(block: ExpectContext<T>.() -> Unit) {
    val expectContext = ExpectContext(actual)
    expectContext.block()
  }
}

fun <T> expect(actual: T, block: Expect<T>.() -> Unit) {
  val expectBuilder = Expect(actual)
  expectBuilder.block()
}
