/*
 * @Project Name: MSP-dependency
 * @File Name: UserController
 * @Package Name: com.hay.msp.web.controller
 * @Date: 2017/6/27 21:49
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.controller;

import com.hay.msp.base.constant.Message;
import com.hay.msp.base.vo.Result;
import com.hay.msp.vo.entity.sys.SysUserInfo;
import com.hay.msp.web.constant.Constant;
import com.hay.msp.web.constant.SwaggerConstant;
import com.hay.msp.web.facade.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户访问控制器
 * @author HAY
 * @date 2017/6/27 21:49
 * @see
 */
@RestController
@RequestMapping("/v1/user")
@Api(tags = SwaggerConstant.SWAGGER_USER_GROUP)
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/selectAll", method = RequestMethod.GET, produces = Constant.JSON_UTF8)
	@ApiOperation(value = "获取用户列表" + SwaggerConstant.AUTHOR, notes = "获取用户列表", produces = Constant.JSON_UTF8)
	public Result<List<SysUserInfo>> selectAll(HttpServletRequest request) {
		List<SysUserInfo> userInfoVOS = userService.selectAll();
		return new Result<List<SysUserInfo>>(Message.RESULT_0, userInfoVOS);
	}
}
