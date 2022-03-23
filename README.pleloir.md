first commit de etu/pleloir

Q1

Select*
from source
where sourceId= 29710725217517768:

Q2

select sourceId, ra, decl
from source
where objectId=433349315283020;

Q3

select sourceId, objectId
from source
where ra between 358.0 and 359.0
and decl between 2.7 and 3.0;

Q4

select objectId, ra, decl
from source
where scienceCcdExposureId=453349688988;

Q5

Select count(sourceId), objectId
from source
where ra between 358.0 and 359.0
and decl between 2.7 and 3.0
group by objectId;

Q6

Select count(sourceId), objectId
from source
group by objectId;

Q7

Select*
from source, object
where object.objectId=source.objectId
and ra between 358.0 and 359.0
and decl between 2.7 and 3.0;

Q8

Select sourceId, objectId
from source
where ra between 358.0 and 359.0
and decl between 2.7 and 3.0
order by objectId;
