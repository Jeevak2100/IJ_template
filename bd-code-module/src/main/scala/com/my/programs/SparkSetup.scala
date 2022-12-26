package com.my.programs

object SparkSetup  {


  def GetSparkContext(AppName: String): SparkSession={

    val sparkConfig = new SparkConf()
    sparkConfig.setIfMissing("spark.master", "local[*]")


    val my_sparkSession = SparkSession
      .builder()
      .config(sparkConfig)
      .appName("click_stream")
      .config("spark.sql.sources.partitionColumnTypeInference.enabled", "true")
      .config("spark.sql.sources.partitionOverwriteMode", "dynamic")
      .getOrCreate()

    my_sparkSession.conf.set("hive.exec.dynamic.partition","true")
    my_sparkSession.conf.set("hive.exec.dynamic.partition.mode","nonstrict")
    my_sparkSession.conf.set("hive.auto.convert.join","true")
    my_sparkSession.conf.set("hive.exec.parallel","true")
    my_sparkSession.conf.set("hive.execution.engine","true")
    my_sparkSession.conf.set("hive.exec.broadcast.compress","true")
    my_sparkSession.conf.set("hive.exec.shuffle.compress","true")
    my_sparkSession.conf.set("hive.exec.shuffle.spill.compress","true")
    my_sparkSession.conf.set("hive.sql.crossJoin.enabled","true")
    my_sparkSession.conf.set("hive.sql.broadcastTimeout","3600")


    my_sparkSession

  }


}
