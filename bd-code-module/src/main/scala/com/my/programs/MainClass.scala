package com.my.programs


object MainClass extends App {

  println("Start-Main")
  val my_sparkSession = SparkSetup.GetSparkContext("My_Spark_Context")

  try{
    println("Start-Main")

    /*
    val someDF = Seq(
      (8, "bat"),
      (64, "mouse"),
      (-27, "horse")
    ).toDF("number", "word")

    someDF.show(2)

*/


  }catch {
    case ex: Exception =>
      println("Error"+ex)

  }

}
