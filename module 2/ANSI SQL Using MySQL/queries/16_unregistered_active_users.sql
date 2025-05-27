-- Exercise 16: Find users who signed up in the last 30 days but have no event registrations

SELECT 
    u.user_id,
    u.full_name,
    u.email,
    u.city,
    u.registration_date
FROM Users u
LEFT JOIN Registrations r ON u.user_id = r.user_id
WHERE u.registration_date >= CURDATE() - INTERVAL 30 DAY
  AND r.registration_id IS NULL;
