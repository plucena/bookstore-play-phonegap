import com.typesafe.sbt.SbtNativePackager._
import com.typesafe.sbt.packager.Keys._
import NativePackagerKeys._
import com.typesafe.sbt.packager.archetypes.ServerLoader.{SystemV, Upstart}

packageArchetype.java_server

serverLoading in Debian := SystemV

name := "BookStore"

version := "1.0-SNAPSHOT"

maintainer in Debian := "gdc <aaa@aaa.com>"

packageSummary in Debian := "loja"

packageDescription in Debian := "loja"



lazy val root = (project in file(".")).enablePlugins(PlayJava)

fork in Test := true


scalaVersion := "2.11.1"

libraryDependencies += filters

libraryDependencies ++= Seq(
"com.wordnik" %% "swagger-play2" % "1.3.12" exclude("org.reflections", "reflections"),
  "org.reflections" % "reflections" % "0.9.8" notTransitive (),
  "org.webjars" % "swagger-ui" % "2.1.8-M1",
   javaJdbc,
  javaEbean,
  cache,
  javaWs,
  filters,
  "com.google.code.gson" %  "gson" % "2.2.4"
)

