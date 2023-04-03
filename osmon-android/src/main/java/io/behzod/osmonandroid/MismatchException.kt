package io.behzod.osmonandroid

class MismatchException(
  message: String?, val expected: String?, val actual: String?
) : RuntimeException(
  """${message ?: ""}
        |Expected: <$expected> but was: <$actual>
    """.trimMargin().trim()
) {
  constructor(message: String?, expected: Any?, actual: Any?) : this(message, expected.toString(), actual.toString())
}
