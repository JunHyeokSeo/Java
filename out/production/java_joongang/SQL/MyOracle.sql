-- 테이블 목록
-- select * from tab;

-- 시퀀스 목록
-- select * from seq;
-- select * from BOARD;

-- 예4. member 테이블 생성
-- create table member(name varchar2(20),
--                     gender varchar2(10),
--                     jumin1 varchar2(6),
--                     jumin2 varchar2(7),
--                     address varchar2(100),
--                     buseo  varchar2(20),
--                     sports varchar2(20),
--                     music varchar2(20),
--                     movie varchar2(20),
--                     computer varchar2(20),
--                     intro varchar2(1000)
-- );

-- 예5. mem02 테이블 생성
-- create  table  mem02(id  varchar2(20)  primary key,
--                      passwd  varchar2(20),
--                      name  varchar2(20),
--                      reg_date  date);

-- 게시판 테이블
-- create table board(
--                       no number primary key,
--                       writer varchar2(20) not null,
--                       passwd varchar2(20) not null,
--                       subject varchar2(100) not null,
--                       content varchar2(1000) not null,
--                       reg_date timestamp );
-- 게시판 시퀀스
-- create sequence board_seq
--     start with 1
--     increment by 1;

-- 테이블 시간 출력
-- select sysdate from CUSTOMER;

-- 레코드 검색
-- select * from CUSTOMER order by NO asc ;

-- count 함수
-- select count(*) as CNT from CUSTOMER;

-- 임시 테이블 삭제
-- purge recyclebin;

-- 예1.
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- create table customer( no number(4)  primary key,
--                        name varchar2(20),
--                        email varchar2(20),
--                        tel varchar2(20)  );

--컬럼 추가
-- alter table CUSTOMER add (address varchar2(50));
-- alter table CUSTOMER add (reg_date timestamp);

-- 시퀀스 생성 (시퀀스는 보통 컬럼에 적용, "테이블명_컬럼명_seq" 형식 사용)
-- create sequence customer_no_seq
--     start with 1
--     increment by 1;

-- 시퀀스 삭제
-- drop sequence CUSTORMER_NO_SEQ;