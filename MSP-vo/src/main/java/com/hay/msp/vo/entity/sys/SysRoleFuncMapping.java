/*
 * @Project Name: MSP-dependency
 * @File Name: SysRoleFuncMapping
 * @Package Name: com.hay.msp.vo.entity.sys
 * @Date: 17-9-7 下午9:26
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
 * 角色 功能映射
 * @author hay
 * @date 17-9-7 下午9:26
 * @see
 */
public class SysRoleFuncMapping extends BaseEntity {

	@ApiModelProperty(value = "主键标识")
	private Long id;
	@ApiModelProperty(value = "角色ID")
	private Long roleId;
	@ApiModelProperty(value = "功能ID")
	private Long funcId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getFuncId() {
		return funcId;
	}

	public void setFuncId(Long funcId) {
		this.funcId = funcId;
	}
}
