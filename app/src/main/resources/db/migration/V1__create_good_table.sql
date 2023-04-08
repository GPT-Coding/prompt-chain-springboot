CREATE TABLE Good (
    id          BIGINT         NOT NULL PRIMARY KEY,
    picture     VARCHAR(255)   NOT NULL,
    title       VARCHAR(255)   NOT NULL,
    description VARCHAR(255)   NOT NULL,
    price       DECIMAL(10, 2) NOT NULL
);
