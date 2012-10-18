drop table if exists users;
drop table if exists group_authorities;
drop table if exists group_members;
drop table if exists authorities;
drop table if exists groups;

drop table if exists hotel;
drop table if exists booking_amenities;
drop table if exists booking;
create table users(
    username varchar(50) not null primary key,
    password varchar(100) not null,
    enabled boolean not null,
    name varchar(50)
);

create table authorities(
    authority varchar(50) not null,
    username varchar(50) not null,
    constraint fk_authorities_users foreign key (username) references users(username)
);
create unique index index_authorities_username on authorities (username,authority);

create table groups(
    id int(11) primary key auto_increment,
    group_name varchar(50) not null
);
create table group_authorities(
    group_id int(11) not null,
    authority varchar(50) not null,

    constraint fk_group_authorities_group foreign key(group_id) references groups(id)
);

create table group_members(
    id int(11) primary key auto_increment,
    username varchar(50) not null,
    group_id int(11) not null,

    constraint fk_group_members_group foreign key(group_id) references groups(id)
);

create table hotel(
    id bigint(20) not null primary key auto_increment,
    price decimal(6,2),
    name varchar(30) not null,
    address varchar(50) not null,
    city varchar(20) not null,
    state varchar(20),
    zip varchar(10) not null,
    country varchar(20)
);

create table booking(
    id bigint(20) not null primary key auto_increment,
    checkinDate date not null,
    checkoutDate date,
    creditCard varchar(16) not null,
    creditCardName varchar(50) not null,
    creditCardExpiryMonth smallint(2) not null,
    creditCardExpiryYear smallint(4) not null,
    smoking boolean not null,
    beds int(10),
    username varchar(50),
    hotel_id bigint(20),

    constraint fk_booking_users_username foreign key (username) references users(username),
    constraint fk_booking_hotel_id foreign key (hotel_id) references hotel(id)
);

create table booking_amenities(
    booking_id bigint(20) not null,
    amenity varchar(20),
    constraint fk_booking_amenities_booking_id foreign key (booking_id) references booking(id)
);
