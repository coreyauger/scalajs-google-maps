import SonatypeKeys._

import sbt.Keys._

sonatypeSettings

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin).settings(
	  //credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
	  //resolvers += "NextWave Repo" at "http://maxdevmaster.cloudapp.net:4343/artifactory/nxtwv-maven/",
	  //publishTo := Some("NextWave Repo" at "http://maxdevmaster.cloudapp.net:4343/artifactory/nxtwv-maven/")
	  publishMavenStyle := true
	)

lazy val demo = (project in file("demo"))
  .settings(demoSettings:_*)
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(root)


val scalaV = "2.12.2"
val scalajsDomV = "0.9.1"

lazy val demoSettings = Seq(
  name := s"gmap-demo",
  scalaVersion := scalaV,
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % scalajsDomV
  )
)

name := "Type-safe and Scala-friendly library over Google Maps"

normalizedName := "scalajs-google-maps"

version := "0.0.3"

organization := "io.surfkit"

scalaVersion := scalaV

crossScalaVersions := Seq("2.10.4", "2.11.5", scalaV)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % scalajsDomV
)

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

