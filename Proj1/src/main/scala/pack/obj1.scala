package pack

import org.apache.spark.{SparkContext,SparkConf}

object obj1 {

  def main(args:Array[String]):Unit={

    println("JSG")

    val conf = new SparkConf().setAppName("obj1").setMaster("local[*]")
    val sc = new SparkContext(conf)


    //one way to create rdd
    val lst = Seq(
      (1,2,3,4,5)
    )

    val rdd1 = sc.parallelize(lst)
    rdd1.foreach(println)

//    2nd way of creating rdd

    val rdd2 = sc.textFile("C:\\Users\\MAYANK\\Desktop\\BigProjRev\\Proj1\\src\\data\\input\\myk11.txt")
    rdd2.foreach(println)
    
  }

}
