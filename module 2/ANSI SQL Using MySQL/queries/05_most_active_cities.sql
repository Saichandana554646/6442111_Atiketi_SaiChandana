-- Exercise 5: Top 5 cities with highest distinct user registrations

SELECT 
    u.city,
    COUNT(DISTINCT r.user_id) AS distinct_user_count
FROM Registrations r
JOIN Users u ON r.user_id = u.user_id
GROUP BY u.city
ORDER BY distinct_user_count DESC
LIMIT 5;
