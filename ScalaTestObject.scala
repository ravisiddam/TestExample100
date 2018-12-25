package core

import org.apache.spark.{SparkConf, SparkContext}

object ScalaTestObject {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("SimpleApp")
    val sc = new SparkContext(conf)
    println("spark cotext created")

    val x = sc.parallelize(List("spark rdd example", "sample example", "big data spark"))
    println("Elemens count-> "+x.count())
    println(x.flatMap(x => x.split( " " )).map(x => (x,1)).countByKey)
  }
}
