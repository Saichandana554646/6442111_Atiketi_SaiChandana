-- Exercise 6: Count of resources by type per event

SELECT 
    e.title AS event_title,
    r.resource_type,
    COUNT(*) AS resource_count
FROM Resources r
JOIN Events e ON r.event_id = e.event_id
GROUP BY r.event_id, r.resource_type
ORDER BY e.title, r.resource_type;
