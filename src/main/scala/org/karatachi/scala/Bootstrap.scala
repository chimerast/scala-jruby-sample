package org.karatachi.scala

import java.io._

import scala.collection.JavaConversions._

import org.jruby.javasupport._

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
    val scene = JRuby.eval(script).asInstanceOf[Runnable]
    scene.run
  }
}

object JRuby {
  val ruby = JavaEmbedUtils.initialize(List())
  val evaluator = JavaEmbedUtils.newRuntimeAdapter

  def eval(script: String) = evaluator.eval(ruby, script)
}
