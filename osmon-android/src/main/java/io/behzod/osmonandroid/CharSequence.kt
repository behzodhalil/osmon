package io.behzod.osmonandroid

infix fun <T : CharSequence> T.toStartWith(expected: T): T {
  return this.apply {
    verify("", this.startsWith(expected))
  }
}

infix fun <T : CharSequence> T.toEndWith(expected: T): T {
  return this.apply {
    verify("", this.endsWith(expected))
  }
}

infix fun <T : CharSequence> T.toContain(character: Char): T {
  return this.apply {
    verify("", this.contains(character))
  }
}

infix fun <T : CharSequence> T.notToContain(characters: Iterable<CharSequence>): T {
  return this.apply {
    verify("", characters.none { character -> this.contains(character) })
  }
}

fun <T : CharSequence> T.notToContain(vararg expected: CharSequence): T {
  return this.apply {
    this.notToContain(expected.toList())
  }
}


infix fun <T : CharSequence> T.toEqual(regex: String): T {
  return this.apply {
    verify("", this.matches(Regex(regex)))
  }
}

infix fun <T : CharSequence> T.toEqual(regex: Regex): T {
  return this.apply {
    verify("", this.matches(regex))
  }
}

fun <T : CharSequence> T.toBeBlank(): T {
  return this.apply {
    verify("", this.isBlank())
  }
}

fun <T : CharSequence> T.toBeEmpty(): T {
  return this.apply {
    verify("", this.isEmpty())
  }
}
fun <T: CharSequence> T.toBeNull(): T {
  return this.apply {
    verify("", !this.isNullOrEmpty())
  }
}
