/*
 * @Project Name: MSP-dependency
 * @File Name: SysDept
 * @Package Name: com.hay.msp.vo.entity.sys
 * @Date: 17-9-7 下午9:10
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
 * 部门信息
 * @author hay
 * @date 17-9-7 下午9:10
 * @see
 */
public class SysDept extends BaseEntity {

	@ApiModelProperty(value = "部门ID")
	private Long id;
	@ApiModelProperty(value = "部门名称")
	private String deptName;
	@ApiModelProperty(value = "0:正常 1:禁用")
	private Integer status;
	@ApiModelProperty(value = "备注")
	private String remarks;
	@ApiModelProperty(value = "上级部门")
	private Long parentId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
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

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
}
