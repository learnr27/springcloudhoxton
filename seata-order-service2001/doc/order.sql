drop TABLE t_order;
CREATE TABLE t_order
(
    `id`         BIGINT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `user_id`    BIGINT(11)     DEFAULT NULL COMMENT '用户id',
    `product_id` BIGINT(11)     DEFAULT NULL COMMENT '产品id',
    `count`      INT(11)        DEFAULT NULL COMMENT '数量',
    `money`      DECIMAL(11, 0) DEFAULT NULL COMMENT '金额',
    `status`     INT(1)         DEFAULT 0 COMMENT '订单状态：0：创建中; 1：已完结'
) ENGINE = INNODB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8;
SELECT *
FROM t_order;