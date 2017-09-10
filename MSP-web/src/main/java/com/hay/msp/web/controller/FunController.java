/*
 * @Project Name: MSP-dependency
 * @File Name: FunController
 * @Package Name: com.hay.msp.web.controller
 * @Date: 17-9-7 下午9:50
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.controller;

import com.hay.msp.base.constant.Message;
import com.hay.msp.base.vo.Result;
import com.hay.msp.vo.entity.sys.SysFunc;
import com.hay.msp.web.constant.Constant;
import com.hay.msp.web.constant.SwaggerConstant;
import com.hay.msp.web.facade.FuncService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 系统功能控制器
 * @author hay
 * @date 17-9-7 下午9:50
 * @see
 */
@RestController
@RequestMapping("/v1/func")
@Api(tags = SwaggerConstant.SWAGGER_FUNC_GROUP)
public class FunController {

	@Autowired
	FuncService funcService;

	@RequestMapping(value = "/selectAll", method = RequestMethod.GET, produces = Constant.JSON_UTF8)
	@ApiOperation(value = "获取功能列表" + SwaggerConstant.AUTHOR, notes = "获取功能列表", produces = Constant.JSON_UTF8)
	public Result<List<SysFunc>> selectAll(HttpServletRequest request) {
		List<SysFunc> sysFuncs = funcService.selectAll();
		return new Result<List<SysFunc>>(Message.RESULT_0, sysFuncs);
	}
}
