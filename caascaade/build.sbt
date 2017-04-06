import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.caascaade",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Caascaase",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "com.amazonaws" % "aws-java-sdk" % "1.11.116"
    )
  )
