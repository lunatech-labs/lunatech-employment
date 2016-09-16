# --- !Ups

CREATE TABLE candidate(
id                      BIGINT NOT NULL PRIMARY KEY,
initialContactDate      VARCHAR NOT NULL ,
firstName               VARCHAR NOT NULL ,
lastName                VARCHAR NOT NULL,
recruiter               VARCHAR NOT NULL,
cv                      VARCHAR NOT NULL,
level                   VARCHAR NOT NULL,
skillSet                VARCHAR NOT NULL,
language                VARCHAR NOT NULL,
nationality             VARCHAR NOT NULL,
first                   VARCHAR NOT NULL,
second                  VARCHAR NOT NULL,
third                   VARCHAR NOT NULL,
startdate               VARCHAR NOT NULL ,
notes                   VARCHAR NOT NULL,
location                VARCHAR NOT NULL
);


# --- !Downs

DROP TABLE candidate;
