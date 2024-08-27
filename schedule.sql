CREATE TABLE  UserName
(
    id bigint primary key comment '아이디',
    username varchar(100) not null comment '이름',
    user_password varchar(100) not null comment '비밀번호',
    foreign key(user_password) references UserName(user_password)
);
