-- Exercise 4: Peak Session Hours (10 AM to 12 PM sessions count per event)

SELECT 
    event_id,
    COUNT(*) AS session_count
FROM Sessions
WHERE TIME(start_time) >= '10:00:00'
  AND TIME(start_time) < '12:00:00'
GROUP BY event_id;
