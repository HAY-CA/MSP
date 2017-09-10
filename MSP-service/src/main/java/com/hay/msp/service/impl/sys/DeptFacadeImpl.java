/*
 * @Project Name: MSP-dependency
 * @File Name: DeptFacadeImpl
 * @Package Name: com.hay.msp.service.impl.sys
 * @Date: 17-9-7 下午10:03
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.service.impl.sys;

import com.alibaba.dubbo.config.annotation.Service;
import com.hay.msp.facade.sys.DeptFacade;
import com.hay.msp.service.mapper.sys.SysDeptMapper;
import com.hay.msp.vo.entity.sys.SysDept;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 部门服务接口
 * @author hay
 * @date 17-9-7 下午10:03
 * @see
 */
@Service(version = "1.0.0")
public class DeptFacadeImpl implements DeptFacade {

	@Autowired
	SysDeptMapper sysDeptMapper;

	/**
	 * 获取部门列表
	 * @date 17-9-7 下午10:04
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysDept> selectAll() {
		List<SysDept> sysDepts = sysDeptMapper.selectAll();
		return sysDepts;
	}
}
