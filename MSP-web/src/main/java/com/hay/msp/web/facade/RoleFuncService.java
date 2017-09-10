/*
 * @Project Name: MSP-dependency
 * @File Name: RoleFuncService
 * @Package Name: com.hay.msp.web.facade
 * @Date: 17-9-7 下午9:57
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.facade;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hay.msp.facade.sys.RoleFuncMappingFacade;
import com.hay.msp.vo.entity.sys.SysRoleFuncMapping;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 角色功能服务
 * @author hay
 * @date 17-9-7 下午9:57
 * @see
 */
@Component
public class RoleFuncService {

	@Reference(version = "1.0.0", timeout = 5000)
	RoleFuncMappingFacade roleFuncMappingFacade;

	/**
	 * 获取角色列表
	 * @date 17-9-7 下午10:20
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysRoleFuncMapping> selectAll() {
		List<SysRoleFuncMapping> sysRoleFuncMappings = roleFuncMappingFacade.selectAll();
		return sysRoleFuncMappings;
	}
}
