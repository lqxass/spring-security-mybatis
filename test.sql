/*
Navicat MySQL Data Transfer

Source Server         : new Connection
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2020-02-07 23:25:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(40) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'lqxass', '123456');
INSERT INTO `user` VALUES ('2', 'admin', '$2a$10$MeoBp2bW9cAx42Tt4uV7tu8mSLuhVG2gg/gL2L0ne2Ln2u/NgPIN6');
INSERT INTO `user` VALUES ('3', 'user', '123456');
