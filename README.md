# tp_spark

SSH : 


ssh-keygen -t rsa


cat /home/login/.ssh/id_rsa.pub


cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/


wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar


## Question 1
fichier scala : Question1.scala
commande : spark-submit --class Question1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question1

## Question 2
fichier scala : Question2.scala
commande : spark-submit --class Question2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question2

## Question 3
fichier scala : Question3.scala
commande : spark-submit --class Question3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question3

## Question 4
fichier scala : Question4.scala
commande : spark-submit --class Question4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question4

## Question 5
fichier scala : Question5.scala
commande : spark-submit --class Question5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question5

## Question 6
fichier scala : Question6.scala
commande : spark-submit --class Question6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question6

## Question 7
fichier scala : Question7.scala
commande : spark-submit --class Question7 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/data/object/ hdfs:///user/cguill18/TP2_result/question7

## Question 8
fichier scala : Question8.scala
commande : spark-submit --class Question8 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/data/object/ hdfs:///user/cguill18/TP2_result/question8