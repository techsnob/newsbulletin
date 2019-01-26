CREATE TABLE `bulletin` (
  `bulletin_id` decimal(19,2) NOT NULL,
  `bulletin_head_line` varchar(255) NOT NULL,
  `bulletin_src_url` varchar(255) NOT NULL,
  `bulletin_type` char(1) NOT NULL,
  `bulletin_publisher_name` varchar(255) NOT NULL,
  `bulletin_publisher_url` varchar(255) NOT NULL,
  PRIMARY KEY (`bulletin_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

