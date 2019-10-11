# Ecommerce-Electronics-Shop-Website-using-Spring-MVC

Here i used Oracle database 11G.

-- Create table
create table ACCOUNTS
(
  USER_NAME VARCHAR2(20 CHAR) not null,
  ACTIVE    NUMBER(1) not null,
  PASSWORD  VARCHAR2(20 CHAR) not null,
  USER_ROLE VARCHAR2(20) not null
) ;
  
alter table ACCOUNTS
  add primary key (USER_NAME) ;
---------------------------------------
  
create table PRODUCTS
(
  CODE        VARCHAR2(20 CHAR) not null,
  IMAGE       BLOB,
  NAME        VARCHAR2(255 CHAR) not null,
  PRICE       FLOAT not null,
  CREATE_DATE DATE default sysdate not null
) ;
  
alter table PRODUCTS
  add primary key (CODE) ;
---------------------------------------
-- Create table
create table ORDERS
(
  ID               VARCHAR2(50 CHAR) not null,
  AMOUNT           FLOAT not null,
  CUSTOMER_ADDRESS VARCHAR2(255 CHAR) not null,
  CUSTOMER_EMAIL   VARCHAR2(128 CHAR) not null,
  CUSTOMER_NAME    VARCHAR2(255 CHAR) not null,
  CUSTOMER_PHONE   VARCHAR2(128 CHAR) not null,
  ORDER_DATE       TIMESTAMP(6) not null,
  ORDER_NUM        NUMBER(10) not null
) ;
alter table ORDERS
  add primary key (ID) ;
alter table ORDERS
  add constraint ORDER_UK unique (ORDER_NUM) ;
---------------------------------------
 
-- Create table
create table ORDER_DETAILS
(
  ID         VARCHAR2(50 CHAR) not null,
  AMOUNT     FLOAT not null,
  PRICE      FLOAT not null,
  QUANITY    NUMBER(10) not null,
  ORDER_ID   VARCHAR2(50 CHAR) not null,
  PRODUCT_ID VARCHAR2(20 CHAR) not null
) ;
--  
alter table ORDER_DETAILS
  add primary key (ID) ;
alter table ORDER_DETAILS
  add constraint ORDER_DETAIL_ORD_FK foreign key (ORDER_ID)
  references ORDERS (ID);
alter table ORDER_DETAILS
  add constraint ORDER_DETAIL_PROD_FK foreign key (PRODUCT_ID)
  references PRODUCTS (CODE);
  
---------------------------------------  
insert into Accounts (USER_NAME, ACTIVE, PASSWORD, USER_ROLE)
values ('employee', 1, '123', 'EMPLOYEE');
 
insert into Accounts (USER_NAME, ACTIVE, PASSWORD, USER_ROLE)
values ('manager', 1, '123', 'MANAGER');
 
----------------
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('Prod_01', 'smartwatch', 100, sysdate);
 
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('Prod_01', 'Laptop', 50, sysdate);
 
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('Prod_01', 'Iphone', 120, sysdate);
 
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('Prod_01', 'refigerator', 120, sysdate);
 
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('Prod_01', 'TV', 110, sysdate);
 
Commit; 
