/*
 * @Project Name: MSP-dependency
 * @File Name: FuncFacadeImpl
 * @Package Name: com.hay.msp.service.impl.sys
 * @Date: 17-9-7 下午10:05
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.service.impl.sys;

import com.alibaba.dubbo.config.annotation.Service;
import com.hay.msp.facade.sys.FuncFacade;
import com.hay.msp.service.mapper.sys.SysFuncMapper;
import com.hay.msp.vo.entity.sys.SysFunc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 系统功能接口
 * @author hay
 * @date 17-9-7 下午10:05
 * @see
 */
@Service(version = "1.0.0")
public class FuncFacadeImpl implements FuncFacade {

	@Autowired
	SysFuncMapper sysFuncMapper;

	public List<SysFunc> selectAll() {
		List<SysFunc> sysFuncs = sysFuncMapper.selectAll();
		return sysFuncs;
	}
}
