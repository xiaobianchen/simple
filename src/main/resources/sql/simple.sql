/*
MySQL Data Transfer
Source Host: localhost
Source Database: simple
Target Host: localhost
Target Database: simple
Date: 2016/4/12 17:27:25
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `roleDesc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`roleName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '身份证号码',
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '登录名',
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '密码',
  `realName` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '真实姓名',
  `phone` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `role` VALUES ('admin', '管理员');
INSERT INTO `role` VALUES ('ebay', 'ebay123');
INSERT INTO `role` VALUES ('guest', '临时访问22');
INSERT INTO `role` VALUES ('tester', 'tester222222');
INSERT INTO `user` VALUES ('340822198905045235', 'ch751652064', 'ch4890467', 'chenxiaobian', '18601705642');
INSERT INTO `user` VALUES ('340822198905045237', 'ebay', 'ebay123', 'ebay', '18823231128');
INSERT INTO `user` VALUES ('340822198905045238', 'test', '', 'tester', '18601705646');
INSERT INTO `user` VALUES ('421012131988192012', 'admin', 'admin123', 'admin', '18812312321');
