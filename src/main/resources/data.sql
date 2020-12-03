DROP TABLE IF EXISTS `user`;

CREATE TABLE user (
  id_person bigint(20) AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  cpf VARCHAR(15) NOT NULL,
  address VARCHAR(250) DEFAULT NULL,
  address_cep varchar(255) DEFAULT NULL,
  address_street varchar(150) DEFAULT NULL,
  address_number int(11) DEFAULT NULL,
  address_complement varchar(150) DEFAULT NULL,
  address_neighborhood varchar(75) DEFAULT NULL,
  address_city varchar(75) DEFAULT NULL,
  address_uf varchar(2) DEFAULT NULL,
);