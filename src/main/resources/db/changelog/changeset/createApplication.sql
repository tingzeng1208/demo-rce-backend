
create schema if not exists rce;
create table rce.application (
    id varchar(255) primary key,
    applicantName varchar(255) not null,
    applicationStatus boolean default true

);