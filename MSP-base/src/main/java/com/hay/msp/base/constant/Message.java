/*
 * @Project Name: MSP-dependency
 * @File Name: Message
 * @Package Name: com.hay.msp.base.constant
 * @Date: 2017/6/27 21:12
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.base.constant;

import com.hay.msp.base.util.XmlParser;
import org.dom4j.Document;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 结果码
 *
 * @author HAY
 * @date 2017/6/27 21:12
 * @see
 */
public class Message {

	private static final Logger logger = LoggerFactory.getLogger(Message.class);
	public static final Map<Integer, String> RESULT_MAP = new HashMap<Integer, String>();
	public static final String XML_PATH = "/xml/ApiResult.xml";
	public static final String RESULT_MESSAGE_NOT_FOUND = "该结果码不存在!";

	static {
		loadXmlMessage();
	}

	/**
	 * 系统错误
	 */
	public static final int RESULT_ERR = -1;
	/**
	 * 成功
	 */
	public static final int RESULT_0 = 0;
	/**
	 * 失败
	 */
	public static final int RESULT_1 = 1;
	/**
	 *  请检查接口文档参数是否正确
	 */
	public static final int RESULT_2 = 2;
	/**
	 * 请求找不到方法
	 */
	public static final int RESULT_3 = 3;


	/**
	 * 获取提示信息
	 *
	 * @param code
	 * @return
	 */
	public static String getMessage(int code) {
		return RESULT_MAP.get(code) == null ? RESULT_MESSAGE_NOT_FOUND : RESULT_MAP.get(code);
	}

	private static void loadXmlMessage() {
		try {
			InputStream inputStream = Message.class.getClassLoader().getResourceAsStream(XML_PATH);
			Document document = XmlParser.getDocument(inputStream);
			Element rootNode = XmlParser.getRootNode(document);
			List<Element> childList = XmlParser.getChildList(rootNode);
			for (Element element : childList) {
				Integer id = Integer.valueOf(element.attributeValue("id"));
				String text = element.getText();
				RESULT_MAP.put(id, text);
			}
		} catch (Exception e) {
			logger.error("#####消息配置文件解析失败:" + e.getMessage());
		}
	}
}
