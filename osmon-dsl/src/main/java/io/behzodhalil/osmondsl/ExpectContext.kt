package io.behzodhalil.osmondsl

import io.behzod.osmoncore.exception.failure

class ExpectContext<T: Any?>(private val actual: T) {
  infix fun equals(expected: T) {
    if (actual != expected) {
      failure("Expected '$expected', but got '$actual")
    }
  }

  fun exists() {
    if (actual == null) {
      failure("The actual value is a null value.")
    }
  }

  fun notExists() {
    if (actual != null) {
      failure("The actual value is not a null value.")
    }
  }

  fun negative() {
    if (actual > 0) {
      failure("Expected 0', but got '$actual")
    }
  }

  fun positive() {
    if (actual < 0) {
      failure("Expected 0', but got '$actual")
    }
  }
}

private operator fun Any?.compareTo(i: Int): Int {
    val value = this?.toString()?.toIntOrNull()

    return value?.compareTo(i) ?: -1
}
