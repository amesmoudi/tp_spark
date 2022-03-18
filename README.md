# tp_spark

SSH : 


ssh-keygen -t rsa


cat /home/login/.ssh/id_rsa.pub


cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/


wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar


spark-submit --class SimpleApp     --master yarn     --deploy-mode cluster     --queue default     target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/collisions/csv hdfs:///user/ubuntu/data/extract_1





## Exercice

Malheureusement je n'ai pas pu compiler, exécuter et tester mon code dû au message d'erreur (que je vous ai communiqué par mail).

### Question 1

#### Commande :
spark-submit --class Q1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/setudiant/data/source/ hdfs:///user/setudiant/data/extract_Q1


### Question 2

#### Commande :
spark-submit --class Q2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/setudiant/data/source/ hdfs:///user/setudiant/data/extract_Q2


### Question 3

#### Commande :
spark-submit --class Q3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/setudiant/data/source/ hdfs:///user/setudiant/data/extract_Q3


### Question 4

#### Commande :
spark-submit --class Q4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/setudiant/data/source/ hdfs:///user/setudiant/data/extract_Q4


### Question 5

#### Commande :
spark-submit --class Q5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/setudiant/data/source/ hdfs:///user/setudiant/data/extract_Q5


### Question 6

#### Commande :
spark-submit --class Q6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/setudiant/data/source/ hdfs:///user/setudiant/data/extract_Q6


### Question 7

#### Commande :
spark-submit --class Q7 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/setudiant/data/source/ hdfs:///user/setudiant/data/extract_Q7


### Question 8

#### Commande :
spark-submit --class Q8 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/setudiant/data/source/ hdfs:///user/setudiant/data/extract_Q8
