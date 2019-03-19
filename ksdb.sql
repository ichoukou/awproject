/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.1.32-community : Database - kusjxlkjalsdmqwnx_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kusjxlkjalsdmqwnx_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `kusjxlkjalsdmqwnx_db`;

/*Table structure for table `opennumber_log` */

DROP TABLE IF EXISTS `opennumber_log`;

CREATE TABLE `opennumber_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_qihao` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开奖期号',
  `create_open` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开奖号码',
  `create_time` datetime DEFAULT NULL COMMENT '开奖时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=350 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `opennumber_log` */

insert  into `opennumber_log`(`id`,`create_qihao`,`create_open`,`create_time`) values (275,'20190314051','1,8,8,7,7','2019-03-14 21:10:30'),(276,'20190314050','1,5,5,3,2','2019-03-14 20:50:30'),(277,'20190314049','2,6,5,8,6','2019-03-14 20:30:30'),(278,'20190314048','8,8,3,2,4','2019-03-14 20:10:30'),(279,'20190314047','6,5,4,7,3','2019-03-14 19:50:30'),(280,'20190314046','2,7,0,1,8','2019-03-14 19:30:30'),(281,'20190314045','2,3,1,8,4','2019-03-14 19:10:30'),(282,'20190314044','4,6,1,7,2','2019-03-14 18:50:30'),(283,'20190314043','1,3,9,1,1','2019-03-14 18:30:30'),(284,'20190314042','8,7,8,7,6','2019-03-14 18:10:30'),(285,'20190314041','0,9,3,3,0','2019-03-14 17:50:30'),(286,'20190314040','2,3,7,8,9','2019-03-14 17:30:30'),(287,'20190314039','2,6,5,6,8','2019-03-14 17:10:30'),(288,'20190314038','7,5,9,8,2','2019-03-14 16:50:30'),(289,'20190314037','7,7,9,8,9','2019-03-14 16:30:30'),(290,'20190314036','3,7,8,3,3','2019-03-14 16:10:30'),(291,'20190314035','9,3,6,4,2','2019-03-14 15:50:30'),(292,'20190314034','7,1,9,0,9','2019-03-14 15:30:30'),(293,'20190314033','6,3,3,5,1','2019-03-14 15:10:30'),(294,'20190314032','4,2,5,5,7','2019-03-14 14:50:30'),(295,'20190317055','0,6,6,4,9','2019-03-17 22:30:30'),(296,'20190318058','4,4,6,2,6','2019-03-18 23:30:30'),(297,'20190318059','2,2,6,3,3','2019-03-18 23:50:30'),(298,'20190319001','6,8,6,3,8','2019-03-19 00:30:30'),(299,'20190319002','5,4,7,4,7','2019-03-19 00:50:30'),(300,'20190319003','6,1,9,4,0','2019-03-19 01:10:30'),(301,'20190319004','1,2,2,8,9','2019-03-19 01:30:30'),(302,'20190319005','6,9,7,3,6','2019-03-19 01:50:30'),(303,'20190319006','1,4,1,0,4','2019-03-19 02:10:30'),(304,'20190319007','9,0,5,2,9','2019-03-19 02:30:30'),(305,'20190319008','8,0,8,4,8','2019-03-19 02:50:30'),(306,'20190319009','8,8,1,0,8','2019-03-19 03:10:30'),(307,'20190319010','1,8,0,2,9','2019-03-19 07:30:30'),(308,'20190319011','7,2,8,7,2','2019-03-19 07:50:30'),(309,'20190319012','0,3,8,9,6','2019-03-19 08:10:30'),(310,'20190319013','1,3,0,8,3','2019-03-19 08:30:30'),(311,'20190319014','6,1,9,1,3','2019-03-19 08:50:30'),(312,'20190319015','9,5,6,7,0','2019-03-19 09:10:30'),(313,'20190319016','9,3,6,3,5','2019-03-19 09:30:30'),(314,'20190319017','2,1,2,5,4','2019-03-19 09:50:30'),(315,'20190319018','9,8,6,5,1','2019-03-19 10:10:30'),(316,'20190319019','9,3,2,4,4','2019-03-19 10:30:30'),(317,'20190319020','8,4,0,2,1','2019-03-19 10:50:30'),(318,'20190319021','2,4,6,5,3','2019-03-19 11:10:30'),(319,'20190319022','9,0,9,9,5','2019-03-19 11:30:30'),(320,'20190319023','3,8,9,7,9','2019-03-19 11:50:30'),(321,'20190319024','4,1,6,4,6','2019-03-19 12:10:30'),(322,'20190319025','0,3,1,6,7','2019-03-19 12:30:30'),(323,'20190319026','4,0,9,1,9','2019-03-19 12:50:30'),(324,'20190319027','3,0,0,8,1','2019-03-19 13:10:30'),(325,'20190319028','6,0,3,5,0','2019-03-19 13:30:30'),(326,'20190319029','9,3,9,1,5','2019-03-19 13:50:30'),(327,'20190319030','3,7,8,5,3','2019-03-19 14:10:30'),(328,'20190319031','6,9,7,4,0','2019-03-19 14:30:30'),(329,'20190319032','9,2,4,5,1','2019-03-19 14:50:30'),(330,'20190319033','1,0,9,2,1','2019-03-19 15:10:30'),(331,'20190319034','8,9,7,1,0','2019-03-19 15:30:30'),(332,'20190319035','7,4,7,8,2','2019-03-19 15:50:30'),(333,'20190319036','1,1,8,3,3','2019-03-19 16:10:30'),(334,'20190319037','8,2,1,1,2','2019-03-19 16:30:30'),(335,'20190319038','8,4,9,3,3','2019-03-19 16:50:30'),(336,'20190319039','8,9,2,2,9','2019-03-19 17:10:30'),(337,'20190319040','4,6,3,9,6','2019-03-19 17:30:30'),(338,'20190319041','2,4,3,8,9','2019-03-19 17:50:30'),(339,'20190319042','3,9,7,3,8','2019-03-19 18:10:30'),(340,'20190319043','4,4,8,7,0','2019-03-19 18:30:30'),(341,'20190319044','6,1,2,8,4','2019-03-19 18:50:30'),(342,'20190319045','2,7,8,4,3','2019-03-19 19:10:30'),(343,'20190319046','4,7,2,4,1','2019-03-19 19:30:30'),(344,'20190319047','6,9,4,1,7','2019-03-19 19:50:30'),(345,'20190319048','2,3,9,0,6','2019-03-19 20:10:30'),(346,'20190319049','1,1,9,8,3','2019-03-19 20:30:30'),(347,'20190319050','4,0,6,9,7','2019-03-19 20:50:30'),(348,'20190319051','5,7,5,3,1','2019-03-19 21:10:30'),(349,'20190319052','4,7,7,2,3','2019-03-19 21:30:30');

/*Table structure for table `taskconfig` */

DROP TABLE IF EXISTS `taskconfig`;

CREATE TABLE `taskconfig` (
  `id` int(11) NOT NULL,
  `status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态：NORMAL(正常) PAUSED(暂停)',
  `second` int(11) DEFAULT NULL COMMENT '倒计时（同步前后端）',
  `close` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '（自动）封盘 0.开奖性封盘  1.正常  2.系统维护性封盘',
  `fenpan` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '（手动）封盘提示 0.封盘  1.正常',
  `closetime` int(11) DEFAULT NULL COMMENT '分盘倒时',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `taskconfig` */

insert  into `taskconfig`(`id`,`status`,`second`,`close`,`fenpan`,`closetime`) values (1,'NORMAL',575,'1','1',60);

/*Table structure for table `wechat_user` */

DROP TABLE IF EXISTS `wechat_user`;

CREATE TABLE `wechat_user` (
  `id` varchar(50) NOT NULL,
  `user` varchar(100) DEFAULT NULL COMMENT '账号',
  `balance` float(10,2) DEFAULT NULL COMMENT '余额',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `head_img` varchar(240) DEFAULT NULL COMMENT '头像路径',
  `nicheng` varchar(200) DEFAULT NULL COMMENT '昵称',
  `qianming` varchar(200) DEFAULT NULL COMMENT '签名',
  `qq` varchar(100) DEFAULT NULL COMMENT 'QQ',
  `wechat` varchar(200) DEFAULT NULL COMMENT '微信号',
  `zhifubao` varchar(200) DEFAULT NULL COMMENT '支付宝',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wechat_user` */

insert  into `wechat_user`(`id`,`user`,`balance`,`create_time`,`head_img`,`nicheng`,`qianming`,`qq`,`wechat`,`zhifubao`,`phone`,`email`) values ('ocJ1B5moezUBmSJqPw0rJ4JNl3ww','伸手不见五指的黑夜',10000.00,'2019-03-14 21:24:52',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `xiazhu_table` */

DROP TABLE IF EXISTS `xiazhu_table`;

CREATE TABLE `xiazhu_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openId` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '微信openId',
  `qihao` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '期号',
  `number` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '下注号码',
  `numType` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '下注类型',
  `createTime` datetime DEFAULT NULL COMMENT '下注时间',
  `domoney` float(10,2) DEFAULT NULL COMMENT '下注金额',
  `status` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态 0、未开奖 1、已开奖',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `xiazhu_table` */

/*Table structure for table `yushenumber` */

DROP TABLE IF EXISTS `yushenumber`;

CREATE TABLE `yushenumber` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `qihao` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `openumber` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creatime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `yushenumber` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
