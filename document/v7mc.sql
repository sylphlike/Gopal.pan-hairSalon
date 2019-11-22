/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.7.24 : Database - v7mc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`v7mc` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `v7mc`;

/*Table structure for table `v7_brand` */

DROP TABLE IF EXISTS `v7_brand`;

CREATE TABLE `v7_brand` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_b_name` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '品牌名称',
  `v7_b_type` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '品牌可有商品大类',
  `v7_b_brand_declare` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '品牌说明',
  `v7_b_status` int(11) DEFAULT NULL COMMENT '品牌状态',
  `v7_b_create_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `v7_b_crate_time` datetime DEFAULT NULL COMMENT '创建时间',
  `v7_b_update_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `V7_b_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `v7_b_remarks` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='品牌表';

/*Data for the table `v7_brand` */

insert  into `v7_brand`(`id`,`v7_b_name`,`v7_b_type`,`v7_b_brand_declare`,`v7_b_status`,`v7_b_create_user`,`v7_b_crate_time`,`v7_b_update_user`,`V7_b_update_time`,`v7_b_remarks`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('114452a338c44080ab57fa86f5c66a5c','测试品牌1','洗发类,烫发类','测试品牌1',1,'admin','2018-11-27 22:43:39',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL),('7ef4950680a8419e8f5731ad2e2e63e1','测试品牌02','洗发类,烫发类,染发类,其它类','测试品牌02',1,'admin','2018-12-05 21:38:14',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_card` */

DROP TABLE IF EXISTS `v7_card`;

CREATE TABLE `v7_card` (
  `ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键ID',
  `v7_c_type` int(11) DEFAULT NULL COMMENT '会员卡类型',
  `v7_c_surplus_amount` double(8,2) DEFAULT NULL COMMENT '卡余额/剩余次数',
  `v7_c_recharge_amount` double(8,2) DEFAULT NULL COMMENT '累计充值金额',
  `v7_c_tintegral` int(11) DEFAULT NULL COMMENT '累计积分（记次卡无积分）',
  `v7_c_status` int(11) DEFAULT NULL COMMENT '状态',
  `v7_pk_member` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '会员ID',
  `v7_c_remarks` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_3` (`v7_pk_member`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`v7_pk_member`) REFERENCES `v7_member` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='会员卡表';

/*Data for the table `v7_card` */

insert  into `v7_card`(`ID`,`v7_c_type`,`v7_c_surplus_amount`,`v7_c_recharge_amount`,`v7_c_tintegral`,`v7_c_status`,`v7_pk_member`,`v7_c_remarks`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('7f8dce4baf7c4644af8131263d41ae14',1,11076.00,11100.00,0,1,'8d0da482595342f28d26037db1b6d6b0','',NULL,NULL,NULL,NULL,NULL),('a0337fbc7a804edba02d2d27bba28829',5,30.00,500.00,0,1,'8d0da482595342f28d26037db1b6d6b0','',NULL,NULL,NULL,NULL,NULL),('d3ffc8bf765e4f569a70fb040306c8e9',2,30000.00,30000.00,0,1,'f860661624534c5195d9300712da2331',NULL,NULL,NULL,NULL,NULL,NULL),('ed3778b0511d4c6bb8fd37178874375f',3,1100.00,1100.00,0,1,'f4f9ae898a464310920a0d7bd0f7fb0b','',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_charge` */

DROP TABLE IF EXISTS `v7_charge`;

CREATE TABLE `v7_charge` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_c_month` date DEFAULT NULL COMMENT '扣款月份',
  `v7_c_mnum` int(11) DEFAULT NULL COMMENT '员工编号',
  `v7_c_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '员工姓名',
  `v7_c_positionf` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '员工职位',
  `v7_c_charge_money` double(8,2) DEFAULT NULL COMMENT '扣款金额',
  `v7_c_charge_explain` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '扣款说明',
  `v7_c_oper_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `v7_c_oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='扣款表';

/*Data for the table `v7_charge` */

/*Table structure for table `v7_crecard` */

DROP TABLE IF EXISTS `v7_crecard`;

CREATE TABLE `v7_crecard` (
  `ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'ID',
  `v7_r_otype` varchar(4) COLLATE utf8_bin DEFAULT NULL COMMENT '操作类型(充值/消费)',
  `v7_r_cardtype` int(11) DEFAULT NULL COMMENT '卡类型',
  `v7_r_omoney` double(8,2) DEFAULT NULL COMMENT '操作金额',
  `v7_r_oper_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `v7_r_oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `v7_r_remarks` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `v7_pk_card` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '会员卡ID',
  `extends1` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_2` (`v7_pk_card`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`v7_pk_card`) REFERENCES `v7_card` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='会员卡操作记录';

/*Data for the table `v7_crecard` */

insert  into `v7_crecard`(`ID`,`v7_r_otype`,`v7_r_cardtype`,`v7_r_omoney`,`v7_r_oper_user`,`v7_r_oper_time`,`v7_r_remarks`,`v7_pk_card`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('111c4a6f53e84571b404d046eae9f5aa','1',1,1000.00,'admin','2018-11-27 22:08:59','','7f8dce4baf7c4644af8131263d41ae14',NULL,NULL,NULL,NULL,NULL),('1a604f7c5361454ea47e49447d39e64a','1',1,100.00,'admin','2018-04-14 13:41:42','','7f8dce4baf7c4644af8131263d41ae14',NULL,NULL,NULL,NULL,NULL),('32d0d713a3c44dc09ab0a05920e0eccf','2',1,24.00,'admin','2018-11-25 17:32:52',NULL,'7f8dce4baf7c4644af8131263d41ae14',NULL,NULL,NULL,NULL,NULL),('5584d5ac048a4b459ff8ab3b5787f003','1',3,1000.00,'admin','2018-12-05 21:23:25','','ed3778b0511d4c6bb8fd37178874375f',NULL,NULL,NULL,NULL,NULL),('9350254326614f62941e69b990c118fc','1',1,10000.00,'admin','2018-04-14 11:02:46',NULL,'7f8dce4baf7c4644af8131263d41ae14',NULL,NULL,NULL,NULL,NULL),('acaa59f8a9f14957b0efccce95e83abe','1',3,100.00,'admin','2018-12-05 21:18:02',NULL,'ed3778b0511d4c6bb8fd37178874375f',NULL,NULL,NULL,NULL,NULL),('b901f9727d0941038d40534f6aedbfe3','1',5,500.00,'admin','2018-11-27 22:08:22',NULL,'a0337fbc7a804edba02d2d27bba28829',NULL,NULL,NULL,NULL,NULL),('bdad7c81937a49ecab9e269a8a05e718','1',2,30000.00,'admin','2018-12-05 21:45:57',NULL,'d3ffc8bf765e4f569a70fb040306c8e9',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_employee` */

DROP TABLE IF EXISTS `v7_employee`;

CREATE TABLE `v7_employee` (
  `ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键ID',
  `v7_e_num` int(11) DEFAULT NULL COMMENT '员工编号',
  `v7_e_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '员工姓名',
  `v7_e_real_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '员工真实名称',
  `v7_e_sex` int(11) DEFAULT NULL COMMENT '性别',
  `v7_e_birthday` date DEFAULT NULL COMMENT '生日',
  `v7_e_phone` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '电话号码',
  `v7_e_position` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '员工职位',
  `v7_e_join_date` date DEFAULT NULL COMMENT '入职时间',
  `v7_e_password` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `v7_e_status` int(11) DEFAULT NULL COMMENT '状态',
  `v7_e_last_login` datetime DEFAULT NULL COMMENT '上次登录时间',
  `v7_e_last_ip` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '上次登录IP地址',
  `v7_e_sum_login` int(11) DEFAULT NULL COMMENT '总登录次数',
  `v7_e_online_time` datetime DEFAULT NULL COMMENT '总在线时长',
  `v7_e_remarks` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `v7_e_create_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `v7_e_create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `v7_e_update_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `v7_e_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `extends1` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='员工表';

/*Data for the table `v7_employee` */

insert  into `v7_employee`(`ID`,`v7_e_num`,`v7_e_name`,`v7_e_real_name`,`v7_e_sex`,`v7_e_birthday`,`v7_e_phone`,`v7_e_position`,`v7_e_join_date`,`v7_e_password`,`v7_e_status`,`v7_e_last_login`,`v7_e_last_ip`,`v7_e_sum_login`,`v7_e_online_time`,`v7_e_remarks`,`v7_e_create_user`,`v7_e_create_date`,`v7_e_update_user`,`v7_e_update_time`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('1',10020,'admin','admin',1,NULL,NULL,NULL,NULL,'25d55ad283aa400af464c76d713c07ad',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('2a15f736ff5e45118fd694115cd0c6e1',10021,'测试员工1','测试员工1',1,'2006-03-17','15923508360','3','2012-04-14','25d55ad283aa400af464c76d713c07ad',1,NULL,NULL,NULL,NULL,'测试员工1','admin','2018-04-14 11:01:48',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('a606d49adf354afc8a52d4ef6a536f36',10022,'技师1','技师1',1,'2013-06-05','15923508367','7,8','2018-08-28','',1,NULL,NULL,NULL,NULL,'','admin','2018-11-25 17:32:27','admin','2018-11-27 22:40:30',NULL,NULL,NULL,NULL,NULL),('cdc6468678174e09955649f2599698f3',10020,'测试员工02','李美妍',2,'1992-05-23','15923508123','9','2018-12-05','e10adc3949ba59abbe56e057f20f883e',1,NULL,NULL,NULL,NULL,'李美妍','admin','2018-12-05 21:35:03',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_handle_card` */

DROP TABLE IF EXISTS `v7_handle_card`;

CREATE TABLE `v7_handle_card` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_h_card_num` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作卡号',
  `v7_h_handle_type` int(11) DEFAULT NULL COMMENT '操作类型（1 新开户，2充值）',
  `v7_h_card_type` int(11) DEFAULT NULL COMMENT '卡类型',
  `v7_h_money` double(8,2) DEFAULT NULL COMMENT '操作金额',
  `v7_h_handle_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '办理人',
  `v7_h_oper_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `v7_h_oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `extends1` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='办卡，充值记录表';

/*Data for the table `v7_handle_card` */

insert  into `v7_handle_card`(`id`,`v7_h_card_num`,`v7_h_handle_type`,`v7_h_card_type`,`v7_h_money`,`v7_h_handle_user`,`v7_h_oper_user`,`v7_h_oper_time`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('1d57d9efaa13466db3774c669e9db0b8','7f8dce4baf7c4644af8131263d41ae14',2,1,1000.00,'2a15f736ff5e45118fd694115cd0c6e1','admin','2018-11-27 22:08:59',NULL,NULL,NULL,NULL,NULL),('4b292563aa814677b461a7e83c1a861c','7f8dce4baf7c4644af8131263d41ae14',2,1,100.00,'员工','admin','2018-04-14 13:41:42',NULL,NULL,NULL,NULL,NULL),('80494c1c489749faa2de79e35a182be2','7f8dce4baf7c4644af8131263d41ae14',1,1,10000.00,'2a15f736ff5e45118fd694115cd0c6e1','admin','2018-04-14 11:02:46',NULL,NULL,NULL,NULL,NULL),('b8183ed635d04afeae2f281dd33651e8','ed3778b0511d4c6bb8fd37178874375f',1,3,100.00,'2a15f736ff5e45118fd694115cd0c6e1','admin','2018-12-05 21:18:02',NULL,NULL,NULL,NULL,NULL),('bb07a7ec62724c45afcb5b2d66b01b84','d3ffc8bf765e4f569a70fb040306c8e9',1,2,30000.00,'cdc6468678174e09955649f2599698f3','admin','2018-12-05 21:45:57',NULL,NULL,NULL,NULL,NULL),('e0d57620fb444280bca75dfdd088fc04','ed3778b0511d4c6bb8fd37178874375f',2,3,1000.00,'2a15f736ff5e45118fd694115cd0c6e1','admin','2018-12-05 21:23:25',NULL,NULL,NULL,NULL,NULL),('fcba57dc9de042ebaf1da14320388974','a0337fbc7a804edba02d2d27bba28829',1,5,500.00,'2a15f736ff5e45118fd694115cd0c6e1','admin','2018-11-27 22:08:22',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_member` */

DROP TABLE IF EXISTS `v7_member`;

CREATE TABLE `v7_member` (
  `ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键ID',
  `v7_m_num` int(11) DEFAULT NULL COMMENT '会员编号',
  `v7_m_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '会员名称',
  `v7_m_real_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '会员真实名称',
  `v7_m_sex` int(11) DEFAULT NULL COMMENT '性别',
  `v7_m_birthday` date DEFAULT NULL COMMENT '生日',
  `v7_m_passowrd` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `v7_m_status` int(11) DEFAULT NULL COMMENT '状态',
  `v7_m_phone` varchar(11) COLLATE utf8_bin DEFAULT NULL COMMENT '电话号码',
  `v7_re_c_type` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '冗余会员卡类型',
  `v7_m_create_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `v7_m_crate_time` datetime DEFAULT NULL COMMENT '创建时间',
  `v7_m_update_user` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `V7_m_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `v7_m_remarks` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='会员表';

/*Data for the table `v7_member` */

insert  into `v7_member`(`ID`,`v7_m_num`,`v7_m_name`,`v7_m_real_name`,`v7_m_sex`,`v7_m_birthday`,`v7_m_passowrd`,`v7_m_status`,`v7_m_phone`,`v7_re_c_type`,`v7_m_create_user`,`v7_m_crate_time`,`v7_m_update_user`,`V7_m_update_time`,`v7_m_remarks`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('8d0da482595342f28d26037db1b6d6b0',10020,'测试会员1','测试会员1',1,'2006-03-13','e10adc3949ba59abbe56e057f20f883e',1,'15923508361','1,5','admin','2018-04-14 11:02:46','admin','2018-11-27 22:08:22','测试员工1 添加 测试会员1',NULL,NULL,NULL,NULL,NULL),('f4f9ae898a464310920a0d7bd0f7fb0b',10021,'test001','陈旋凯',2,'1992-12-14','e10adc3949ba59abbe56e057f20f883e',1,'15923508345','3','admin','2018-12-05 21:18:02',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL),('f860661624534c5195d9300712da2331',10022,'test001','测试',1,'2017-02-02','e10adc3949ba59abbe56e057f20f883e',1,'15923508432','2','admin','2018-12-05 21:45:57',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_product` */

DROP TABLE IF EXISTS `v7_product`;

CREATE TABLE `v7_product` (
  `ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'ID',
  `v7_p_brand` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '产品品牌',
  `v7_p_type` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '产品类型',
  `v7_p_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '产品名称',
  `v7_p_unit` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '计量单位',
  `v7_p_standard` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '产品规格',
  `v7_p_agent` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '代理商',
  `v7_p_agent_phone` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '代理商电话',
  `v7_p_status` int(11) DEFAULT NULL COMMENT '状态',
  `v7_p_remarks` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `v7_p_create_user` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `v7_p_crate_time` datetime DEFAULT NULL COMMENT '创建时间',
  `v7_p_update_user` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `v7_p_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `v7_pk_brand` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '品牌ID',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_6` (`v7_pk_brand`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`v7_pk_brand`) REFERENCES `v7_brand` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='产品表';

/*Data for the table `v7_product` */

insert  into `v7_product`(`ID`,`v7_p_brand`,`v7_p_type`,`v7_p_name`,`v7_p_unit`,`v7_p_standard`,`v7_p_agent`,`v7_p_agent_phone`,`v7_p_status`,`v7_p_remarks`,`v7_p_create_user`,`v7_p_crate_time`,`v7_p_update_user`,`v7_p_update_time`,`v7_pk_brand`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('c6fd9eafa1b143f38009fc3456c614f0','测试品牌1','-1','测试产品1','ml','1瓶','重庆女人街','023-55768173',1,'','admin','2018-11-27 22:50:17',NULL,NULL,'114452a338c44080ab57fa86f5c66a5c',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_reception` */

DROP TABLE IF EXISTS `v7_reception`;

CREATE TABLE `v7_reception` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_r_num` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '流水号',
  `v7_r_consumption` int(11) DEFAULT NULL COMMENT '消费方式',
  `v7_r_consumetype` int(11) DEFAULT NULL COMMENT '消费类型',
  `v7_r_memberid` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '会员id',
  `v7_r_cardid` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '使用会员卡id',
  `v7_r_usecardtype` int(11) DEFAULT NULL COMMENT '使用会员卡类型',
  `v7_r_blowWash` double(8,2) DEFAULT NULL COMMENT '洗吹原价',
  `v7_r_blowCutWash` double(8,2) DEFAULT NULL COMMENT '洗剪吹原价',
  `v7_r_permcostprice` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '烫发项目-原价',
  `v7_r_dyehaircostprice` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '染发项目-原价',
  `v7_r_conditionercostprice` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '护发项目-原价',
  `v7_r_sumcostprice` double(8,2) DEFAULT NULL COMMENT '总原价',
  `v7_r_discountprice` double(8,2) DEFAULT NULL COMMENT '折后价',
  `v7_r_discountrate` double(8,2) DEFAULT NULL COMMENT '折扣率',
  `v7_r_payCash4Hedging` double(8,2) DEFAULT NULL COMMENT '对冲卡，应付现',
  `v7_r_payCash` double(8,2) DEFAULT NULL COMMENT '现金支付金额',
  `v7_r_recordnum` int(11) DEFAULT NULL COMMENT '记次卡划卡次数',
  `v7_r_raiseamount` double(8,2) DEFAULT NULL COMMENT '加价产品金额',
  `v7_r_hairstylist` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '服务发型师',
  `v7_r_technician` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '服务技师',
  `v7_r_assistant` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '服务助理',
  `v7_r_productid` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '产品ID',
  `v7_r_sale_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '销售人ID',
  `v7_r_sale_proammount` double(8,2) DEFAULT NULL COMMENT '销售金额',
  `v7_r_sale_count` int(11) DEFAULT NULL COMMENT '销售数量',
  `v7_r_sale_totalprice` double(8,2) DEFAULT NULL COMMENT '销售总价',
  `v7_r_statement_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '结单人',
  `v7_r_statement_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '结单时间',
  `v7_r_remarks` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `extends1` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='前台收银';

/*Data for the table `v7_reception` */

insert  into `v7_reception`(`id`,`v7_r_num`,`v7_r_consumption`,`v7_r_consumetype`,`v7_r_memberid`,`v7_r_cardid`,`v7_r_usecardtype`,`v7_r_blowWash`,`v7_r_blowCutWash`,`v7_r_permcostprice`,`v7_r_dyehaircostprice`,`v7_r_conditionercostprice`,`v7_r_sumcostprice`,`v7_r_discountprice`,`v7_r_discountrate`,`v7_r_payCash4Hedging`,`v7_r_payCash`,`v7_r_recordnum`,`v7_r_raiseamount`,`v7_r_hairstylist`,`v7_r_technician`,`v7_r_assistant`,`v7_r_productid`,`v7_r_sale_user`,`v7_r_sale_proammount`,`v7_r_sale_count`,`v7_r_sale_totalprice`,`v7_r_statement_user`,`v7_r_statement_date`,`v7_r_remarks`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('5bef9f1f5fcf4f52a11d966b5649b708','20181126224802',5,1,'','',NULL,30.00,NULL,NULL,NULL,NULL,30.00,30.00,NULL,NULL,30.00,NULL,NULL,'2a15f736ff5e45118fd694115cd0c6e1','a606d49adf354afc8a52d4ef6a536f36','a606d49adf354afc8a52d4ef6a536f36',NULL,NULL,NULL,NULL,NULL,'admin','2018-11-26 22:48:02',NULL,NULL,NULL,NULL,NULL,NULL),('77b01d3c2d834c169309b6926766696b','20181125173252',1,1,'8d0da482595342f28d26037db1b6d6b0','7f8dce4baf7c4644af8131263d41ae14',1,30.00,NULL,NULL,NULL,NULL,30.00,24.00,NULL,NULL,NULL,NULL,NULL,'2a15f736ff5e45118fd694115cd0c6e1','a606d49adf354afc8a52d4ef6a536f36','a606d49adf354afc8a52d4ef6a536f36',NULL,NULL,NULL,NULL,NULL,'admin','2018-11-25 17:32:52',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_results` */

DROP TABLE IF EXISTS `v7_results`;

CREATE TABLE `v7_results` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_r_month` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '业绩月份',
  `v7_r_eid` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '员工ID',
  `v7_r_mnum` int(11) DEFAULT NULL COMMENT '员工编号',
  `v7_r_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '员工姓名',
  `v7_r_position` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '员工职位',
  `v7_r_bus_results` double(8,2) DEFAULT NULL COMMENT '项目绩效',
  `v7_r_raise_results` double(8,2) DEFAULT NULL COMMENT '加价产品绩效',
  `v7_r_out_results` double(8,2) DEFAULT NULL COMMENT '外卖绩效',
  `v7_r_trans_results` double(8,2) DEFAULT NULL COMMENT '办卡绩效',
  `v7_r_blowwash` int(11) DEFAULT NULL COMMENT '洗吹卡次数',
  `v7_r_blowcutwash` int(11) DEFAULT NULL COMMENT '洗剪吹卡次数',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='业绩表';

/*Data for the table `v7_results` */

insert  into `v7_results`(`id`,`v7_r_month`,`v7_r_eid`,`v7_r_mnum`,`v7_r_name`,`v7_r_position`,`v7_r_bus_results`,`v7_r_raise_results`,`v7_r_out_results`,`v7_r_trans_results`,`v7_r_blowwash`,`v7_r_blowcutwash`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('477507c1d6d14868a75c2483f6005663','2018-11','2a15f736ff5e45118fd694115cd0c6e1',10020,'测试员工1','技术总监',30.00,0.00,0.00,0.00,0,0,NULL,NULL,NULL,NULL,NULL),('957be73a404b4f1bb3bc962f353d15e3','2018-04','2a15f736ff5e45118fd694115cd0c6e1',10020,'测试员工1','技术总监',0.00,0.00,0.00,10000.00,0,0,NULL,NULL,NULL,NULL,NULL),('f486e4f429d44948a6aa34d735bc9486','2018-11','a606d49adf354afc8a52d4ef6a536f36',10020,'技师1','技师,助理',30.00,0.00,0.00,0.00,0,0,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_roll_day_accounts` */

DROP TABLE IF EXISTS `v7_roll_day_accounts`;

CREATE TABLE `v7_roll_day_accounts` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_r_rolling_date` date DEFAULT NULL COMMENT '轧账日期',
  `v7_r_cash` double(8,2) DEFAULT NULL COMMENT '现金收入',
  `v7_r_vipout` double(8,2) DEFAULT NULL COMMENT 'Vip卡划卡金额',
  `v7_r_hedgeout` double(8,2) DEFAULT NULL COMMENT '对冲卡划卡金额',
  `v7_r_hedgecashin` double(8,2) DEFAULT NULL COMMENT '对冲卡现金收入',
  `v7_r_blowwashout` int(11) DEFAULT NULL COMMENT '洗吹卡划卡次数',
  `v7_r_blowcutwashout` int(11) DEFAULT NULL COMMENT '洗剪吹卡划卡次数',
  `v7_r_vipin` int(11) DEFAULT NULL COMMENT 'Vip办卡张数',
  `v7_r_hedgein` int(11) DEFAULT NULL COMMENT '对冲卡办卡张数',
  `v7_r_blowwashin` int(11) DEFAULT NULL COMMENT '洗吹卡办卡张数',
  `v7_r_blowcutwashin` int(11) DEFAULT NULL COMMENT '洗剪吹卡办卡张数',
  `v7_r_cardmoney` double(8,2) DEFAULT NULL COMMENT '充卡，开卡金额',
  `v7_r_raiseamount` double(8,2) DEFAULT NULL COMMENT '加价产品金额',
  `v7_r_takeout` double(8,2) DEFAULT NULL COMMENT '外卖金额',
  `v7_r_total_card` double(8,2) DEFAULT NULL COMMENT '总卡划出',
  `v7_r_total_cash` double(8,2) DEFAULT NULL COMMENT '总现金收入',
  `v7_r_operuser` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '轧账人',
  `v7_r_opertime` datetime DEFAULT NULL COMMENT '轧账时间',
  `extends1` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='日轧账';

/*Data for the table `v7_roll_day_accounts` */

insert  into `v7_roll_day_accounts`(`id`,`v7_r_rolling_date`,`v7_r_cash`,`v7_r_vipout`,`v7_r_hedgeout`,`v7_r_hedgecashin`,`v7_r_blowwashout`,`v7_r_blowcutwashout`,`v7_r_vipin`,`v7_r_hedgein`,`v7_r_blowwashin`,`v7_r_blowcutwashin`,`v7_r_cardmoney`,`v7_r_raiseamount`,`v7_r_takeout`,`v7_r_total_card`,`v7_r_total_cash`,`v7_r_operuser`,`v7_r_opertime`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('73cbd12372834fdbb6d782f392849182','2018-11-26',30.00,0.00,0.00,0.00,0,0,0,0,0,0,0.00,0.00,0.00,NULL,30.00,'admin','2018-11-26 22:55:14',NULL,NULL,NULL,NULL,NULL),('c0945b48273647788dfb28fea85d7015','2018-04-14',0.00,0.00,0.00,0.00,0,0,2,0,0,0,10100.00,0.00,0.00,NULL,10100.00,'admin','2018-04-14 13:50:32',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_roll_month_accounts` */

DROP TABLE IF EXISTS `v7_roll_month_accounts`;

CREATE TABLE `v7_roll_month_accounts` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_m_rolling_date` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '轧账日期',
  `v7_m_cash` double(8,2) DEFAULT NULL COMMENT '现金收入',
  `v7_m_vipout` double(8,2) DEFAULT NULL COMMENT 'Vip卡划卡金额',
  `v7_m_hedgeout` double(8,2) DEFAULT NULL COMMENT '对冲卡划卡金额',
  `v7_m_hedgecashin` double(8,2) DEFAULT NULL COMMENT '对冲卡现金收入',
  `v7_m_blowwashout` int(11) DEFAULT NULL COMMENT '洗吹卡划卡次数',
  `v7_m_blowcutwashout` int(11) DEFAULT NULL COMMENT '洗剪吹卡划卡次数',
  `v7_m_vipin` int(11) DEFAULT NULL COMMENT 'Vip办卡张数',
  `v7_m_hedgein` int(11) DEFAULT NULL COMMENT '对冲卡办卡张数',
  `v7_m_blowwashin` int(11) DEFAULT NULL COMMENT '洗吹卡办卡张数',
  `v7_m_blowcutwashin` int(11) DEFAULT NULL COMMENT '洗剪吹卡办卡张数',
  `v7_m_cardmoney` double(8,2) DEFAULT NULL COMMENT '充卡，开卡金额',
  `v7_m_raiseamount` double(8,2) DEFAULT NULL COMMENT '加价产品金额',
  `v7_m_takeout` double(8,2) DEFAULT NULL COMMENT '外卖金额',
  `v7_m_total_card` double(8,2) DEFAULT NULL COMMENT '总卡划出',
  `v7_m_total_cash` double(8,2) DEFAULT NULL COMMENT '总现金收入',
  `v7_m_operuser` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '轧账人',
  `v7_m_opertime` datetime DEFAULT NULL COMMENT '轧账时间',
  `extends1` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='月轧账';

/*Data for the table `v7_roll_month_accounts` */

/*Table structure for table `v7_salary` */

DROP TABLE IF EXISTS `v7_salary`;

CREATE TABLE `v7_salary` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_s_month` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '薪水月份',
  `v7_s_mnum` int(11) DEFAULT NULL COMMENT '员工编号',
  `v7_s_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '员工姓名',
  `v7_s_position` varchar(60) COLLATE utf8_bin DEFAULT NULL COMMENT '员工职位',
  `v7_s_base_salary` double(8,2) DEFAULT NULL COMMENT '基本薪资',
  `v7_s_pre_salary` double(8,2) DEFAULT NULL COMMENT '绩效薪资',
  `v7_s_out_salary` double(8,2) DEFAULT NULL COMMENT '外卖薪资',
  `v7_s_trans_salary` double(8,2) DEFAULT NULL COMMENT '办卡薪资',
  `v7_s_charge_salary` double(8,2) DEFAULT NULL COMMENT '扣款金额',
  `v7_s_reality_salary` double(8,2) DEFAULT NULL COMMENT '实发金额',
  `v7_s_status` int(11) DEFAULT NULL COMMENT '状态(1 已发，2未发)',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='薪水表';

/*Data for the table `v7_salary` */

/*Table structure for table `v7_store_in` */

DROP TABLE IF EXISTS `v7_store_in`;

CREATE TABLE `v7_store_in` (
  `ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'ID',
  `v7_s_brand` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '产品品牌',
  `v7_s_type` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '产品类型',
  `v7_s_name` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '产品名称',
  `v7_s_price` double(8,2) DEFAULT NULL COMMENT '商品单价',
  `v7_s_standard` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '产品规格',
  `v7_s_unit` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '计量单位',
  `v7_s_price_count` double(8,2) DEFAULT NULL COMMENT '合计价格',
  `v7_s_count` int(11) DEFAULT NULL COMMENT '入库数量',
  `v7_s_oper_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `v7_s_oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `v7_s_update_user` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `v7_s_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `v7_s_status` int(11) DEFAULT NULL COMMENT '状态（1 正常启用， 3 删除）',
  `v7_s_remarks` text COLLATE utf8_bin COMMENT '备注',
  `v7_pk_product` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '产品外键',
  `v7_pk_store_quantity` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '库存外键',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_4` (`v7_pk_product`),
  KEY `FK_Reference_9` (`v7_pk_store_quantity`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`v7_pk_product`) REFERENCES `v7_product` (`ID`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`v7_pk_store_quantity`) REFERENCES `v7_store_quantity` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='产品入库表';

/*Data for the table `v7_store_in` */

insert  into `v7_store_in`(`ID`,`v7_s_brand`,`v7_s_type`,`v7_s_name`,`v7_s_price`,`v7_s_standard`,`v7_s_unit`,`v7_s_price_count`,`v7_s_count`,`v7_s_oper_user`,`v7_s_oper_time`,`v7_s_update_user`,`v7_s_update_time`,`v7_s_status`,`v7_s_remarks`,`v7_pk_product`,`v7_pk_store_quantity`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('376d82efeed9492baccc93ec178dd95f','测试品牌1','-1','测试产品1',100.00,'1瓶','ml',2000.00,20,'admin','2018-11-28 20:58:21',NULL,NULL,1,'','c6fd9eafa1b143f38009fc3456c614f0','00ecee99c39641268f0b2095331995ed',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_store_out` */

DROP TABLE IF EXISTS `v7_store_out`;

CREATE TABLE `v7_store_out` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_s_brand` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '产品品牌',
  `v7_s_type` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '产品类型',
  `v7_s_name` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '产品名称',
  `v7_s_out_type` int(11) DEFAULT NULL COMMENT '出库类型（1 外卖，2项目使用）',
  `v7_s_standard` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '产品规格',
  `v7_s_unit` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '计量单位',
  `v7_s_price` double(8,2) DEFAULT NULL COMMENT '商品单价',
  `v7_s_count` int(11) DEFAULT NULL COMMENT '出库数量',
  `v7_s_price_count` double(8,2) DEFAULT NULL COMMENT '合计价格',
  `v7_s_oper_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `v7_s_oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `v7_s_update_user` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `v7_s_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `v7_s_status` int(11) DEFAULT NULL COMMENT '状态（1 正常启用， 3 删除）',
  `v7_s_remarks` text COLLATE utf8_bin COMMENT '备注',
  `v7_pk_store_quantity` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '库存外键',
  `v7_pk_product` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '产品外键',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`),
  KEY `FK_Reference_5` (`v7_pk_product`),
  KEY `FK_Reference_8` (`v7_pk_store_quantity`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`v7_pk_product`) REFERENCES `v7_product` (`ID`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`v7_pk_store_quantity`) REFERENCES `v7_store_quantity` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='出库表';

/*Data for the table `v7_store_out` */

insert  into `v7_store_out`(`id`,`v7_s_brand`,`v7_s_type`,`v7_s_name`,`v7_s_out_type`,`v7_s_standard`,`v7_s_unit`,`v7_s_price`,`v7_s_count`,`v7_s_price_count`,`v7_s_oper_user`,`v7_s_oper_time`,`v7_s_update_user`,`v7_s_update_time`,`v7_s_status`,`v7_s_remarks`,`v7_pk_store_quantity`,`v7_pk_product`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('f5e2e6e8f05d4ba1a523d1b0dc673515','测试品牌1','-1','测试产品1',2,'1瓶','ml',150.00,5,750.00,'admin','2018-11-28 20:59:01',NULL,NULL,NULL,'','00ecee99c39641268f0b2095331995ed','c6fd9eafa1b143f38009fc3456c614f0',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_store_quantity` */

DROP TABLE IF EXISTS `v7_store_quantity`;

CREATE TABLE `v7_store_quantity` (
  `ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'ID',
  `v7_s_brand` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '产品品牌',
  `v7_s_type` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '产品类型',
  `v7_s_name` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '产品名称',
  `v7_s_count` int(11) DEFAULT NULL COMMENT '库存数量',
  `v7_s_unit` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '计量单位',
  `v7_s_standard` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '产品规格',
  `v7_s_lately_time` datetime DEFAULT NULL COMMENT '最近一次采购时间',
  `v7_pk_product` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '产品ID',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_7` (`v7_pk_product`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`v7_pk_product`) REFERENCES `v7_product` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='库存表';

/*Data for the table `v7_store_quantity` */

insert  into `v7_store_quantity`(`ID`,`v7_s_brand`,`v7_s_type`,`v7_s_name`,`v7_s_count`,`v7_s_unit`,`v7_s_standard`,`v7_s_lately_time`,`v7_pk_product`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('00ecee99c39641268f0b2095331995ed','测试品牌1','-1','测试产品1',15,'ml','1瓶','2018-11-28 20:58:21','c6fd9eafa1b143f38009fc3456c614f0',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v7_universal_log` */

DROP TABLE IF EXISTS `v7_universal_log`;

CREATE TABLE `v7_universal_log` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT 'id',
  `v7_u_module_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '访问模块名',
  `v7_u_feature_name` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '访问功能名',
  `v7_u_feature_path` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '访问路径',
  `v7_u_request_param` text COLLATE utf8_bin COMMENT '请求所带参数',
  `v7_u_request_result` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '响应结果',
  `v7_u_request_user` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '请求人',
  `v7_u_request_time` datetime DEFAULT NULL COMMENT '请求时间',
  `v7_u_request_pcname` varchar(40) COLLATE utf8_bin DEFAULT NULL COMMENT '客户端PC名称',
  `v7_u_request_ip` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '客户端IP',
  `extends1` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段1',
  `extends2` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段2',
  `extends3` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段3',
  `extends4` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段4',
  `extends5` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '拓展字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='统一日志记录表';

/*Data for the table `v7_universal_log` */

insert  into `v7_universal_log`(`id`,`v7_u_module_name`,`v7_u_feature_name`,`v7_u_feature_path`,`v7_u_request_param`,`v7_u_request_result`,`v7_u_request_user`,`v7_u_request_time`,`v7_u_request_pcname`,`v7_u_request_ip`,`extends1`,`extends2`,`extends3`,`extends4`,`extends5`) values ('006461b8bd0b410c9cc294d9325489b2','员工中心','修改员工信息','/hairSalon/employee/updateEmployee.action','{birthday=2013 06 05 , v7EPhone=15923508367 , v7EName=技师1 , v7EJoinDate=2018-08-28 00:00:00 , v7MRemarks= , id=a606d49adf354afc8a52d4ef6a536f36 , v7ERealName=技师1  , v7MSex=1 , v7EPosition=7 8 }','成功','admin','2018-11-27 22:40:30','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('07ad01ac0bcf46e08f23f0cb4fe2ffae','会员中心','新增会员','/hairSalon/member/addMember.action','{birthday=1992 12 14 , v7CRechargeAmount=100 , handleEmployee=测试员工1 , v7MRemarks= , v7MName=test001 , v7MRealName=陈旋凯 , v7MPhone=15923508345 , v7MSex=2 , v7CType=3 }','成功','admin','2018-12-05 21:18:03','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('0f463c0d668842d2b149a3147dc4b51a','前台管理','买单','/hairSalon/cashier/addCashier.action','{v7RHairstylist=2a15f736ff5e45118fd694115cd0c6e1 , v7RTechnician=a606d49adf354afc8a52d4ef6a536f36 , v7RUsecardtype=1 , v7RMemberid=8d0da482595342f28d26037db1b6d6b0 , v7RConsumption=1 , v7RDiscountrate= , v7RConsumetype=1 , v7RPaycash4hedging= , v7RRecordnum= , v7RProductid=-1 , useCardType4VIP=1 , v7RRaiseamount=-1 -1 -1 -1 , v7RCardid=7f8dce4baf7c4644af8131263d41ae14 , v7RDiscountprice=24.00 24.00 , v7RAssistant=a606d49adf354afc8a52d4ef6a536f36 , v7RSaleCount= , v7RSaleUser=-1 , v7RSaleProammount= , v7RSumcostprice=30 30 30 }','成功','admin','2018-11-25 17:32:52','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('14fbdfb9c3cc434c88bdff1928f4ca43','员工中心','添加员工','/hairSalon/employee/addEmployee.action','{birthday=1992 5 23 , v7ESex=2 , v7EPhone=15923508123 , v7EName=测试员工02 , v7EJoinDate=2018-12-05 21:33:52 , v7ERemarks=李美妍 , v7ERealName=李美妍 , v7EPosition=9 }','成功','admin','2018-12-05 21:35:03','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('19a98f54caed44f4af524daf3f829a6e','产品入库管理','添加/修改入库信息','/hairSalon/inProduct/addInProduct.action','{v7SRemarks= , v7SCount=20 , v7SPrice=100 , id= , v7PkProduct=c6fd9eafa1b143f38009fc3456c614f0 , v7SName=测试产品1 }','成功','admin','2018-11-28 20:58:09','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('232df83f75c741ea9bafe607eb088d91','会员中心','修改会员','/hairSalon/member/updateMember.action','{birthday=2017 02 02 , v7MRemarks= , id=f860661624534c5195d9300712da2331 , v7MName=test001 , v7MRealName=测试 , v7MPhone=15923508432 , v7MSex=1 }','成功','admin','2018-12-05 21:46:24','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('28d5881dc88c4859951e4b89c38eead1','员工中心','修改员工信息','/hairSalon/employee/updateEmployee.action','{birthday=2013 06 05 , v7EPhone=15923508367 , v7EName=技师1 , v7EJoinDate=2018-11-27 22:40:07 , v7MRemarks= , id=a606d49adf354afc8a52d4ef6a536f36 , v7ERealName=技师1  , v7MSex=1 , v7EPosition=7 8 }','成功','admin','2018-11-27 22:40:12','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('29d9df15a0fb472380a10f6b0d57f5ef','员工中心','修改员工状态','/hairSalon/employee/updateEmployeeStatus.action','{oper=1 , id=a606d49adf354afc8a52d4ef6a536f36 }','成功','admin','2018-11-25 17:52:02','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('38105a7495114d6890f8379f0a50318f','前台管理','买单','/hairSalon/cashier/addCashier.action','{v7RHairstylist=2a15f736ff5e45118fd694115cd0c6e1 , v7RTechnician=a606d49adf354afc8a52d4ef6a536f36 , v7RUsecardtype= , v7RMemberid= , v7RConsumption=5 , v7RDiscountrate= , v7RConsumetype=1 , v7RPaycash4hedging= , v7RRecordnum= , v7RProductid=-1 , v7RRaiseamount=-1 -1 -1 -1 , v7RCardid= , v7RDiscountprice=  , v7RAssistant=a606d49adf354afc8a52d4ef6a536f36 , v7RSaleCount= , v7RSaleUser=-1 , v7RSaleProammount= , v7RSumcostprice=30 30 30 }','成功','admin','2018-11-26 22:48:03','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('3af6a5f87fd3427298ac3ab8fb7fe550','员工中心','添加员工','/hairSalon/employee/addEmployee.action','{birthday=2013 6 5 , v7ESex=1 , v7EPhone=15923508367 , v7EName=技师1 , v7EJoinDate=2018-11-25 17:32:22 , v7ERemarks= , v7ERealName=技师1 , v7EPosition=7 8 }','成功','admin','2018-11-25 17:32:27','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('431a8edc33464ac1b8f22184a24fa592','会员中心','新增会员','/hairSalon/member/addMember.action','{birthday=2017 2 2 , v7CRechargeAmount=30000 , handleEmployee=测试员工02 , v7MRemarks= , v7MName= test001 , v7MRealName=测试 , v7MPhone=15923508432 , v7MSex=1 , v7CType=2 }','成功','admin','2018-12-05 21:45:57','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('476e9c6e089b4056b33e30b8346028ad','员工中心','修改员工状态','/hairSalon/employee/updateEmployeeStatus.action','{oper=2 , id=a606d49adf354afc8a52d4ef6a536f36 }','成功','admin','2018-11-25 17:51:57','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('4af52f037acf4978939424d1281d112b','会员卡中心','会员充值','/hairSalon/card/addCardRecharge.action','{v7CRemarks= , v7CRechargeAmount=1000 , handleEmployee=测试员工1 , id=7f8dce4baf7c4644af8131263d41ae14 , v7CType=1 }','成功','admin','2018-11-27 22:08:59','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('4fdd0d63ec6e4d34a20029c8219ffbbe','会员中心','添加会员卡','/hairSalon/member/addMemberCard.action','{v7CRemarks= , v7CRechargeAmount=100 , handleEmployee=测试员工1 , v7CType=6 , memberId=8d0da482595342f28d26037db1b6d6b0 }','失败','admin','2018-11-27 22:07:42','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('5d8219f914124794a27efdd85a5a46b2','产品入库管理','添加/修改入库信息','/hairSalon/inProduct/addInProduct.action','{v7SRemarks= , v7SCount=20 , v7SPrice=100.0 , id=376d82efeed9492baccc93ec178dd95f , v7PkProduct=c6fd9eafa1b143f38009fc3456c614f0 }','成功','admin','2018-11-28 20:58:21','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('6044a4c6e1ec4612a84f5902ea06b975','产品管理','添加/修改产品','/hairSalon/product/addProduct.action','{v7PType=-1 , v7PBrand=测试品牌1 , v7PRemarks= , v7PkBrand=114452a338c44080ab57fa86f5c66a5c , v7PStandard=1瓶 , v7PUnit=ml  , id= , v7PName=测试产品1 , v7PAgentPhone=023-55768173 , v7PAgent=重庆女人街 }','成功','admin','2018-11-27 22:50:17','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('68c88283e75d4962a553757a4ed5d5c7','会员中心','添加会员卡','/hairSalon/member/addMemberCard.action','{v7CRemarks= , v7CRechargeAmount=500 , handleEmployee=测试员工1 , v7CType=5 , memberId=8d0da482595342f28d26037db1b6d6b0 }','成功','admin','2018-11-27 22:08:22','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('8068ca75806a4a22bbf90c5d84d8e118','会员中心','新增会员','/v7mc/member/addMember.action','{birthday=2006 3 13 , v7CRechargeAmount=10000 , handleEmployee=测试员工1 , v7MRemarks=测试员工1 添加 测试会员1 , v7MName=测试会员1 , v7MRealName=测试会员1 , v7MPhone=15923508361 , v7MSex=1 , v7CType=1 }','成功','admin','2018-04-14 11:02:46','DESKTOP-bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('8116590cd5464a88a0279f521dcef32c','员工中心','修改员工状态','/hairSalon/employee/updateEmployeeStatus.action','{oper=2 , id=2a15f736ff5e45118fd694115cd0c6e1 }','成功','admin','2018-11-27 22:36:24','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('8c4731062248479b9d67d168355329a6','员工中心','添加员工','/v7mc/employee/addEmployee.action','{birthday=2006 3 17 , v7ESex=1 , v7EPhone=15923508360 , v7EName=测试员工1 , v7EJoinDate=2012-04-14 11:01:34 , v7ERemarks=测试员工1 , v7ERealName=测试员工1 , v7EPosition=3 }','成功','admin','2018-04-14 11:01:48','DESKTOP-bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('9b3399ebb03d4ed799a0a70f7633e5c2','会员中心','修改会员','/hairSalon/member/updateMember.action','{birthday=1992 12 14 , v7MRemarks= , id=f4f9ae898a464310920a0d7bd0f7fb0b , v7MName=test001 , v7MRealName=陈旋凯 , v7MPhone=15923508345 , v7MSex=2 }','成功','admin','2018-12-05 21:41:52','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('9cf5fa2463ef4fd6ab1d31d8db8d7662','会员卡中心','会员充值','/hairSalon/card/addCardRecharge.action','{v7CRemarks= , v7CRechargeAmount=1000 , handleEmployee=测试员工1 , id=ed3778b0511d4c6bb8fd37178874375f , v7CType=3 }','成功','admin','2018-12-05 21:23:25','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('a7997a8db2384cb195323fce3fb6c2f3','品牌管理','新增/修改品牌','/hairSalon/brand/addBrand.action','{v7BRemarks= , v7BType=洗发类 烫发类 染发类 其它类 , v7BBrandDeclare=测试品牌02 , id=7ef4950680a8419e8f5731ad2e2e63e1 , v7BName=测试品牌02 }','成功','admin','2018-12-05 21:48:51','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('ba1c8238a95441dcb8f3a09880fa8382','员工中心','修改员工状态','/hairSalon/employee/updateEmployeeStatus.action','{oper=1 , id=2a15f736ff5e45118fd694115cd0c6e1 }','成功','admin','2018-11-27 22:36:33','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('bcfc4481c10848a4b843263aa155c5a1','员工中心','修改员工信息','/hairSalon/employee/updateEmployee.action','{newemployeePassword= , v7EPassword= , id=a606d49adf354afc8a52d4ef6a536f36 }','成功','admin','2018-11-25 17:52:09','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('c3650e3d80fa43cb87f420c28b426506','会员中心','修改会员','/hairSalon/member/updateMember.action','{birthday=2006 03 13 , v7MRemarks=测试员工1 添加 测试会员1 , id=8d0da482595342f28d26037db1b6d6b0 , v7MName=测试会员1 , v7MRealName=测试会员1 , v7MPhone=15923508361 , v7MSex=1 }','成功','admin','2018-11-27 21:58:39','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('cc2474d13bfc4f3cb8d65b1e6f85157a','会员中心','添加会员卡','/hairSalon/member/addMemberCard.action','{v7CRemarks= , v7CRechargeAmount=100 , handleEmployee=测试员工1 , v7CType=5 , memberId=8d0da482595342f28d26037db1b6d6b0 }','失败','admin','2018-11-27 22:08:05','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('cfe5f2dc3e174d6abe5bbccc36ccdeff','产品出库库管理','添加/修改出库信息','/hairSalon/outProduct/addOutProduct.action','{v7SRemarks= , v7SCount=5 , v7SPrice=150 , id= , v7PkProduct= , v7SName=测试产品1 }','成功','admin','2018-11-28 20:59:01','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('d56b963383cc4d97bd433d5644667fae','品牌管理','新增/修改品牌','/hairSalon/brand/addBrand.action','{v7BRemarks= , v7BType=洗发类 染发类 , v7BBrandDeclare=测试品牌02 , id= , v7BName=测试品牌02 }','成功','admin','2018-12-05 21:38:14','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('d59acb69954c4a9089278e527bd52ac6','品牌管理','新增/修改品牌','/hairSalon/brand/addBrand.action','{v7BRemarks= , v7BType=洗发类 烫发类 , v7BBrandDeclare=测试品牌1 , id=114452a338c44080ab57fa86f5c66a5c , v7BName=测试品牌1 }','成功','admin','2018-11-27 22:43:45','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('e251ea0f01c74778afa4afdcc5f030fc','品牌管理','新增/修改品牌','/hairSalon/brand/addBrand.action','{v7BRemarks= , v7BType=洗发类 烫发类 , v7BBrandDeclare=测试品牌1 , id= , v7BName=测试品牌1 }','成功','admin','2018-11-27 22:43:40','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL),('fdff82a850e747c0ab7b5d7ab7d0d904','会员中心','修改会员','/hairSalon/member/updateMember.action','{birthday=2017 02 02 , v7MRemarks= , id=f860661624534c5195d9300712da2331 , v7MName=test001 , v7MRealName=测试 , v7MPhone=15923508432 , v7MSex=1 }','成功','admin','2018-12-05 21:46:36','bingPan','0:0:0:0:0:0:0:1',NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
