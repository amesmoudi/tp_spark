# tp_spark

SSH : 


ssh-keygen -t rsa


cat /home/login/.ssh/id_rsa.pub


cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/


wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar


## Question 1
fichier scala : Question1.scala
commande : spark-submit --class Question1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question1
version sql :
select *
from source
where sourceId = 29710725217517768

## Question 2
fichier scala : Question2.scala
commande : spark-submit --class Question2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question2
version sql :
select sourceId, ra, decl
from source
where objectId = 433349315283020

## Question 3
fichier scala : Question3.scala
commande : spark-submit --class Question3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question3
version sql :
select sourceId, objectId
from source
where ra between 358.0 and 359.0
and decl between 2.7 and 3.0
and objectId is not null

## Question 4
fichier scala : Question4.scala
commande : spark-submit --class Question4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question4
version sql :
select objectId, ra, decl
from source
where scienceCcdExposureId = 453349688988
and objectId is not null

## Question 5
fichier scala : Question5.scala
commande : spark-submit --class Question5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question5
version sql :
select objectId, count(*) as nb_observation
from source
where ra between 358.0 and 359.0
and decl between 2.7 and 3.0
and objectId is not null
group by objectId

## Question 6
fichier scala : Question6.scala
commande : spark-submit --class Question6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/TP2_result/question6
version sql :
select objectId, count(sourceId) as nb_observation
from source
where objectId is not null
group by objectId

## Question 7
fichier scala : Question7.scala
commande : spark-submit --class Question7 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/data/object/ hdfs:///user/cguill18/TP2_result/question7
version sql :
select *
from source as s, object as o
where s.ra between 358.0 and 359.0
and s.decl between 2.7 and 3.0
and s.objectId = o.objectId

## Question 8
fichier scala : Question8.scala
commande : spark-submit --class Question8 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/cguill18/data/source/ hdfs:///user/cguill18/data/object/ hdfs:///user/cguill18/TP2_result/question8
version sql :
select *
from source as s, object as o
where s.ra between 358.0 and 359.0
and s.decl between 2.7 and 3.0
and s.objectId = o.objectId
order by objectId