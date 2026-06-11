SELECT y.ID
  FROM ECOLI_DATA y
  JOIN (SELECT A.ID
          FROM ECOLI_DATA A
          JOIN (SELECT *
                  FROM ECOLI_DATA
                 WHERE PARENT_ID IS NULL) B
            ON (A.PARENT_ID = B.ID)) x
    ON (y.PARENT_ID = x.ID)
 ORDER BY y.ID