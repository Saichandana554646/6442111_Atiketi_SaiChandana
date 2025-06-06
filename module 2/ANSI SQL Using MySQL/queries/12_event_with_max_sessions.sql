-- Exercise 12: List the event(s) with the highest number of sessions

SELECT 
    e.event_id,
    e.title,
    COUNT(s.session_id) AS session_count
FROM Events e
JOIN Sessions s ON e.event_id = s.event_id
GROUP BY e.event_id, e.title
HAVING session_count = (
    SELECT MAX(session_total) 
    FROM (
        SELECT COUNT(session_id) AS session_total
        FROM Sessions
        GROUP BY event_id
    ) AS subquery
);
