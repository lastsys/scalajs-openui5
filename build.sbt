lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.0"
    )
  )

name := "Scala.js OpenUI5"

normalizedName := "scalajs-openui5"

version := "0.1.0-SNAPSHOT"

organization := "com.lastsys"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.6", "2.11.7")

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

//homepage := Some(url("http://somewhere"))

licenses += ("MIT", url("http://opensource.org/licenses/mit-license.php"))

scmInfo := Some(ScmInfo(
  url("https://github.com/scala-js/scala-js-openui5"),
  "scm:git:git@github.com:scala-js/scala-js-openui5.git",
  Some("scm:git:git@github.com:scala-js/scala-js-openui5.git")
))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra :=
  <developers>
    <developer>
      <id>lastsys</id>
      <name>Stefan Larsson</name>
      <url>https://github.com/lastsys/</url>
    </developer>
  </developers>

pomIncludeRepository := { _ ⇒ false }
