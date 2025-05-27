-- Exercise 1: List upcoming events a user is registered for in their city

SELECT e.event_id, e.title, e.start_date, e.end_date, e.city
FROM Events e
JOIN Registrations r ON e.event_id = r.event_id
JOIN Users u ON r.user_id = u.user_id
WHERE u.user_id = ?  -- Replace ? with the actual user ID or bind parameter
  AND e.city = u.city
  AND e.status = 'upcoming'
ORDER BY e.start_date ASC;
