
Third commit etu/tcharre


/*Toutes les informations liées à l’observation avec le id 29710725217517768*/

Select * from source 
Where sourceID =  29710725217517768;


val Q1 = source.where(col("sourceID") === "29710725217517768").show()
