/*
 * @Project Name: MSP-dependency
 * @File Name: DeptController
 * @Package Name: com.hay.msp.web.controller
 * @Date: 17-9-7 下午10:29
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.web.controller;

import com.hay.msp.base.constant.Message;
import com.hay.msp.base.vo.Result;
import com.hay.msp.vo.entity.sys.SysDept;
import com.hay.msp.web.constant.Constant;
import com.hay.msp.web.constant.SwaggerConstant;
import com.hay.msp.web.facade.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 部门控制器
 * @author hay
 * @date 17-9-7 下午10:29
 * @see
 */
@RestController
@RequestMapping("/v1/dept")
@Api(tags = SwaggerConstant.SWAGGER_DEPT_GROUP)
public class DeptController {

	@Autowired
	DeptService deptService;

	@RequestMapping(value = "/selectAll", method = RequestMethod.GET, produces = Constant.JSON_UTF8)
	@ApiOperation(value = "获取部门列表" + SwaggerConstant.AUTHOR, notes = "获取部门列表", produces = Constant.JSON_UTF8)
	public Result<List<SysDept>> selectAll(HttpServletRequest request) {
		List<SysDept> sysDepts = deptService.selectAll();
		return new Result<List<SysDept>>(Message.RESULT_0, sysDepts);
	}
}
