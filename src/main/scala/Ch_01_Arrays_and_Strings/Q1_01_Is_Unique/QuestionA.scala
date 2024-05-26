package Q1_01_Is_Unique

import scala.compiletime.ops.boolean

@main def run: Unit = {
  val words = Array("abcde", "hello", "apple", "kite", "padle")
  for (word <- words) {
    println(word + ": " + isUniqueChars(word))
  }
}

def isUniqueChars(str: String): Boolean = {
  if (str.length > 128) return false
  val char_set = new Array[Boolean](128)
  for (i <- 0 until str.length) {
    val charVal = str.charAt(i)
    if (char_set(charVal)) return false
    char_set(charVal) = true
  }
  true
}
