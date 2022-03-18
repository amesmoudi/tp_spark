# tp_spark
## Karmim chakib
 
 J'ai un soucis avec la commande : 
	
	' spark-submit --class SimpleApp --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/collisions/csv hdfs:///user/ubuntu/data/extract_1 '
 Sachant que je l'ai déja utiliser dans la seance de tp sans aucun probléme ('hdfs dfs -ls data' pour voir les exemples d'avant)
	
	![#f03c15]( Message d'erreur depuis ce matin : )
	 client token: N/A
	 diagnostics: Max number of executor failures (3) reached
	 ApplicationMaster host: worker06
	 ApplicationMaster RPC port: 33953
	 queue: default
	 start time: 1647629107351
	 final status: FAILED
	 tracking URL: http://master:8088/proxy/application_1647516231759_0402/
	 user: ckarmim

## Commande 
	* cd/tp_spark
	* sbt package 
	* spark-submit --class qstXX --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/ckarmim/data/source/ hdfs:///user/ubuntu/data/extract_qstXX
	* hdfs dfs -ls data/extract_qstXX

## Remarque 
	NB : Le spark submit ne fontionne pas sur ma machine donc le dossier data ne contient pas les fichiers extract_qstXX
