-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-05-31 16:58:55.607

-- tables
-- Table: client
CREATE TABLE client (
                        id_client int NOT NULL AUTO_INCREMENT,
                        name varchar(50) NOT NULL,
                        lastname varchar(50) NOT NULL,
                        CI int NOT NULL,
                        phone int NOT NULL,
                        CONSTRAINT client_pk PRIMARY KEY (id_client)
);

-- Table: product
CREATE TABLE product (
                         id_product int NOT NULL AUTO_INCREMENT,
                         name_product varchar(59) NOT NULL,
                         quantity int NOT NULL,
                         price numeric(10,4) NOT NULL,
                         description varchar(200) NOT NULL,
                         CONSTRAINT product_pk PRIMARY KEY (id_product)
);

-- Table: sale
CREATE TABLE sale (
                      id_sale int NOT NULL AUTO_INCREMENT,
                      id_product int NOT NULL,
                      id_client int NOT NULL,
                      date date NOT NULL,
                      CONSTRAINT sale_pk PRIMARY KEY (id_sale)
);

-- foreign keys
-- Reference: sale_client (table: sale)
ALTER TABLE sale ADD CONSTRAINT sale_client FOREIGN KEY sale_client (id_client)
    REFERENCES client (id_client);

-- Reference: sale_product (table: sale)
ALTER TABLE sale ADD CONSTRAINT sale_product FOREIGN KEY sale_product (id_product)
    REFERENCES product (id_product);

-- End of file.