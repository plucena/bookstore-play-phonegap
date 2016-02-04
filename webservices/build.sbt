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

scalaVersion := "2.11.1"

libraryDependencies += filters

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  filters,
  "com.google.code.gson" %  "gson" % "2.2.4"
)

val main = play.Project(appName, appVersion, appDependencies).settings(
    //write test reports and to console
    testOptions in Test += Tests.Argument("junitxml", "console")
  )
