import sbt._

class ScalaJRubyProject(info: ProjectInfo) extends DefaultProject(info) {
  val jruby = "org.jruby" % "jruby" % "1.6.0"

  override def fork = forkRun
}
