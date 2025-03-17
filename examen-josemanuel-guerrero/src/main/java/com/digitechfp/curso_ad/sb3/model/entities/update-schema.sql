CREATE SEQUENCE IF NOT EXISTS products_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE products
(
    id     INTEGER      NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    precio INTEGER      NOT NULL,
    stock  INTEGER      NOT NULL,
    CONSTRAINT pk_products PRIMARY KEY (id)
);

ALTER TABLE products
    ADD CONSTRAINT uc_products_nombre UNIQUE (nombre);

CREATE UNIQUE INDEX product_name_idx ON products (nombre);