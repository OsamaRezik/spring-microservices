CREATE TABLE `t_orders` (
     id BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
     skucode VARCHAR(255),
     ordernumber VARCHAR(255),
     price DECIMAL(19, 2),
     quantity INT(11)
);