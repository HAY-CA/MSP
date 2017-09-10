
package com.hay.msp.web.facade;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hay.msp.facade.sys.UserFacade;
import com.hay.msp.vo.entity.sys.SysUserInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户服务
 */
@Component
public class UserService {

	@Reference(version = "1.0.0", timeout = 5000)
	UserFacade userFacade;

	/**
	 * 获取用户列表
	 * @date 17-9-2 下午9:26
	 * @author hay
	 * @since 1.0.0
	 */
	public List<SysUserInfo> selectAll() {
		List<SysUserInfo> userInfos = userFacade.selectAll();
		return userInfos;
	}
}
