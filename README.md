# tp_spark


# SOMETIMES THERE IS ONLY ONE FILE IN EXIT AND SOMETIMES THERE ARE TWO, BUT ONE HAS ONLY NAMES OF COLUMNS AND SECOND RESPONSE

# TODO BEFORE EXECUTE:
```bash
sbt package
```

or if code changed


## Question 1 TWO FILES IN EXIT: FIRST IS EMPTY, SECOND HAS RESPONSE TO A REQUEST

```bash
spark-submit --class Q1 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q1
```

to get names of generated files:
```bash
hdfs dfs -ls data/extract_Q1
```

to see the result in file:
```bash
hdfs dfs -cat data/extract_Q1/"name from previous command"
```



## Question 2 ONLY ONE FILE IN EXIT

```bash
spark-submit --class Q2 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q2
```

to get names of generated files:
```bash
hdfs dfs -ls data/extract_Q2
```

to see the result in file:
```bash
hdfs dfs -cat data/extract_Q2/"name from previous command" 
```

## Question 3 TWO FILES IN EXIT: FIRST IS EMPTY, SECOND HAS RESPONSE TO A REQUEST

```bash
spark-submit --class Q3 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q3
```

to get names of generated files:
```bash
hdfs dfs -ls data/extract_Q3
```

to see the result in file:
```bash
hdfs dfs -cat data/extract_Q3/"name from previous command" 
```



## Question 4 TWO FILES IN EXIT: FIRST IS EMPTY, SECOND HAS RESPONSE TO A REQUEST

```bash
spark-submit --class Q4 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q4
```

to get names of generated files:
```bash
hdfs dfs -ls data/extract_Q4
```

to see the result in file:
```bash
hdfs dfs -cat data/extract_Q4/"name from previous command" 
```

## Question 5 ONLY ONE FILE IN EXIT

```bash
spark-submit --class Q5 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q5
```

to get names of generated files:
```bash
hdfs dfs -ls data/extract_Q5
```

to see the result in file:
```bash
hdfs dfs -cat data/extract_Q5/"name from previous command" 
```

## Question 6 ONLY ONE FILE IN EXIT

```bash
spark-submit --class Q6 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/extract_Q6
```

to get names of generated files:
```bash
hdfs dfs -ls data/extract_Q6
```

to see the result in file:
```bash
hdfs dfs -cat data/extract_Q6/"name from previous command" 
```

## Question 7 ONLY ONE FILE IN EXIT

```bash
spark-submit --class Q7 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/object/ hdfs:///user/mglukhov/data/extract_Q7
```

to get names of generated files:
```bash
hdfs dfs -ls data/extract_Q7
```

to see the result in file:
```bash
hdfs dfs -cat data/extract_Q7/"name from previous command" 
```

## Question 8 ONLY ONE FILE IN EXIT

```bash
spark-submit --class Q8 --master yarn --deploy-mode cluster --queue default target/scala-2.13/simple-project_2.13-1.0.jar hdfs:///user/mglukhov/data/source/ hdfs:///user/mglukhov/data/object/ hdfs:///user/mglukhov/data/extract_Q8
```

to get names of generated files:
```bash
hdfs dfs -ls data/extract_Q8
```

to see the result in file:
```bash
hdfs dfs -cat data/extract_Q8/"name from previous command" 
```

