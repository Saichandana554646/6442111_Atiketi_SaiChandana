-- Exercise 22: Find users registered multiple times for the same event

SELECT 
    user_id,
    event_id,
    COUNT(*) AS registration_count
FROM Registrations
GROUP BY user_id, event_id
HAVING registration_count > 1;
