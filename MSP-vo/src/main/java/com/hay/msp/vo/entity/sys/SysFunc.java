/*
 * @Project Name: MSP-dependency
 * @File Name: SysFunc
 * @Package Name: com.hay.msp.vo.entity.sys
 * @Date: 17-9-7 下午9:20
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
 * 系统功能
 * @author hay
 * @date 17-9-7 下午9:20
 * @see
 */
public class SysFunc extends BaseEntity {

	@ApiModelProperty(value = "功能ID")
	private Long id;
	@ApiModelProperty(value = "功能名称")
	private String funcName;
	@ApiModelProperty(value = "功能类型")
	private String funcType;
	@ApiModelProperty(value = "功能url")
	private String funcUrl;
	@ApiModelProperty
	private String funcIconUrl;
	@ApiModelProperty(value = "排序权重")
	private Integer sortWeight;
	@ApiModelProperty(value = "状态0:正常 1:禁用")
	private Integer status;
	@ApiModelProperty(value = "备注")
	private String remarks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

	public String getFuncType() {
		return funcType;
	}

	public void setFuncType(String funcType) {
		this.funcType = funcType;
	}

	public String getFuncUrl() {
		return funcUrl;
	}

	public void setFuncUrl(String funcUrl) {
		this.funcUrl = funcUrl;
	}

	public Integer getSortWeight() {
		return sortWeight;
	}

	public void setSortWeight(Integer sortWeight) {
		this.sortWeight = sortWeight;
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

	public String getFuncIconUrl() {
		return funcIconUrl;
	}

	public void setFuncIconUrl(String funcIconUrl) {
		this.funcIconUrl = funcIconUrl;
	}
}
