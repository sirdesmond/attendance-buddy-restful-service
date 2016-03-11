name := """simple-rest-scala"""

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "com.wordnik" %% "swagger-play2" % "1.3.12"
)
