# tp_spark
Commandes mise en place : 
SSH : 
ssh-keygen -t rsa
cat /home/login/.ssh/id_rsa.pub
cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/
wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar

Requetes : 

1 - Retourner toutes les informations liées à l’observation : 
Compiler : sbt package
Executer : spark-submit --class Q1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/kboulouf/data/source/ hdfs:///user/kboulouf/data/Q1Resultat
Resultat : hdfs dfs -ls ./data/Q1Resultat

2- Retourner l’identifiant de l’observation et sa position : 
Compiler : sbt package
Executer : spark-submit --class Q2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/kboulouf/data/source/ hdfs:///user/kboulouf/data/Q2Resultat
Resultat : hdfs dfs -ls ./data/Q2Resultat

3- Retourner tous les couples : 
Compiler : sbt package
Executer : spark-submit --class Q3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/kboulouf/data/source/ hdfs:///user/kboulouf/data/Q3Resultat
Resultat : hdfs dfs -ls ./data/Q3Resultat

4- Retourner les id et les positions des objets : 
Compiler : sbt package
Executer : spark-submit --class Q4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/kboulouf/data/source/ hdfs:///user/kboulouf/data/Q4Resultat
Resultat : hdfs dfs -ls ./data/Q4Resultat

5- Retourner le nombre d’observation pour chaque objet observé dans la zone du ciel identifiée par Ra : 
Compiler : sbt package
Executer : spark-submit --class Q5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/kboulouf/data/source/ hdfs:///user/kboulouf/data/Q5Resultat
Resultat : hdfs dfs -ls ./data/Q5Resultat

6- Retourner le nombre d’observations pour chaque objet dans la BDD : *
Compiler : sbt package
Executer : spark-submit --class Q6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/kboulouf/data/source/ hdfs:///user/kboulouf/data/Q6Resultat
Resultat : hdfs dfs -ls ./data/Q6Resultat

7-Retourner les informations sur l’objet associé ainsi que sur l’observation elle-même, pour chaque observation dans la zone du ciel 
Compiler : sbt package
Executer : spark-submit --class Q7 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/kboulouf/data/source/ hdfs:///user/kboulouf/data/Q7Resultat
Resultat : hdfs dfs -ls ./data/Q7Resultat

8- Retourner toutes les informations sur les couples (id Observation, id Objet) dans la zone du ciel identifiée par Ra ∈ [358.0, 359.0] et Decl ∈ [2.7, 3.0] triées par id de l’objet : 
Compiler : sbt package
Executer : spark-submit --class Q8 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/kboulouf/data/source/ hdfs:///user/kboulouf/data/Q8Resultat
Resultat : hdfs dfs -ls ./data/Q8Resultat

