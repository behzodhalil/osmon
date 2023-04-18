package io.behzod.osmoncore.assertion

import io.behzod.osmoncore.exception.MismatchException
import io.behzod.osmoncore.exception.failure
import io.behzod.osmoncore.issue.LocalizedIssueMonitor
import io.behzod.osmoncore.issue.requireDetection
import io.behzod.osmoncore.string.prefix

fun verify(message: String, condition: Boolean) {
  verifyTrue(condition, message)
}

 fun verifyTrue(actual: Boolean, message: String? = null) {
  if (!actual) {
    failure(message = message)
  }
}

inline fun verifyTrue(actual: Boolean, block: () -> String) {
  verifyTrue(actual = actual, message = block())
}

fun verifyEquals(message: String? = null, expected: Any?, actual: Any?) {
  if (actual != expected) {
    LocalizedIssueMonitor.requireDetection(MismatchException(message, expected, actual))
  }
}

fun verifyNotEquals(message: String? = null, expected: Any?, actual: Any?) {
  verifyTrue(actual != expected) {
    prefix(message) + "The value <$actual> is not valid."
  }
}
