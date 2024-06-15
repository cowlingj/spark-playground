scalaVersion := "2.13.14"

name := "sparkplayground"
organization := "uk.me.jonathancowling"
version := "0.0.1"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % "3.5.1",
	"org.apache.spark" %% "spark-sql" % "3.5.1",
    "org.apache.spark" %% "spark-mllib" % "3.5.1"
)