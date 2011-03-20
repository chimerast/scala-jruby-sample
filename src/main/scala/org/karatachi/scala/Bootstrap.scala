package org.karatachi.scala

import java.io._
import javax.script._

object Bootstrap {
  def main(args: Array[String]) {
    println(JRubyEngine.eval("1"))
  }
}

object JRubyEngine {
  val manager = new ScriptEngineManager
  val engine = manager.getEngineByName("jruby")

  def eval(script: String) = engine.eval(script)
  def eval(reader: Reader) = engine.eval(reader)
}
