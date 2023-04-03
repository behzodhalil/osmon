package io.behzod.osmonandroid

public fun failure(message: String, expected: Any?, actual: Any?) {
  LocalFailureTracker.getOrFailed(MismatchException(message, expected, actual))
}

public fun failure(message: String?) {
  try {
    throw AssertionError(message)
  } catch (exception: Throwable) {
    throw assertionError(exception)
  }
}

fun assertionError(exception: Throwable): Throwable {
  val message = buildString {
    append("The assertion has resulted in a failure.\n")
    append("${exception.message}\n")
  }

  return AssertionError(message)
}
