/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.6.24 : Database - navigation
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`navigation` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `navigation`;

/*Table structure for table `t_category` */

DROP TABLE IF EXISTS `t_category`;

CREATE TABLE `t_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(255) DEFAULT NULL COMMENT '导航 类型名称',
  `bg_image_url` char(255) DEFAULT NULL COMMENT '网站导航类目背景图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_category` */

/*Table structure for table `t_website` */

DROP TABLE IF EXISTS `t_website`;

CREATE TABLE `t_website` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cate_id` int(11) DEFAULT NULL COMMENT '外键，网站类目id',
  `name` char(255) DEFAULT NULL COMMENT '网站 名称',
  `url` char(255) DEFAULT NULL COMMENT '网站链接',
  `bg_image_url` char(255) DEFAULT NULL COMMENT '网站卡片背景图片',
  `bg_color` char(255) DEFAULT NULL COMMENT '网站卡片背景颜色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_website` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
