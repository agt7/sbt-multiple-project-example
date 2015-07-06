name := """sbt-multiple-project-example"""

version := "1.0-SNAPSHOT"

lazy val commonSettings = Seq(scalaVersion := "2.11.6")

lazy val root = project in file(".")

lazy val helloPlayApp = (project in file("modules/hello-play-app"))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= Seq(jdbc,cache,ws,specs2 % Test))
  .settings(resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases")
  .dependsOn(helloUtils)
  .enablePlugins(PlayScala)

lazy val helloUtils = (project in file("modules/hello-utils"))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.8",
  "org.joda" % "joda-convert" % "1.7"
  ))

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


