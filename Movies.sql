CREATE TABLE Movies (
                        movie_id INT PRIMARY KEY,
                        title VARCHAR(100),
                        director VARCHAR(100),
                        release_year INT
);

INSERT INTO Movies (movie_id, title, director, release_year)
VALUES
    (1, 'Inception', 'Christopher Nolan', 2010),
    (2, 'Interstellar', 'Christopher Nolan', 2014),
    (3, 'Avatar', 'James Cameron', 2009);

SELECT * FROM Movies;
UPDATE Movies
SET release_year = 2011
WHERE movie_id = 1;
DELETE FROM Movies
WHERE movie_id = 3;