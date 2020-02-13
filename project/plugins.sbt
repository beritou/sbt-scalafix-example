resolvers += Resolver.sonatypeRepo("releases")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.0.9.11")
addSbtPlugin(
  "io.get-coursier" % "sbt-coursier" % coursier.util.Properties.version
)
