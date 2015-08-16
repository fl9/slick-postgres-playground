# Users schema

# --- !Ups

CREATE TABLE "users" (
  id bigserial primary key,
  email varchar(255) not null,
  password varchar(255) not null,
  salt varchar(255) not null
);

# --- !Downs

DROP TABLE "users";
