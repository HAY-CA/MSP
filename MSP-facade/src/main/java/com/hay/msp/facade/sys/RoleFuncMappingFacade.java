/*
 * @Project Name: MSP-dependency
 * @File Name: RoleFuncMappingFacade
 * @Package Name: com.hay.msp.facade.sys
 * @Date: 17-9-7 下午9:39
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.facade.sys;

import com.hay.msp.vo.entity.sys.SysRoleFuncMapping;

import java.util.List;

/**
 * 角色 功能映射服务接口
 * @author hay
 * @date 17-9-7 下午9:39
 * @see
 */
public interface RoleFuncMappingFacade {

	/**
	 * 获取映射列表
	 * @date 17-9-7 下午9:40
	 * @author hay
	 * @since 1.0.0
	 */
	List<SysRoleFuncMapping> selectAll();
}
