// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html

import Q1_01_Is_Unique.isUniqueChars

class Q1_01_Is_Unique_Test_Suite extends munit.FunSuite {
  test("test that string has unique chars") {
    val obtained = isUniqueChars("abcde")
    val expected = true
    assertEquals(obtained, expected)
  }

  test("test that string does not have unique chars") {
    val obtained = isUniqueChars("hello")
    val expected = false
    assertEquals(obtained, expected)
  }
}
