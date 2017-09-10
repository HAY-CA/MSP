/*
 * @Project Name: MSP-dependency
 * @File Name: DeptService
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
import com.hay.msp.facade.sys.DeptFacade;
import com.hay.msp.vo.entity.sys.SysDept;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 部门服务
 * @author hay
 * @date 17-9-7 下午9:56
 * @see
 */
@Component
public class DeptService {

	@Reference(version = "1.0.0", timeout = 5000)
	DeptFacade deptFacade;

	/**
	 * 获取部门列表
	 * @date 17-9-7 下午10:12
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysDept> selectAll() {
		List<SysDept> sysDepts = deptFacade.selectAll();
		return sysDepts;
	}
}
