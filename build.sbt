lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4"
    )),
    name := "MinimimTrianglePath"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
