import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

object Question8 {
  def main(args: Array[String]) {
    val inputDir1 = args(0)
	val inputDir2 = args(1)
    var outputDir= args(2)
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
	val schemaSource = (new StructType).
add("sourceId", LongType,false).
add("scienceCcdExposureId", LongType,true).
add("filterId", IntegerType,false).
add("objectId", LongType,true).
add("movingObjectId", IntegerType,true).
add("procHistoryId", IntegerType,false).
add("ra", FloatType ,false).
add("raSigmaForDetection", FloatType,true).
add("raSigmaForWcs", FloatType,false).
add("decl", FloatType ,false).
add("declSigmaForDetection", FloatType,true).
add("declSigmaForWcs", FloatType,false).
add("htmId20", IntegerType,false).
add("xFlux", FloatType ,true).
add("xFluxSigma", FloatType,true).
add("yFlux", FloatType ,true).
add("yFluxSigma", FloatType,true).
add("raFlux", FloatType ,true).
add("raFluxSigma", FloatType,true).
add("declFlux", FloatType ,true).
add("declFluxSigma", FloatType,true).
add("xPeak", FloatType ,true).
add("yPeak", FloatType ,true).
add("raPeak", FloatType ,true).
add("declPeak", FloatType ,true).
add("xAstrom", FloatType ,true).
add("xAstromSigma", FloatType,true).
add("yAstrom", FloatType ,true).
add("yAstromSigma", FloatType,true).
add("raAstrom", FloatType ,true).
add("raAstromSigma", FloatType,true).
add("declAstrom", FloatType ,true).
add("declAstromSigma", FloatType,true).
add("raObject", FloatType ,true).
add("declObject", FloatType ,true).
add("taiMidPoint", FloatType ,false).
add("taiRange", FloatType,true).
add("psfFlux", FloatType ,true).
add("psfFluxSigma", FloatType,true).
add("apFlux", FloatType ,true).
add("apFluxSigma", FloatType,true).
add("modelFlux", FloatType ,true).
add("modelFluxSigma", FloatType,true).
add("petroFlux", FloatType ,true).
add("petroFluxSigma", FloatType,true).
add("instFlux", FloatType ,true).
add("instFluxSigma", FloatType,true).
add("nonGrayCorrFlux", FloatType ,true).
add("nonGrayCorrFluxSigma", FloatType,true).
add("atmCorrFlux", FloatType ,true).
add("atmCorrFluxSigma", FloatType,true).
add("apDia", FloatType,true).
add("Ixx", FloatType,true).
add("IxxSigma", FloatType,true).
add("Iyy", FloatType,true).
add("IyySigma", FloatType,true).
add("Ixy", FloatType,true).
add("IxySigma", FloatType,true).
add("psfIxx", FloatType,true).
add("psfIxxSigma", FloatType,true).
add("psfIyy", FloatType,true).
add("psfIyySigma", FloatType,true).
add("psfIxy", FloatType,true).
add("psfIxySigma", FloatType,true).
add("e1_SG", FloatType,true).
add("e1_SG_Sigma", FloatType,true).
add("e2_SG", FloatType,true).
add("e2_SG_Sigma", FloatType,true).
add("resolution_SG", FloatType,true).
add("shear1_SG", FloatType,true).
add("shear1_SG_Sigma", FloatType,true).
add("shear2_SG", FloatType,true).
add("shear2_SG_Sigma", FloatType,true).
add("sourceWidth_SG", FloatType,true).
add("sourceWidth_SG_Sigma", FloatType,true).
add("shapeFlag_SG", IntegerType,true).
add("snr", FloatType,false).
add("chi2", FloatType,false).
add("sky", FloatType,true).
add("skySigma", FloatType,true).
add("extendedness", IntegerType,true).
add("flux_Gaussian", FloatType ,true).
add("flux_Gaussian_Sigma", FloatType,true).
add("flux_ESG", FloatType ,true).
add("flux_ESG_Sigma", FloatType,true).
add("sersicN_SG", FloatType,true).
add("sersicN_SG_Sigma", FloatType,true).
add("radius_SG", FloatType,true).
add("radius_SG_Sigma", FloatType,true).
add("flux_flux_SG_Cov", FloatType,true).
add("flux_e1_SG_Cov", FloatType,true).
add("flux_e2_SG_Cov", FloatType,true).
add("flux_radius_SG_Cov", FloatType,true).
add("flux_sersicN_SG_Cov", FloatType,true).
add("e1_e1_SG_Cov", FloatType,true).
add("e1_e2_SG_Cov", FloatType,true).
add("e1_radius_SG_Cov", FloatType,true).
add("e1_sersicN_SG_Cov", FloatType,true).
add("e2_e2_SG_Cov", FloatType,true).
add("e2_radius_SG_Cov", FloatType,true).
add("e2_sersicN_SG_Cov", FloatType,true).
add("radius_radius_SG_Cov", FloatType,true).
add("radius_sersicN_SG_Cov", FloatType,true).
add("sersicN_sersicN_SG_Cov", FloatType,true).
add("flagForAssociation", IntegerType,true).
add("flagForDetection", IntegerType,true).
add("flagForWcs", IntegerType,true)

val schemaObject = (new StructType).
add("O_objectId", LongType, false).
add("iauId", StringType, true).
add("ra_PS", FloatType , false).
add("ra_PS_Sigma", FloatType, true).
add("decl_PS", FloatType , false).
add("decl_PS_Sigma", FloatType, true).
add("radecl_PS_Cov", FloatType, true).
add("O_htmId20", IntegerType, false).
add("ra_SG", FloatType , true).
add("ra_SG_Sigma", FloatType, true).
add("decl_SG", FloatType , true).
add("decl_SG_Sigma", FloatType, true).
add("radecl_SG_Cov", FloatType, true).
add("raRange", FloatType, true).
add("declRange", FloatType, true).
add("muRa_PS", FloatType , true).
add("muRa_PS_Sigma", FloatType, true).
add("muDecl_PS", FloatType , true).
add("muDecl_PS_Sigma", FloatType, true).
add("muRaDecl_PS_Cov", FloatType, true).
add("parallax_PS", FloatType , true).
add("parallax_PS_Sigma", FloatType, true).
add("canonicalFilterId", IntegerType, true).
add("O_extendedness", IntegerType, true).
add("varProb", FloatType, true).
add("earliestObsTime", FloatType , true).
add("latestObsTime", FloatType , true).
add("meanObsTime", FloatType , true).
add("flags", IntegerType, true).
add("uNumObs", IntegerType, true).
add("uExtendedness", IntegerType, true).
add("uVarProb", FloatType, true).
add("uRaOffset_PS", FloatType, true).
add("uRaOffset_PS_Sigma", FloatType, true).
add("uDeclOffset_PS", FloatType, true).
add("uDeclOffset_PS_Sigma", FloatType, true).
add("uRaDeclOffset_PS_Cov", FloatType, true).
add("uRaOffset_SG", FloatType, true).
add("uRaOffset_SG_Sigma", FloatType, true).
add("uDeclOffset_SG", FloatType, true).
add("uDeclOffset_SG_Sigma", FloatType, true).
add("uRaDeclOffset_SG_Cov", FloatType, true).
add("uLnL_PS", FloatType, true).
add("uLnL_SG", FloatType, true).
add("uFlux_PS", FloatType, true).
add("uFlux_PS_Sigma", FloatType, true).
add("uFlux_ESG", FloatType, true).
add("uFlux_ESG_Sigma", FloatType, true).
add("uFlux_Gaussian", FloatType, true).
add("uFlux_Gaussian_Sigma", FloatType, true).
add("uTimescale", FloatType, true).
add("uEarliestObsTime", FloatType , true).
add("uLatestObsTime", FloatType , true).
add("uSersicN_SG", FloatType, true).
add("uSersicN_SG_Sigma", FloatType, true).
add("uE1_SG", FloatType, true).
add("uE1_SG_Sigma", FloatType, true).
add("uE2_SG", FloatType, true).
add("uE2_SG_Sigma", FloatType, true).
add("uRadius_SG", FloatType, true).
add("uRadius_SG_Sigma", FloatType, true).
add("uFlags", IntegerType, true).
add("gNumObs", IntegerType, true).
add("gExtendedness", IntegerType, true).
add("gVarProb", FloatType, true).
add("gRaOffset_PS", FloatType, true).
add("gRaOffset_PS_Sigma", FloatType, true).
add("gDeclOffset_PS", FloatType, true).
add("gDeclOffset_PS_Sigma", FloatType, true).
add("gRaDeclOffset_PS_Cov", FloatType, true).
add("gRaOffset_SG", FloatType, true).
add("gRaOffset_SG_Sigma", FloatType, true).
add("gDeclOffset_SG", FloatType, true).
add("gDeclOffset_SG_Sigma", FloatType, true).
add("gRaDeclOffset_SG_Cov", FloatType, true).
add("gLnL_PS", FloatType, true).
add("gLnL_SG", FloatType, true).
add("gFlux_PS", FloatType, true).
add("gFlux_PS_Sigma", FloatType, true).
add("gFlux_ESG", FloatType, true).
add("gFlux_ESG_Sigma", FloatType, true).
add("gFlux_Gaussian", FloatType, true).
add("gFlux_Gaussian_Sigma", FloatType, true).
add("gTimescale", FloatType, true).
add("gEarliestObsTime", FloatType , true).
add("gLatestObsTime", FloatType , true).
add("gSersicN_SG", FloatType, true).
add("gSersicN_SG_Sigma", FloatType, true).
add("gE1_SG", FloatType, true).
add("gE1_SG_Sigma", FloatType, true).
add("gE2_SG", FloatType, true).
add("gE2_SG_Sigma", FloatType, true).
add("gRadius_SG", FloatType, true).
add("gRadius_SG_Sigma", FloatType, true).
add("gFlags", IntegerType, true).
add("rNumObs", IntegerType, true).
add("rExtendedness", IntegerType, true).
add("rVarProb", FloatType, true).
add("rRaOffset_PS", FloatType, true).
add("rRaOffset_PS_Sigma", FloatType, true).
add("rDeclOffset_PS", FloatType, true).
add("rDeclOffset_PS_Sigma", FloatType, true).
add("rRaDeclOffset_PS_Cov", FloatType, true).
add("rRaOffset_SG", FloatType, true).
add("rRaOffset_SG_Sigma", FloatType, true).
add("rDeclOffset_SG", FloatType, true).
add("rDeclOffset_SG_Sigma", FloatType, true).
add("rRaDeclOffset_SG_Cov", FloatType, true).
add("rLnL_PS", FloatType, true).
add("rLnL_SG", FloatType, true).
add("rFlux_PS", FloatType, true).
add("rFlux_PS_Sigma", FloatType, true).
add("rFlux_ESG", FloatType, true).
add("rFlux_ESG_Sigma", FloatType, true).
add("rFlux_Gaussian", FloatType, true).
add("rFlux_Gaussian_Sigma", FloatType, true).
add("rTimescale", FloatType, true).
add("rEarliestObsTime", FloatType , true).
add("rLatestObsTime", FloatType , true).
add("rSersicN_SG", FloatType, true).
add("rSersicN_SG_Sigma", FloatType, true).
add("rE1_SG", FloatType, true).
add("rE1_SG_Sigma", FloatType, true).
add("rE2_SG", FloatType, true).
add("rE2_SG_Sigma", FloatType, true).
add("rRadius_SG", FloatType, true).
add("rRadius_SG_Sigma", FloatType, true).
add("rFlags", IntegerType, true).
add("iNumObs", IntegerType, true).
add("iExtendedness", IntegerType, true).
add("iVarProb", FloatType, true).
add("iRaOffset_PS", FloatType, true).
add("iRaOffset_PS_Sigma", FloatType, true).
add("iDeclOffset_PS", FloatType, true).
add("iDeclOffset_PS_Sigma", FloatType, true).
add("iRaDeclOffset_PS_Cov", FloatType, true).
add("iRaOffset_SG", FloatType, true).
add("iRaOffset_SG_Sigma", FloatType, true).
add("iDeclOffset_SG", FloatType, true).
add("iDeclOffset_SG_Sigma", FloatType, true).
add("iRaDeclOffset_SG_Cov", FloatType, true).
add("iLnL_PS", FloatType, true).
add("iLnL_SG", FloatType, true).
add("iFlux_PS", FloatType, true).
add("iFlux_PS_Sigma", FloatType, true).
add("iFlux_ESG", FloatType, true).
add("iFlux_ESG_Sigma", FloatType, true).
add("iFlux_Gaussian", FloatType, true).
add("iFlux_Gaussian_Sigma", FloatType, true).
add("iTimescale", FloatType, true).
add("iEarliestObsTime", FloatType , true).
add("iLatestObsTime", FloatType , true).
add("iSersicN_SG", FloatType, true).
add("iSersicN_SG_Sigma", FloatType, true).
add("iE1_SG", FloatType, true).
add("iE1_SG_Sigma", FloatType, true).
add("iE2_SG", FloatType, true).
add("iE2_SG_Sigma", FloatType, true).
add("iRadius_SG", FloatType, true).
add("iRadius_SG_Sigma", FloatType, true).
add("iFlags", IntegerType, true).
add("zNumObs", IntegerType, true).
add("zExtendedness", IntegerType, true).
add("zVarProb", FloatType, true).
add("zRaOffset_PS", FloatType, true).
add("zRaOffset_PS_Sigma", FloatType, true).
add("zDeclOffset_PS", FloatType, true).
add("zDeclOffset_PS_Sigma", FloatType, true).
add("zRaDeclOffset_PS_Cov", FloatType, true).
add("zRaOffset_SG", FloatType, true).
add("zRaOffset_SG_Sigma", FloatType, true).
add("zDeclOffset_SG", FloatType, true).
add("zDeclOffset_SG_Sigma", FloatType, true).
add("zRaDeclOffset_SG_Cov", FloatType, true).
add("zLnL_PS", FloatType, true).
add("zLnL_SG", FloatType, true).
add("zFlux_PS", FloatType, true).
add("zFlux_PS_Sigma", FloatType, true).
add("zFlux_ESG", FloatType, true).
add("zFlux_ESG_Sigma", FloatType, true).
add("zFlux_Gaussian", FloatType, true).
add("zFlux_Gaussian_Sigma", FloatType, true).
add("zTimescale", FloatType, true).
add("zEarliestObsTime", FloatType , true).
add("zLatestObsTime", FloatType , true).
add("zSersicN_SG", FloatType, true).
add("zSersicN_SG_Sigma", FloatType, true).
add("zE1_SG", FloatType, true).
add("zE1_SG_Sigma", FloatType, true).
add("zE2_SG", FloatType, true).
add("zE2_SG_Sigma", FloatType, true).
add("zRadius_SG", FloatType, true).
add("zRadius_SG_Sigma", FloatType, true).
add("zFlags", IntegerType, true).
add("yNumObs", IntegerType, true).
add("yExtendedness", IntegerType, true).
add("yVarProb", FloatType, true).
add("yRaOffset_PS", FloatType, true).
add("yRaOffset_PS_Sigma", FloatType, true).
add("yDeclOffset_PS", FloatType, true).
add("yDeclOffset_PS_Sigma", FloatType, true).
add("yRaDeclOffset_PS_Cov", FloatType, true).
add("yRaOffset_SG", FloatType, true).
add("yRaOffset_SG_Sigma", FloatType, true).
add("yDeclOffset_SG", FloatType, true).
add("yDeclOffset_SG_Sigma", FloatType, true).
add("yRaDeclOffset_SG_Cov", FloatType, true).
add("yLnL_PS", FloatType, true).
add("yLnL_SG", FloatType, true).
add("yFlux_PS", FloatType, true).
add("yFlux_PS_Sigma", FloatType, true).
add("yFlux_ESG", FloatType, true).
add("yFlux_ESG_Sigma", FloatType, true).
add("yFlux_Gaussian", FloatType, true).
add("yFlux_Gaussian_Sigma", FloatType, true).
add("yTimescale", FloatType, true).
add("yEarliestObsTime", FloatType , true).
add("yLatestObsTime", FloatType , true).
add("ySersicN_SG", FloatType, true).
add("ySersicN_SG_Sigma", FloatType, true).
add("yE1_SG", FloatType, true).
add("yE1_SG_Sigma", FloatType, true).
add("yE2_SG", FloatType, true).
add("yE2_SG_Sigma", FloatType, true).
add("yRadius_SG", FloatType, true).
add("yRadius_SG_Sigma", FloatType, true).
add("yFlags", IntegerType, true).
add("chunkId", IntegerType, true).
add("subChunkId", IntegerType, true)
  

    val sources =spark.read.schema(schemaSource).csv(inputDir1)
	
	val objects =spark.read.schema(schemaObject).csv(inputDir2)
	
	
import spark.implicits._

val allobject =sources.select("*").
where($"ra".between(358.0,359.0) and $"decl".between(2.7,3.0)).
join(objects, objects("O_objectId") === sources("objectId"),"inner").
sort("objectId")


	
    allobject.write
	.option("header",true)
	.option("sep",";")
	.csv(outputDir)
    spark.stop()
  }
} 



