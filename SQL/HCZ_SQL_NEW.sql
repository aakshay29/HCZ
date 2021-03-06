drop table HCZApplication;
drop table HCZJobs;
drop table HCZApplicationstatus;
drop table HCZInterviewQuestions;
drop table HCZInterviewAnswers;

create table HczApplication (
ApplicationID number generated by default on null as identity primary key,
ApplicantName varchar(20),
Address varchar(20),
Birthday date,
Education varchar(25),
Jobhistory varchar(200),
EmpReferences varchar(200),
Druguser number,
veteran number,
citizen number,
Empresume varchar(50));

create table HCZUser (
userid number generated by default on null as identity primary key,
userRole number,
username varchar(15),
userpassword varchar(15));

create table HCZInterviewQuestions (
InterviewQuestionID number generated by default on null as identity primary key,
question varchar(150),
interviewType number
);

create table HCZInterviewAnswers (
InterviewAnswerID number generated by default on null as identity primary key,
answer varchar(250),
interviewType number,
InterviewQuestionID number,
ApplicationID number
);

Create table HCZApplicationStatus (
StatusID number generated by default on null as identity primary key,
ApplicationID number,
Status varchar(50),
Nationality number,
WorkHistory number,
EducationDegree number,
StandardPanelTest number,
DOTtest number,
AlcoholTest number,
Veteran number,
HRinterview number,
Managerinterview number,
Groupinterview number,
CodingTest number);

create table HCZjobs (
JobID number generated by default on null as identity primary key,
Jobname varchar(20),
JobDescription varchar(50),
JobQualifications varchar(50),
Jobstatus number);

alter table HCZApplication add JobID number;
alter table HCZApplicationStatus add foreign key (ApplicationID) references HczApplication(ApplicationID);
alter table HCZInterviewAnswers add foreign key (ApplicationID) references HczApplication(ApplicationID);
alter table HCZInterviewAnswers add foreign key (InterviewQuestionID) references HCZInterviewQuestions(InterviewQuestionID);
alter table HCZApplication add foreign key (JobID) references HCZJobs(JobID);

New edits:
 CREATE TABLE "ORA1"."HCZUSERPROFILE" 
   (	"USERID" NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOT NULL ENABLE, 
	"USERNAME" VARCHAR2(20 BYTE), 
	"EMAIL" VARCHAR2(20 BYTE), 
	"SKILLS" VARCHAR2(100 BYTE), 
	"USERSUMMARY" VARCHAR2(200 BYTE), 
	"OBJECTIVE" VARCHAR2(200 BYTE), 
	"EDUCATION" VARCHAR2(50 BYTE), 
	"EXPERIENCE" VARCHAR2(100 BYTE), 
	"FIRSTREFERENCE" VARCHAR2(50 BYTE), 
	"SECONDREFERENCE" VARCHAR2(50 BYTE), 
	"ADDRESS" VARCHAR2(50 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE), 
	 PRIMARY KEY ("USERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) 
   

