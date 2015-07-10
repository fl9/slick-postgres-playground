name := """playground-postgres"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  cache,
  ws,
  specs2 % Test,
  "com.typesafe.play" %% "play-slick" % "1.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "1.0.0",
  "org.postgresql" % "postgresql" % "9.4-1200-jdbc4",
  "org.mindrot" % "jbcrypt" % "0.3m"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "jbcrypt repo" at "http://mvnrepository.com/"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
