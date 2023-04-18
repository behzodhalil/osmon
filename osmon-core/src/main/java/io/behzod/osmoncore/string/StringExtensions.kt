package io.behzod.osmoncore.string

fun prefix(message: String?): String {
  return message?.let { currentMsg ->
    currentMsg
  } ?: String.Empty
}

val String.Companion.Empty
  get() = ""
