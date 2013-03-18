import com.typesafe.sbt.SbtStartScript

name := "hello"

version := "1.0"

scalaVersion := "2.10.0"

seq(SbtStartScript.startScriptForClassesSettings: _*)

//sourceDirectories in Compile += new File("app")
mainClass in (Compile, run) := Some("Main")

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-server" % "8.0.4.v20111024",
  "org.eclipse.jetty" % "jetty-servlet" % "8.0.4.v20111024"
)
