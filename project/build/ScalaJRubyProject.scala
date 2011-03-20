import sbt._

class ScalaJRubyProject(info: ProjectInfo) extends DefaultProject(info) {
  val jruby = "org.jruby" % "jruby" % "1.6.0"
  val jsr223 = "org.livetribe" % "livetribe-jsr223" % "2.0.6"

  override def fork = forkRun
}
