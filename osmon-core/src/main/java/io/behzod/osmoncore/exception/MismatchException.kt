package io.behzod.osmoncore.exception

class MismatchException(
  message: String?,
  private val expected: String?,
  private val actual: String?
) : RuntimeException(
  """${message ?: ""}
        |Expected: <$expected> but was: <$actual>
  """.trimMargin().trim()
) {
  constructor(message: String?, expected: Any?, actual: Any?) : this(message, expected.toString(), actual.toString())
}
