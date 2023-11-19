--<ScriptOptions statementTerminator=";"/>

CREATE TABLE usercart (
	username VARCHAR(60),
	prodid VARCHAR(45),
	quantity INT
);

CREATE TABLE transactions (
	transid VARCHAR(45) NOT NULL,
	username VARCHAR(60),
	time DATETIME,
	amount DECIMAL(10 , 2),
	PRIMARY KEY (transid)
);

CREATE TABLE product (
	pid VARCHAR(45) NOT NULL,
	pname VARCHAR(100),
	ptype VARCHAR(20),
	pinfo VARCHAR(350),
	pprice DECIMAL(10 , 2),
	pquantity INT,
	image LONGBLOB,
	PRIMARY KEY (pid)
);

CREATE TABLE user (
	email VARCHAR(60) NOT NULL,
	name VARCHAR(30),
	mobile BIGINT,
	address VARCHAR(250),
	pincode INT,
	password VARCHAR(20)
);

CREATE TABLE user_demand (
	username VARCHAR(60) NOT NULL,
	prodid VARCHAR(45) NOT NULL,
	quantity INT,
	PRIMARY KEY (username,prodid)
);

CREATE TABLE orders (
	orderid VARCHAR(45) NOT NULL,
	prodid VARCHAR(45) NOT NULL,
	quantity INT,
	amount DECIMAL(10 , 2),
	shipped INT DEFAULT 0 NOT NULL,
	PRIMARY KEY (orderid,prodid)
);

CREATE INDEX prodid_idx ON user_demand (prodid ASC);

CREATE INDEX useremail_idx ON usercart (username ASC);

CREATE INDEX productid_idx ON orders (prodid ASC);

CREATE UNIQUE INDEX PRIMARY ON user (email ASC);

CREATE INDEX prodidcart_idx ON usercart (prodid ASC);

CREATE UNIQUE INDEX PRIMARY ON user (null);

CREATE UNIQUE INDEX PRIMARY ON user (null);

CREATE INDEX truserid_idx ON transactions (username ASC);

