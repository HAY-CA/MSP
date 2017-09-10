/*
 * @Project Name: MSP-dependency
 * @File Name: RoleFuncFacadeImpl
 * @Package Name: com.hay.msp.service.impl.sys
 * @Date: 17-9-7 下午10:08
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.service.impl.sys;

import com.alibaba.dubbo.config.annotation.Service;
import com.hay.msp.facade.sys.RoleFuncMappingFacade;
import com.hay.msp.service.mapper.sys.SysRoleFuncMappingMapper;
import com.hay.msp.vo.entity.sys.SysRoleFuncMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 角色 功能映射
 * @author hay
 * @date 17-9-7 下午10:08
 * @see
 */
@Service(version = "1.0.0")
public class RoleFuncFacadeImpl implements RoleFuncMappingFacade {

	@Autowired
	SysRoleFuncMappingMapper sysRoleFuncMappingMapper;

	/**
	 * 获取映射列表
	 * @date 17-9-7 下午10:10
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysRoleFuncMapping> selectAll() {
		List<SysRoleFuncMapping> sysRoleFuncMappings = sysRoleFuncMappingMapper.selectAll();
		return sysRoleFuncMappings;
	}
}
