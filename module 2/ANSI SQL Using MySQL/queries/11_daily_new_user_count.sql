-- Exercise 11: Number of users registered each day in the last 7 days

SELECT 
    registration_date,
    COUNT(*) AS user_count
FROM Users
WHERE registration_date >= CURDATE() - INTERVAL 7 DAY
GROUP BY registration_date
ORDER BY registration_date DESC;
