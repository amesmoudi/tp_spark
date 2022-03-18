# tp_spark

SSH : 


ssh-keygen -t rsa


cat /home/login/.ssh/id_rsa.pub


cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/


wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar


spark-submit --class SimpleApp     --master yarn     --deploy-mode cluster     --queue default     target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/collisions/csv hdfs:///user/ubuntu/data/extract_1


PROBLEME DE COMPILATION


//##############################################################################"
//
//          Question 1
//
//###############################################################################

//Compilation

sbt package

//Exécution

spark-submit --class Q1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/source/ hdfs:///user/lrenou05/data/extract_Q1

//Vérification

hdfs dfs -ls data/extract_Q1



//##############################################################################"
//
//          Question 2
//
//###############################################################################

//Compilation

sbt package

//Exécution

spark-submit --class Q2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/source/ hdfs:///user/lrenou05/data/extract_Q2

//Vérification

hdfs dfs -ls data/extract_Q2


//##############################################################################"
//
//          Question 3
//
//###############################################################################

//Compilation

sbt package

//Exécution

spark-submit --class Q3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/source/ hdfs:///user/lrenou05/data/extract_Q3

//Vérification

hdfs dfs -ls data/extract_Q3

//##############################################################################"
//
//          Question 4
//
//###############################################################################

//Compilation

sbt package

//Exécution

spark-submit --class Q4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/source/ hdfs:///user/lrenou05/data/extract_Q4

//Vérification

hdfs dfs -ls data/extract_Q4


//##############################################################################"
//
//          Question 5
//
//###############################################################################

//Compilation

sbt package

//Exécution

spark-submit --class Q5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/source/ hdfs:///user/lrenou05/data/extract_Q5

//Vérification

hdfs dfs -ls data/extract_Q5
