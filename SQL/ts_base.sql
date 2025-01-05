SELECT name 
FROM table1
WHERE country='Ukraine' AND city != 'Kyiv';

SELECT table2.Phone_number 
FROM table1
JOIN table2
ON table1.id = table2.id
WHERE table1.city = 'Split';

-- CREATE TABLE table1 (
--     id INTEGER,
--     name TEXT,
--     city TEXT,
--     Country TEXT
-- );

-- INSERT INTO table1 (id, name, city, Country) VALUES
-- (1, 'Oleksandr', 'Kyiv', 'Ukraine'),
-- (2, 'Vasyl', 'Gdansk', 'Poland'),
-- (3, 'Sergii', 'Hotiv', 'Ukraine'),
-- (4, 'Polina', 'Kyiv', 'Ukraine'),
-- (5, 'Kate', 'Split', 'Chroatia'),
-- (6, 'Yuliia', 'Ternopil', 'Ukraine'),
-- (7, 'Denys', 'Split', 'Chroatia'),
-- (8, 'Oleksandr', 'Cherkasy', 'Ukraine');

-- CREATE TABLE table2 (
--     id INTEGER,
--     name TEXT,
--     Surname TEXT,
--     Phone_number TEXT
-- );

-- INSERT INTO table2 (id, name, Surname, Phone_number) VALUES
-- (1, 'Oleksandr', 'Ponezha', '0-12345612'),
-- (2, 'Vasyl', 'Ponezha', '123-4253731'),
-- (3, 'Sergii', 'Ponezha', '111-11099999'),
-- (4, 'Polina', 'Ponezha', '1-2345123'),
-- (5, 'Yuliia', 'Hrubiak', '78782-1111'),
-- (6, 'Kate', 'Lokhmar', '431-1234'),
-- (7, 'Denys', 'Lokhmar', '921-34542'),
-- (8, 'Oleksandr', 'Rozumnyi', '202-1111111');
