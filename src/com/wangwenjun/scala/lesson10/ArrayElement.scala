package com.wangwenjun.scala.lesson10

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
class ArrayElement(conts: Array[String]) extends Element {

  override val x: String = "ArrayElement"

  override val contents = conts

  def test(){
    println("======ArrayElement=======")
  }
}
