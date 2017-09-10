/*
 * @Project Name: MSP-dependency
 * @File Name: BaseEntity
 * @Package Name: com.hay.msp.base.vo
 * @Date: 17-9-2 下午8:45
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.base.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * TODO
 * @author hay
 * @date 17-9-2 下午8:45
 * @see
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -1851771991545561128L;
	@ApiModelProperty(value = "创建用户")
	private Date createUser;
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	@ApiModelProperty(value = "更新用户")
	private Date updateUser;
	@ApiModelProperty(value = "更新时间")
	private Date updateTime;

	public Date getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Date createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Date updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
