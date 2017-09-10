/*
 * @Project Name: MSP-dependency
 * @File Name: SystemController
 * @Package Name: com.hay.msp.web.controller
 * @Date: 17-9-7 下午10:31
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.controller;

import com.hay.msp.base.constant.Message;
import com.hay.msp.base.vo.Result;
import com.hay.msp.vo.entity.sys.SysRoleFuncMapping;
import com.hay.msp.web.constant.Constant;
import com.hay.msp.web.constant.SwaggerConstant;
import com.hay.msp.web.facade.RoleFuncService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 系统控制器
 * @author hay
 * @date 17-9-7 下午10:31
 * @see
 */
@RestController
@RequestMapping("/v1/system")
@Api(tags = SwaggerConstant.SWAGGER_SYSTEM_GROUP)
public class SystemController {

	@Autowired
	RoleFuncService roleFuncService;

	@RequestMapping(value = "/selectAllRoleFunc", method = RequestMethod.GET, produces = Constant.JSON_UTF8)
	@ApiOperation(value = "获取角色功能映射列表" + SwaggerConstant.AUTHOR, notes = "获取角色功能映射列表", produces = Constant.JSON_UTF8)
	public Result<List<SysRoleFuncMapping>> selectAll(HttpServletRequest request) {
		List<SysRoleFuncMapping> sysRoleFuncMappings = roleFuncService.selectAll();
		return new Result<List<SysRoleFuncMapping>>(Message.RESULT_0, sysRoleFuncMappings);
	}
}
