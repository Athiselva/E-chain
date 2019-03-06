create table chainsys(employee_id number(20) primary key,employee_name varchar2(40),position varchar2(30),username varchar2(30) unique,
password varchar2(30),phone_number varchar2(30) unique,email varchar2(30) unique,date_of_birth date);

create sequence chainsys_emp_id_seq43 start with 2000 increment by 1;

insert into chainsys (employee_id,employee_name,position,username,password,phone_number,email,date_of_birth)
values(chainsys_emp_id_seq43.nextval,'Athiselvam','Software Developer','athitek','pass123',
'9042401691','athitek@rediffmail.com','11-05-1997');

create table timesheet(
EMPLOYEE_ID number(30),ONDATE date,TASK varchar(50),TIMESHEET_NUMBER number(20),TASKSTATUS VARCHAR(50),TIMESHEETSTATUS VARCHAR(30),
CONSTRAINT fk_TS_empid FOREIGN KEY(employee_id) REFERENCES chainsys(employee_id)
);

create sequence timesheet_timesheet_number_sq start with 100 increment by 1;


select * from timesheet;




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
(2000,'01-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'--','--');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'02-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'--','--');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'03-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'--','--');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'04-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'--','--');
insert into timesheet(employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus) values
(2000,'05-03-19','Project RL module 5',timesheet_timesheet_number_sq.nextval,'--','--');










SELECT * FROM TIMESHEET;

create table attendance(
ondate date,Employee_id number(30),Employee_Name varchar(30),Present_hours number,Status varchar(30),Reason varchar(30),Approval varchar(30),
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
values('18-02-19',2000,'Athiselvam','Leave',8,'Sick','Approved');
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




