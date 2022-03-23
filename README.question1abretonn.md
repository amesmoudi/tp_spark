
Third commit etu/abretonn
question 1

Select * from source 
Where sourceID =  29710725217517768;

val q1= source.where(col("sourceID") === "29710725217517768").show()
