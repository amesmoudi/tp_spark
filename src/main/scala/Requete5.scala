/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

object Requete5{
  def main(args: Array[String]) {
    val inputDir = args(0)
    var outputDir= args(1)
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val schema =( new StructType)
.add("sourceId", LongType,false)
.add("scienceCcdExposureId", IntegerType,true)
.add("filterId", IntegerType,false)
.add("objectId", IntegerType,true)
.add("movingObjectId", IntegerType,true)
.add("procHistoryId", IntegerType,false)
.add("ra", FloatType ,false)
.add("raSigmaForDetection", FloatType,true)
.add("raSigmaForWcs", FloatType,false)
.add("decl", FloatType ,false)
.add("declSigmaForDetection", FloatType,true)
.add("declSigmaForWcs", FloatType,false)
.add("htmId20", IntegerType,false)
.add("xFlux", FloatType ,true)
.add("xFluxSigma", FloatType,true)
.add("yFlux", FloatType ,true)
.add("yFluxSigma", FloatType,true)
.add("raFlux", FloatType ,true)
.add("raFluxSigma", FloatType,true)
.add("declFlux", FloatType ,true)
.add("declFluxSigma", FloatType,true)
.add("xPeak", FloatType ,true)
.add("yPeak", FloatType ,true)
.add("raPeak", FloatType ,true)
.add("declPeak", FloatType ,true)
.add("xAstrom", FloatType ,true)
.add("xAstromSigma", FloatType,true)
.add("yAstrom", FloatType ,true)
.add("yAstromSigma", FloatType,true)
.add("raAstrom", FloatType ,true)
.add("raAstromSigma", FloatType,true)
.add("declAstrom", FloatType ,true)
.add("declAstromSigma", FloatType,true)
.add("raObject", FloatType ,true)
.add("declObject", FloatType ,true)
.add("taiMidPoint", FloatType ,false)
.add("taiRange", FloatType,true)
.add("psfFlux", FloatType ,true)
.add("psfFluxSigma", FloatType,true)
.add("apFlux", FloatType ,true)
.add("apFluxSigma", FloatType,true)
.add("modelFlux", FloatType ,true)
.add("modelFluxSigma", FloatType,true)
.add("petroFlux", FloatType ,true)
.add("petroFluxSigma", FloatType,true)
.add("instFlux", FloatType ,true)
.add("instFluxSigma", FloatType,true)
.add("nonGrayCorrFlux", FloatType ,true)
.add("nonGrayCorrFluxSigma", FloatType,true)
.add("atmCorrFlux", FloatType ,true)
.add("atmCorrFluxSigma", FloatType,true)
.add("apDia", FloatType,true)
.add("Ixx", FloatType,true)
.add("IxxSigma", FloatType,true)
.add("Iyy", FloatType,true)
.add("IyySigma", FloatType,true)
.add("Ixy", FloatType,true)
.add("IxySigma", FloatType,true)
.add("psfIxx", FloatType,true)
.add("psfIxxSigma", FloatType,true)
.add("psfIyy", FloatType,true)
.add("psfIyySigma", FloatType,true)
.add("psfIxy", FloatType,true)
.add("psfIxySigma", FloatType,true)
.add("e1_SG", FloatType,true)
.add("e1_SG_Sigma", FloatType,true)
.add("e2_SG", FloatType,true)
.add("e2_SG_Sigma", FloatType,true)
.add("resolution_SG", FloatType,true)
.add("shear1_SG", FloatType,true)
.add("shear1_SG_Sigma", FloatType,true)
.add("shear2_SG", FloatType,true)
.add("shear2_SG_Sigma", FloatType,true)
.add("sourceWidth_SG", FloatType,true)
.add("sourceWidth_SG_Sigma", FloatType,true)
.add("shapeFlag_SG", IntegerType,true)
.add("snr", FloatType,false)
.add("chi2", FloatType,false)
.add("sky", FloatType,true)
.add("skySigma", FloatType,true)
.add("extendedness", IntegerType,true)
.add("flux_Gaussian", FloatType ,true)
.add("flux_Gaussian_Sigma", FloatType,true)
.add("flux_ESG", FloatType ,true)
.add("flux_ESG_Sigma", FloatType,true)
.add("sersicN_SG", FloatType,true)
.add("sersicN_SG_Sigma", FloatType,true)
.add("radius_SG", FloatType,true)
.add("radius_SG_Sigma", FloatType,true)
.add("flux_flux_SG_Cov", FloatType,true)
.add("flux_e1_SG_Cov", FloatType,true)
.add("flux_e2_SG_Cov", FloatType,true)
.add("flux_radius_SG_Cov", FloatType,true)
.add("flux_sersicN_SG_Cov", FloatType,true)
.add("e1_e1_SG_Cov", FloatType,true)
.add("e1_e2_SG_Cov", FloatType,true)
.add("e1_radius_SG_Cov", FloatType,true)
.add("e1_sersicN_SG_Cov", FloatType,true)
.add("e2_e2_SG_Cov", FloatType,true)
.add("e2_radius_SG_Cov", FloatType,true)
.add("e2_sersicN_SG_Cov", FloatType,true)
.add("radius_radius_SG_Cov", FloatType,true)
.add("radius_sersicN_SG_Cov", FloatType,true)
.add("sersicN_sersicN_SG_Cov", FloatType,true)
.add("flagForAssociation", IntegerType,true)
.add("flagForDetection", IntegerType,true)
.add("flagForWcs", IntegerType,true)


    val dataQ5=spark
	.read
    .schema(schema)
	.csv(inputDir)
import spark.implicits._
    val donneesDF=dataQ5
    .where($"ra".between(358.0,359.0) and $"decl".between(2.7,3.0))
	.filter($"objectId".isNotNull)
	.groupBy($"objectId")
	.agg(count("*").as("observations_total"))
	.select($"objectId",$"observations_total")


    donneesDF.write
	.option("header",true)
	.option("sep",";")
	.csv(outputDir)
    spark.stop()
  }
}