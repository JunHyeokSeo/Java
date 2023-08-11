# show databases ;
# use jsptest;
#
# create table customer(
#     no int(4) auto_increment primary key,
#     name varchar(20),
#     email varchar(20),
#     tel varchar(20),
#     address varchar(50),
#     reg_date timestamp );

# show tables ;
# select * from customer;

# INSERT into customer (name, email, tel, address, reg_date) values ('jisu', 'vivi6865@naver.com', '010-2410-0239', 'seoul', sysdate())

# DROP table board cascade ;

# create table board(
#     no int auto_increment primary key,
#     writer varchar(20) not null,
#     passwd varchar(20) not null,
#     subject varchar(100) not null,
#     content varchar(1000) not null,
#     reg_date timestamp );

# desc board;

# select count(*) from board;
# select * from board order by no desc limit 0, 5;
# use jsptest;

# select * from board order by no desc limit 2, 3;

# insert into board(WRITER, PASSWD, SUBJECT, CONTENT, REG_DATE) values ('jun', 'pass', 'Math', '1+1=2', sysdate());