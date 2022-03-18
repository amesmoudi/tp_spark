QUESTION 1

 spark-submit --class Requete1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/aamouh/data/source hdfs:///user
/aamouh/resultats_requetes/Q1

et

hdfs dfs -cat resultats_requetes/Q1/part-00000-666a18ad-3076-4945-80fa-4aff9d014f00-c000.csv


QUESTION 2

spark-submit --class Requete2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simpleproject_2.13-1.0.jar hdfs:///user/aamouh/data/source hdfs:///user
/aamouh/resultats_requetes/Q2

et

hdfs dfs -cat resultats_requetes/Q2/part-00001-72572d8d-3364-442e-a5fc-3602fbcdec4c-c000.csv

QUESTION 3

spark-submit --class Requete3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simpleproject_2.13-1.0.jar hdfs:///user/aamouh/data/source hdfs:///user
/aamouh/resultats_requetes/Q3

et

hdfs dfs -cat resultats_requetes/Q3/part-00000-43940727-7d61-465c-8b0a-d7c6bdd8e7c9-c000.csv

QUESTION 4

spark-submit --class Requete4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simpleproject_2.13-1.0.jar hdfs:///user/aamouh/data/source hdfs:///user
/aamouh/resultats_requetes/Q4

et

hdfs dfs -cat resultats_requetes/Q4/part-00000-de082d80-e338-4aaf-b227-4b79d20624a6-c000.csv


QUESTION 5

spark-submit --class Requete5--master yarn --deploy-mode cluster --queue default target/scala-2.13/simpleproject_2.13-1.0.jar hdfs:///user/aamouh/data/source hdfs:///user
/aamouh/resultats_requetes/Q5

et

hdfs dfs -cat resultats_requetes/Q5/part-00000-de082d80-e338-4aaf-b227-4b79d20624a6-c000.csv