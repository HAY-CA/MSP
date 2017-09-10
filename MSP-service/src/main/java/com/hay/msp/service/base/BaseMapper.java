/*
 * @Project Name: MSP-dependency
 * @File Name: BaseMapper
 * @Package Name: com.hay.msp.base.mapper
 * @Date: 17-9-2 下午9:13
 * @Creator: hay
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.service.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper
 * @author hay
 * @date 17-9-2 下午9:13
 * @see
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
