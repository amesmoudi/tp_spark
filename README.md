# tp_spark

SSH : 


ssh-keygen -t rsa


cat /home/login/.ssh/id_rsa.pub


cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/


wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar

#TP Big Data avec Spark 
#Devémy Thibaud

*Question 1

  sbt package
  
  commande d'execution : spark-submit --class Q1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar      hdfs:///user/tdevemy/data/source/ hdfs:///user/tdevemy/data/extract_Q1
  
  commande pour consulter les résultats : hdfs dfs -ls data/extract_Q1

*Question 2

sbt package

commande d'execution : spark-submit --class Q2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/tdevemy/data/source/ hdfs:///user/tdevemy/data/extract_Q2

commande pour consulter les résultats : hdfs dfs -ls data/extract_Q2

*Question 3

sbt package

commande d'execution : spark-submit --class Q3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/tdevemy/data/source/ hdfs:///user/tdevemy/data/extract_Q3

commande pour consulter les résultats : hdfs dfs -ls data/extract_Q3

*Question 4

sbt package

commande d'execution : spark-submit --class Q4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/tdevemy/data/source/ hdfs:///user/tdevemy/data/extract_Q4

commande pour consulter les résultats : hdfs dfs -ls data/extract_Q4

*Question 5

sbt package

commande d'execution : spark-submit --class Q5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/tdevemy/data/source/ hdfs:///user/tdevemy/data/extract_Q5

commande pour consulter les résultats : hdfs dfs -ls data/extract_Q5

*Question 6

sbt package

commande d'execution : spark-submit --class Q6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/tdevemy/data/source/ hdfs:///user/tdevemy/data/extract_Q6

commande pour consulter les résultats : hdfs dfs -ls data/extract_Q6

*Question 7

sbt package

commande d'execution : spark-submit --class Q7 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/tdevemy/data/source/ hdfs:///user/tdevemy/data/extract_Q7

commande pour consulter les résultats : hdfs dfs -ls data/extract_Q7

*Question 8

sbt package

commande d'execution : spark-submit --class Q8 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/tdevemy/data/source/ hdfs:///user/tdevemy/data/extract_Q8

commande pour consulter les résultats : hdfs dfs -ls data/extract_Q8
