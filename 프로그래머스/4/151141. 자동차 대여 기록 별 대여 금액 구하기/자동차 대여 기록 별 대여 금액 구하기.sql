SELECT H.HISTORY_ID,
       FLOOR(C.DAILY_FEE * (DATEDIFF(H.END_DATE, H.START_DATE) + 1) * 
            (CASE WHEN DATEDIFF(H.END_DATE, H.START_DATE) + 1 >= 90 THEN 0.85  
                  WHEN DATEDIFF(H.END_DATE, H.START_DATE) + 1 >= 30 THEN 0.92 
                  WHEN DATEDIFF(H.END_DATE, H.START_DATE) + 1 >= 7 THEN 0.95   
                  ELSE 1                                                       
                  END)
            ) AS FEE
 FROM CAR_RENTAL_COMPANY_CAR C
 JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H 
   ON C.CAR_ID = H.CAR_ID
WHERE C.CAR_TYPE = '트럭'
ORDER BY FEE DESC, H.HISTORY_ID DESC;