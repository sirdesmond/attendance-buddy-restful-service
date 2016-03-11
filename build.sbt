name := """attendance-buddy"""

version := "1.0"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)



libraryDependencies ++= Seq(
  "com.wordnik" %% "swagger-play2" % "1.3.12",
  "org.mongodb" %% "casbah" % "2.6.0"
)
