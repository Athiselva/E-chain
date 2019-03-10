
create table chainsys(employee_id number(10) primary key,employee_name varchar2(30) not null,position varchar2(30) not null,username varchar2(25) unique not null,
password varchar2(30) not null,phone_number varchar2(20) unique not null,email varchar2(30) unique not null,date_of_birth  date not null);

create sequence chainsys_emp_id_seq43 start with 2000 increment by 1;

insert into chainsys (employee_id,employee_name,position,username,password,phone_number,email,date_of_birth)
values(chainsys_emp_id_seq43.nextval,'Athiselvam','Software Developer','Athitek2','Pass123',
'9042401691','athitek@rediffmail.com','11-05-1997');

create table timesheet(
EMPLOYEE_ID number(30),ONDATE date not null,TASK varchar(50) not null,TIMESHEET_NUMBER number(20),TASKSTATUS VARCHAR(50),TIMESHEETSTATUS VARCHAR(30),
CONSTRAINT fk_TS_empid FOREIGN KEY(employee_id) REFERENCES chainsys(employee_id)
);

create sequence timesheet_timesheet_number_sq start with 100 increment by 1;


insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'01-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'04-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'05-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'06-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'07-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'08-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'11-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'12-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'13-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'14-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'15-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'18-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'19-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'20-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'21-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'22-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'23-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'24-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'25-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'26-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'27-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'28-02-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'01-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'02-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'03-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'04-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'05-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'06-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'07-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'08-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'08-03-19','Project RL module 6',timesheet_timesheet_number_sq.nextval,'Completed','Approved');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'09-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'--','--');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'09-03-19','Project RL module 6',timesheet_timesheet_number_sq.nextval,'--','--');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'09-03-19','Project RL module 7',timesheet_timesheet_number_sq.nextval,'--','--');


create table attendance(
ONDATE date not null,Employee_id number(30),Employee_Name varchar(30) not null,Present_hours number,Status varchar(30)not null,Reason varchar(30),Approval varchar(30),
CONSTRAINT fk_atd_empi FOREIGN KEY(employee_id) REFERENCES chainsys(employee_id));


insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('01-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('02-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('04-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('05-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('06-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('07-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('08-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('09-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('11-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('12-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('13-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('14-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('15-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('16-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('18-02-19',2000,'Athiselvam','Leave',0,'Sick','Approved');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('19-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('20-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('21-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('22-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('23-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('26-02-19',2000,'Athiselvam','Leave',0,'Sick','Approved');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('25-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('26-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('27-02-19',2000,'Athiselvam','Present',8,'--','--');
insert into attendance (ondate,employee_id,employee_name,status,present_hours,reason,approval)
values('28-02-19',2000,'Athiselvam','Present',8,'--','--');


COMMIT;

create table admin(ADMIN_ID number(10) primary key,ADMIN_NAME VARCHAR(30) NOT NULL,
EMAIL VARCHAR(30) UNIQUE NOT NULL,USERNAME VARCHAR(20) UNIQUE NOT NULL,PASSWORD VARCHAR(20) NOT NULL); 

SELECT * FROM ADMIN;

create sequence admin_employee_id_seq43 start with 5000 increment by 1;

INSERT INTO ADMIN VALUES(admin_employee_id_seq43.nextval,'Mechster','Mechster@gmail.com','Mechster5','Pass12345');

select * from chainsys;

select employee_id,employee_name,position,username,password,phone_number,email,date_of_birth from chainsys;

select * from timesheet;
insert into timesheet (employee_id,ondate,task,timesheet_number)
values(2001,'10-03-19','Project AS Module W',timesheet_timesheet_number_sq.nextval);

select employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus from timesheet;

select * from chainsys;

update chainsys set username='Mechster2',password='Mechster2',
employee_name='Mechsterss',position='Tester',email='mech@gmail.com',date_of_birth='01-01-97',
phone_number='9420401691' where employee_id=2001; 

commit;
