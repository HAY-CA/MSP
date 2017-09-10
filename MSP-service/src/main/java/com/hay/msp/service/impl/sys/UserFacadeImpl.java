/*
 * @Project Name: MSP-dependency
 * @File Name: UserFacadeImpl
 * @Package Name: com.hay.msp.service.impl.sys
 * @Date: 17-9-7 下午9:58
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.service.impl.sys;

import com.alibaba.dubbo.config.annotation.Service;
import com.hay.msp.facade.sys.UserFacade;
import com.hay.msp.service.mapper.sys.SysUserMapper;
import com.hay.msp.vo.entity.sys.SysUserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户服务实现
 * @author hay
 * @date 17-9-7 下午9:58
 * @see
 */
@Service(version = "1.0.0")
public class UserFacadeImpl implements UserFacade {

	@Autowired
	SysUserMapper userMapper;

	/**
	 * 获取用户列表
	 * @date 17-9-7 下午10:05
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysUserInfo> selectAll() {
		List<SysUserInfo> userInfos = userMapper.selectAll();
		return userInfos;
	}
}
