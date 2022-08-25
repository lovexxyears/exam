/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.26 : Database - db_exam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_exam` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `db_exam`;

/*Table structure for table `r_exam_answer` */

DROP TABLE IF EXISTS `r_exam_answer`;

CREATE TABLE `r_exam_answer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL,
  `sid` int DEFAULT NULL,
  `reuid` int DEFAULT NULL COMMENT '考卷中考题id r_exam_user',
  `type` int DEFAULT NULL COMMENT '1选择 2判断 3主观，4简答',
  `answer` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_exam_answer` */

insert  into `r_exam_answer`(`id`,`eid`,`sid`,`reuid`,`type`,`answer`) values 
(5,19,73,4,4,'fEFEAFAEFESAFFWE'),
(6,19,73,5,2,'1'),
(7,19,73,7,3,'发色发涩费'),
(8,19,73,9,1,'2'),
(9,14,73,1,3,'gregrwegr发而发'),
(10,14,73,2,4,''),
(11,14,73,4,4,'刚打分高大上'),
(12,14,73,5,3,'肺癌法尔发二手房'),
(13,14,73,7,3,'发方法是肺癌高发人数反倒是公司担任广东省广东省公司的认购的闪光点水果蛋糕的人生观的认识个人是大股东人生果实帝国时代个人所得'),
(14,14,73,8,3,'格式的如果输入的个人所得广东人是公认的三个输入的过'),
(15,14,73,11,1,'3'),
(16,14,73,1,3,'个第三个当然是广东省鬼地方个非常小办公室身体发发发发发发付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付咔咔咔咔咔咔扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩牛牛牛牛牛女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女女付付付付付付付付付'),
(17,14,73,2,4,''),
(18,14,73,4,1,'4'),
(19,14,73,5,1,'2'),
(20,14,73,7,3,'个人感人的故事的故事的干扰'),
(21,14,73,8,3,'广东人时光如梭帝国时代如果输入的过生日蛋糕'),
(22,19,73,4,4,''),
(23,19,73,7,3,''),
(24,19,73,4,4,''),
(25,19,73,7,3,''),
(26,19,73,4,4,''),
(27,19,73,7,3,''),
(28,19,73,4,4,''),
(29,19,73,7,3,''),
(30,19,73,4,4,''),
(31,19,73,7,3,'');

/*Table structure for table `r_exam_user` */

DROP TABLE IF EXISTS `r_exam_user`;

CREATE TABLE `r_exam_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL COMMENT '考试id  那次',
  `qid` int DEFAULT NULL COMMENT '题目id',
  `type` int DEFAULT NULL COMMENT '考题类型 1 单选 2 判断 3主观 4 代码',
  `score` int DEFAULT NULL COMMENT '考题分值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1532 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_exam_user` */

insert  into `r_exam_user`(`id`,`eid`,`qid`,`type`,`score`) values 
(1426,14,11,1,4),
(1427,14,9,1,4),
(1428,14,8,1,4),
(1429,14,12,1,4),
(1430,14,10,1,4),
(1431,14,13,1,4),
(1432,14,5,1,4),
(1433,14,6,1,4),
(1434,14,7,1,4),
(1435,14,4,1,4),
(1436,14,9,2,2),
(1437,14,5,2,2),
(1438,14,12,2,2),
(1439,14,8,2,2),
(1440,14,7,2,2),
(1441,14,6,2,2),
(1442,14,1,2,2),
(1443,14,11,2,2),
(1444,14,4,2,2),
(1445,14,10,2,2),
(1446,14,2,3,4),
(1447,14,1,3,4),
(1448,14,7,3,4),
(1449,14,8,3,4),
(1450,14,5,3,4),
(1451,14,2,4,10),
(1452,14,4,4,10),
(1453,15,4,1,4),
(1454,15,13,1,4),
(1455,15,1,1,4),
(1456,15,8,1,4),
(1457,15,12,1,4),
(1458,15,9,1,4),
(1459,15,11,1,4),
(1460,15,5,1,4),
(1461,15,7,1,4),
(1462,15,6,1,4),
(1463,15,7,2,2),
(1464,15,12,2,2),
(1465,15,11,2,2),
(1466,15,9,2,2),
(1467,15,8,2,2),
(1468,15,6,2,2),
(1469,15,5,2,2),
(1470,15,10,2,2),
(1471,15,4,2,2),
(1472,15,1,2,2),
(1473,15,1,3,4),
(1474,15,6,3,4),
(1475,15,2,3,4),
(1476,15,5,3,4),
(1477,15,8,3,4),
(1478,15,1,4,10),
(1479,15,3,4,10),
(1480,16,4,1,4),
(1481,16,13,1,4),
(1482,16,8,1,4),
(1483,16,5,1,4),
(1484,16,11,1,4),
(1485,16,1,1,4),
(1486,16,2,1,4),
(1487,16,10,1,4),
(1488,16,7,1,4),
(1489,16,6,1,4),
(1490,16,9,2,4),
(1491,16,4,2,4),
(1492,16,1,2,4),
(1493,16,6,2,4),
(1494,16,10,2,4),
(1495,16,7,3,4),
(1496,16,2,3,4),
(1497,16,1,3,4),
(1498,16,6,3,4),
(1499,16,8,3,4),
(1500,16,4,4,10),
(1501,16,2,4,10),
(1502,17,7,1,4),
(1503,17,4,1,4),
(1504,17,6,1,4),
(1505,17,8,1,4),
(1506,17,1,1,4),
(1507,17,5,1,4),
(1508,17,9,1,4),
(1509,17,12,1,4),
(1510,17,10,1,4),
(1511,17,2,1,4),
(1512,17,11,2,4),
(1513,17,6,2,4),
(1514,17,4,2,4),
(1515,17,5,2,4),
(1516,17,7,2,4),
(1517,17,5,3,4),
(1518,17,6,3,4),
(1519,17,2,3,4),
(1520,17,8,3,4),
(1521,17,1,3,4),
(1522,17,5,4,10),
(1523,17,4,4,10),
(1528,19,9,1,12),
(1529,19,5,2,10),
(1530,19,7,3,10),
(1531,19,4,4,10);

/*Table structure for table `r_exam_user_choose` */

DROP TABLE IF EXISTS `r_exam_user_choose`;

CREATE TABLE `r_exam_user_choose` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL COMMENT '考试id',
  `cid` int DEFAULT NULL COMMENT '单选题id',
  `uid` int DEFAULT NULL COMMENT '学生id',
  `chooseScore` int DEFAULT NULL COMMENT '分值',
  `result` int DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_exam_user_choose` */

insert  into `r_exam_user_choose`(`id`,`eid`,`cid`,`uid`,`chooseScore`,`result`) values 
(1,1,1,36,2,NULL),
(2,1,1,37,2,NULL),
(3,1,1,38,2,NULL),
(4,1,1,39,2,NULL),
(5,1,1,40,2,NULL),
(6,1,1,41,2,NULL),
(7,1,1,42,2,NULL),
(8,1,1,43,2,NULL),
(9,1,1,44,2,NULL),
(10,1,1,45,2,NULL),
(11,1,1,46,2,NULL),
(12,1,1,47,2,NULL),
(13,1,1,48,2,NULL),
(14,1,1,49,2,NULL),
(15,1,1,50,2,NULL),
(16,1,1,51,2,NULL),
(17,1,1,52,2,NULL),
(18,1,1,53,2,NULL),
(19,1,1,54,2,NULL),
(20,1,1,55,2,NULL),
(21,1,1,56,2,NULL),
(22,1,1,60,2,NULL),
(23,1,1,61,2,NULL),
(24,1,1,62,2,NULL),
(25,1,1,66,2,NULL),
(26,1,1,67,2,NULL),
(27,1,1,70,2,NULL),
(28,1,1,72,2,NULL),
(29,1,1,73,2,NULL),
(30,1,1,99,2,NULL),
(31,1,1,100,2,NULL),
(32,1,1,102,2,NULL),
(33,1,1,103,2,NULL),
(34,2,1,36,12,NULL),
(35,2,1,37,12,NULL),
(36,2,1,38,12,NULL),
(37,2,1,39,12,NULL),
(38,2,1,40,12,NULL),
(39,2,1,41,12,NULL),
(40,2,1,42,12,NULL),
(41,2,1,43,12,NULL),
(42,2,1,44,12,NULL),
(43,2,1,45,12,NULL),
(44,2,1,46,12,NULL),
(45,2,1,47,12,NULL),
(46,2,1,48,12,NULL),
(47,2,1,49,12,NULL),
(48,2,1,50,12,NULL),
(49,2,1,51,12,NULL),
(50,2,1,52,12,NULL),
(51,2,1,53,12,NULL),
(52,2,1,54,12,NULL),
(53,2,1,55,12,NULL),
(54,2,1,56,12,NULL),
(55,2,1,60,12,NULL),
(56,2,1,61,12,NULL),
(57,2,1,62,12,NULL),
(58,2,1,66,12,NULL),
(59,2,1,67,12,NULL),
(60,2,1,70,12,NULL),
(61,2,1,72,12,NULL),
(62,2,1,73,12,NULL),
(63,2,1,99,12,NULL),
(64,2,1,100,12,NULL),
(65,2,1,102,12,NULL),
(66,2,1,103,12,NULL),
(67,3,1,36,2,NULL),
(68,3,1,37,2,NULL),
(69,3,1,38,2,NULL),
(70,3,1,39,2,NULL),
(71,3,1,40,2,NULL),
(72,3,1,41,2,NULL),
(73,3,1,42,2,NULL),
(74,3,1,43,2,NULL),
(75,3,1,44,2,NULL),
(76,3,1,45,2,NULL),
(77,3,1,46,2,NULL),
(78,3,1,47,2,NULL),
(79,3,1,48,2,NULL),
(80,3,1,49,2,NULL),
(81,3,1,50,2,NULL),
(82,3,1,51,2,NULL),
(83,3,1,52,2,NULL),
(84,3,1,53,2,NULL),
(85,3,1,54,2,NULL),
(86,3,1,55,2,NULL),
(87,3,1,56,2,NULL),
(88,3,1,60,2,NULL),
(89,3,1,61,2,NULL),
(90,3,1,62,2,NULL),
(91,3,1,66,2,NULL),
(92,3,1,67,2,NULL),
(93,3,1,70,2,NULL),
(94,3,1,72,2,NULL),
(95,3,1,73,2,NULL),
(96,3,1,99,2,NULL),
(97,3,1,100,2,NULL),
(98,3,1,102,2,NULL),
(99,3,1,103,2,NULL);

/*Table structure for table `r_exam_user_code` */

DROP TABLE IF EXISTS `r_exam_user_code`;

CREATE TABLE `r_exam_user_code` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL COMMENT '考试id',
  `cid` int DEFAULT NULL COMMENT '单选题id',
  `uid` int DEFAULT NULL COMMENT '学生id',
  `codeScore` int DEFAULT NULL COMMENT '分值',
  `result` int DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_exam_user_code` */

insert  into `r_exam_user_code`(`id`,`eid`,`cid`,`uid`,`codeScore`,`result`) values 
(34,2,2,75,10,NULL),
(36,1,2,75,10,NULL),
(37,1,2,75,10,NULL),
(38,1,2,75,10,NULL),
(39,2,2,75,10,NULL),
(40,3,2,75,10,NULL),
(41,1,2,75,10,NULL),
(42,2,2,75,10,NULL),
(43,2,2,75,10,NULL),
(44,3,2,36,10,NULL),
(45,3,2,37,10,NULL),
(46,3,2,38,10,NULL),
(47,3,2,39,10,NULL),
(48,3,2,40,10,NULL),
(49,3,2,41,10,NULL),
(50,3,2,42,10,NULL),
(51,3,2,43,10,NULL),
(52,3,2,44,10,NULL),
(53,3,2,45,10,NULL),
(54,3,2,46,10,NULL),
(55,3,2,47,10,NULL),
(56,3,2,48,10,NULL),
(57,3,2,49,10,NULL),
(58,3,2,50,10,NULL),
(59,3,2,51,10,NULL),
(60,3,2,52,10,NULL),
(61,3,2,53,10,NULL),
(62,3,2,54,10,NULL),
(63,3,2,55,10,NULL),
(64,3,2,56,10,NULL),
(65,3,2,60,10,NULL),
(66,3,2,61,10,NULL),
(67,3,2,62,10,NULL),
(68,3,2,66,10,NULL),
(69,3,2,67,10,NULL),
(70,3,2,70,10,NULL),
(71,3,2,72,10,NULL),
(72,3,2,73,10,NULL),
(73,3,2,99,10,NULL),
(74,3,2,100,10,NULL),
(75,3,2,102,10,NULL),
(76,3,2,103,10,NULL),
(77,3,2,36,10,NULL),
(78,3,2,37,10,NULL),
(79,3,2,38,10,NULL),
(80,3,2,39,10,NULL),
(81,3,2,40,10,NULL),
(82,3,2,41,10,NULL),
(83,3,2,42,10,NULL),
(84,3,2,43,10,NULL),
(85,3,2,44,10,NULL),
(86,3,2,45,10,NULL),
(87,3,2,46,10,NULL),
(88,3,2,47,10,NULL),
(89,3,2,48,10,NULL),
(90,3,2,49,10,NULL),
(91,3,2,50,10,NULL),
(92,3,2,51,10,NULL),
(93,3,2,52,10,NULL),
(94,3,2,53,10,NULL),
(95,3,2,54,10,NULL),
(96,3,2,55,10,NULL),
(97,3,2,56,10,NULL),
(98,3,2,60,10,NULL),
(99,3,2,61,10,NULL),
(100,3,2,62,10,NULL),
(101,3,2,66,10,NULL),
(102,3,2,67,10,NULL),
(103,3,2,70,10,NULL),
(104,3,2,72,10,NULL),
(105,3,2,73,10,NULL),
(106,3,2,99,10,NULL),
(107,3,2,100,10,NULL),
(108,3,2,102,10,NULL),
(109,3,2,103,10,NULL);

/*Table structure for table `r_exam_user_judge` */

DROP TABLE IF EXISTS `r_exam_user_judge`;

CREATE TABLE `r_exam_user_judge` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL COMMENT '考试id',
  `cid` int DEFAULT NULL COMMENT '单选题id',
  `uid` int DEFAULT NULL COMMENT '学生id',
  `judgeScore` int DEFAULT NULL COMMENT '分值',
  `result` int DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_exam_user_judge` */

insert  into `r_exam_user_judge`(`id`,`eid`,`cid`,`uid`,`judgeScore`,`result`) values 
(34,3,1,36,2,NULL),
(35,3,1,37,2,NULL),
(36,3,1,38,2,NULL),
(37,3,1,39,2,NULL),
(38,3,1,40,2,NULL),
(39,3,1,41,2,NULL),
(40,3,1,42,2,NULL),
(41,3,1,43,2,NULL),
(42,3,1,44,2,NULL),
(43,3,1,45,2,NULL),
(44,3,1,46,2,NULL),
(45,3,1,47,2,NULL),
(46,3,1,48,2,NULL),
(47,3,1,49,2,NULL),
(48,3,1,50,2,NULL),
(49,3,1,51,2,NULL),
(50,3,1,52,2,NULL),
(51,3,1,53,2,NULL),
(52,3,1,54,2,NULL),
(53,3,1,55,2,NULL),
(54,3,1,56,2,NULL),
(55,3,1,60,2,NULL),
(56,3,1,61,2,NULL),
(57,3,1,62,2,NULL),
(58,3,1,66,2,NULL),
(59,3,1,67,2,NULL),
(60,3,1,70,2,NULL),
(61,3,1,72,2,NULL),
(62,3,1,73,2,NULL),
(63,3,1,99,2,NULL),
(64,3,1,100,2,NULL),
(65,3,1,102,2,NULL),
(66,3,1,103,2,NULL);

/*Table structure for table `r_exam_user_subjective` */

DROP TABLE IF EXISTS `r_exam_user_subjective`;

CREATE TABLE `r_exam_user_subjective` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL COMMENT '考试id',
  `cid` int DEFAULT NULL COMMENT '单选题id',
  `uid` int DEFAULT NULL COMMENT '学生id',
  `subjectiveScore` int DEFAULT NULL COMMENT '分值',
  `result` int DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_exam_user_subjective` */

insert  into `r_exam_user_subjective`(`id`,`eid`,`cid`,`uid`,`subjectiveScore`,`result`) values 
(34,3,2,36,5,NULL),
(35,3,2,37,5,NULL),
(36,3,2,38,5,NULL),
(37,3,2,39,5,NULL),
(38,3,2,40,5,NULL),
(39,3,2,41,5,NULL),
(40,3,2,42,5,NULL),
(41,3,2,43,5,NULL),
(42,3,2,44,5,NULL),
(43,3,2,45,5,NULL),
(44,3,2,46,5,NULL),
(45,3,2,47,5,NULL),
(46,3,2,48,5,NULL),
(47,3,2,49,5,NULL),
(48,3,2,50,5,NULL),
(49,3,2,51,5,NULL),
(50,3,2,52,5,NULL),
(51,3,2,53,5,NULL),
(52,3,2,54,5,NULL),
(53,3,2,55,5,NULL),
(54,3,2,56,5,NULL),
(55,3,2,60,5,NULL),
(56,3,2,61,5,NULL),
(57,3,2,62,5,NULL),
(58,3,2,66,5,NULL),
(59,3,2,67,5,NULL),
(60,3,2,70,5,NULL),
(61,3,2,72,5,NULL),
(62,3,2,73,5,NULL),
(63,3,2,99,5,NULL),
(64,3,2,100,5,NULL),
(65,3,2,102,5,NULL),
(66,3,2,103,5,NULL);

/*Table structure for table `r_score_exam_student` */

DROP TABLE IF EXISTS `r_score_exam_student`;

CREATE TABLE `r_score_exam_student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL COMMENT '那次考试',
  `sid` int DEFAULT NULL COMMENT '学生id',
  `score` int DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_score_exam_student` */

insert  into `r_score_exam_student`(`id`,`eid`,`sid`,`score`) values 
(1,19,73,90);

/*Table structure for table `r_student_clazz` */

DROP TABLE IF EXISTS `r_student_clazz`;

CREATE TABLE `r_student_clazz` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int NOT NULL,
  `cid` int NOT NULL,
  PRIMARY KEY (`id`,`uid`,`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_student_clazz` */

insert  into `r_student_clazz`(`id`,`uid`,`cid`) values 
(3,36,6),
(4,37,6),
(5,38,6),
(6,39,6),
(7,40,6),
(8,41,6),
(9,42,6),
(10,43,6),
(11,44,6),
(12,45,6),
(13,46,6),
(14,47,6),
(15,48,6),
(16,49,6),
(17,50,6),
(18,51,6),
(19,52,6),
(20,53,6),
(21,54,6),
(22,55,6),
(23,56,6),
(24,57,7),
(25,58,7),
(26,59,7),
(27,60,6),
(28,61,6),
(29,62,6),
(30,63,7),
(31,64,7),
(32,66,6),
(33,67,6),
(34,68,8),
(35,69,18),
(36,70,6),
(37,71,8),
(38,72,6),
(39,73,6),
(40,74,16),
(41,75,14),
(44,78,17),
(54,85,13),
(55,97,13),
(57,99,6),
(58,100,6),
(59,101,13),
(60,102,6),
(61,103,6),
(62,104,8);

/*Table structure for table `r_teacher_clazz` */

DROP TABLE IF EXISTS `r_teacher_clazz`;

CREATE TABLE `r_teacher_clazz` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int NOT NULL,
  `cid` int NOT NULL,
  PRIMARY KEY (`id`,`uid`,`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;

/*Data for the table `r_teacher_clazz` */

insert  into `r_teacher_clazz`(`id`,`uid`,`cid`) values 
(12,112,6),
(13,113,6),
(14,114,6);

/*Table structure for table `t_exam_paper` */

DROP TABLE IF EXISTS `t_exam_paper`;

CREATE TABLE `t_exam_paper` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `paper_type` int DEFAULT NULL,
  `grade_level` int DEFAULT NULL,
  `score` int DEFAULT NULL,
  `question_count` int DEFAULT NULL,
  `suggest_time` int DEFAULT NULL,
  `limit_start_time` datetime DEFAULT NULL,
  `limit_end_time` datetime DEFAULT NULL,
  `frame_text_content_id` int DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `task_exam_id` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_exam_paper` */

/*Table structure for table `t_exam_paper_answer` */

DROP TABLE IF EXISTS `t_exam_paper_answer`;

CREATE TABLE `t_exam_paper_answer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `exam_paper_id` int DEFAULT NULL,
  `paper_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `paper_type` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `system_score` int DEFAULT NULL,
  `user_score` int DEFAULT NULL,
  `paper_score` int DEFAULT NULL,
  `question_correct` int DEFAULT NULL,
  `question_count` int DEFAULT NULL,
  `do_time` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `task_exam_id` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_exam_paper_answer` */

/*Table structure for table `t_exam_paper_question_customer_answer` */

DROP TABLE IF EXISTS `t_exam_paper_question_customer_answer`;

CREATE TABLE `t_exam_paper_question_customer_answer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `question_id` int DEFAULT NULL,
  `exam_paper_id` int DEFAULT NULL,
  `exam_paper_answer_id` int DEFAULT NULL,
  `question_type` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `customer_score` int DEFAULT NULL,
  `question_score` int DEFAULT NULL,
  `question_text_content_id` int DEFAULT NULL,
  `answer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `text_content_id` int DEFAULT NULL,
  `do_right` bit(1) DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `item_order` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_exam_paper_question_customer_answer` */

/*Table structure for table `t_message` */

DROP TABLE IF EXISTS `t_message`;

CREATE TABLE `t_message` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `content` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `send_user_id` int DEFAULT NULL,
  `send_user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `send_real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `receive_user_count` int DEFAULT NULL,
  `read_count` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_message` */

/*Table structure for table `t_message_user` */

DROP TABLE IF EXISTS `t_message_user`;

CREATE TABLE `t_message_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `message_id` int DEFAULT NULL,
  `receive_user_id` int DEFAULT NULL,
  `receive_user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `receive_real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `readed` bit(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `read_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_message_user` */

/*Table structure for table `t_question` */

DROP TABLE IF EXISTS `t_question`;

CREATE TABLE `t_question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `question_type` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `score` int DEFAULT NULL,
  `grade_level` int DEFAULT NULL,
  `difficult` int DEFAULT NULL,
  `correct` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `info_text_content_id` int DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_question` */

/*Table structure for table `t_subject` */

DROP TABLE IF EXISTS `t_subject`;

CREATE TABLE `t_subject` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `level` int DEFAULT NULL,
  `level_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `item_order` int DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_subject` */

/*Table structure for table `t_task_exam` */

DROP TABLE IF EXISTS `t_task_exam`;

CREATE TABLE `t_task_exam` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `grade_level` int DEFAULT NULL,
  `frame_text_content_id` int DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `create_user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_task_exam` */

/*Table structure for table `t_task_exam_customer_answer` */

DROP TABLE IF EXISTS `t_task_exam_customer_answer`;

CREATE TABLE `t_task_exam_customer_answer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `task_exam_id` int DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `text_content_id` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_task_exam_customer_answer` */

/*Table structure for table `t_text_content` */

DROP TABLE IF EXISTS `t_text_content`;

CREATE TABLE `t_text_content` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_text_content` */

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_uuid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` int DEFAULT NULL,
  `birth_day` datetime DEFAULT NULL,
  `user_level` int DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `role` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `image_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `last_active_time` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `wx_open_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`user_uuid`,`user_name`,`password`,`real_name`,`age`,`sex`,`birth_day`,`user_level`,`phone`,`role`,`status`,`image_path`,`create_time`,`modify_time`,`last_active_time`,`deleted`,`wx_open_id`) values 
(1,'d2d29da2-dcb3-4013-b874-727626236f47','student','D1AGFL+Gx37t0NPG4d6biYP5Z31cNbwhK5w1lUeiHB2zagqbk8efYfSjYoh1Z/j1dkiRjHU+b0EpwzCh8IGsksJjzD65ci5LsnodQVf4Uj6D3pwoscXGqmkjjpzvSJbx42swwNTA+QoDU8YLo7JhtbUK2X0qCjFGpd+8eJ5BGvk=','学生',18,1,'2019-09-01 16:00:00',1,'19171171610',1,1,'https://www.mindskip.net:9008/image/ba607a75-83ba-4530-8e23-660b72dc4953/头像.jpg','2019-09-07 18:55:02','2020-02-04 08:26:54',NULL,'\0',NULL),
(2,'52045f5f-a13f-4ccc-93dd-f7ee8270ad4c','admin','D1AGFL+Gx37t0NPG4d6biYP5Z31cNbwhK5w1lUeiHB2zagqbk8efYfSjYoh1Z/j1dkiRjHU+b0EpwzCh8IGsksJjzD65ci5LsnodQVf4Uj6D3pwoscXGqmkjjpzvSJbx42swwNTA+QoDU8YLo7JhtbUK2X0qCjFGpd+8eJ5BGvk=','管理员',30,1,'2019-09-07 18:56:07',NULL,NULL,3,1,NULL,'2019-09-07 18:56:21',NULL,NULL,'\0',NULL);

/*Table structure for table `t_user_event_log` */

DROP TABLE IF EXISTS `t_user_event_log`;

CREATE TABLE `t_user_event_log` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_user_event_log` */

/*Table structure for table `t_user_token` */

DROP TABLE IF EXISTS `t_user_token`;

CREATE TABLE `t_user_token` (
  `id` int NOT NULL AUTO_INCREMENT,
  `token` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `wx_open_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT;

/*Data for the table `t_user_token` */

/*Table structure for table `tb_clazz` */

DROP TABLE IF EXISTS `tb_clazz`;

CREATE TABLE `tb_clazz` (
  `id` int NOT NULL AUTO_INCREMENT,
  `clazz_name` varchar(32) DEFAULT NULL,
  `perid` int DEFAULT NULL,
  `start` date DEFAULT NULL,
  `major` varchar(32) DEFAULT NULL,
  `status` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_clazz` */

insert  into `tb_clazz`(`id`,`clazz_name`,`perid`,`start`,`major`,`status`) values 
(6,'XAL2',114,'2021-12-30','HTML5',1),
(8,'xaj1',112,'2021-12-30','HTML5',1),
(13,'a3',114,'2021-12-14','Java',1),
(14,'ada1',113,'2021-12-16','Java',1),
(16,'dwad',89,'2021-12-15','Java',1),
(17,'dwadw',105,'2021-12-23','Java',1),
(18,'dwadwa',6,'2021-12-22','HTML5',1),
(19,'公司的感受到',113,'2022-01-11','Java',1);

/*Table structure for table `tb_examination` */

DROP TABLE IF EXISTS `tb_examination`;

CREATE TABLE `tb_examination` (
  `id` int NOT NULL AUTO_INCREMENT,
  `major` varchar(50) DEFAULT NULL COMMENT '方向：java',
  `level` int DEFAULT NULL COMMENT '难度1-3',
  `seg` varchar(50) DEFAULT NULL COMMENT '类别：面向对象',
  `perid` int DEFAULT NULL COMMENT '出题者id',
  `created` datetime DEFAULT NULL COMMENT '出题时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_examination` */

insert  into `tb_examination`(`id`,`major`,`level`,`seg`,`perid`,`created`) values 
(2,'HTML5',1,'js',114,'2022-01-13 02:12:34'),
(3,'Java',1,'面向对象',112,'2022-01-13 02:16:46');

/*Table structure for table `tb_examination1` */

DROP TABLE IF EXISTS `tb_examination1`;

CREATE TABLE `tb_examination1` (
  `id` int NOT NULL AUTO_INCREMENT,
  `clazzId` int DEFAULT NULL COMMENT '班级id',
  `perid` int DEFAULT NULL COMMENT '发布者id',
  `status` int DEFAULT NULL COMMENT '状态 1未开始 2 已开始 3.待批改  4.已结束',
  `created` datetime DEFAULT NULL,
  `submitStatus` int DEFAULT NULL COMMENT '学生提交状态 1 未提交 2 已提交',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_examination1` */

insert  into `tb_examination1`(`id`,`clazzId`,`perid`,`status`,`created`,`submitStatus`) values 
(14,6,114,2,'2022-01-15 20:21:34',1),
(15,8,112,1,'2022-01-15 21:01:04',1),
(16,8,112,1,'2022-01-15 21:07:16',1),
(17,6,114,1,'2022-01-15 22:35:21',1),
(19,6,114,4,'2022-01-16 21:17:59',2),
(21,6,114,4,'2022-03-28 09:31:51',NULL);

/*Table structure for table `tb_question_choose` */

DROP TABLE IF EXISTS `tb_question_choose`;

CREATE TABLE `tb_question_choose` (
  `id` int NOT NULL AUTO_INCREMENT,
  `major` varchar(20) DEFAULT NULL COMMENT '方向：java\\html5',
  `level` int DEFAULT NULL COMMENT '级别',
  `source` varchar(25) DEFAULT NULL COMMENT '来源',
  `perid` int DEFAULT NULL COMMENT '出题者',
  `seg` varchar(50) DEFAULT NULL COMMENT '类别：面向对象',
  `title` varchar(255) DEFAULT NULL COMMENT '题目',
  `choiseA` varchar(100) DEFAULT NULL COMMENT '选项A',
  `choiseB` varchar(100) DEFAULT NULL COMMENT '选项B',
  `choiseC` varchar(100) DEFAULT NULL COMMENT '选项C',
  `choiseD` varchar(100) DEFAULT NULL COMMENT '选项D',
  `correct` int DEFAULT NULL COMMENT '答案',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_question_choose` */

insert  into `tb_question_choose`(`id`,`major`,`level`,`source`,`perid`,`seg`,`title`,`choiseA`,`choiseB`,`choiseC`,`choiseD`,`correct`) values 
(1,'Java',1,'牛客',112,'面向对象','题目一','选项A','选项B','选项C','选项D',1),
(2,'Java',1,'牛客',113,'js','题目二','选项A','选项B','选项C','选项D',3),
(4,'Java',1,'力扣',NULL,'java基础','题目三','选项A','选项B','选项C','选项D',2),
(5,'Html5',1,'牛客',NULL,'面向对象','题目四','选项A','选项B','选项C','选项D',1),
(6,'Java',1,'牛客',NULL,'js','题目五','选项A','选项B','选项C','选项D',4),
(7,'Html5',1,'力扣',NULL,'js','题目六','选项A','选项B','选项C','选项D',4),
(8,'Java',1,'牛客',NULL,'面向对象','题目七','选项A','选项B','选项C','选项D',1),
(9,'Html5',1,'力扣',NULL,'java基础','题目八','选项A','选项B','选项C','选项D',2),
(10,'Java',1,'力扣',NULL,'js','题目九','选项A','选项B','选项C','选项D',1),
(11,'Java',1,'力扣',NULL,'java基础','题目十','选项A','选项B','选项C','选项D',3),
(12,'Html5',1,'牛客',NULL,'面向对象','题目十一','选项A','选项B','选项C','选项D',2),
(13,'Java',1,'力扣',NULL,'java基础','题目十二','选项A','选项B','选项C','选项D',1),
(14,'Html5',1,'力扣',NULL,'js','题目十三','选项A','选项B','选项C','选项D',4),
(18,'Java',1,'牛客',NULL,'面向对象',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tb_question_code` */

DROP TABLE IF EXISTS `tb_question_code`;

CREATE TABLE `tb_question_code` (
  `id` int NOT NULL AUTO_INCREMENT,
  `major` varchar(20) DEFAULT NULL COMMENT '方向：java\\html5',
  `level` int DEFAULT NULL COMMENT '级别',
  `source` varchar(25) DEFAULT NULL COMMENT '来源',
  `perid` int DEFAULT NULL COMMENT '出题者',
  `seg` varchar(50) DEFAULT NULL COMMENT '类别：面向对象',
  `title` varchar(255) DEFAULT NULL COMMENT '题目',
  `usercase` varchar(255) DEFAULT NULL COMMENT '用例',
  `correct` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '答案',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_question_code` */

insert  into `tb_question_code`(`id`,`major`,`level`,`source`,`perid`,`seg`,`title`,`usercase`,`correct`) values 
(1,'Java',1,'力扣',112,'带娃','题目一','15151656','达瓦达瓦'),
(2,'Java',1,'牛客网',113,'带娃D','题目二','256156','dwaDWa'),
(3,'Java',1,NULL,NULL,NULL,'题目三',NULL,NULL),
(4,'Java',1,NULL,NULL,NULL,'题目四',NULL,NULL),
(5,'Java',1,NULL,NULL,NULL,'题目五',NULL,NULL);

/*Table structure for table `tb_question_judge` */

DROP TABLE IF EXISTS `tb_question_judge`;

CREATE TABLE `tb_question_judge` (
  `id` int NOT NULL AUTO_INCREMENT,
  `major` varchar(20) DEFAULT NULL COMMENT '方向：java\\html5',
  `level` int DEFAULT NULL COMMENT '级别',
  `source` varchar(25) DEFAULT NULL COMMENT '来源',
  `perid` int DEFAULT NULL COMMENT '出题者',
  `seg` varchar(50) DEFAULT NULL COMMENT '类别：面向对象',
  `title` varchar(255) DEFAULT NULL COMMENT '题目',
  `correct` int DEFAULT NULL COMMENT '答案 0 未填写 1 true 2false',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_question_judge` */

insert  into `tb_question_judge`(`id`,`major`,`level`,`source`,`perid`,`seg`,`title`,`correct`) values 
(1,'java',1,'力扣',112,'15611','题目一',1),
(2,'html5',2,'牛客',113,'1651651','题目二',2),
(4,'java',1,'力扣',NULL,'15611','题目三',2),
(5,'html5',1,'力扣',NULL,'1651651','题目四',2),
(6,'java',1,'牛客',NULL,'1651651','题目五',1),
(7,'html5',1,'力扣',NULL,'1651651','题目六',1),
(8,'java',1,'牛客',NULL,'15611','题目七',2),
(9,'html5',1,'力扣',NULL,'1651651','题目八',2),
(10,'java',1,'牛客',NULL,'1651651','题目九',1),
(11,'java',1,'力扣',NULL,'15611','题目十',2),
(12,'java',1,'牛客',NULL,'1651651','题目十一',1),
(13,'html5',1,'力扣',NULL,'15611','题目十二',2),
(14,'java',1,'牛客',NULL,'15611','题目十三',2),
(15,'html5',1,'力扣',NULL,'1651651','题目十四',1),
(16,'java',1,'牛客',NULL,'15611','题目十五',2),
(17,'html5',1,'牛客',NULL,'15611','题目十六',1);

/*Table structure for table `tb_question_subjective` */

DROP TABLE IF EXISTS `tb_question_subjective`;

CREATE TABLE `tb_question_subjective` (
  `id` int NOT NULL AUTO_INCREMENT,
  `major` varchar(20) DEFAULT NULL COMMENT '方向：java\\html5',
  `level` int DEFAULT NULL COMMENT '级别',
  `source` varchar(25) DEFAULT NULL COMMENT '来源',
  `perid` int DEFAULT NULL COMMENT '出题者',
  `seg` varchar(50) DEFAULT NULL COMMENT '类别：面向对象',
  `title` varchar(255) DEFAULT NULL COMMENT '题目',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_question_subjective` */

insert  into `tb_question_subjective`(`id`,`major`,`level`,`source`,`perid`,`seg`,`title`) values 
(1,'Java',1,'牛客',112,'151','题目一'),
(2,'Java',1,'力扣',113,'156165','题目二'),
(5,'Java',1,'牛客',NULL,'156165','题目三'),
(6,'Java',1,'牛客',NULL,'151','题目四'),
(7,'Java',1,'力扣',NULL,'156165','题目五'),
(8,'Java',1,'力扣',NULL,'151','题目六');

/*Table structure for table `tb_role` */

DROP TABLE IF EXISTS `tb_role`;

CREATE TABLE `tb_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_role` */

insert  into `tb_role`(`id`,`role_name`) values 
(1,'管理员'),
(2,'教学总监'),
(3,'讲师'),
(4,'学生');

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `rid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_esperanto_ci;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`account`,`password`,`rid`) values 
(1,'admin','admin',1),
(68,'1235615616','1234',4),
(69,'15597796','1234',4),
(70,'15511111111','1234',4),
(71,'12216515615','1234',4),
(73,'1599999999','1234',4),
(74,'15165516516','1234',4),
(75,'24532453543','1234',4),
(78,'15596151','1234',4),
(85,'15591049108','1234',4),
(90,'25156162','1234',3),
(91,'25156161','1234',3),
(92,'25156163','1234',3),
(93,'25156164','1234',3),
(94,'25156165','1234',3),
(95,'25156166','1234',3),
(96,'25156167','1234',3),
(97,'51651651651','1234',4),
(99,'151651156','1234',4),
(100,'1561561165156','1234',4),
(101,'156156156156','1234',4),
(102,'15616556','1234',4),
(103,'56265+26+26+2','1234',4),
(104,'587876','1234',4),
(112,'12345','1234',3),
(113,'1234','1234',3),
(114,'123456','1234',3);

/*Table structure for table `tb_user_info` */

DROP TABLE IF EXISTS `tb_user_info`;

CREATE TABLE `tb_user_info` (
  `id` int NOT NULL AUTO_INCREMENT,
  `realName` varchar(32) DEFAULT NULL,
  `major` varchar(32) DEFAULT NULL,
  `phone` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `uid` int NOT NULL,
  PRIMARY KEY (`id`,`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb3;

/*Data for the table `tb_user_info` */

insert  into `tb_user_info`(`id`,`realName`,`major`,`phone`,`uid`) values 
(2,'张三','HTML5','1235615616',68),
(3,'王五','HTML5','15597796',69),
(4,'沈依依','Java','15511111111',70),
(5,'张飞','Java','12216515615',71),
(6,'李白','Java','15165516516',74),
(7,'杜甫','Java','24532453543',75),
(10,'李伟东','HTML5','15596151',78),
(17,'赵四','Java','15591049108',85),
(22,'分安抚','Java','51651651651',97),
(24,'肺癌无法呢','Java','151651156',99),
(25,'法萨芬三方','Java','1561561165156',100),
(26,'分安抚','Java','156156156156',101),
(27,'力达瓦','Java','15616556',102),
(28,'15615156156','Java','56265+26+26+2',103),
(29,'公司非的故事','Java','587876',104),
(37,'沈飞','Java','1515131351',112),
(38,'张三','Java','1561515165',113),
(39,'李白','Java','155910',114),
(40,'王维','java','1599999',73);

/*Table structure for table `undo_log` */

DROP TABLE IF EXISTS `undo_log`;

CREATE TABLE `undo_log` (
  `branch_id` bigint NOT NULL COMMENT 'branch transaction id',
  `xid` varchar(100) NOT NULL COMMENT 'global transaction id',
  `context` varchar(128) NOT NULL COMMENT 'undo_log context,such as serialization',
  `rollback_info` longblob NOT NULL COMMENT 'rollback info',
  `log_status` int NOT NULL COMMENT '0:normal status,1:defense status',
  `log_created` datetime(6) NOT NULL COMMENT 'create datetime',
  `log_modified` datetime(6) NOT NULL COMMENT 'modify datetime',
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='AT transaction mode undo table';

/*Data for the table `undo_log` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
