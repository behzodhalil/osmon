package io.behzod.osmonandroid

internal fun prefix(message: String?): String {
  return message?.let { currentMsg ->
    currentMsg
  } ?: String.Empty
}

val String.Companion.Empty
  get() = ""
