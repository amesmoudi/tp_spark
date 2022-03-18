
# TP Spark - Scala

Travail sur le développement et le déploiement d’une application Spark autonome
- [BERRAZOUANE ABDELMALEK](https://github.com/brzabdelmalek)



## 1
Retourner toutes les informations liées à l’observation avec le id
29710725217517768

- Compilation :
sbt package

- Execution : 
spark-submit --class Exo1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/aberrazo/data/source/ hdfs:///user/aberrazo/data/result_Q1

- Result :
hdfs dfs -ls ./data/result_Q1

## 2
Pour l’objet avec le id 433349315283020, retourner l’identifiant de l’observation et
sa position (RA et DECL) 

- Compilation :
sbt package

- Execution : 
spark-submit --class Exo2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/aberrazo/data/source/ hdfs:///user/aberrazo/data/result_Q2

- Result :
hdfs dfs -ls ./data/result_Q2

## 3 
Retourner tous les couples (id Observation, id Objet) dans la zone du ciel identifier
par Ra ∈ [358.0, 359.0] et Decl ∈ [2.7, 3.0]. Penser à enlever les lignes avec des « id
objet » null

- Compilation :
sbt package

- Execution : 
spark-submit --class Exo3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/aberrazo/data/source/ hdfs:///user/aberrazo/data/result_Q3

- Result :
hdfs dfs -ls ./data/result_Q3

## 4 
Retourner les ids des objets, et leur positions (Ra, Decl), observés lors de la séance
d’observation identifiée par le id 453349688988 (scienceccdexposureid). Il ne faut
pas considérer les « id objet » null

- Compilation :
sbt package

- Execution : 
spark-submit --class Exo4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/aberrazo/data/source/ hdfs:///user/aberrazo/data/result_Q4

- Result :
hdfs dfs -ls ./data/result_Q4

## 5 
Retourner le nombre d’observation pour chaque objet observé dans la zone du ciel
identifiée par Ra ∈ [358.0, 359.0] et Decl ∈ [2.7, 3.0]. Il ne faut pas considérer les « id
objet » null

- Compilation :
sbt package

- Execution : 
spark-submit --class Exo5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/aberrazo/data/source/ hdfs:///user/aberrazo/data/result_Q5

- Result :
hdfs dfs -ls ./data/result_Q5

## 6 
Retourner le nombre d’observation pour chaque objet dans la base de données

- Compilation :
sbt package

- Execution : 
spark-submit --class Exo6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/aberrazo/data/source/ hdfs:///user/aberrazo/data/result_Q6

- Result :
hdfs dfs -ls ./data/result_Q6


## 7 
Pour chaque observation dans la zone du ciel identifier par Ra ∈ [358.0, 359.0] et
Decl ∈ [2.7, 3.0], retourner les informations sur l’objet associé ainsi que sur
l’observation elle-même

## 8
Retourner toutes les informations sur les couples (id Observation, id Objet) dans la
zone du ciel identifiée par Ra ∈ [358.0, 359.0] et Decl ∈ [2.7, 3.0] triées par id de
l’objet.