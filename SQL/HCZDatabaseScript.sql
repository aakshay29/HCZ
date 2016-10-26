DROP TABLE HCZAPPLICATIONSTATUS;
DROP TABLE HCZINTERVIEWANSWERS;
DROP TABLE HCZINTERVIEWQUESTIONS;
DROP TABLE HCZUSER;
DROP TABLE HCZUSERPROFILE;
DROP TABLE HCZAPPLICATION;
DROP TABLE HCZJOBS;

--------------------------------------------------------
--  File created - Wednesday-October-26-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table HCZAPPLICATION
--------------------------------------------------------

  CREATE TABLE "ORA1"."HCZAPPLICATION" 
   (	"APPLICATIONID" NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE , 
	"APPLICANTNAME" VARCHAR2(20 BYTE), 
	"ADDRESS" VARCHAR2(20 BYTE), 
	"BIRTHDAY" DATE, 
	"EDUCATION" VARCHAR2(25 BYTE), 
	"JOBHISTORY" VARCHAR2(200 BYTE), 
	"EMPREFERENCES" VARCHAR2(200 BYTE), 
	"DRUGUSER" NUMBER, 
	"VETERAN" NUMBER, 
	"CITIZEN" NUMBER, 
	"SKILLS" VARCHAR2(50 BYTE), 
	"JOBID" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table HCZAPPLICATIONSTATUS
--------------------------------------------------------

  CREATE TABLE "ORA1"."HCZAPPLICATIONSTATUS" 
   (	"STATUSID" NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE , 
	"APPLICATIONID" NUMBER, 
	"STATUS" VARCHAR2(50 BYTE), 
	"NATIONALITY" NUMBER, 
	"WORKHISTORY" NUMBER, 
	"EDUCATIONDEGREE" NUMBER, 
	"STANDARDPANELTEST" NUMBER, 
	"DOTTEST" NUMBER, 
	"ALCOHOLTEST" NUMBER, 
	"VETERAN" NUMBER, 
	"HRINTERVIEW" NUMBER, 
	"MANAGERINTERVIEW" NUMBER, 
	"GROUPINTERVIEW" NUMBER, 
	"CODINGTEST" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table HCZINTERVIEWANSWERS
--------------------------------------------------------

  CREATE TABLE "ORA1"."HCZINTERVIEWANSWERS" 
   (	"INTERVIEWANSWERID" NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE , 
	"ANSWER" VARCHAR2(250 BYTE), 
	"INTERVIEWTYPE" NUMBER, 
	"INTERVIEWQUESTIONID" NUMBER, 
	"APPLICATIONID" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table HCZINTERVIEWQUESTIONS
--------------------------------------------------------

  CREATE TABLE "ORA1"."HCZINTERVIEWQUESTIONS" 
   (	"INTERVIEWQUESTIONID" NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE , 
	"QUESTION" VARCHAR2(150 BYTE), 
	"INTERVIEWTYPE" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table HCZJOBS
--------------------------------------------------------

  CREATE TABLE "ORA1"."HCZJOBS" 
   (	"JOBID" NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE , 
	"JOBNAME" VARCHAR2(20 BYTE), 
	"JOBDESCRIPTION" VARCHAR2(50 BYTE), 
	"JOBQUALIFICATIONS" VARCHAR2(50 BYTE), 
	"JOBSTATUS" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table HCZUSER
--------------------------------------------------------

  CREATE TABLE "ORA1"."HCZUSER" 
   (	"USERID" NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE , 
	"USERROLE" NUMBER, 
	"USERNAME" VARCHAR2(15 BYTE), 
	"USERPASSWORD" VARCHAR2(15 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table HCZUSERPROFILE
--------------------------------------------------------

  CREATE TABLE "ORA1"."HCZUSERPROFILE" 
   (	"USERID" NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE , 
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
	"PASSWORD" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into ORA1.HCZAPPLICATION
SET DEFINE OFF;
REM INSERTING into ORA1.HCZAPPLICATIONSTATUS
SET DEFINE OFF;
REM INSERTING into ORA1.HCZINTERVIEWANSWERS
SET DEFINE OFF;
REM INSERTING into ORA1.HCZINTERVIEWQUESTIONS
SET DEFINE OFF;
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (1,'Can you tell me something about yourself?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (2,'How did you hear about this position?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (3,'What do you know about this company?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (4,'Why do you want thiis job?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (5,'Why should we hire you?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (6,'What are your greatest professional strengths?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (7,'What are your weaknesses?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (8,'What is you greatest professioanl acheievment?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (9,'Where do you see yourself in 5 years?',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (10,'Score 1-10',1);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (11,'Any other offers?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (12,'Why are you leaving your current job?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (13,'Why were you fired?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (14,'What are you looking for in a new position?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (15,'What type of work environment do you prefer?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (16,'Whats your management style?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (17,'Whats a time you exercised leadership?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (18,'Whats a time you disagreed with a decision that was made at work?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (19,'How would your boss and co-workers describe you?',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (20,'Score 1-10',2);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (21,'What is your dream job?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (22,'Why was there a gap in your employment?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (23,'Can you explain why you changed career paths?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (24,'How do you deal with pressure or stressful situations?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (25,'What would your first 30, 60, or 90 days look like in this role?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (26,'What are your salary requirements?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (27,'What do you like to do outside of work?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (28,'If you were an animal, which one would you want to be?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (29,'How many tennis balls can you fit into a limousine?',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (30,'Score 1-10',3);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (31,'What development tools have you used?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (32,'What languages have you programmed in?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (33,'What source control tools have you used?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (34,'What are your technical certifications?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (35,'What do you do to maintain your technical certifications?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (36,'How did your education help prepare you for this job?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (37,'How would you rate your key competencies for this job?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (38,'What are your IT strengths and weaknesses?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (39,'Tell me about the most recent project you worked on. What were your responsibilities?',4);
Insert into ORA1.HCZINTERVIEWQUESTIONS (INTERVIEWQUESTIONID,QUESTION,INTERVIEWTYPE) values (40,'Score 1-10',4);
REM INSERTING into ORA1.HCZJOBS
SET DEFINE OFF;
Insert into ORA1.HCZJOBS (JOBID,JOBNAME,JOBDESCRIPTION,JOBQUALIFICATIONS,JOBSTATUS) values (1,'Developer','Full Stack','QF',1);
REM INSERTING into ORA1.HCZUSER
SET DEFINE OFF;
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (21,1,'first','first');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (22,2,'second','second');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (23,3,'third','third');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (24,4,'fourth','fourth');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (25,5,'fifth','fifth');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (26,6,'sixth','sixth');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (1,1,'1','1');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (2,2,'2','2');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (3,3,'3','3');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (4,4,'4','4');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (5,5,'5','5');
Insert into ORA1.HCZUSER (USERID,USERROLE,USERNAME,USERPASSWORD) values (6,6,'6','6');
REM INSERTING into ORA1.HCZUSERPROFILE
SET DEFINE OFF;
Insert into ORA1.HCZUSERPROFILE (USERID,USERNAME,EMAIL,SKILLS,USERSUMMARY,OBJECTIVE,EDUCATION,EXPERIENCE,FIRSTREFERENCE,SECONDREFERENCE,ADDRESS,PASSWORD) values (360,'Aakshay','asd@asd.com','SQL','asdf','Nothong','MBA','asdf','wer',null,'123 Apple Street',null);
Insert into ORA1.HCZUSERPROFILE (USERID,USERNAME,EMAIL,SKILLS,USERSUMMARY,OBJECTIVE,EDUCATION,EXPERIENCE,FIRSTREFERENCE,SECONDREFERENCE,ADDRESS,PASSWORD) values (365,'Aakshay','ak@gmail.com','JAVA','Developer','Developer','Master','Developer','gh@mail.com',null,'redwall',null);
--------------------------------------------------------
--  DDL for Index SYS_C0011147
--------------------------------------------------------

  CREATE UNIQUE INDEX "ORA1"."SYS_C0011147" ON "ORA1"."HCZAPPLICATION" ("APPLICATIONID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0011151
--------------------------------------------------------

  CREATE UNIQUE INDEX "ORA1"."SYS_C0011151" ON "ORA1"."HCZAPPLICATIONSTATUS" ("STATUSID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0011231
--------------------------------------------------------

  CREATE UNIQUE INDEX "ORA1"."SYS_C0011231" ON "ORA1"."HCZINTERVIEWANSWERS" ("INTERVIEWANSWERID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0011229
--------------------------------------------------------

  CREATE UNIQUE INDEX "ORA1"."SYS_C0011229" ON "ORA1"."HCZINTERVIEWQUESTIONS" ("INTERVIEWQUESTIONID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0011154
--------------------------------------------------------

  CREATE UNIQUE INDEX "ORA1"."SYS_C0011154" ON "ORA1"."HCZJOBS" ("JOBID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0011149
--------------------------------------------------------

  CREATE UNIQUE INDEX "ORA1"."SYS_C0011149" ON "ORA1"."HCZUSER" ("USERID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0011227
--------------------------------------------------------

  CREATE UNIQUE INDEX "ORA1"."SYS_C0011227" ON "ORA1"."HCZUSERPROFILE" ("USERID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table HCZAPPLICATION
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZAPPLICATION" ADD PRIMARY KEY ("APPLICATIONID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ORA1"."HCZAPPLICATION" MODIFY ("APPLICATIONID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table HCZAPPLICATIONSTATUS
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZAPPLICATIONSTATUS" ADD PRIMARY KEY ("STATUSID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ORA1"."HCZAPPLICATIONSTATUS" MODIFY ("STATUSID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table HCZINTERVIEWANSWERS
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZINTERVIEWANSWERS" ADD PRIMARY KEY ("INTERVIEWANSWERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ORA1"."HCZINTERVIEWANSWERS" MODIFY ("INTERVIEWANSWERID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table HCZINTERVIEWQUESTIONS
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZINTERVIEWQUESTIONS" ADD PRIMARY KEY ("INTERVIEWQUESTIONID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ORA1"."HCZINTERVIEWQUESTIONS" MODIFY ("INTERVIEWQUESTIONID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table HCZJOBS
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZJOBS" ADD PRIMARY KEY ("JOBID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ORA1"."HCZJOBS" MODIFY ("JOBID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table HCZUSER
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZUSER" ADD PRIMARY KEY ("USERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ORA1"."HCZUSER" MODIFY ("USERID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table HCZUSERPROFILE
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZUSERPROFILE" ADD PRIMARY KEY ("USERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ORA1"."HCZUSERPROFILE" MODIFY ("USERID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table HCZAPPLICATION
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZAPPLICATION" ADD FOREIGN KEY ("JOBID")
	  REFERENCES "ORA1"."HCZJOBS" ("JOBID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table HCZAPPLICATIONSTATUS
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZAPPLICATIONSTATUS" ADD FOREIGN KEY ("APPLICATIONID")
	  REFERENCES "ORA1"."HCZAPPLICATION" ("APPLICATIONID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table HCZINTERVIEWANSWERS
--------------------------------------------------------

  ALTER TABLE "ORA1"."HCZINTERVIEWANSWERS" ADD FOREIGN KEY ("APPLICATIONID")
	  REFERENCES "ORA1"."HCZAPPLICATION" ("APPLICATIONID") ENABLE;
  ALTER TABLE "ORA1"."HCZINTERVIEWANSWERS" ADD FOREIGN KEY ("INTERVIEWQUESTIONID")
	  REFERENCES "ORA1"."HCZINTERVIEWQUESTIONS" ("INTERVIEWQUESTIONID") ENABLE;
