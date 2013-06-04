package com.example.app

import org.scalatra._
import scalate.ScalateSupport
import _root_.akka.actor.ActorSystem

class MyScalatraServlet extends ScalatraServlet with FutureSupport {
  val system = ActorSystem()
  implicit def executor = system.dispatcher

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
      </body>
    </html>
  }
  
}
