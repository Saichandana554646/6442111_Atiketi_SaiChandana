-- Exercise 23: Monthly registration counts for the past 12 months

SELECT 
    DATE_FORMAT(registration_date, '%Y-%m') AS registration_month,
    COUNT(*) AS registrations_count
FROM Registrations
WHERE registration_date >= DATE_SUB(CURDATE(), INTERVAL 12 MONTH)
GROUP BY registration_month
ORDER BY registration_month;
