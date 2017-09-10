/*
 * @Project Name: MSP-dependency
 * @File Name: RoleFacadeImpl
 * @Package Name: com.hay.msp.service.impl.sys
 * @Date: 17-9-7 下午10:00
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.service.impl.sys;

import com.alibaba.dubbo.config.annotation.Service;
import com.hay.msp.facade.sys.RoleFacade;
import com.hay.msp.service.mapper.sys.SysRoleMapper;
import com.hay.msp.vo.entity.sys.SysRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 角色服务实现
 * @author hay
 * @date 17-9-7 下午10:00
 * @see
 */
@Service(version = "1.0.0")
public class RoleFacadeImpl implements RoleFacade {

	@Autowired
	SysRoleMapper sysRoleMapper;

	/**
	 * 获取角色列表
	 * @date 17-9-7 下午10:05
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysRole> selectAll() {
		List<SysRole> sysRoles = sysRoleMapper.selectAll();
		return sysRoles;
	}
}
