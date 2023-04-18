package io.behzod.osmonjvm

import io.behzod.osmoncore.assertion.verify
import io.behzod.osmoncore.assertion.verifyEquals
import io.behzod.osmoncore.assertion.verifyNotEquals

infix fun Byte.toEquals(expected: Byte): Byte {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun Short.toEquals(expected: Short): Short {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun Int.toEquals(expected: Int): Int {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun Long.toEquals(expected: Long): Long {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun Double.toEquals(expected: Double): Double {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun Float.toEquals(expected: Float): Float {
  return this.apply {
    verifyEquals(expected = expected, actual = this)
  }
}

infix fun Byte.toNotEqual(expected: Byte): Byte {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}

infix fun Short.toNotEqual(expected: Short): Short {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}

infix fun Int.toNotEqual(expected: Int): Int {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}

infix fun Long.toNotEqual(expected: Long): Long {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}

infix fun Double.toNotEqual(expected: Double): Double {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}

infix fun Float.toNotEqual(expected: Float): Float {
  return this.apply {
    verifyNotEquals(expected = expected, actual = this)
  }
}

infix fun <T : Comparable<T>> T.toBeGreaterThan(expected: T): T {
  return this.apply {
    verify("The expected value of $this was supposed to be greater than $expected.", this > expected)
  }
}

infix fun <T : Comparable<T>> T.toBeLessThan(expected: T): T {
  return this.apply {
    verify("The expected value of $this was supposed to be less than $expected", condition = this < expected)
  }
}

infix fun <T : Comparable<T>> T.toLessThanOrEqual(expected: T): T {
  return this.apply {
    verify("The expected value of $this was supposed to be less or equal to $expected", this <= expected)
  }
}

infix fun <T : Comparable<T>> T.toGreaterThanOrEqual(expected: T): T {
  return this.apply {
    verify("The expected value of $this was supposed to be greater or equal to $expected.", this >= expected)
  }
}

fun Byte.toBePositive(): Byte {
  return this.apply {
    verify("Expected $this value to be positive", this > 0)
  }
}

fun Short.toBePositive(): Short {
  return this.apply {
    verify("Expected $this value to be positive", this > 0)
  }
}

fun Int.toBePositive(): Int {
  return this.apply {
    verify("Expected $this value to be positive", this > 0)
  }
}

fun Long.toBePositive(): Long {
  return this.apply {
    verify("Expected $this value to be positive", this > 0)
  }
}

fun Float.toBePositive(): Float {
  return this.apply {
    verify("Expected $this value to be positive", this > 0)
  }
}

fun Double.toBePositive(): Double {
  return this.apply {
    verify("Expected $this value to be positive", this > 0)
  }
}

fun Byte.toBeNegative(): Byte {
  return this.apply {
    verify("Expected $this value to be negative", this < 0)
  }
}

fun Short.toBeNegative(): Short {
  return this.apply {
    verify("Expected $this value to be negative", this < 0)
  }
}

fun Int.toBeNegative(): Int {
  return this.apply {
    verify("Expected $this value to be negative", this < 0)
  }
}
