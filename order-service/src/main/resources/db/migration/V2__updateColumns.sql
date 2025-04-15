drop table if exists t_orders;
CREATE TABLE `t_orders` (
    `id` BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
    `sku_code` VARCHAR(255),
    `order_number` VARCHAR(255),
    `price` DECIMAL(19, 2),
    `quantity` INT(11)
);