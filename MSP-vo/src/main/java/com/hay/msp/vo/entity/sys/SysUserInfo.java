/*
 * @Project Name: MSP-dependency
 * @File Name: SysUserInfo
 * @Package Name: com.hay.msp.vo.entity.user
 * @Date: 17-9-5 下午11:11
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.vo.entity.sys;

import com.hay.msp.base.vo.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 用户信息
 * @author hay
 * @date 17-9-5 下午11:11
 * @see
 */
public class SysUserInfo extends BaseEntity {

	@ApiModelProperty(value = "用户ID")
	private String userId;
	@ApiModelProperty(value = "密码")
	private String password;
	@ApiModelProperty(value = "用户昵称")
	private String userName;
	@ApiModelProperty(value = "头像地址")
	private String iconUrl;
	@ApiModelProperty(value = "性别 1:男 2:女 3:保密")
	private Integer sex;
	@ApiModelProperty(value = "出生日期")
	private Date dateBirth;
	@ApiModelProperty(value = "手机号码")
	private String phone;
	@ApiModelProperty(value = "省份")
	private Integer prov;
	@ApiModelProperty(value = "城市")
	private Integer city;
	@ApiModelProperty(value = "区")
	private Integer dist;
	@ApiModelProperty(value = "详细地址")
	private String address;
	@ApiModelProperty(value = "所属角色")
	private Integer roleId;
	@ApiModelProperty(value = "所属部门")
	private Integer depId;
	@ApiModelProperty(value = "邮箱地址")
	private String email;
	@ApiModelProperty(value = "最后登录时间")
	private Date lastLoginTime;
	@ApiModelProperty(value = "最后登录ip")
	private Date lastLoginIp;
	@ApiModelProperty(value = "状态 0:正常 1:禁用 2:待激活")
	private Integer status;
	@ApiModelProperty(value = "备注")
	private String remarks;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getProv() {
		return prov;
	}

	public void setProv(Integer prov) {
		this.prov = prov;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getDist() {
		return dist;
	}

	public void setDist(Integer dist) {
		this.dist = dist;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(Date lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
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
