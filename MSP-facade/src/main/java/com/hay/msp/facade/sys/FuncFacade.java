/*
 * @Project Name: MSP-dependency
 * @File Name: FuncFacade
 * @Package Name: com.hay.msp.facade.sys
 * @Date: 17-9-7 下午9:38
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.facade.sys;

import com.hay.msp.vo.entity.sys.SysFunc;

import java.util.List;

/**
 * 系统服务接口
 * @author hay
 * @date 17-9-7 下午9:38
 * @see
 */
public interface FuncFacade {

	/**
	 * 获取功能列表
	 * @date 17-9-7 下午9:39
	 * @author hay
	 * @since 1.0.0
	 */
	List<SysFunc> selectAll();
}
