-- -----------------------------------------------
-- 配置中心分组信息 `zuul_conf_group`
-- -----------------------------------------------
DROP TABLE IF EXISTS `zuul_conf_group`;
CREATE TABLE `zuul_conf_group` (
  `id`                  int(11)           NOT NULL AUTO_INCREMENT,
  `uuid`                varchar(100)      NOT NULL COMMENT      'uuid号',
  `group_code`          varchar(100)      DEFAULT NULL COMMENT  '分组编码',
  `group_name`          varchar(200)      DEFAULT NULL COMMENT  '分组名称',
  `sort_order`          tinyint(2)        DEFAULT NULL COMMENT  '展示顺序号',

  `valid_start_time`  varchar(32)        DEFAULT NULL COMMENT  '有效开始日期”',
  `valid_end_time`    varchar(32)        DEFAULT NULL COMMENT  '有效结束日期',

  `status`              tinyint(2)        DEFAULT NULL COMMENT  '状态标识 1：正常 0：禁用',
  `remark`              varchar(200)      DEFAULT NULL COMMENT  '备注',
  `create_by`           varchar(32)       DEFAULT NULL COMMENT '创建人',
  `create_time`         varchar(32)       DEFAULT NULL COMMENT '创建时间',
  `update_time`         varchar(32)       DEFAULT NULL COMMENT '修改时间',
  `ext`                 varchar(100)      DEFAULT NULL COMMENT '扩展',
   PRIMARY KEY (`id`),
   UNIQUE INDEX `group_code` (`group_code`) USING BTREE
) comment='分组信息'
 ENGINE=InnoDB
 DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;



-- -----------------------------------------------
-- （微服务）网关服务配置 `ms_gateway_service_conf`
-- -----------------------------------------------
DROP TABLE IF EXISTS `ms_gateway_service_conf`;
CREATE TABLE `ms_gateway_service_conf` (
  `id`                  int(11)           NOT NULL AUTO_INCREMENT,
  `uuid`                varchar(100)      NOT NULL COMMENT      'uuid号',
  `group_code`          varchar(100)      DEFAULT NULL COMMENT  '分组编码',
  `group_name`          varchar(200)      DEFAULT NULL COMMENT  '分组名称',
  `sort_order`          tinyint(2)        DEFAULT NULL COMMENT  '展示顺序号',

  `valid_start_time`  varchar(32)        DEFAULT NULL COMMENT  '有效开始日期”',
  `valid_end_time`    varchar(32)        DEFAULT NULL COMMENT  '有效结束日期',

  `status`              tinyint(2)        DEFAULT NULL COMMENT  '状态标识 1：正常 0：禁用',
  `remark`              varchar(200)      DEFAULT NULL COMMENT  '备注',
  `create_by`           varchar(32)       DEFAULT NULL COMMENT '创建人',
  `create_time`         varchar(32)       DEFAULT NULL COMMENT '创建时间',
  `update_time`         varchar(32)       DEFAULT NULL COMMENT '修改时间',
  `ext`                 varchar(100)      DEFAULT NULL COMMENT '扩展',
   PRIMARY KEY (`id`),
   UNIQUE INDEX `group_code` (`group_code`) USING BTREE
) comment='分组信息'
 ENGINE=InnoDB
 DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;


-- -----------------------------------------------
-- （微服务）网关服务配置 `ms_gateway_service_conf`
-- -----------------------------------------------
DROP TABLE IF EXISTS `ms_gateway_service_conf`;
CREATE TABLE `ms_gateway_service_conf` (
  `id`                  int(11)           NOT NULL AUTO_INCREMENT,
  `uuid`                varchar(100)      NOT NULL COMMENT      'uuid号',
  `name`                varchar(255)      DEFAULT NULL COMMENT  '名称',
  `path`                varchar(255)      DEFAULT NULL COMMENT  '请求路径',
  `service_id`          varchar(255)      DEFAULT NULL COMMENT  '服务Id(SpringCloud ServiceId)',
  `service_url`         varchar(255)      DEFAULT NULL COMMENT  'URL地址',

  `valid_start_time`  varchar(32)        DEFAULT NULL COMMENT  '有效开始日期”',
  `valid_end_time`    varchar(32)        DEFAULT NULL COMMENT  '有效结束日期',

  `status`              tinyint(2)        DEFAULT NULL COMMENT  '状态标识 1：正常 0：禁用',
  `remark`              varchar(200)      DEFAULT NULL COMMENT  '备注',
  `create_by`           varchar(32)       DEFAULT NULL COMMENT '创建人',
  `create_time`         varchar(32)       DEFAULT NULL COMMENT '创建时间',
  `update_time`         varchar(32)       DEFAULT NULL COMMENT '修改时间',
  `ext`                 varchar(100)      DEFAULT NULL COMMENT '扩展',
   PRIMARY KEY (`id`),
   UNIQUE INDEX `path` (`path`, `status`) USING BTREE
) comment='分组信息'
 ENGINE=InnoDB
 DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;
