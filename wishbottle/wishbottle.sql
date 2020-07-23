/*
SQLyog Professional v12.09 (64 bit)
MySQL - 8.0.18 : Database - wishbottle
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`wishbottle` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `wishbottle`;

/*Table structure for table `administrator_info` */

DROP TABLE IF EXISTS `administrator_info`;

CREATE TABLE `administrator_info` (
  `id` int(11) NOT NULL,
  `account` varchar(255) DEFAULT NULL,
  `psd` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `administrator_info` */

insert  into `administrator_info`(`id`,`account`,`psd`,`type`) values (0,'张三','111',0),(1,'李四','123456',1),(2,'admin','123',NULL),(5,'zzz','zzz',NULL),(6,'zz','111',NULL);

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (11),(11);

/*Table structure for table `tree_hole` */

DROP TABLE IF EXISTS `tree_hole`;

CREATE TABLE `tree_hole` (
  `id` int(11) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `creat_time` datetime(6) DEFAULT NULL,
  `goods` int(11) DEFAULT NULL,
  `writer_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tree_hole` */

insert  into `tree_hole`(`id`,`content`,`creat_time`,`goods`,`writer_id`) values (0,'疫情什么时候结束',NULL,1,'zzz'),(1,'想吃火锅',NULL,1,'sss'),(2,'武汉加油',NULL,2,'yyy');

/*Table structure for table `tree_reply` */

DROP TABLE IF EXISTS `tree_reply`;

CREATE TABLE `tree_reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `answered_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `replyer_id` int(11) DEFAULT NULL,
  `tree_hole_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tree_reply` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`age`,`city`,`gender`,`name`,`picture`) values (0,18,'武汉',0,'zzz',NULL),(1,20,'北京',1,'yyy',NULL),(2,24,'深圳',0,'sss',NULL),(3,9,'广州',0,'ddd',NULL);

/*Table structure for table `wish_bottle` */

DROP TABLE IF EXISTS `wish_bottle`;

CREATE TABLE `wish_bottle` (
  `id` int(11) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `writer_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wish_bottle` */

insert  into `wish_bottle`(`id`,`content`,`status`,`writer_id`) values (0,'希望疫情结束',0,'zzz'),(1,'测试一下',1,'yyy'),(2,'再次测试一下',0,'sss');

/*Table structure for table `wish_reply` */

DROP TABLE IF EXISTS `wish_reply`;

CREATE TABLE `wish_reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `answered_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `replyer_id` int(11) DEFAULT NULL,
  `wish_bottle_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wish_reply` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
