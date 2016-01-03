/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50546
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50546
 File Encoding         : utf-8

 Date: 01/03/2016 18:03:35 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `showcase_id_card`
-- ----------------------------
DROP TABLE IF EXISTS `showcase_id_card`;
CREATE TABLE `showcase_id_card` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `showcase_id_card`
-- ----------------------------
BEGIN;
INSERT INTO `showcase_id_card` VALUES ('1', '430703199009037578');
COMMIT;

-- ----------------------------
--  Table structure for `showcase_image_item`
-- ----------------------------
DROP TABLE IF EXISTS `showcase_image_item`;
CREATE TABLE `showcase_image_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(300) DEFAULT NULL,
  `image_pkg_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `showcase_image_item`
-- ----------------------------
BEGIN;
INSERT INTO `showcase_image_item` VALUES ('1', 'http://1.jpg', '1'), ('2', 'http://2.jpg', '1');
COMMIT;

-- ----------------------------
--  Table structure for `showcase_image_pkg`
-- ----------------------------
DROP TABLE IF EXISTS `showcase_image_pkg`;
CREATE TABLE `showcase_image_pkg` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `showcase_image_pkg`
-- ----------------------------
BEGIN;
INSERT INTO `showcase_image_pkg` VALUES ('1');
COMMIT;

-- ----------------------------
--  Table structure for `showcase_user`
-- ----------------------------
DROP TABLE IF EXISTS `showcase_user`;
CREATE TABLE `showcase_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `id_card_id` bigint(20) DEFAULT NULL,
  `image_pkg_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `showcase_user`
-- ----------------------------
BEGIN;
INSERT INTO `showcase_user` VALUES ('1', 'caizhengda', '1', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
