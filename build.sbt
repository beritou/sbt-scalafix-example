import Dependencies._

addCommandAlias(
  "runScalafix",
  "; compile:scalafix --check ; test:scalafix --check"
)

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "Scala Seed Project",
    addCompilerPlugin(scalafixSemanticdb), // enable SemanticDB
    scalacOptions ++= List(
      "-Yrangepos", // required by SemanticDB compiler plugin
      "-Ywarn-unused" // required by `RemoveUnused` rule
    ),
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
