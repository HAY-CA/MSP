/*
 * @Project Name: MSP-dependency
 * @File Name: SysRole
 * @Package Name: com.hay.msp.vo.entity.sys
 * @Date: 17-9-7 下午9:14
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.vo.entity.sys;

import com.hay.msp.base.vo.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

/**
 * 系统角色
 * @author hay
 * @date 17-9-7 下午9:14
 * @see
 */
public class SysRole extends BaseEntity {

	@ApiModelProperty(value = "角色id")
	private Long id;
	@ApiModelProperty(value = "角色名称")
	private String roleName;
	@ApiModelProperty(value = "状态 0:正常 1:禁用")
	private Integer status;
	@ApiModelProperty(value = "备注")
	private String remarks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
