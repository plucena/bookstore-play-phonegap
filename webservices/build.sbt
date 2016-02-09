name := """BookStore"""
maintainer in Debian := "gdc <aaa@aaa.com>"
packageSummary in Debian := "loja"
packageDescription in Debian := "loja"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-q", "-a")


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
