/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50617
Source Host           : 127.0.0.1:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2018-07-02 11:31:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '下单用户id',
  `number` varchar(32) NOT NULL COMMENT '订单号',
  `createtime` datetime NOT NULL COMMENT '创建订单时间',
  `note` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_orders_1` (`user_id`),
  CONSTRAINT `FK_orders_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('3', '1', '1000010', '2015-02-04 13:22:35', null);
INSERT INTO `orders` VALUES ('4', '1', '1000011', '2015-02-03 13:22:41', null);
INSERT INTO `orders` VALUES ('5', '10', '1000012', '2015-02-12 16:13:23', null);

-- ----------------------------
-- Table structure for tb_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_info`;
CREATE TABLE `tb_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '信息的标题',
  `type` varchar(255) DEFAULT NULL COMMENT '信息的分类',
  `userId` int(11) DEFAULT NULL COMMENT '发布的用户ID',
  `createDate` datetime DEFAULT NULL COMMENT '信息发布的时间',
  `status` int(11) DEFAULT NULL COMMENT '发布状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_info
-- ----------------------------
INSERT INTO `tb_info` VALUES ('1', 'adaa', 'aaaa', '1', '2018-06-22 11:29:12', '2');
INSERT INTO `tb_info` VALUES ('5', 'nihao', '行业动态', '16', '2018-07-02 10:17:59', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名称',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `address` varchar(256) DEFAULT NULL COMMENT '地址',
  `password` varchar(10) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王五', null, '2', null, null);
INSERT INTO `user` VALUES ('10', '张三', '2014-07-10', '1', '北京市', null);
INSERT INTO `user` VALUES ('16', '张小明', null, '1', '河南郑州', null);
INSERT INTO `user` VALUES ('22', '陈小明', null, '1', '河南郑州', null);
INSERT INTO `user` VALUES ('24', '张三丰', null, '1', '河南郑州', null);
INSERT INTO `user` VALUES ('25', '陈小明', null, '1', '河南郑州', null);
INSERT INTO `user` VALUES ('26', '王五', null, null, null, null);
INSERT INTO `user` VALUES ('27', '通用mapper真牛', null, null, '我是通用mapper增加的数据', null);
INSERT INTO `user` VALUES ('28', '通用mapper真牛', null, null, '我是通用mapper增加的数据', null);
INSERT INTO `user` VALUES ('29', '通用mapper真牛', null, null, '我是通用mapper增加的数据', null);
INSERT INTO `user` VALUES ('30', 'admin', null, null, null, 'admin');
