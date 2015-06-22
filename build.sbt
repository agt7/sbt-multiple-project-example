name := """sbt-multiple-project-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

lazy val helloApp = (project in file("modules/hello-app"))
  .settings(libraryDependencies ++= Seq(jdbc,cache,ws,specs2 % Test)) // FIXME: Dependenciesに書けなかった
  .settings(resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases")
  .dependsOn(helloUtils)
  .enablePlugins(PlayScala)

lazy val helloUtils = (project in file("modules/hello-utils"))

scalaVersion := "2.11.6"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


