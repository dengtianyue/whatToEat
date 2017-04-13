/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : whatoeat

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-04-13 14:02:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dislikelist`
-- ----------------------------
DROP TABLE IF EXISTS `dislikelist`;
CREATE TABLE `dislikelist` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `Uid` int(11) DEFAULT NULL,
  `Fid` int(11) DEFAULT NULL,
  PRIMARY KEY (`did`),
  KEY `Uid` (`Uid`),
  KEY `Fid` (`Fid`),
  CONSTRAINT `dislikelist_ibfk_1` FOREIGN KEY (`Uid`) REFERENCES `users` (`Uid`) ON DELETE CASCADE,
  CONSTRAINT `dislikelist_ibfk_2` FOREIGN KEY (`Fid`) REFERENCES `foods` (`Fid`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dislikelist
-- ----------------------------
INSERT INTO `dislikelist` VALUES ('1', '1', '2');
INSERT INTO `dislikelist` VALUES ('2', '2', '1');
INSERT INTO `dislikelist` VALUES ('3', '1', '4');

-- ----------------------------
-- Table structure for `foods`
-- ----------------------------
DROP TABLE IF EXISTS `foods`;
CREATE TABLE `foods` (
  `Fid` int(11) NOT NULL AUTO_INCREMENT,
  `FoodName` varchar(20) DEFAULT NULL,
  `FoodType` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Fid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of foods
-- ----------------------------
INSERT INTO `foods` VALUES ('1', '肉末茄子', '半荤');
INSERT INTO `foods` VALUES ('2', '炒青菜', '素');
INSERT INTO `foods` VALUES ('3', '红烧肉', '荤');
INSERT INTO `foods` VALUES ('4', '肉沫涨蛋', '半荤');
INSERT INTO `foods` VALUES ('5', '溜肉段', '荤');
INSERT INTO `foods` VALUES ('6', '锅包肉', '荤');

-- ----------------------------
-- Table structure for `likelist`
-- ----------------------------
DROP TABLE IF EXISTS `likelist`;
CREATE TABLE `likelist` (
  `Lid` int(11) NOT NULL AUTO_INCREMENT,
  `Uid` int(11) DEFAULT NULL,
  `Fid` int(11) DEFAULT NULL,
  PRIMARY KEY (`Lid`),
  KEY `Uid` (`Uid`),
  KEY `Fid` (`Fid`),
  CONSTRAINT `likelist_ibfk_1` FOREIGN KEY (`Uid`) REFERENCES `users` (`Uid`) ON DELETE CASCADE,
  CONSTRAINT `likelist_ibfk_2` FOREIGN KEY (`Fid`) REFERENCES `foods` (`Fid`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of likelist
-- ----------------------------
INSERT INTO `likelist` VALUES ('2', '1', '3');
INSERT INTO `likelist` VALUES ('3', '2', '3');
INSERT INTO `likelist` VALUES ('4', '2', '1');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `Uid` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'dengtianyue', '123456');
INSERT INTO `users` VALUES ('2', 'qingqing', '123456');
