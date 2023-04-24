<h1 align="center">Osmon</h1></br>

<p align="center">
:cloud: Osmon is a modern assertion library for Kotlin 
</p><br>

<p align="center">
  <a href="https://github.com/behzod1996/izoh"><img width="400dp"  alt="Osmon Cover" src="https://github.com/behzodhalil/osmon/blob/master/docs/images/CoverWithDescription.png?raw=true"/></a> <br>
</p>


## Install


Add the dependency below into your **module**'s `build.gradle.kts` file:

```gradle
dependencies {
    val osmonVersion = "1.1.2"
    
    testImplementation("io.github.behzodhalil:osmon-jvm:$osmonVersion")
    testImplementation("io.github.behzodhalil:osmon-dsl:$osmonVersion")
}
```

## Examples

### `toEquals` ###

```kotlin
"some text" toEquals "some text"
```

### `toNotEquals` ###

```kotlin
"some text" toNotEquals "some text"
```

### `toInclude` ###

```kotlin
"some text" toInclude 't'
```

### `toNotInclude` ###

```kotlin
"some text" toNotInclude 'a'
```
