# Users schema

# --- !Ups

CREATE TABLE "users" (
    id bigserial primary key,
    name varchar(255) not null
);

# --- !Downs

DROP TABLE "users";
