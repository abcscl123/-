/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80011
Source Host           : 127.0.0.1:3306
Source Database       : cosmetics

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-11-16 15:21:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment_comment
-- ----------------------------
DROP TABLE IF EXISTS `comment_comment`;
CREATE TABLE `comment_comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(500) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `like_number` int(11) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `cosmetics_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqpe59eiwk5vfiyysau6pa35b4` (`user_id`),
  KEY `FKdjdgn817tfv0oq3e74kjx02i` (`cosmetics_id`),
  CONSTRAINT `FKdjdgn817tfv0oq3e74kjx02i` FOREIGN KEY (`cosmetics_id`) REFERENCES `cosmetic_cosmetics` (`id`),
  CONSTRAINT `FKqpe59eiwk5vfiyysau6pa35b4` FOREIGN KEY (`user_id`) REFERENCES `user_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment_comment
-- ----------------------------
INSERT INTO `comment_comment` VALUES ('1', '这个好', '2018-10-23 08:15:34', '56', null, '1');

-- ----------------------------
-- Table structure for comment_image
-- ----------------------------
DROP TABLE IF EXISTS `comment_image`;
CREATE TABLE `comment_image` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `path` varchar(100) DEFAULT NULL,
  `comment_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKls2bhol2proluapdv6ad68j2u` (`comment_id`),
  CONSTRAINT `FKls2bhol2proluapdv6ad68j2u` FOREIGN KEY (`comment_id`) REFERENCES `comment_comment` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment_image
-- ----------------------------

-- ----------------------------
-- Table structure for comment_reply
-- ----------------------------
DROP TABLE IF EXISTS `comment_reply`;
CREATE TABLE `comment_reply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `comment_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3kq8l6gw8ur80mdu7kp0dfu8j` (`comment_id`),
  CONSTRAINT `FK3kq8l6gw8ur80mdu7kp0dfu8j` FOREIGN KEY (`comment_id`) REFERENCES `comment_comment` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment_reply
-- ----------------------------
INSERT INTO `comment_reply` VALUES ('1', 'smile', '不好', '1');

-- ----------------------------
-- Table structure for cosmetic_cosmetics
-- ----------------------------
DROP TABLE IF EXISTS `cosmetic_cosmetics`;
CREATE TABLE `cosmetic_cosmetics` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `describes` varchar(500) DEFAULT NULL,
  `is_recommend` tinyint(1) DEFAULT NULL,
  `type_id` bigint(20) DEFAULT NULL,
  `function_id` bigint(20) DEFAULT NULL,
  `result_id` bigint(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8cdagkxvkm3a14im5m5cjcitf` (`type_id`),
  KEY `FKqyha8ik09eefvu1rt9lxksq6b` (`function_id`),
  KEY `FKsfn1jv8w15vuxfmqnc8tfu4od` (`result_id`),
  CONSTRAINT `FK8cdagkxvkm3a14im5m5cjcitf` FOREIGN KEY (`type_id`) REFERENCES `cosmetic_type` (`id`),
  CONSTRAINT `FKqyha8ik09eefvu1rt9lxksq6b` FOREIGN KEY (`function_id`) REFERENCES `cosmetic_functions` (`id`),
  CONSTRAINT `FKsfn1jv8w15vuxfmqnc8tfu4od` FOREIGN KEY (`result_id`) REFERENCES `test_result` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cosmetic_cosmetics
-- ----------------------------
INSERT INTO `cosmetic_cosmetics` VALUES ('1', '科颜氏亚马逊白泥净肤面膜', '亚马逊白泥净肤面膜能有效调理肌肤、净化毛孔、帮助清洁，改善多余油脂分泌的神奇面膜。使用亚马逊白泥净肤面膜后肌肤呈现出平滑、洁净。内含亚马逊白泥*、库拉索芦荟叶汁、膨润土、燕麦粉等卓效肌肤净致成分。\r\n*即配方中高岭土', '0', '4', '4', null, '2018-10-10 09:14:30');
INSERT INTO `cosmetic_cosmetics` VALUES ('2', '科颜氏高保湿霜', '科颜氏高保湿霜富含珍稀成分冷冻保护蛋白*能滋润肌肤，同时抗冻，配合白茅根提取物及角鲨烷，形成肌肤“水循环”，发挥润泽保湿，强化肌肤屏障。\r\n*即假交替单胞菌发酵产物提取物', '0', '3', '1', null, '2018-08-09 09:14:37');
INSERT INTO `cosmetic_cosmetics` VALUES ('3', '科颜氏新集焕白均衡亮肤淡斑精华液', '科颜氏[安·白瓶]集焕白均衡亮肤淡斑精华液\r\n19天持续增白20%*\r\n科颜氏[安·白瓶]集焕白均衡亮肤淡斑精华液，经典活力维C 深层净透焕白，无需激活，稳定释放活性。小分子深层渗透，淡化并预防黑色素生成。突破性透明瓶包装，成分稳定。\r\n可长期持续使用，不刺激皮肤，无需担心刺激感，质地轻薄，触感丝滑温和无负担。\r\n科颜氏[安·白瓶]集焕白均衡亮肤淡斑精华液，主要成分：活力维C**、白桦、牡丹萃取精华\r\n*51名消费者每天使用两次，持续使用19天的专家评估结果，实际效果因人而异\r\n**为3-o-乙基抗坏血酸\r\n\r\n（为达到更好使用效果，建议您于白天使用集焕白均衡亮肤淡斑精华液同步坚持使用科颜氏防晒隔离乳液）\r\n', '0', '2', '4', null, '2018-07-04 09:14:44');
INSERT INTO `cosmetic_cosmetics` VALUES ('4', '科颜氏维生素C紧肤精华乳液', '科颜氏首款“发热精华”, 富含10.5%精纯左旋维C①+10.5%精纯左旋维Cg②，添加玻尿酸③，无水配方，鲜活卓效。\r\n科颜氏12.5%④高浓维C精华⑤， 高浓抗氧+促进胶原再生⑥，对抗轻熟肌暗黄粗糙，淡化三大初老纹⑦。\r\n\r\n①指配方中添加的抗坏血酸浓度为10.5%\r\n②指配方中添加的抗坏血酸糖苷浓度为2%\r\n③水解透明质酸\r\n④指配方中添加的抗坏血酸和抗坏血酸葡糖苷的浓度为12.5%\r\n⑤科颜氏维生素C紧致亮肤精华乳液 国妆备进字J20179737US\r\n⑥指维生素C活性物可以促进胶原蛋白生成\r\n⑦指木偶纹、抬头纹、法令纹，三方实验资料， 志愿者每日使用两次持续两周后的前后对比，实际效果因人而异', '0', '2', '5', null, '2018-02-07 10:01:59');
INSERT INTO `cosmetic_cosmetics` VALUES ('5', '科颜氏金盏花洁面啫喱', '科颜氏金盏花洁面啫喱，气味清新，泡沫丰盈。科颜氏金盏花洁面啫喱在带来深层温和洁净的同时，不破坏肌肤天然屏障。使用科颜氏金盏花洁面啫喱后肌肤散发健康光泽，温和滋润不干绷。 金盏花洁面啫喱含特有科颜氏经典明星天然植物成分——金盏花菁粹，温和滋润，调理肤质，令肌肤清新舒缓。', '0', '1', '4', null, '2018-03-16 10:04:41');
INSERT INTO `cosmetic_cosmetics` VALUES ('6', '科颜氏丰润保湿水凝精华乳', '保湿新突破！科颜氏丰润保湿水凝精华乳蕴含紫苏叶提取物与15%源于植物的甘油，深入肌肤层层保湿，打造抓水、补水、打造充满弹力的Baby Face*丰盈水润肌\r\n•卓效“水循环”，抓水，补水又锁水\r\n•改善肌肤暗沉与细纹、平滑肌肤纹理\r\n•使肌肤充满水润弹力、饱满丰盈，散发健康光彩\r\n•荣获2015嘉人国际美妆大奖\r\n\r\n*指产品弹润效果', '0', '1', '3', null, '2018-05-17 10:12:18');

-- ----------------------------
-- Table structure for cosmetic_functions
-- ----------------------------
DROP TABLE IF EXISTS `cosmetic_functions`;
CREATE TABLE `cosmetic_functions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `functions` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cosmetic_functions
-- ----------------------------
INSERT INTO `cosmetic_functions` VALUES ('1', '保湿');
INSERT INTO `cosmetic_functions` VALUES ('2', '控油');
INSERT INTO `cosmetic_functions` VALUES ('3', '亮白');
INSERT INTO `cosmetic_functions` VALUES ('4', '亮肤');
INSERT INTO `cosmetic_functions` VALUES ('5', '紧肤');

-- ----------------------------
-- Table structure for cosmetic_image
-- ----------------------------
DROP TABLE IF EXISTS `cosmetic_image`;
CREATE TABLE `cosmetic_image` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `path` varchar(100) DEFAULT NULL,
  `cosmetics_id` bigint(20) DEFAULT NULL,
  `is_cosmeticImage` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa5y4o1sgu29bh2h9yweee4bd7` (`cosmetics_id`),
  CONSTRAINT `FKa5y4o1sgu29bh2h9yweee4bd7` FOREIGN KEY (`cosmetics_id`) REFERENCES `cosmetic_cosmetics` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cosmetic_image
-- ----------------------------
INSERT INTO `cosmetic_image` VALUES ('1', '/ssh_cosmetics/databaseimage/cosmetic/1_1.jpg', '1', '');
INSERT INTO `cosmetic_image` VALUES ('2', '/ssh_cosmetics/databaseimage/cosmetic/1_2.jpg', '1', '\0');
INSERT INTO `cosmetic_image` VALUES ('3', '/ssh_cosmetics/databaseimage/cosmetic/1_3.jpg', '1', '\0');
INSERT INTO `cosmetic_image` VALUES ('4', '/ssh_cosmetics/databaseimage/cosmetic/1_4.jpg', '1', '\0');
INSERT INTO `cosmetic_image` VALUES ('5', '/ssh_cosmetics/databaseimage/cosmetic/2_1.jpg', '2', '');
INSERT INTO `cosmetic_image` VALUES ('6', '/ssh_cosmetics/databaseimage/cosmetic/2_2.jpg', '2', '\0');
INSERT INTO `cosmetic_image` VALUES ('7', '/ssh_cosmetics/databaseimage/cosmetic/2_3.jpg', '2', '\0');
INSERT INTO `cosmetic_image` VALUES ('8', '/ssh_cosmetics/databaseimage/cosmetic/2_4.jpg', '2', '\0');
INSERT INTO `cosmetic_image` VALUES ('9', '/ssh_cosmetics/databaseimage/cosmetic/3_1.jpg', '3', '');
INSERT INTO `cosmetic_image` VALUES ('10', '/ssh_cosmetics/databaseimage/cosmetic/3_2.jpg', '3', '\0');
INSERT INTO `cosmetic_image` VALUES ('11', '/ssh_cosmetics/databaseimage/cosmetic/3_3.jpg', '3', '\0');
INSERT INTO `cosmetic_image` VALUES ('12', '/ssh_cosmetics/databaseimage/cosmetic/3_4.jpg', '3', '\0');
INSERT INTO `cosmetic_image` VALUES ('13', '/ssh_cosmetics/databaseimage/cosmetic/4_1.jpg', '4', '');
INSERT INTO `cosmetic_image` VALUES ('14', '/ssh_cosmetics/databaseimage/cosmetic/4_2.jpg', '4', '\0');
INSERT INTO `cosmetic_image` VALUES ('15', '/ssh_cosmetics/databaseimage/cosmetic/4_3.jpg', '4', '\0');
INSERT INTO `cosmetic_image` VALUES ('16', '/ssh_cosmetics/databaseimage/cosmetic/4_4.jpg', '4', '\0');
INSERT INTO `cosmetic_image` VALUES ('17', '/ssh_cosmetics/databaseimage/cosmetic/4_5.jpg', '4', '\0');
INSERT INTO `cosmetic_image` VALUES ('18', '/ssh_cosmetics/databaseimage/cosmetic/4_6.jpg', '4', '\0');
INSERT INTO `cosmetic_image` VALUES ('19', '/ssh_cosmetics/databaseimage/cosmetic/4_7.jpg', '4', '\0');
INSERT INTO `cosmetic_image` VALUES ('20', '/ssh_cosmetics/databaseimage/cosmetic/5_1.jpg', '5', '');
INSERT INTO `cosmetic_image` VALUES ('21', '/ssh_cosmetics/databaseimage/cosmetic/5_2.jpg', '5', '\0');
INSERT INTO `cosmetic_image` VALUES ('22', '/ssh_cosmetics/databaseimage/cosmetic/5_3.jpg', '5', '\0');
INSERT INTO `cosmetic_image` VALUES ('23', '/ssh_cosmetics/databaseimage/cosmetic/6_1.jpg', '6', '');

-- ----------------------------
-- Table structure for cosmetic_like
-- ----------------------------
DROP TABLE IF EXISTS `cosmetic_like`;
CREATE TABLE `cosmetic_like` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `is_like` bit(1) DEFAULT NULL,
  `cosmetics_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2f87wleq3lu3xnb6163kx550t` (`cosmetics_id`),
  KEY `FKpo5qa2q48r224l4gxxqtr35lx` (`user_id`),
  CONSTRAINT `FK2f87wleq3lu3xnb6163kx550t` FOREIGN KEY (`cosmetics_id`) REFERENCES `cosmetic_cosmetics` (`id`),
  CONSTRAINT `FKpo5qa2q48r224l4gxxqtr35lx` FOREIGN KEY (`user_id`) REFERENCES `user_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cosmetic_like
-- ----------------------------
INSERT INTO `cosmetic_like` VALUES ('2', '', '1', '2');
INSERT INTO `cosmetic_like` VALUES ('3', '', '2', '1');
INSERT INTO `cosmetic_like` VALUES ('4', '', '2', '2');
INSERT INTO `cosmetic_like` VALUES ('5', '', '3', '1');
INSERT INTO `cosmetic_like` VALUES ('6', '', '3', '2');
INSERT INTO `cosmetic_like` VALUES ('7', '', '4', '1');
INSERT INTO `cosmetic_like` VALUES ('8', '', '5', '1');
INSERT INTO `cosmetic_like` VALUES ('9', '', '6', '1');
INSERT INTO `cosmetic_like` VALUES ('13', '', '1', '1');
INSERT INTO `cosmetic_like` VALUES ('14', '', '2', null);
INSERT INTO `cosmetic_like` VALUES ('15', '', '6', '8');
INSERT INTO `cosmetic_like` VALUES ('16', '\0', '2', '8');
INSERT INTO `cosmetic_like` VALUES ('17', '\0', '1', '8');
INSERT INTO `cosmetic_like` VALUES ('18', '', '3', '8');
INSERT INTO `cosmetic_like` VALUES ('19', '\0', '4', '8');
INSERT INTO `cosmetic_like` VALUES ('20', '\0', '5', '8');

-- ----------------------------
-- Table structure for cosmetic_type
-- ----------------------------
DROP TABLE IF EXISTS `cosmetic_type`;
CREATE TABLE `cosmetic_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cosmetic_type
-- ----------------------------
INSERT INTO `cosmetic_type` VALUES ('1', '水');
INSERT INTO `cosmetic_type` VALUES ('2', '乳');
INSERT INTO `cosmetic_type` VALUES ('3', '霜');
INSERT INTO `cosmetic_type` VALUES ('4', '面膜');

-- ----------------------------
-- Table structure for test_answer
-- ----------------------------
DROP TABLE IF EXISTS `test_answer`;
CREATE TABLE `test_answer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `answer` varchar(100) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `problem_id` bigint(20) DEFAULT NULL,
  `options` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKiyt91473l3au6y0sxg39pb7jt` (`problem_id`),
  CONSTRAINT `FKiyt91473l3au6y0sxg39pb7jt` FOREIGN KEY (`problem_id`) REFERENCES `test_problem` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_answer
-- ----------------------------
INSERT INTO `test_answer` VALUES ('1', '无明显透明油渍', '1', '1', 'A');
INSERT INTO `test_answer` VALUES ('2', '少量透明有油渍，少于2点/cm2', '2', '1', 'B');
INSERT INTO `test_answer` VALUES ('3', '中量透明油渍，2~5点/ cm2', '3', '1', 'C');
INSERT INTO `test_answer` VALUES ('4', '大量透明油渍，大于5点/ cm2，相互融合', '4', '1', 'D');
INSERT INTO `test_answer` VALUES ('5', '皮肤紧绷感明显，伴有痒、痛感', '1', '2', 'A');
INSERT INTO `test_answer` VALUES ('6', '皮肤稍有紧绷感，可以忍受', '2', '2', 'B');
INSERT INTO `test_answer` VALUES ('7', '皮肤状态适应中', '3', '2', 'C');
INSERT INTO `test_answer` VALUES ('8', '皮肤开始有油腻感', '4', '2', 'D');
INSERT INTO `test_answer` VALUES ('9', '皮肤干燥，灰白色皮屑分布于面部皮肤', '1', '3', 'A');
INSERT INTO `test_answer` VALUES ('10', '皮肤粗糙感，无皮屑', '2', '3', 'B');
INSERT INTO `test_answer` VALUES ('11', '皮肤处于正常纹理，与平时无明显差别', '3', '3', 'C');
INSERT INTO `test_answer` VALUES ('12', '皮肤有光亮感', '4', '3', 'D');
INSERT INTO `test_answer` VALUES ('13', '看不到明显的毛孔', '1', '4', 'A');
INSERT INTO `test_answer` VALUES ('14', '可以看见针尖般大小的毛孔', '2', '4', 'B');
INSERT INTO `test_answer` VALUES ('15', '明显看到毛孔', '3', '4', 'C');
INSERT INTO `test_answer` VALUES ('16', '明显看到毛孔，伴有黑头和白头的状况', '4', '4', 'D');
INSERT INTO `test_answer` VALUES ('17', '面部皮肤比上臂内侧皮肤僵硬', '1', '5', 'A');
INSERT INTO `test_answer` VALUES ('18', '面部皮肤比上臂内侧感觉粗糙', '2', '5', 'B');
INSERT INTO `test_answer` VALUES ('19', '面部皮肤比上臂内侧皮肤触感无明显区别', '3', '5', 'C');
INSERT INTO `test_answer` VALUES ('20', '面部皮肤比上臂内侧皮肤感觉更油腻些', '4', '5', 'D');
INSERT INTO `test_answer` VALUES ('21', '必须立刻使用，否则皮肤不适感无法缓解', '1', '6', 'A');
INSERT INTO `test_answer` VALUES ('22', '涂上保湿产品，皮肤会感受更舒适', '2', '6', 'B');
INSERT INTO `test_answer` VALUES ('23', '可以用，但不是必须', '3', '6', 'C');
INSERT INTO `test_answer` VALUES ('24', '完全可以不用', '4', '6', 'D');
INSERT INTO `test_answer` VALUES ('29', 'sss', '3', null, null);
INSERT INTO `test_answer` VALUES ('30', 'ss', '5', null, null);

-- ----------------------------
-- Table structure for test_number
-- ----------------------------
DROP TABLE IF EXISTS `test_number`;
CREATE TABLE `test_number` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `describes` varchar(500) DEFAULT NULL,
  `is_show` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_number
-- ----------------------------
INSERT INTO `test_number` VALUES ('1', '基础测试——《护肤品全解码》', '1');
INSERT INTO `test_number` VALUES ('2', '进阶测试——《护肤品全解码》', '0');

-- ----------------------------
-- Table structure for test_problem
-- ----------------------------
DROP TABLE IF EXISTS `test_problem`;
CREATE TABLE `test_problem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `problem` varchar(500) DEFAULT NULL,
  `type` varchar(8) DEFAULT NULL,
  `number_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK361a2d05nbmpdgin5hawbvogo` (`number_id`),
  CONSTRAINT `FK361a2d05nbmpdgin5hawbvogo` FOREIGN KEY (`number_id`) REFERENCES `test_number` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_problem
-- ----------------------------
INSERT INTO `test_problem` VALUES ('1', '早晨起床后先用纸巾轻轻按压面部皮肤，一分钟后取下，观察纸巾上的透明油渍：', '单项选择', '1');
INSERT INTO `test_problem` VALUES ('2', '用温度30℃~40℃的清水清洁面部，用毛巾吸干皮肤多余水分，室内活动2小时后，此时你的感受：', '单项选择', '1');
INSERT INTO `test_problem` VALUES ('3', '与此同时，在明亮的环境下观察皮肤，发现：', '单项选择', '1');
INSERT INTO `test_problem` VALUES ('4', '再靠近一些观察皮肤的毛孔状况：', '单项选择', '1');
INSERT INTO `test_problem` VALUES ('5', '用一根手指轻轻按压面部皮肤，然后用同样方式和力度按压上臂内侧皮肤，得到的感受：', '单项选择', '1');
INSERT INTO `test_problem` VALUES ('6', '这时，你是否需要使用保湿产品？', '单项选择', '1');

-- ----------------------------
-- Table structure for test_result
-- ----------------------------
DROP TABLE IF EXISTS `test_result`;
CREATE TABLE `test_result` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `highest_score` int(11) DEFAULT NULL,
  `minimum_score` int(11) DEFAULT NULL,
  `answer` varchar(500) DEFAULT NULL,
  `proposal` varchar(1000) DEFAULT NULL,
  `number_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKigqodf3hc28mq6d8tke3pumso` (`number_id`),
  CONSTRAINT `FKigqodf3hc28mq6d8tke3pumso` FOREIGN KEY (`number_id`) REFERENCES `test_number` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_result
-- ----------------------------
INSERT INTO `test_result` VALUES ('1', '9', '6', 'D+型皮肤，中重度干性皮肤', null, '1');
INSERT INTO `test_result` VALUES ('2', '12', '10', 'D型皮肤，轻重度干性皮肤', null, '1');
INSERT INTO `test_result` VALUES ('3', '15', '13', 'N型皮肤，中性皮肤', null, '1');
INSERT INTO `test_result` VALUES ('4', '18', '16', 'O型皮肤，轻中度油性皮肤', null, '1');
INSERT INTO `test_result` VALUES ('5', '21', '19', 'O+型皮肤，中重度油性皮肤', null, '1');

-- ----------------------------
-- Table structure for user_collection
-- ----------------------------
DROP TABLE IF EXISTS `user_collection`;
CREATE TABLE `user_collection` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `note_title` varchar(20) DEFAULT NULL,
  `note_author` varchar(16) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnm4vrkloci6cw40kqninw3t4k` (`user_id`),
  CONSTRAINT `FKnm4vrkloci6cw40kqninw3t4k` FOREIGN KEY (`user_id`) REFERENCES `user_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_collection
-- ----------------------------
INSERT INTO `user_collection` VALUES ('1', '今天非常高兴', 'ldz', '2018-10-23 20:43:00', '2');

-- ----------------------------
-- Table structure for user_note
-- ----------------------------
DROP TABLE IF EXISTS `user_note`;
CREATE TABLE `user_note` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) DEFAULT NULL,
  `type` varchar(5) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK14w14odrxunb7g781c293ta3h` (`user_id`),
  CONSTRAINT `FK14w14odrxunb7g781c293ta3h` FOREIGN KEY (`user_id`) REFERENCES `user_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_note
-- ----------------------------
INSERT INTO `user_note` VALUES ('1', '今天真高兴', '共享', null);
INSERT INTO `user_note` VALUES ('2', '今天也很高兴', '私有', null);
INSERT INTO `user_note` VALUES ('3', '今天非常高兴', '共享', '2');

-- ----------------------------
-- Table structure for user_user
-- ----------------------------
DROP TABLE IF EXISTS `user_user`;
CREATE TABLE `user_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `nickname` varchar(16) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `eamil` varchar(30) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_user
-- ----------------------------
INSERT INTO `user_user` VALUES ('1', '123', '123456789', 'user', 'smiles', '13326095638', '10571687473@qq.com', '2003-05-07 16:00:00', '1', null);
INSERT INTO `user_user` VALUES ('2', '123456', '123456', 'user', 'ldz', '13326095630', '1057168743@qq.com', '1998-09-12 00:00:00', '0', null);
INSERT INTO `user_user` VALUES ('3', '012345', '123456789', 'admin', 'sss', '13326095630', '1057168743@qq.com', '2018-10-02 09:08:18', '1', null);
INSERT INTO `user_user` VALUES ('5', 'admin', '123456789', '', '说的阿萨德', '13326095631', '1316791550@qq.com', '2018-11-07 16:00:00', '0', null);
INSERT INTO `user_user` VALUES ('6', 'admin', '123456789', null, null, null, null, null, '0', null);
INSERT INTO `user_user` VALUES ('7', '吱吱吱吱', '123456789', '', 'sss', '13326095630', '1111111111@qq.com', '1917-12-31 16:00:00', '1', null);
INSERT INTO `user_user` VALUES ('8', 'jijijiji', 'jijijiji', '', 'jijijiji', '13041308079', '1316791550@qq.com', '1899-12-31 16:00:00', '0', null);
INSERT INTO `user_user` VALUES ('9', '叽叽叽叽', 'jijijiji', '', '哈哈哈', '13326095631', '1111111111@qq.com', '1900-08-31 15:54:17', '1', null);
