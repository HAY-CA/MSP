create table sys_user_info(
	user_id varchar(40) not null primary key comment '主键标识',
    password varchar(128) not null comment '密码',
    user_name varchar(40) not null comment '用户名称',
    icon_url varchar(100) comment '用户头像',
    sex TINYINT not null default 3 comment '1:男 2:女 3:保密',
    date_birth datetime comment '出生日期',
    phone varchar(20) not null comment '手机号码',
    prov int comment '省份',
    city int comment '市',
    dist int comment '区',
    address varchar(100) comment '详细地址',
    role_id int not null comment '所属角色',
    dep_id int not null comment '所属机构',
    email varchar(40) comment '邮箱地址',
    last_login_time timestamp  default CURRENT_TIMESTAMP comment '最后登录时间',
    last_login_ip varchar(30) comment '最后登录IP',
    status TINYINT not null comment '0:正常 1:禁用 2:待激活',
    remarks varchar(200) comment '备注',
    create_user varchar(40) not null comment '创建人',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_user varchar(40) not null comment '更新人',
    update_time timestamp not null default CURRENT_TIMESTAMP comment '更新时间'
);


create table sys_dept(
	id int not null auto_increment primary key comment '主键标识',
    dept_name varchar(40) not null comment '部门名称',
    status TINYINT not null comment '0:正常 1:禁用',
	remarks varchar(200) comment '备注',
    parent_id int not null default 0 comment '上级部门',
	create_user varchar(40) not null comment '创建人',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_user varchar(40) not null comment '更新人',
    update_time timestamp not null default CURRENT_TIMESTAMP comment '更新时间'
);

create  table sys_role(
	id int not null auto_increment primary key comment '主键标识',
    role_name varchar(40) not null comment '角色名称',
    status TINYINT not null comment '0:正常 1:禁用',
    remarks varchar(200) comment '备注',
	create_user varchar(40) not null comment '创建人',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_user varchar(40) not null comment '更新人',
    update_time timestamp not null default CURRENT_TIMESTAMP comment '更新时间'
);

create table sys_func(
	id int not null auto_increment primary key comment '主键标识',
    func_name varchar(40) not null comment '功能名称',
    func_type varchar(40) not null comment '功能类型',
    func_url varchar(100) not null comment '功能路径',
    func_icon_url varchar(100) not null comment '功能图标',
    sort_weight TINYINT not null comment '排序权重',
    parent_id int not null default 0 comment '父节点',
    status TINYINT not null comment '0:正常 1:禁用',
    remarks varchar(200) comment '备注',
    create_user varchar(40) not null comment '创建人',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_user varchar(40) not null comment '更新人',
    update_time timestamp not null default CURRENT_TIMESTAMP comment '更新时间'
);

create table sys_role_func_mapping(
	id int not null auto_increment primary key comment '主键标识',
    role_id int not null comment '角色ID',
    func_id int not null comment '功能ID',
    create_user varchar(40) not null comment '创建人',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_user varchar(40) not null comment '更新人',
    update_time timestamp not null default CURRENT_TIMESTAMP comment '更新时间'
);
