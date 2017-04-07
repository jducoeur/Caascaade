package example

import scala.concurrent._
import scala.concurrent.duration._
import ExecutionContext.Implicits.global

import com.amazonaws.services.elasticloadbalancing._

object Hello extends App {

  println("Fetching the ELBs")

  val client = AmazonElasticLoadBalancingClientBuilder.defaultClient()
  val elbFut = Future(client.describeLoadBalancers())
  val elbs = Await.ready(elbFut, 5 seconds)

  println(elbs)
}
