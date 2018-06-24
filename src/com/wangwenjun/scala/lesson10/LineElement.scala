package com.wangwenjun.scala.lesson10

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
class LineElement(s: String) extends ArrayElement(conts = Array(s)) {


  override def test(): Unit = {
    println("LineElement-test")
  }

  override val y: String = "LineElement-Y"
}
