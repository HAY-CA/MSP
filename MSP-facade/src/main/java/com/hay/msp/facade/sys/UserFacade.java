
package com.hay.msp.facade.sys;

import com.hay.msp.vo.entity.sys.SysUserInfo;

import java.util.List;

/**
 * 用户服务接口
 */
public interface UserFacade {

	/**
	 * 获取用户列表
	 * @date 17-9-2 下午9:23
	 * @author hay
	 * @since 1.0.0
	 */
	List<SysUserInfo> selectAll();
}
