/*
Navicat MySQL Data Transfer

Source Server         : family
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2016-12-20 18:26:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog_admin_user
-- ----------------------------
DROP TABLE IF EXISTS `blog_admin_user`;
CREATE TABLE `blog_admin_user` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BAU_USER_NAME` varchar(32) NOT NULL COMMENT '用户名',
  `BAU_PASSWORD` varchar(32) NOT NULL COMMENT '密码',
  `BAU_NAME` varchar(32) DEFAULT NULL COMMENT '姓名',
  `BAU_SEX` char(1) DEFAULT NULL COMMENT '性别(0:女 1:男)',
  `BAU_ADDRESS` varchar(32) DEFAULT NULL COMMENT '地址',
  `BAU_DIRTHDAY` datetime DEFAULT NULL COMMENT '生日',
  `BAU_MOBILE` varchar(20) DEFAULT NULL COMMENT '手机号',
  `BAU_MAIL` varchar(32) NOT NULL COMMENT '邮箱',
  `BAU_WECHAT` varchar(32) DEFAULT NULL COMMENT '微信号',
  `BAU_SKETCH` varchar(255) DEFAULT NULL COMMENT '描述',
  `BAU_ENCRYPT_SALT` varchar(32) DEFAULT NULL COMMENT '加盐值',
  `BAU_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BAU_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  `BAU_ACTIVATE_TIME` datetime DEFAULT NULL COMMENT '激活时间',
  `BAU_PASSWORD_MODIFY_TIME` datetime DEFAULT NULL COMMENT '密码修改时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='admin用户表';

-- ----------------------------
-- Records of blog_admin_user
-- ----------------------------

-- ----------------------------
-- Table structure for blog_area
-- ----------------------------
DROP TABLE IF EXISTS `blog_area`;
CREATE TABLE `blog_area` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BA_CODE` varchar(20) NOT NULL COMMENT '编号',
  `BA_NAME` varchar(150) NOT NULL COMMENT '名称',
  `BA_LEVEL` char(1) NOT NULL COMMENT '层级(0:国家 1：省 2:市 3:县 4:镇/乡)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地域表';

-- ----------------------------
-- Records of blog_area
-- ----------------------------

-- ----------------------------
-- Table structure for blog_article
-- ----------------------------
DROP TABLE IF EXISTS `blog_article`;
CREATE TABLE `blog_article` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BA_LABEL_ID` varchar(32) DEFAULT NULL COMMENT '类别id',
  `BA_USER_ID` varchar(32) NOT NULL COMMENT '用户id',
  `BA_TITLE` varchar(255) NOT NULL COMMENT '标题',
  `BA_SUMMARY` varchar(255) DEFAULT NULL COMMENT '总结',
  `BA_CONTENT` longtext NOT NULL COMMENT '内容',
  `BA_HOT` char(1) DEFAULT '1' COMMENT '热门文章（0：非热门文章 1：热门文章）',
  `BA_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BA_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章表';

-- ----------------------------
-- Records of blog_article
-- ----------------------------
INSERT INTO `blog_article` VALUES ('a9713876b61e11e6b538fcaa14e16be9', '9c131df99f3e11e6b61efcaa14e16be9', '', '1212', '1', '<p>111</p>', '1', '2016-11-29 18:29:09', '2016-11-29 18:29:09');

-- ----------------------------
-- Table structure for blog_category
-- ----------------------------
DROP TABLE IF EXISTS `blog_category`;
CREATE TABLE `blog_category` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BC_NAME` varchar(100) NOT NULL COMMENT '类别名称',
  `BC_ORDER_NUMBER` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='类目表';

-- ----------------------------
-- Records of blog_category
-- ----------------------------

-- ----------------------------
-- Table structure for blog_client_user
-- ----------------------------
DROP TABLE IF EXISTS `blog_client_user`;
CREATE TABLE `blog_client_user` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BCU_USER_NAME` varchar(32) NOT NULL COMMENT '用户名',
  `BCU_PASSWORD` varchar(32) NOT NULL COMMENT '密码',
  `BCU_NAME` varchar(32) DEFAULT NULL COMMENT '姓名',
  `BCU_SEX` char(1) DEFAULT NULL COMMENT '性别(0:女 1:男)',
  `BCU_ADDRESS` varchar(32) DEFAULT NULL COMMENT '地址',
  `BCU_DIRTHDAY` datetime DEFAULT NULL COMMENT '生日',
  `BCU_MOBILE` varchar(20) DEFAULT NULL COMMENT '手机号',
  `BCU_MAIL` varchar(32) NOT NULL COMMENT '邮箱',
  `BCU_WECHAT` varchar(32) DEFAULT NULL COMMENT '微信号',
  `BCU_SKETCH` varchar(255) DEFAULT NULL COMMENT '描述',
  `BCU_ENCRYPT_SALT` varchar(32) DEFAULT NULL COMMENT '加盐值',
  `BCU_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BCU_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  `BCU_ACTIVATE_TIME` datetime DEFAULT NULL COMMENT '激活时间',
  `BCU_PASSWORD_MODIFY_TIME` datetime DEFAULT NULL COMMENT '密码修改时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='client用户表';

-- ----------------------------
-- Records of blog_client_user
-- ----------------------------

-- ----------------------------
-- Table structure for blog_comment
-- ----------------------------
DROP TABLE IF EXISTS `blog_comment`;
CREATE TABLE `blog_comment` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BC_USER_ID` varchar(32) NOT NULL COMMENT '用户id',
  `BC_ABEL_ID` varchar(32) NOT NULL COMMENT '文章id',
  `BC_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BC_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表';

-- ----------------------------
-- Records of blog_comment
-- ----------------------------

-- ----------------------------
-- Table structure for blog_industry
-- ----------------------------
DROP TABLE IF EXISTS `blog_industry`;
CREATE TABLE `blog_industry` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BI_NAME` varchar(32) NOT NULL COMMENT '名称',
  `BI_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BI_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='行业表';

-- ----------------------------
-- Records of blog_industry
-- ----------------------------

-- ----------------------------
-- Table structure for blog_label
-- ----------------------------
DROP TABLE IF EXISTS `blog_label`;
CREATE TABLE `blog_label` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BL_NAME` varchar(32) NOT NULL COMMENT '名称',
  `BL_ORDER_NUMBER` int(11) DEFAULT NULL COMMENT '排序',
  `BL_USER_ID` varchar(32) NOT NULL COMMENT '用户id',
  `BL_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BL_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签表';

-- ----------------------------
-- Records of blog_label
-- ----------------------------
INSERT INTO `blog_label` VALUES ('9c131df99f3e11e6b61efcaa14e16be9', '甘肃省地方', null, '', '2016-10-31 15:49:53', '2016-11-17 12:32:17');
INSERT INTO `blog_label` VALUES ('a22109db9f2c11e6b61efcaa14e16be9', '中心', null, '', '2016-10-31 13:41:12', '2016-10-31 13:41:12');
INSERT INTO `blog_label` VALUES ('a2b766839f3e11e6b61efcaa14e16be9', '功夫四分公司的', null, '', '2016-10-31 15:50:04', '2016-10-31 15:50:04');
INSERT INTO `blog_label` VALUES ('a574ee9e9f3e11e6b61efcaa14e16be9', '给双方各得', null, '', '2016-10-31 15:50:09', '2016-11-02 12:41:22');
INSERT INTO `blog_label` VALUES ('a6691e2c9f2e11e6b61efcaa14e16be9', '多发发送', null, '', '2016-10-31 13:55:38', '2016-10-31 13:55:38');
INSERT INTO `blog_label` VALUES ('b53e6d5e9f3e11e6b61efcaa14e16be9', '哦婆婆', null, '', '2016-10-31 15:50:35', '2016-10-31 15:50:35');
INSERT INTO `blog_label` VALUES ('b9e898af9f4311e6b61efcaa14e16be9', '更好的辅导费', null, '', '2016-10-31 16:26:30', '2016-10-31 16:26:30');
INSERT INTO `blog_label` VALUES ('bde3c7e89f2f11e6b61efcaa14e16be9', '官方回复', null, '', '2016-10-31 14:03:27', '2016-10-31 14:03:27');
INSERT INTO `blog_label` VALUES ('c10c44eb9f4111e6b61efcaa14e16be9', '的分公司的', null, '', '2016-10-31 16:12:23', '2016-10-31 16:12:23');
INSERT INTO `blog_label` VALUES ('c6c4cdb99f4111e6b61efcaa14e16be9', '、‘’类', null, '', '2016-10-31 16:12:33', '2016-10-31 16:12:33');
INSERT INTO `blog_label` VALUES ('c73516cb9f2d11e6b61efcaa14e16be9', '发送', null, '', '2016-10-31 13:49:24', '2016-10-31 13:49:24');
INSERT INTO `blog_label` VALUES ('c7d5deab9f2e11e6b61efcaa14e16be9', '暗室逢灯', null, '', '2016-10-31 13:56:34', '2016-10-31 13:56:34');
INSERT INTO `blog_label` VALUES ('ca44674b9f2e11e6b61efcaa14e16be9', '发打发', null, '', '2016-10-31 13:56:38', '2016-10-31 13:56:38');
INSERT INTO `blog_label` VALUES ('cc35f8d99f3011e6b61efcaa14e16be9', '地方', null, '', '2016-10-31 14:11:01', '2016-10-31 14:11:01');
INSERT INTO `blog_label` VALUES ('cca697b69f2e11e6b61efcaa14e16be9', '案发时', null, '', '2016-10-31 13:56:42', '2016-10-31 13:56:42');
INSERT INTO `blog_label` VALUES ('cf466ac79f4211e6b61efcaa14e16be9', '发生的', null, '', '2016-10-31 16:19:57', '2016-10-31 16:19:57');
INSERT INTO `blog_label` VALUES ('d0c338159f4211e6b61efcaa14e16be9', '暗室逢灯', null, '', '2016-10-31 16:19:59', '2016-11-02 12:41:34');
INSERT INTO `blog_label` VALUES ('d11a669c9f2b11e6b61efcaa14e16be9', '小豪', null, '', '2016-10-31 13:35:21', '2016-10-31 13:35:21');
INSERT INTO `blog_label` VALUES ('d41721979f4211e6b61efcaa14e16be9', '双方各是多少的', null, '', '2016-10-31 16:20:05', '2016-10-31 16:20:05');
INSERT INTO `blog_label` VALUES ('d7faa0889f4311e6b61efcaa14e16be9', '上的故事的', null, '', '2016-10-31 16:27:21', '2016-10-31 16:27:21');
INSERT INTO `blog_label` VALUES ('dccab66b9f4611e6b61efcaa14e16be9', '申达股份11', null, '', '2016-10-31 16:48:57', '2016-10-31 16:48:57');
INSERT INTO `blog_label` VALUES ('e08b7f019f3e11e6b61efcaa14e16be9', '法案是', null, '', '2016-10-31 15:51:48', '2016-10-31 15:51:48');
INSERT INTO `blog_label` VALUES ('e3be45349f3f11e6b61efcaa14e16be9', '小炮', null, '', '2016-10-31 15:59:03', '2016-10-31 15:59:03');
INSERT INTO `blog_label` VALUES ('e6fd20779f2c11e6b61efcaa14e16be9', '类别', null, '', '2016-10-31 13:43:07', '2016-10-31 13:43:07');
INSERT INTO `blog_label` VALUES ('f5a599be9f4511e6b61efcaa14e16be9', '手电筒官方', null, '', '2016-10-31 16:42:30', '2016-10-31 16:42:30');

-- ----------------------------
-- Table structure for blog_recommend
-- ----------------------------
DROP TABLE IF EXISTS `blog_recommend`;
CREATE TABLE `blog_recommend` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BR_URL` varchar(32) NOT NULL COMMENT '连接',
  `BR_PICTURE` varchar(32) DEFAULT NULL COMMENT '图片',
  `BR_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BR_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推荐表';

-- ----------------------------
-- Records of blog_recommend
-- ----------------------------

-- ----------------------------
-- Table structure for blog_resource
-- ----------------------------
DROP TABLE IF EXISTS `blog_resource`;
CREATE TABLE `blog_resource` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BR_NAME` varchar(100) NOT NULL COMMENT '资源名称',
  `BR_URL` varchar(100) NOT NULL COMMENT '资源地址',
  `BR_STATUS` char(1) NOT NULL COMMENT '状态0：显示 1：不显示 ',
  `BR_LEVEL` char(1) NOT NULL COMMENT '（层级：0 顶级 1 子级） ',
  `BR_PARENT_ID` varchar(32) NOT NULL COMMENT '父级ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT=' 杂项表 ';

-- ----------------------------
-- Records of blog_resource
-- ----------------------------
INSERT INTO `blog_resource` VALUES ('05aeecc4a24a11e6aeb7fcaa14e16be9', '类别', '/admin/category/page', '0', '1', '540b6f67a24911e6aeb7fcaa14e16be9');
INSERT INTO `blog_resource` VALUES ('362e555ca24a11e6aeb7fcaa14e16be9', '账户管理', '#', '0', '1', '73d98b68a23011e6aeb7fcaa14e16be9');
INSERT INTO `blog_resource` VALUES ('428c9bc5a24a11e6aeb7fcaa14e16be9', '个人资料', '/admin/user/edit', '0', '1', '73d98b68a23011e6aeb7fcaa14e16be9');
INSERT INTO `blog_resource` VALUES ('5000168da24a11e6aeb7fcaa14e16be9', '账户中心', '#', '0', '1', '73d98b68a23011e6aeb7fcaa14e16be9');
INSERT INTO `blog_resource` VALUES ('540b6f67a24911e6aeb7fcaa14e16be9', '应用管理', '#', '0', '0', '#');
INSERT INTO `blog_resource` VALUES ('57c78c22a4bc11e6a2c0fcaa14e16be9', '资源操作', '/admin/resource/page', '0', '1', 'ce5e0b70a4bb11e6a2c0fcaa14e16be9');
INSERT INTO `blog_resource` VALUES ('73d98b68a23011e6aeb7fcaa14e16be9', '用户管理', '#', '0', '0', '#');
INSERT INTO `blog_resource` VALUES ('8c84a14ba24911e6aeb7fcaa14e16be9', '配置管理', '#', '1', '0', '#');
INSERT INTO `blog_resource` VALUES ('ce5e0b70a4bb11e6a2c0fcaa14e16be9', '资源管理', '#', '0', '0', '#');
INSERT INTO `blog_resource` VALUES ('d2c6eb35a24a11e6aeb7fcaa14e16be9', '文章管理', '#', '0', '0', '#');
INSERT INTO `blog_resource` VALUES ('dd224137ac9711e685e3fcaa14e16be9', '文章列表', '/admin/article/list', '0', '1', 'd2c6eb35a24a11e6aeb7fcaa14e16be9');
INSERT INTO `blog_resource` VALUES ('e10aa26ea24a11e6aeb7fcaa14e16be9', '评论管理', '#', '1', '0', '#');
INSERT INTO `blog_resource` VALUES ('e38f09e7a24911e6aeb7fcaa14e16be9', '业务统计', '#', '1', '0', '#');

-- ----------------------------
-- Table structure for blog_sundry
-- ----------------------------
DROP TABLE IF EXISTS `blog_sundry`;
CREATE TABLE `blog_sundry` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BS_CONTENT` varchar(255) NOT NULL COMMENT '内容',
  `BS_STATUS` char(1) NOT NULL COMMENT '状态 0：闲言碎语 1生活感悟 2 名言金句 3 人生体会 4时间轴',
  `BS_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BS_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='杂项表';

-- ----------------------------
-- Records of blog_sundry
-- ----------------------------

-- ----------------------------
-- Table structure for blog_user
-- ----------------------------
DROP TABLE IF EXISTS `blog_user`;
CREATE TABLE `blog_user` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `BU_USER_NAME` varchar(32) NOT NULL COMMENT '用户名',
  `BU_PASSWORD` varchar(32) NOT NULL COMMENT '密码',
  `BU_NAME` varchar(32) DEFAULT NULL COMMENT '姓名',
  `BU_SEX` char(1) DEFAULT NULL COMMENT '性别(0:女 1:男)',
  `BU_ADDRESS` varchar(32) DEFAULT NULL COMMENT '地址',
  `BU_DIRTHDAY` datetime DEFAULT NULL COMMENT '生日',
  `BU_MOBILE` varchar(20) DEFAULT NULL COMMENT '手机号',
  `BU_MAIL` varchar(32) NOT NULL COMMENT '邮箱',
  `BU_WECHAT` varchar(32) DEFAULT NULL COMMENT '微信号',
  `BU_SKETCH` varchar(255) DEFAULT NULL COMMENT '描述',
  `BU_ENCRYPT_SALT` varchar(32) NOT NULL COMMENT '加盐值',
  `BU_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `BU_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of blog_user
-- ----------------------------
INSERT INTO `blog_user` VALUES ('faaabc56c5b111e6bcddfcaa14e16be9', '论倾添', 'ae8d5af8101428d35323b9440364b697', '黎力豪', '1', null, '1993-07-24 00:00:00', '15381072474', '1816604387@163.com', '740641026', '哦呦。不错哦·~~', '6206856f28573361ee38126ea0159d32', '2016-12-19 14:11:29', '2016-12-19 14:11:29');
