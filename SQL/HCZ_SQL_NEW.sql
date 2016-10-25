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


create table HCZuserprofile (
userid number generated by default on null as identity primary key,
username varchar(20),
email varchar(20),
skills varchar (100),
usersummary varchar(200),
objective varchar(200),
education varchar(50),
experience varchar(100),
firstreference varchar(50),
secondreference varchar(50));
