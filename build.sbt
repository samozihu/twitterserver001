name := "twitterserver001"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "com.twitter" %% "twitter-server" % "19.11.0"
//libraryDependencies += "com.twitter" % "util-core_2.12" % "19.11.0"
//libraryDependencies += "org.slf4j" % "slf4j-simple" % "2.0.0-alpha1" % Test

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

retrieveManaged := true