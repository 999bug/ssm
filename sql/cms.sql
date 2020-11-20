/*
Navicat MySQL Data Transfer

Source Server         : leyou_192.168.194.131
Source Server Version : 50173
Source Host           : 192.168.194.131:3306
Source Database       : cms

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2020-11-20 17:24:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_score`
-- ----------------------------
DROP TABLE IF EXISTS `t_score`;
CREATE TABLE `t_score` (
  `score_id` int(11) NOT NULL AUTO_INCREMENT,
  `score_value` int(11) DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`score_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_score
-- ----------------------------
INSERT INTO `t_score` VALUES ('1', '100', '16130130', '1');
INSERT INTO `t_score` VALUES ('3', '57', '16130131', '1');
INSERT INTO `t_score` VALUES ('5', '34', '16130130', '3');
INSERT INTO `t_score` VALUES ('7', '66', '201743710112', '1');
INSERT INTO `t_score` VALUES ('8', '55', '201743710112', '2');
INSERT INTO `t_score` VALUES ('9', '76', '201743710112', '4');
INSERT INTO `t_score` VALUES ('10', '87', '201743710112', '5');
INSERT INTO `t_score` VALUES ('11', '45', '201743710112', '6');
INSERT INTO `t_score` VALUES ('12', '76', '201743710111', '1');
INSERT INTO `t_score` VALUES ('13', '78', '201743710111', '2');
INSERT INTO `t_score` VALUES ('14', '87', '201743710111', '3');
INSERT INTO `t_score` VALUES ('15', '99', '201743710111', '5');
INSERT INTO `t_score` VALUES ('16', '89', '201743710111', '6');

-- ----------------------------
-- Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `student_no` bigint(20) NOT NULL,
  `student_name` varchar(40) DEFAULT NULL,
  `student_sex` varchar(2) DEFAULT NULL,
  `stu_pass` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`student_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('16130130', '李四3', '女', '16130130');
INSERT INTO `t_student` VALUES ('16130131', '王六', '女', '16130131');
INSERT INTO `t_student` VALUES ('201743710111', '李石岩', '男', '201743710111');
INSERT INTO `t_student` VALUES ('201743710112', '马保国', '男', '201743710112');

-- ----------------------------
-- Table structure for `t_subject`
-- ----------------------------
DROP TABLE IF EXISTS `t_subject`;
CREATE TABLE `t_subject` (
  `subject_id` int(11) NOT NULL,
  `subject_name` varchar(20) DEFAULT NULL,
  `subject_type` varchar(10) DEFAULT NULL,
  `subject_info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_subject
-- ----------------------------
INSERT INTO `t_subject` VALUES ('1', '计算机导论', '必修', '计算机导论是计算机专业必修的一门基础课');
INSERT INTO `t_subject` VALUES ('2', '操作系统', '必修', '操作系统是计算机基础');
INSERT INTO `t_subject` VALUES ('3', '编译原理', '必修', '编译原理是计算机底层基础');
INSERT INTO `t_subject` VALUES ('4', '计算机组成原理', '选修', '计算机组成原理简单介绍了。。。');
INSERT INTO `t_subject` VALUES ('5', 'Java 并发编程的艺术', '必修', '深入理解多并发的底层源码实现');
INSERT INTO `t_subject` VALUES ('6', '深入理解JVM的实现', '必修', '了解JVM的底层原理剖析源码');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(40) DEFAULT NULL,
  `pass_word` varchar(20) DEFAULT NULL,
  `identify` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '张三', '123456', '0');
INSERT INTO `t_user` VALUES ('2', '李石岩', '123456', '0');
