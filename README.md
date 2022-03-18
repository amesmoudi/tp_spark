# tp_spark

SSH : 


ssh-keygen -t rsa


cat /home/login/.ssh/id_rsa.pub


cd  ~/.cache/sbt/boot/sbt-launch/1.5.5/


wget https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch/1.5.5/sbt-launch-1.5.5.jar


spark-submit --class SimpleApp     --master yarn     --deploy-mode cluster     --queue default     target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///data/collisions/csv hdfs:///user/ubuntu/data/extract_1


# SOMETIMES THERE IS ONLY ONE FILE IN EXIT AND SOMETIMES THERE ARE TWO, BUT ONE HAS ONLY NAMES OF COLUMN AND SECOND RESPONSE

# TODO BEFORE EXECUTE:
```bash
sbt package
```

or if code changed


## Question 1 TWO FILES IN EXIT, FIRST IS EMPTY, SECOND HAS RESPONSE TO A REQUEST

```bash
spark-submit --class Q1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q1
```

to get names of generated files
```bash
hdfs dfs -ls data/extract_Q1
```

to see the result in file
```bash
hdfs dfs -cat data/extract_Q1/"name form previous command"
```



## Question 2 ONLY ONE FILE IN EXIT

```bash
spark-submit --class Q2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q2
```

to get names of generated files
```bash
hdfs dfs -ls data/extract_Q2
```

to see the result in file
```bash
hdfs dfs -cat data/extract_Q2/"name form previous command" 
```

## Question 3 TWO FILES IN EXIT, FIRST IS EMPTY, SECOND HAS RESPONSE TO A REQUEST

```bash
spark-submit --class Q3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q3
```

to get names of generated files
```bash
hdfs dfs -ls data/extract_Q3
```

to see the result in file
```bash
hdfs dfs -cat data/extract_Q3/"name form previous command" 
```



## Question 4 TWO FILES IN EXIT, FIRST IS EMPTY, SECOND HAS RESPONSE TO A REQUEST

```bash
spark-submit --class Q4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q4
```

to get names of generated files
```bash
hdfs dfs -ls data/extract_Q4
```

to see the result in file
```bash
hdfs dfs -cat data/extract_Q4/"name form previous command" 
```

## Question 5 ONLY ONE FILE IN EXIT

```bash
spark-submit --class Q5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q5
```

to get names of generated files
```bash
hdfs dfs -ls data/extract_Q5
```

to see the result in file
```bash
hdfs dfs -cat data/extract_Q5/"name form previous command" 
```

## Question 6 ONLY ONE FILE IN EXIT

```bash
spark-submit --class Q6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q6
```

to get names of generated files
```bash
hdfs dfs -ls data/extract_Q6
```

to see the result in file
```bash
hdfs dfs -cat data/extract_Q6/"name form previous command" 
```

## Question 7

```bash
spark-submit --class Q7 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/object/ hdfs:///user/mglukhov/data/extract_Q7
```

to get names of generated files
```bash
hdfs dfs -ls data/extract_Q7
```

to see the result in file
```bash
hdfs dfs -cat data/extract_Q7/"name form previous command" 
```

