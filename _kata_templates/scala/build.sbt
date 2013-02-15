version := "1.0.0"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "org.specs2" %% "specs2" % "1.13" % "test",
    "junit" % "junit" % "4.11" % "test",
    "org.mockito" % "mockito-core" % "1.9.5" % "test",
    "info.cukes" % "cucumber-scala" % "1.1.2" % "test"
)

seq(cucumberSettings : _*)