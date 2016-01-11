# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                        varchar(255) not null,
  author                    varchar(255),
  collection                varchar(255),
  other                     varchar(255),
  title                     varchar(255),
  reader                    varchar(255),
  editora_nome              varchar(255),
  constraint pk_book primary key (id))
;

create table editora (
  nome                      varchar(255) not null,
  constraint pk_editora primary key (nome))
;

alter table book add constraint fk_book_editora_1 foreign key (editora_nome) references editora (nome) on delete restrict on update restrict;
create index ix_book_editora_1 on book (editora_nome);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table book;

drop table editora;

SET FOREIGN_KEY_CHECKS=1;

