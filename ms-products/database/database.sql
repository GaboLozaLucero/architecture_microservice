-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-05-31 20:34:50.409

-- tables
-- Table: client
CREATE TABLE client (
                        client_id int NOT NULL AUTO_INCREMENT,
                        client_name varchar(20) NULL,
                        CONSTRAINT client_pk PRIMARY KEY (client_id)
);

-- Table: invoice
CREATE TABLE invoice (
                         invoice_id int NOT NULL AUTO_INCREMENT,
                         product_id int NOT NULL,
                         client_id int NOT NULL,
                         date date NULL,
                         CONSTRAINT invoice_pk PRIMARY KEY (invoice_id)
);

-- Table: products
CREATE TABLE products (
                          product_id int NOT NULL AUTO_INCREMENT,
                          product_name varchar(20) NULL,
                          quantity int NULL,
                          price numeric(10,4) NULL,
                          description varchar(200) NULL,
                          provider_id int NOT NULL,
                          CONSTRAINT product_id PRIMARY KEY (product_id)
);

-- Table: providers
CREATE TABLE providers (
                           provider_id int NOT NULL AUTO_INCREMENT,
                           provider_name varchar(20) NULL,
                           CONSTRAINT providers_pk PRIMARY KEY (provider_id)
);

-- foreign keys
-- Reference: invoice_client (table: invoice)
ALTER TABLE invoice ADD CONSTRAINT invoice_client FOREIGN KEY invoice_client (client_id)
    REFERENCES client (client_id);

-- Reference: invoice_products (table: invoice)
ALTER TABLE invoice ADD CONSTRAINT invoice_products FOREIGN KEY invoice_products (product_id)
    REFERENCES products (product_id);

-- Reference: products_providers (table: products)
ALTER TABLE products ADD CONSTRAINT products_providers FOREIGN KEY products_providers (provider_id)
    REFERENCES providers (provider_id);

-- End of file.
