/*
 * @Project Name: MSP-dependency
 * @File Name: FuncService
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
import com.hay.msp.facade.sys.FuncFacade;
import com.hay.msp.vo.entity.sys.SysFunc;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统功能服务
 * @author hay
 * @date 17-9-7 下午9:56
 * @see
 */
@Component
public class FuncService {

	@Reference(version = "1.0.0", timeout = 5000)
	FuncFacade funcFacade;

	/**
	 * 获取功能列表
	 * @date 17-9-7 下午10:18
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysFunc> selectAll() {
		List<SysFunc> sysFuncs = funcFacade.selectAll();
		return sysFuncs;
	}
}
