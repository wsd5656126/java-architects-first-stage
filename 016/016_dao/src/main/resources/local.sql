# --视频类型表
CREATE TABLE `video_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键(自增长)',
  `type_name` varchar(30) DEFAULT NULL COMMENT '视频类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
# --视频详情表
CREATE TABLE `video_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键(自增长)',
  `video_name` varchar(150) DEFAULT NULL COMMENT '视频名称',
  `video_url` varchar(100) DEFAULT NULL COMMENT '封面图片',
  `video_html` varchar(500) DEFAULT NULL COMMENT '视频html执行元素',
  `video_type_id` int DEFAULT NULL COMMENT '关联typeID',
  `video_del` INT DEFAULT 0 COMMENT '是否显示 0显示 1隐藏',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;