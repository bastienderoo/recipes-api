CREATE TABLE IF NOT EXISTS ingredient_type
(
    id
    SERIAL
    PRIMARY
    KEY,
    name
    VARCHAR
(
    50
),
    vege INT
    );

CREATE TABLE IF NOT EXISTS ingredient
(
    id
    SERIAL
    PRIMARY
    KEY,
    name
    VARCHAR
(
    50
),
    calories INT,
    picture VARCHAR
(
    1024
),
    ingredient_type_id INT,
    FOREIGN KEY
(
    ingredient_type_id
) REFERENCES ingredient_type
(
    id
)
    );

CREATE TABLE IF NOT EXISTS recipe
(
    id
    SERIAL
    PRIMARY
    KEY,
    name
    VARCHAR
(
    50
),
    picture VARCHAR
(
    1024
)
    );

CREATE TABLE IF NOT EXISTS recipe_ingredient
(
    id
    SERIAL
    PRIMARY
    KEY,
    quantity
    DECIMAL,
    unit
    INT,
    ingredient_id
    INT,
    recipe_id
    INT,
    FOREIGN
    KEY
(
    ingredient_id
) REFERENCES ingredient
(
    id
),
    FOREIGN KEY
(
    recipe_id
) REFERENCES recipe
(
    id
)
    );
