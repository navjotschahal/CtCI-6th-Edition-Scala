val scala3Version = "3.7.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "CtCI-6th-Edition-Scala",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
