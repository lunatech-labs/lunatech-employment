name := """employment"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "2.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "2.0.0",
  "com.h2database" % "h2" % "1.4.190",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  specs2 % Test,
  ws
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
