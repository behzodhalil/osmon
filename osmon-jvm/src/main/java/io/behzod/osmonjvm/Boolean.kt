package io.behzod.osmonjvm

import io.behzod.osmoncore.assertion.verifyEquals
import io.behzod.osmoncore.assertion.verifyNotEquals

infix fun Boolean.toEquals(expected: Boolean): Boolean {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun Boolean.toNotEqual(expected: Boolean): Boolean {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}
