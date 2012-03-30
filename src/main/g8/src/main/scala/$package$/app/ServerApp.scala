package $package$
package app

import hello._

object ServerApp extends App {
  
  val helloServer = new HelloServiceImpl with HelloService.ThriftServer {
    override val thriftPort = 8001
    override val serverName = "hello"
  }
  
  helloServer.start()
}
