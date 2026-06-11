SELECT x.ID
  FROM ECOLI_DATA x
  JOIN (SELECT A.ID
          FROM ECOLI_DATA A
          JOIN (SELECT *
                  FROM ECOLI_DATA
                 WHERE PARENT_ID IS NULL) B
            ON (A.PARENT_ID = B.ID)) y
    ON (x.PARENT_ID = y.ID)
 ORDER BY x.ID