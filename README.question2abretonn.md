Fourth commit etu/abretonn


Select objectId, RA, DECL from source
Where objectId = 433349315283020;

val q2= source.select($"objectId",$"RA",$"DECL").where.(col("objectId") === "433349315283020").show()

