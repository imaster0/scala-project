name := """play-scala-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val scala213 = "2.13.0"
lazy val scalatestplusVersion = "4.0.3"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := scala213

libraryDependencies ++= Seq(
  guice,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % scalatestplusVersion % Test
)
