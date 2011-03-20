package org.karatachi.scala

import scala.collection.JavaConversions._
import java.io._
import org.jruby.embed._

object Bootstrap {
  val script = """
require 'java'
class Test
  include org.karatachi.scala.IExecutable
  def exec
    puts "Hello World"
  end
end

Test.new
  """

  def main(args: Array[String]) {
    val container = new ScriptingContainer
    val scene = container.runScriptlet(script).asInstanceOf[IExecutable]
    scene.exec
  }
}

trait IExecutable {
  def exec(): Unit
}
