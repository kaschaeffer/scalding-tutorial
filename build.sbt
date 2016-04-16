name := "scalding-tutorial"
version := "SNAPSHOT-0.1"
scalaVersion := "2.11.7"

resolvers += "Concurrent Maven Repo" at "http://conjars.org/repo"
libraryDependencies ++= Seq(
  "com.twitter" %% "scalding-core" % "0.15.0" exclude("com.esotericsoftware.minlog", "minlog"),
  "org.apache.hadoop" % "hadoop-core" % "1.2.1" % "provided"
)
