# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table customer (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  email                         varchar(255),
  constraint pk_customer primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  category_id                   bigint,
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null,
  constraint pk_product primary key (id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table product add constraint fk_product_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_product_category_id on product (category_id);


# --- !Downs

alter table product drop constraint if exists fk_product_category_id;
drop index if exists ix_product_category_id;

drop table if exists category;

drop table if exists customer;

drop table if exists product;

drop table if exists user;

