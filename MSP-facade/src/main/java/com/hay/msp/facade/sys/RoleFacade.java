/*
 * @Project Name: MSP-dependency
 * @File Name: RoleFacade
 * @Package Name: com.hay.msp.facade.sys
 * @Date: 17-9-7 下午9:37
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.facade.sys;

import com.hay.msp.vo.entity.sys.SysRole;

import java.util.List;

/**
 * 角色服务接口
 * @author hay
 * @date 17-9-7 下午9:37
 * @see
 */
public interface RoleFacade {

	/**
	 * 获取角色列表
	 * @date 17-9-7 下午9:38
	 * @author hay
	 * @since 1.0.0
	 */
	List<SysRole> selectAll();
}
