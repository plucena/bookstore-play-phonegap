create database IF NOT EXISTS books

use books

create table carrinho (
email                     varchar(255) not null,
total                     float,
constraint pk_carrinho primary key (email))
;

create table compra (
COMPRA_ID                 bigint auto_increment not null,
status                    varchar(255),
data                      datetime,
usaurio                   varchar(255),
total                     float,
constraint pk_compra primary key (COMPRA_ID))
;

create table produto (
id                        bigint auto_increment not null,
nome                      varchar(255),
preco                     float,
DECRICAO                  text,
foto                      varchar(255),
arquivo                   varchar(255),
constraint pk_produto primary key (id))
;

create table usuario (
email                     varchar(255) not null,
senha                     varchar(255),
endereco                  varchar(255),
telefone                  varchar(255),
constraint pk_usuario primary key (email))
;


create table CARRINHO_PRODUTO (
Email                          varchar(255) not null,
produto_id                     bigint not null,
constraint pk_CARRINHO_PRODUTO primary key (Email, produto_id))
;

create table COMPRA_PRODUTOS (
COMPRA_ID                      bigint not null,
produto_id                     bigint not null,
constraint pk_COMPRA_PRODUTOS primary key (COMPRA_ID, produto_id))
;



alter table CARRINHO_PRODUTO add constraint fk_CARRINHO_PRODUTO_carrinho_01 foreign key (Email) references carrinho (Email) on delete restrict on update restrict;

alter table CARRINHO_PRODUTO add constraint fk_CARRINHO_PRODUTO_produto_02 foreign key (produto_id) references produto (id) on delete restrict on update restrict;

alter table COMPRA_PRODUTOS add constraint fk_COMPRA_PRODUTOS_compra_01 foreign key (COMPRA_ID) references compra (COMPRA_ID) on delete restrict on update restrict;

alter table COMPRA_PRODUTOS add constraint fk_COMPRA_PRODUTOS_produto_02 foreign key (produto_id) references produto (id) on delete restrict on update restrict;