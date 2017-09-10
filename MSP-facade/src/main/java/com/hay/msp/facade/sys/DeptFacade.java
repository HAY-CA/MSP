/*
 * @Project Name: MSP-dependency
 * @File Name: DeptFacade
 * @Package Name: com.hay.msp.facade.sys
 * @Date: 17-9-7 下午9:31
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.facade.sys;

import com.hay.msp.vo.entity.sys.SysDept;

import java.util.List;

/**
 * 部门服务借口
 * @author hay
 * @date 17-9-7 下午9:31
 * @see
 */
public interface DeptFacade {

	/**
	 * 获取部门列表
	 * @date 17-9-7 下午9:32
	 * @author hay
	 * @since 1.0.0
	 */
	List<SysDept> selectAll();
}
