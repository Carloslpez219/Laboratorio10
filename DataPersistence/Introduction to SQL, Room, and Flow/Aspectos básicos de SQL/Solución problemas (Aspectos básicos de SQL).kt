
// Solución problema número 1

SELECT name FROM park WHERE park_visitors < 1000000

// Solución problema número 2

SELECT COUNT(DISTINCT city) FROM park

// Solución problema número 3

SELECT SUM(park_visitors) FROM park WHERE city = "San Francisco"

// Solución problema número 4

SELECT name, park_visitors FROM park ORDER BY park_visitors DESC LIMIT 5