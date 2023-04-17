package io.behzod.osmonandroid

infix fun Boolean.toEqual(expected: Boolean): Boolean {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun Boolean.notToEqual(expected: Boolean): Boolean {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}
