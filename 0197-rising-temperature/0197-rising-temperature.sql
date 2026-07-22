# Write your MySQL query statement below
SELECT today.id from Weather today
JOIN Weather yesterday
on today.recordDate = DATE_ADD(yesterday.recordDate,INTERVAL 1 DAY)
WHERE today.temperature > yesterday.temperature