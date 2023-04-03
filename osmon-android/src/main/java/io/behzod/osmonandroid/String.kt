package io.behzod.osmonandroid

infix fun String.toEqual(expected: String): String {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun String.notToEqual(expected: String): String {
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

