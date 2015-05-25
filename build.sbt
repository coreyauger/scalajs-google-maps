import SonatypeKeys._

sonatypeSettings

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Type-safe and Scala-friendly library over Google Maps"

normalizedName := "scalajs-google-maps"

version := "0.1-SNAPSHOT"

organization := "io.surfkit"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.5")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0"
)

//jsDependencies += "org.webjars" % "flux"                 % "2.0.2" / "Flux.js"

jsDependencies in Test += RuntimeDOM

homepage := Some(url("http://www.surfkit.io/"))

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

scmInfo := Some(ScmInfo(
    url("https://github.com/coreyauger/scalajs-google-maps"),
    "scm:git:git@github.com/coreyauger/scalajs-google-maps.git",
    Some("scm:git:git@github.com:coreyauger/scalajs-google-maps.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>coreyauger</id>
      <name>Corey Auger</name>
      <url>https://github.com/coreyauger/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }

