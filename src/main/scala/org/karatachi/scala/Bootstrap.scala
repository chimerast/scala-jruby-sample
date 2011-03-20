package org.karatachi.scala

import scala.collection.JavaConversions._
import java.io._
import org.jruby.embed._

object Bootstrap {
  val script = """
require 'java'
class Test
  include java.lang.Runnable
  def run
    puts "Hello World"
  end
end

Test.new
  """

  def main(args: Array[String]) {
    val container = new ScriptingContainer
    val scene = container.runScriptlet(script).asInstanceOf[Runnable]
    scene.run
  }
}
