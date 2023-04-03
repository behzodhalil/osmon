package io.behzod.osmonandroid

internal fun prefix(message: String?): String {
  return if (!message.isNullOrEmpty()) {
    String.Empty
  } else {
    requireNotNull(message)
  }
}

val String.Companion.Empty
  get() = ""
