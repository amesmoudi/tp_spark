# tp_spark

SSH : 


ssh-keygen -t rsa


cat /home/login/.ssh/id_rsa.pub


cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/


wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar


spark-submit --class SimpleApp     --master yarn     --deploy-mode cluster     --queue default     target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/collisions/csv hdfs:///user/ubuntu/data/extract_1


# Question 1
spark-submit --class Q1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q1



# Question 2
spark-submit --class Q2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q2


# Question 3
spark-submit --class Q3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q3

# Question 4
spark-submit --class Q4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q4

# Question 5


