name := """BookStore"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "com.google.code.gson" %  "gson" % "2.2.4",
  "com.wordnik" %% "swagger-play2" % "1.3.12" exclude("org.reflections", "reflections"), "org.reflections" % "reflections" % "0.9.8" notTransitive (), "org.webjars" % "swagger-ui" % "2.1.8-M1"
)
