package io.behzod.osmonjvm

import io.behzod.osmoncore.assertion.verifyEquals
import io.behzod.osmoncore.assertion.verifyNotEquals

infix fun String.toEquals(expected: String): String {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun String.toNotEqual(expected: String): String {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}

infix fun String.toStartWith(expected: String): String {
  return this.apply {
  }
}

infix fun String.toEndWith(expected: String): String {
  return this.apply {
  }
}
