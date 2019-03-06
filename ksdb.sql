/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.1.62-community : Database - kusjxlkjalsdmqwnx_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `opennumber_log` */

CREATE TABLE `opennumber_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_qihao` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开奖期号',
  `create_open` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开奖号码',
  `create_time` datetime DEFAULT NULL COMMENT '开奖时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `opennumber_log` */

insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (16,'2019000015','1,1,6','2019-01-16 20:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (17,'2019000016','4,6,6','2019-01-16 20:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (18,'2019000017','4,5,5','2019-01-16 23:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (19,'2019000018','3,5,6','2019-01-16 23:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (20,'2019000019','1,2,6','2019-01-16 23:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (21,'2019000020','1,2,6','2019-01-16 23:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (22,'2019000021','1,5,6','2019-01-16 23:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (23,'2019000022','2,4,5','2019-01-16 23:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (24,'2019000023','2,3,6','2019-01-16 23:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (25,'2019000024','3,5,6','2019-01-17 00:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (26,'2019000025','3,5,6','2019-01-17 00:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (27,'2019000026','2,2,2','2019-01-17 00:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (28,'2019000027','2,3,6','2019-01-17 00:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (29,'2019000028','1,2,3','2019-01-17 00:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (30,'2019000029','2,4,6','2019-01-17 00:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (31,'2019000030','3,5,5','2019-01-17 00:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (32,'2019000031','1,3,5','2019-01-17 00:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (33,'2019000032','2,2,6','2019-01-17 00:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (34,'2019000033','1,6,6','2019-01-17 00:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (35,'2019000034','2,4,6','2019-01-17 00:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (36,'2019000035','1,2,6','2019-01-17 00:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (37,'2019000036','2,3,3','2019-01-17 01:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (38,'2019000037','4,4,4','2019-01-17 01:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (39,'2019000038','1,5,5','2019-01-17 01:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (40,'2019000039','1,2,4','2019-01-17 01:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (41,'2019000040','2,3,6','2019-01-17 01:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (42,'2019000041','4,4,5','2019-01-17 01:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (43,'2019000042','1,2,6','2019-01-17 01:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (44,'2019000043','1,6,6','2019-01-17 01:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (45,'2019000044','1,1,5','2019-01-17 01:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (46,'2019000045','1,4,6','2019-01-17 01:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (47,'2019000046','1,5,5','2019-01-17 01:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (48,'2019000047','1,3,3','2019-01-17 01:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (49,'2019000048','4,5,6','2019-01-17 02:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (50,'2019000049','2,3,3','2019-01-17 02:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (51,'2019000050','1,5,6','2019-01-17 02:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (52,'2019000051','4,4,6','2019-01-17 02:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (53,'2019000052','2,2,6','2019-01-17 02:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (54,'2019000053','6,6,6','2019-01-17 02:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (55,'2019000054','1,1,5','2019-01-17 02:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (56,'2019000055','3,5,5','2019-01-17 02:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (57,'2019000056','2,3,6','2019-01-17 02:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (58,'2019000057','3,6,6','2019-01-17 02:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (59,'2019000058','3,5,5','2019-01-17 02:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (60,'2019000059','3,4,5','2019-01-17 02:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (61,'2019000060','2,4,5','2019-01-17 03:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (62,'2019000061','3,5,5','2019-01-17 03:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (63,'2019000062','2,3,5','2019-01-17 03:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (64,'2019000063','1,3,6','2019-01-17 03:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (65,'2019000064','3,3,5','2019-01-17 03:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (66,'2019000065','1,1,4','2019-01-17 03:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (67,'2019000066','3,4,6','2019-01-17 03:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (68,'2019000067','5,6,6','2019-01-17 03:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (69,'2019000068','4,5,5','2019-01-17 03:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (70,'2019000069','1,4,4','2019-01-17 03:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (71,'2019000070','1,1,6','2019-01-17 03:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (72,'2019000071','1,4,4','2019-01-17 03:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (73,'2019000072','2,6,6','2019-01-17 04:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (74,'2019000073','1,5,6','2019-01-17 04:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (75,'2019000074','4,5,6','2019-01-17 04:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (76,'2019000075','1,3,5','2019-01-17 04:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (77,'2019000076','3,5,5','2019-01-17 04:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (78,'2019000077','4,5,6','2019-01-17 04:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (79,'2019000078','2,6,6','2019-01-17 04:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (80,'2019000079','1,3,3','2019-01-17 04:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (81,'2019000080','4,6,6','2019-01-17 04:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (82,'2019000081','3,4,6','2019-01-17 04:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (83,'2019000082','2,4,4','2019-01-17 04:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (84,'2019000083','1,3,4','2019-01-17 04:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (85,'2019000084','1,3,4','2019-01-17 05:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (86,'2019000085','3,3,6','2019-01-17 05:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (87,'2019000086','1,1,5','2019-01-17 05:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (88,'2019000087','1,2,2','2019-01-17 05:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (89,'2019000088','3,5,6','2019-01-17 05:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (90,'2019000089','2,4,4','2019-01-17 05:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (91,'2019000090','1,3,3','2019-01-17 05:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (92,'2019000091','3,5,6','2019-01-17 05:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (93,'2019000092','3,4,6','2019-01-17 05:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (94,'2019000093','2,4,6','2019-01-17 05:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (95,'2019000094','4,6,6','2019-01-17 05:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (96,'2019000095','1,4,6','2019-01-17 05:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (97,'2019000096','4,6,6','2019-01-17 06:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (98,'2019000097','1,2,4','2019-01-17 06:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (99,'2019000098','2,3,6','2019-01-17 06:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (100,'2019000099','3,3,5','2019-01-17 06:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (101,'2019000100','3,4,6','2019-01-17 06:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (102,'2019000101','3,5,6','2019-01-17 06:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (103,'2019000102','1,4,5','2019-01-17 06:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (104,'2019000103','1,2,5','2019-01-17 06:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (105,'2019000104','1,3,5','2019-01-17 06:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (106,'2019000105','3,5,6','2019-01-17 06:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (107,'2019000106','1,2,5','2019-01-17 06:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (108,'2019000107','1,4,5','2019-01-17 06:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (109,'2019000108','1,1,1','2019-01-17 07:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (110,'2019000109','1,5,6','2019-01-17 07:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (111,'2019000110','1,2,6','2019-01-17 07:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (112,'2019000111','5,5,6','2019-01-17 07:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (113,'2019000112','1,2,2','2019-01-17 07:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (114,'2019000113','3,5,5','2019-01-17 07:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (115,'2019000114','1,2,6','2019-01-17 07:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (116,'2019000115','1,2,4','2019-01-17 07:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (117,'2019000116','3,3,4','2019-01-17 07:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (118,'2019000117','1,4,6','2019-01-17 07:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (119,'2019000118','1,1,5','2019-01-17 07:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (120,'2019000119','2,3,6','2019-01-17 07:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (121,'2019000120','2,4,5','2019-01-17 08:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (122,'2019000121','2,4,5','2019-01-17 08:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (123,'2019000122','1,5,6','2019-01-17 08:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (124,'2019000123','4,5,6','2019-01-17 08:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (125,'2019000124','1,1,4','2019-01-17 08:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (126,'2019000125','1,2,6','2019-01-17 08:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (127,'2019000126','4,6,6','2019-01-17 08:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (128,'2019000127','4,5,5','2019-01-17 08:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (129,'2019000128','1,4,5','2019-01-17 08:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (130,'2019000129','1,2,6','2019-01-17 08:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (131,'2019000130','5,5,6','2019-01-17 08:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (132,'2019000131','2,4,6','2019-01-17 08:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (133,'2019000132','4,4,5','2019-01-17 09:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (134,'2019000133','4,4,5','2019-01-17 09:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (135,'2019000134','1,1,3','2019-01-17 09:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (136,'2019000135','3,5,6','2019-01-17 09:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (137,'2019000136','1,5,5','2019-01-17 09:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (138,'2019000137','1,3,6','2019-01-17 09:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (139,'2019000138','2,5,5','2019-01-17 09:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (140,'2019000139','1,6,6','2019-01-17 09:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (141,'2019000140','1,5,6','2019-01-17 09:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (142,'2019000141','1,1,5','2019-01-17 09:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (143,'2019000142','1,2,6','2019-01-17 09:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (144,'2019000143','2,3,5','2019-01-17 09:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (145,'2019000144','3,3,4','2019-01-17 10:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (146,'2019000145','3,3,6','2019-01-17 10:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (147,'2019000146','3,5,5','2019-01-17 10:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (148,'2019000147','3,3,5','2019-01-17 10:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (149,'2019000148','1,1,1','2019-01-17 10:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (150,'2019000149','3,4,5','2019-01-17 10:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (151,'2019000150','3,3,5','2019-01-17 10:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (152,'2019000151','2,5,5','2019-01-17 10:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (153,'2019000152','1,1,4','2019-01-17 10:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (154,'2019000153','3,4,5','2019-01-17 10:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (155,'2019000154','1,5,5','2019-01-17 10:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (156,'2019000155','2,4,6','2019-01-17 10:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (157,'2019000156','1,3,6','2019-01-17 11:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (158,'2019000157','1,3,5','2019-01-17 11:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (159,'2019000158','1,1,4','2019-01-17 11:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (160,'2019000159','2,2,4','2019-01-17 11:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (161,'2019000160','2,3,5','2019-01-17 11:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (162,'2019000161','1,4,5','2019-01-17 11:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (163,'2019000162','1,1,6','2019-01-17 11:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (164,'2019000163','1,4,4','2019-01-17 11:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (165,'2019000164','1,4,6','2019-01-17 11:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (166,'2019000165','3,6,6','2019-01-17 11:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (167,'2019000166','2,2,4','2019-01-17 11:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (168,'2019000167','3,3,5','2019-01-17 11:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (169,'2019000168','2,2,3','2019-01-17 12:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (170,'2019000169','4,5,5','2019-01-17 12:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (171,'2019000170','2,2,2','2019-01-17 12:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (172,'2019000171','4,5,6','2019-01-17 12:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (173,'2019000172','1,3,6','2019-01-17 12:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (174,'2019000173','1,5,6','2019-01-17 12:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (175,'2019000174','3,5,5','2019-01-17 12:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (176,'2019000175','2,2,4','2019-01-17 12:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (177,'2019000176','1,3,6','2019-01-17 12:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (178,'2019000177','3,5,6','2019-01-17 12:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (179,'2019000178','1,1,5','2019-01-17 12:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (180,'2019000179','1,2,5','2019-01-17 12:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (181,'2019000180','1,4,6','2019-01-17 13:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (182,'2019000181','3,4,5','2019-01-17 13:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (183,'2019000182','2,3,6','2019-01-17 13:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (184,'2019000183','1,4,4','2019-01-17 13:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (185,'2019000184','3,4,5','2019-01-17 13:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (186,'2019000185','1,2,5','2019-01-17 13:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (187,'2019000186','4,5,6','2019-01-17 13:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (188,'2019000187','3,4,4','2019-01-17 13:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (189,'2019000188','2,3,6','2019-01-17 13:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (190,'2019000189','1,5,6','2019-01-17 13:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (191,'2019000190','3,3,6','2019-01-17 13:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (192,'2019000191','2,3,4','2019-01-17 13:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (193,'2019000192','1,2,4','2019-01-17 14:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (194,'2019000193','3,4,5','2019-01-17 14:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (195,'2019000194','1,1,4','2019-01-17 14:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (196,'2019000195','2,2,5','2019-01-17 14:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (197,'2019000196','1,1,6','2019-01-17 14:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (198,'2019000197','1,2,2','2019-01-17 14:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (199,'2019000198','2,2,5','2019-01-17 14:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (200,'2019000199','2,3,6','2019-01-17 14:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (201,'2019000200','1,3,4','2019-01-17 14:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (202,'2019000201','3,5,6','2019-01-17 14:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (203,'2019000202','2,2,5','2019-01-17 14:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (204,'2019000203','3,4,4','2019-01-17 14:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (205,'2019000204','1,3,6','2019-01-17 15:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (206,'2019000205','2,4,5','2019-01-17 15:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (207,'2019000206','3,4,4','2019-01-17 15:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (208,'2019000207','1,1,6','2019-01-17 15:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (209,'2019000208','3,5,5','2019-01-17 15:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (210,'2019000209','2,3,6','2019-01-17 15:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (211,'2019000210','1,1,3','2019-01-17 15:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (212,'2019000211','2,3,5','2019-01-17 15:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (213,'2019000212','1,1,4','2019-01-17 15:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (214,'2019000213','1,2,5','2019-01-17 15:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (215,'2019000214','2,4,6','2019-01-17 15:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (216,'2019000215','2,3,6','2019-01-17 15:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (217,'2019000216','1,1,2','2019-01-17 16:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (218,'2019000217','2,4,6','2019-01-17 16:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (219,'2019000218','2,5,6','2019-01-17 16:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (220,'2019000219','2,2,6','2019-01-17 16:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (221,'2019000220','1,1,3','2019-01-17 16:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (222,'2019000221','1,2,4','2019-01-17 16:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (223,'2019000222','1,5,6','2019-01-17 16:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (224,'2019000223','1,4,6','2019-01-17 16:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (225,'2019000224','1,3,3','2019-01-17 16:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (226,'2019000225','1,5,5','2019-01-17 16:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (227,'2019000226','2,5,6','2019-01-17 16:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (228,'2019000227','1,3,4','2019-01-17 16:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (229,'2019000228','4,6,6','2019-01-17 17:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (230,'2019000229','1,1,2','2019-01-17 17:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (231,'2019000230','1,2,5','2019-01-17 17:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (232,'2019000231','1,4,5','2019-01-17 17:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (233,'2019000232','4,4,5','2019-01-17 17:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (234,'2019000233','3,4,6','2019-01-17 17:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (235,'2019000234','3,4,5','2019-01-17 17:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (236,'2019000235','2,4,6','2019-01-17 17:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (237,'2019000236','1,3,3','2019-01-17 17:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (238,'2019000237','2,2,3','2019-01-17 17:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (239,'2019000238','1,3,6','2019-01-17 17:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (240,'2019000239','1,3,3','2019-01-17 17:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (241,'2019000240','1,1,5','2019-01-17 18:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (242,'2019000241','5,6,6','2019-01-17 18:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (243,'2019000242','1,2,4','2019-01-17 18:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (244,'2019000243','1,3,5','2019-01-17 18:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (245,'2019000244','1,2,6','2019-01-17 18:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (246,'2019000245','1,5,5','2019-01-17 18:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (247,'2019000246','1,3,4','2019-01-17 18:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (248,'2019000247','1,5,5','2019-01-17 18:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (249,'2019000248','2,5,6','2019-01-17 18:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (250,'2019000249','1,2,5','2019-01-17 18:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (251,'2019000250','2,3,6','2019-01-17 18:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (252,'2019000251','2,4,5','2019-01-17 18:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (253,'2019000252','4,5,6','2019-01-17 19:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (254,'2019000253','1,2,3','2019-01-17 19:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (255,'2019000254','2,2,6','2019-01-17 19:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (256,'2019000255','1,2,5','2019-01-17 19:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (257,'2019000256','1,3,5','2019-01-17 19:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (258,'2019000257','1,1,5','2019-01-17 19:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (259,'2019000258','3,4,4','2019-01-17 19:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (260,'2019000259','2,6,6','2019-01-17 19:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (261,'2019000260','1,2,4','2019-01-17 19:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (262,'2019000261','3,5,5','2019-01-17 19:45:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (263,'2019000262','1,3,4','2019-01-17 19:50:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (264,'2019000263','1,4,4','2019-01-17 19:55:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (265,'2019000264','1,2,6','2019-01-17 20:00:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (266,'2019000265','1,3,5','2019-01-17 20:05:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (267,'2019000266','4,4,6','2019-01-17 20:10:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (268,'2019000267','1,4,6','2019-01-17 20:15:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (269,'2019000268','1,4,5','2019-01-17 20:20:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (270,'2019000269','2,2,6','2019-01-17 20:25:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (271,'2019000270','1,2,3','2019-01-17 20:30:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (272,'2019000271','1,2,5','2019-01-17 20:35:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (273,'2019000272','5,6,6','2019-01-17 20:40:00');
insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (274,'2019000273','1,5,5','2019-01-17 20:45:00');

/*Table structure for table `taskconfig` */

CREATE TABLE `taskconfig` (
  `id` int(11) NOT NULL,
  `status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态：NORMAL(正常) PAUSED(暂停)',
  `nowNum` int(11) DEFAULT NULL COMMENT '现在开到几期了的标志',
  `second` int(11) DEFAULT NULL COMMENT '倒计时（同步前后端）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `taskconfig` */

insert  into `taskconfig`(`id`,`status`,`nowNum`,`second`) values (1,'NORMAL',274,257);

/*Table structure for table `xiazhu_table` */

CREATE TABLE `xiazhu_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openId` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '微信openId',
  `qihao` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '期号',
  `number` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '下注号码',
  `numType` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '下注类型',
  `createTime` datetime DEFAULT NULL COMMENT '下注时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `xiazhu_table` */

/*Table structure for table `yushenumber` */

CREATE TABLE `yushenumber` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `qihao` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `openumber` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creatime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `yushenumber` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
