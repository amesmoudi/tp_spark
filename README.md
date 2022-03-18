# tp_spark

SSH : 


ssh-keygen -t rsa


cat /home/login/.ssh/id_rsa.pub


cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/


wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar



@Author : [DAVID Axel](https://github.com/Raxteel)



# Question 1

Nom du fichier scala :   Q1.scala

Commande  :

```

spark-submit --class Q1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/adavid19/data/source/ hdfs:///user/adavid19/data/Q1_results

```


Resultats :

```

 hdfs dfs -ls ./data/Q1_results

```

# Question 2

Nom du fichier scala :   Q2.scala

Commande  :

```

spark-submit --class Q2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/adavid19/data/source/ hdfs:///user/adavid19/data/Q2_results

```


Resultats :

```

 hdfs dfs -ls ./data/Q2_results

```


# Question 3

Nom du fichier scala :   Q3.scala

Commande  :

```

spark-submit --class Q3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/adavid19/data/source/ hdfs:///user/adavid19/data/Q3_results

```

Resultats :

```

 hdfs dfs -ls ./data/Q3_results

```


# Question 4


Nom du fichier scala :   Q4.scala

Commande  :

```

spark-submit --class Q4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/adavid19/data/source/ hdfs:///user/adavid19/data/Q4_results

```

Resultats :

```

 hdfs dfs -ls ./data/Q4_results

```


# Question 5


Nom du fichier scala :   Q5.scala

Commande  :

```

spark-submit --class Q5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/adavid19/data/source/ hdfs:///user/adavid19/data/Q5_results

```

Resultats :

```

 hdfs dfs -ls ./data/Q5_results

```


# Question 6


Nom du fichier scala :   Q6.scala

Commande  :

```

spark-submit --class Q6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/adavid19/data/source/ hdfs:///user/adavid19/data/Q6_results

```

Resultats :

```

 hdfs dfs -ls ./data/Q6_results

```


# Question 7


# Question 8





