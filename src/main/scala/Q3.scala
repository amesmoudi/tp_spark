/* Q3.scala */
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

object Q3 {
  def main(args: Array[String]) {
    val inputDir = args(0)
    var outputDir= args(1)
    val spark = SparkSession.builder.appName("Q1").getOrCreate()
    val schemasource = new StructType()
		.add("sourceId", LongType, false)
        .add("scienceCcdExposureId", LongType, true)
        .add("filterId", LongType, false)
        .add("objectId", LongType, true)
        .add("movingObjectId", LongType, true)
        .add("procHistoryId", LongType, false)
		.add("ra", FloatType, false)
		.add("raSigmaForDetection", FloatType, true)
		.add("raSigmaForWcs", FloatType, false)
		.add("decl", FloatType, false)
		.add("declSigmaForDetection", FloatType, true)
		.add("declSigmaForWcs", FloatType, false)
		.add("htmId20", LongType, false)
		.add("xFlux", FloatType, true)
		.add("xFluxSigma", FloatType, true)
		.add("yFlux", FloatType, true)
		.add("yFluxSigma", FloatType, true)
		.add("raFlux", FloatType, true)
		.add("raFluxSigma", FloatType, true)
		.add("declFlux", FloatType, true)
		.add("declFluxSigma", FloatType, true)
		.add("xPeak", FloatType, true)
		.add("yPeak", FloatType, true)
		.add("raPeak", FloatType, true)
		.add("declPeak", FloatType, true)
		.add("xAstrom", FloatType, true)
		.add("xAstromSigma", FloatType, true)
		.add("yAstrom", FloatType, true)
		.add("yAstromSigma", FloatType, true)
		.add("raAstrom", FloatType, true)
		.add("raAstromSigma", FloatType, true)
		.add("declAstrom", FloatType, true)
		.add("declAstromSigma", FloatType, true)
		.add("raObject", FloatType, true)
		.add("declObject", FloatType, true)
		.add("taiMidPoint", FloatType, false)
		.add("taiRange", FloatType, true)
		.add("psfFlux", FloatType, true)
		.add("psfFluxSigma", FloatType, true)
		.add("apFlux", FloatType, true)
		.add("apFluxSigma", FloatType, true)
		.add("modelFlux", FloatType, true)
		.add("modelFluxSigma", FloatType, true)
		.add("petroFlux", FloatType, true)
		.add("petroFluxSigma", FloatType, true)
		.add("instFlux", FloatType, true)
		.add("instFluxSigma", FloatType, true)
		.add("nonGrayCorrFlux", FloatType, true)
		.add("nonGrayCorrFluxSigma", FloatType, true)
		.add("atmCorrFlux", FloatType, true)
		.add("atmCorrFluxSigma", FloatType, true)
		.add("apDia", FloatType, true)
		.add("Ixx", FloatType, true)
		.add("IxxSigma", FloatType, true)
		.add("Iyy", FloatType, true)
		.add("IyySigma", FloatType, true)
		.add("Ixy", FloatType, true)
		.add("IxySigma", FloatType, true)
		.add("psfIxx", FloatType, true)
		.add("psfIxxSigma", FloatType, true)
		.add("psfIyy", FloatType, true)
		.add("psfIyySigma", FloatType, true)
		.add("psfIxy", FloatType, true)
		.add("psfIxySigma", FloatType, true)
		.add("e1_SG", FloatType, true)
		.add("e1_SG_Sigma", FloatType, true)
		.add("e2_SG", FloatType, true)
		.add("e2_SG_Sigma", FloatType, true)
		.add("resolution_SG", FloatType, true)
		.add("shear1_SG", FloatType, true)
		.add("shear1_SG_Sigma", FloatType, true)
		.add("shear2_SG", FloatType, true)
		.add("shear2_SG_Sigma", FloatType, true)
		.add("sourceWidth_SG", FloatType, true)
		.add("sourceWidth_SG_Sigma", FloatType, true)
		.add("shapeFlag_SG", FloatType, true)
		.add("snr", FloatType, false)
		.add("chi2", FloatType, false)
		.add("sky", FloatType, true)
		.add("skySigma", FloatType, true)
		.add("extendedness", FloatType, true)
		.add("flux_Gaussian", FloatType, true)
		.add("flux_Gaussian_Sigma", FloatType, true)
		.add("flux_ESG", FloatType, true)
		.add("flux_ESG_Sigma", FloatType, true)
		.add("sersicN_SG", FloatType, true)
		.add("sersicN_SG_Sigma", FloatType, true)
		.add("radius_SG", FloatType, true)
		.add("radius_SG_Sigma", FloatType, true)
		.add("flux_flux_SG_Cov", FloatType, true)
		.add("flux_e1_SG_Cov", FloatType, true)
		.add("flux_e2_SG_Cov", FloatType, true)
		.add("flux_radius_SG_Cov", FloatType, true)
		.add("flux_sersicN_SG_Cov", FloatType, true)
		.add("e1_e1_SG_Cov", FloatType, true)
		.add("e1_e2_SG_Cov", FloatType, true)
		.add("e1_radius_SG_Cov", FloatType, true)
		.add("e1_sersicN_SG_Cov", FloatType, true)
		.add("e2_e2_SG_Cov", FloatType, true)
		.add("e2_radius_SG_Cov", FloatType, true)
		.add("e2_sersicN_SG_Cov", FloatType, true)
		.add("radius_radius_SG_Cov", FloatType, true)
		.add("radius_sersicN_SG_Cov", FloatType, true)
		.add("sersicN_sersicN_SG_Cov", FloatType, true)
		.add("flagForAssociation", FloatType, true)
		.add("flagForDetection", FloatType, true)
		.add("flagForWcs", FloatType, true)


	val observations =spark
	.read
	.schema(schemasource)
	.csv(inputDir)

import spark.implicits._
   
	val donneesDF=observations
		.select("sourceId","objectId")
		.where(col("ra").between(358.0,359.0) and col("decl").between(2.7,3.0))
		.filter(col("objectId").isNotNull)

    donneesDF.write
	.option("header",true)
	.option("sep",";")
	.csv(outputDir)
    spark.stop()
  }
}
