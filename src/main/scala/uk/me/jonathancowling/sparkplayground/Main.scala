package uk.me.jonathancowling.sparkplayground

import org.apache.spark.sql.SparkSession



object Main extends App {
    val spark: SparkSession = SparkSession
  .builder()
  .appName("Spark SQL basic example")
  .config("spark.master", "local")
//   .config("spark.some.config.option", "some-value")
  .getOrCreate()
  spark.read.csv(getClass.getResource("data/colors.csv").getPath())

    println("Hello world")
}