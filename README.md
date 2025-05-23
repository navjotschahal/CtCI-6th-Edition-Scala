[![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)

# CtCI-6th-Edition-Scala

This repository is an effort to contribute solutions in Scala for the coding-problems in the book "CRACKING the CODING INTERVIEW" by Gayle Laakmann McDowell
Reference to the Books Web-site for all details about the book and Author :)
https://www.crackingthecodinginterview.com

## Pre-requisites

Go to Scala-lang website https://www.scala-lang.org/
Follow the scala install guide or got to https://www.scala-lang.org/download/

Recommended use coursier install scripts for MacOS either brew or curl as suitable to you .
For windows use Scala Installer
For Linux follow the latest install instruction | Recommended follow the curl command which uses/downloads coursier script.

## All Education/Learning related Source code directory

All Solution / Coding Question Source code resides under `src/main/scala` directory .

## Note

Coursier will automatically install scala, scalafmt, REPL's, scala-compiler etc. even JDK on your system.

## sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).

### Running Coding question solutions

## 1.

cd to the solution.scala file of any coding question.
execute `scala file_name.scala` to run it.

## 2.

In VS code install scala-metals extension .
then from vscode window dash select Run Tab

### Note!

sometimes "metals.javaHome": "path/jdk/home" has to be set with path to your JDK in .vscode settings.json [reference](https://github.com/scalameta/metals/issues/2020) !

### Suggestion!

Intellij works out of the box maximum times / like always !

1. select Run without debugging to run normally.
2. select Start Debugging to debug code with added break-points.
