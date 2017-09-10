/*
 * @Project Name: MSP-dependency
 * @File Name: RoleService
 * @Package Name: com.hay.msp.web.facade
 * @Date: 17-9-7 下午9:56
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.facade;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hay.msp.facade.sys.RoleFacade;
import com.hay.msp.vo.entity.sys.SysRole;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 角色服务
 * @author hay
 * @date 17-9-7 下午9:56
 * @see
 */
@Component
public class RoleService {

	@Reference(version = "1.0.0", timeout = 5000)
	RoleFacade roleFacade;

	/**
	 * 获取角色列表
	 * @date 17-9-7 下午10:23
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysRole> selectAll() {
		List<SysRole> sysRoles = roleFacade.selectAll();
		return sysRoles;
	}
}
