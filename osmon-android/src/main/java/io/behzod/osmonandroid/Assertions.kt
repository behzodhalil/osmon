package io.behzod.osmonandroid

internal fun verify(message: String, condition: Boolean) {
  verifyTrue(condition, message)
}

internal fun verifyTrue(actual: Boolean, message: String? = null) {
  if (!actual) {
    failure(message = message)
  }
}

internal inline fun verifyTrue(actual: Boolean, block: () -> String) {
  verifyTrue(actual = actual, message = block())
}

fun verifyEquals(message: String? = null, expected: Any?, actual: Any?) {
  if (actual != expected) {
    LocalFailureTracker.getOrFailed(MismatchException(message, expected, actual))
  }
}

fun verifyNotEquals(message: String? = null, expected: Any?, actual: Any?) {
  verifyTrue(actual != expected) {
    prefix(message) + "The value <$actual> is not valid."
  }
}
