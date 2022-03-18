Commandes utilisées pour tester le programme :

Question 1 :

Execution :
spark-submit --class Question1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/jcruchon/source hdfs:///user/jcruchon/data/extract_Q1_3

Test : 

hdfs dfs -cat data/extract_Q1_3/part-00000-3fe3eb4a-9a7d-4894-bd8f-f839c5d6e872-c000.csv
hdfs dfs -cat data/extract_Q1_3/part-00001-3fe3eb4a-9a7d-4894-bd8f-f839c5d6e872-c000.csv


Question 2 :

Execution : 

spark-submit --class Question2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/jcruchon/data/object hdfs:///user/jcruchon/data/extract_Q2_4

Test : 

hdfs dfs -cat data/extract_Q2_4/part-00000-e710c90d-2e45-4dfd-9bd4-d804900ca0ec-c000.csv