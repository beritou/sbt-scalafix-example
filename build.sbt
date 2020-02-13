lazy val myproject = project.settings(
  scalaVersion := "2.12.6",
  addCompilerPlugin(scalafixSemanticdb),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test",
  scalacOptions ++= List(
    "-Yrangepos",
    "-Ywarn-unused-import"
  )
)