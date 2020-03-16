create table customers (
    id int(11) NOT NULL AUTO_INCREMENT primary key,
	email varchar_ignorecase(50) not null,
	password varchar_ignorecase(50) not null,
	enabled boolean not null
);

create table roles (
    id int(11) NOT NULL AUTO_INCREMENT primary key,
	email varchar_ignorecase(50) not null,
	role varchar_ignorecase(50) not null,
	constraint fk_customers_roles foreign key(email) references customers(email)
);
create unique index ix_roles on roles (email, role);