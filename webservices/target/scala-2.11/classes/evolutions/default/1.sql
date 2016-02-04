# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table carrinho (
  email                     varchar(255) not null,
  total                     float,
  constraint pk_carrinho primary key (email))
;

create table compra (
  COMPRA_ID                 bigint not null,
  status                    varchar(255),
  data                      timestamp,
  usaurio                   varchar(255),
  total                     float,
  constraint pk_compra primary key (COMPRA_ID))
;

create table produto (
  id                        bigint not null,
  nome                      varchar(255),
  preco                     float,
  DECRICAO                  clob(5000),
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
create sequence carrinho_seq;

create sequence compra_seq;

create sequence produto_seq;

create sequence usuario_seq;




alter table CARRINHO_PRODUTO add constraint fk_CARRINHO_PRODUTO_carrinho_01 foreign key (Email) references carrinho (Email) on delete restrict on update restrict;

alter table CARRINHO_PRODUTO add constraint fk_CARRINHO_PRODUTO_produto_02 foreign key (produto_id) references produto (id) on delete restrict on update restrict;

alter table COMPRA_PRODUTOS add constraint fk_COMPRA_PRODUTOS_compra_01 foreign key (COMPRA_ID) references compra (COMPRA_ID) on delete restrict on update restrict;

alter table COMPRA_PRODUTOS add constraint fk_COMPRA_PRODUTOS_produto_02 foreign key (produto_id) references produto (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists carrinho;

drop table if exists CARRINHO_PRODUTO;

drop table if exists compra;

drop table if exists COMPRA_PRODUTOS;

drop table if exists produto;

drop table if exists usuario;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists carrinho_seq;

drop sequence if exists compra_seq;

drop sequence if exists produto_seq;

drop sequence if exists usuario_seq;

