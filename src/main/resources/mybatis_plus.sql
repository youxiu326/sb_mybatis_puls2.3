/*
Navicat MySQL Data Transfer

Source Server         : 阿里云
Source Server Version : 50724
Source Host           : youxiu326.xin:3306
Source Database       : mybatis_plus

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-02-17 15:59:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_employee
-- ----------------------------
DROP TABLE IF EXISTS `tbl_employee`;
CREATE TABLE `tbl_employee` (
  `id` varchar(20) NOT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_employee
-- ----------------------------
INSERT INTO `tbl_employee` VALUES ('1', '李老师', 'youxiu326@163.com', '1', '35', '1');
INSERT INTO `tbl_employee` VALUES ('1096995791036706818', 'MP', 'mp@atguigu.com', null, null, '1');
INSERT INTO `tbl_employee` VALUES ('1096998099921383425', '宋老师', 'sls@atguigu.com', '1', '35', '1');
INSERT INTO `tbl_employee` VALUES ('1096999885201649665', '玛利亚老师', 'mly@sina.com', '0', '22', null);
INSERT INTO `tbl_employee` VALUES ('1097000111899598849', '玛利亚老师', 'mly@sina.com', '0', '22', null);
INSERT INTO `tbl_employee` VALUES ('2', 'Jerry', 'jerry@atguigu.com', '0', '25', '1');
INSERT INTO `tbl_employee` VALUES ('3', 'TomAA', 'tomAA@sina.com', '1', '22', '3');
INSERT INTO `tbl_employee` VALUES ('4', '苍老师', 'cls@sina.com', '0', '35', '1');

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', '小日', 'aaaaaa@.qq.com', '28', '1');
INSERT INTO `tbl_user` VALUES ('2', '小日2', 'aaaaaa@.qq.com', '22', '1');
INSERT INTO `tbl_user` VALUES ('3', '小日3', 'abbbaa@.qq.com', '22', '-1');
INSERT INTO `tbl_user` VALUES ('4', 'youxiu326', 'niubi@.qq.com', '22', null);
