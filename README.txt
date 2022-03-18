=-= TP2 SPARK/SCALA - M1 Informatique - ETU SFA - GAD =-=

= IDBD - COUGNON Alexandre =

Document explication pour le chaque questions :

 -> Question 1 :
 .select("*")
  Selection de tout les champs de la table
 .where('objectId === 29710725217517768L)
  Pour l'objectID valant 29710725217517768
 
 -> Question 2 :
 .select($"sourceId", $"ra", $"decl")
  Selection des champs $"sourceId", $"ra", $"decl" de la table
 .where('objectId === 433349315283020L)
  Pour l'objectID valant 433349315283020
  
 -> Question 3 :
 .select($"sourceId", $"objectId")
  Selection des champs $"sourceId", $"objectId" de la table 
 .where($"ra".between(358.0,359.0) and $"decl".between(2.7,3.0))

 .filter($"objectId".isNotNull)
  Filtré pour tout objectID non nul
 
 -> Question 4 :
 .select($"objectId", $"ra", $"decl")
  Selection des champs $"objectId", $"ra", $"decl" de la table 
 .where('scienceCcdExposureId === 453349688988L)
  Pour scienceCcdExposureId valant 453349688988
 .filter('objectId.isNotNull)
  Filtré pour tout objectID non nul
 
 -> Question 5 :
 .where($"ra".between(358.0,359.0) and $"decl".between(2.7,3.0))
  Pour ra compris entre 358 et 359 ET decl compris entre 2.7 et 3
 .filter('objectId.isNotNull)
  Filtré pour tout objectID non nul
 .groupBy('objectId)
  Groupé par objectId
 .agg(count("*").as("observations"))
  Avec le nombre d'observation nommé "observations"
 .select('objectId,$"observations")
  Selection des champs $"objectId", $"observations de la table 
 
 -> Question 6 :
 .groupBy($"objectId")
  Groupé par objectId
 .agg(count('sourceId).as("observations"))
  Avec le nombre d'identifiants nommé "observations"
 .filter('objectId.isNotNull)
  Filtré pour tout objectID non nul
 .select('objectId, $"observations")
  Selection des champs $"objectId", $"observations de la table 