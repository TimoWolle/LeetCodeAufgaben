--Customer Who Visited but Did Not Make Any Transactions
SELECT customer_id, COUNT(*) as count_no_trans FROM Visits t1 LEFT JOIN Transactions t2 ON t1.visit_id = t2.visit_id WHERE t2.visit_id IS NULL
GROUP BY 1