/*
 * @Project Name: MSP-dependency
 * @File Name: XmlParser
 * @Package Name: com.hay.msp.base.util
 * @Date: 2017/6/27 21:06
 * @Creator: HAY
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hay.msp.base.util;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/**
 * XML解析工具
 *
 * @author HAY
 * @date 2017/6/27 21:06
 * @see
 */
public class XmlParser {


	/**
	 * 创建空xml文件
	 * @date 2017/6/22 12:19
	 * @author huyajun
	 * @since 1.0.0
	 *
	 */
	public static void createEmptyXmlFile(String filePath){
		if (StringUtils.isBlank(filePath)){
			return;
		}
		Comment doc = DocumentHelper.createComment(filePath);
		OutputFormat format = OutputFormat.createPrettyPrint();
		try {
			format.setEncoding("UTF-8");
			XMLWriter writer = new XMLWriter(new FileWriter(filePath),format);
			writer.write(doc);
			writer.close();
		} catch (IOException e) {
			return;
		}
	}

	/**
	 * 根据路径获取xml文档
	 * @date 2017/6/22 21:32
	 * @author huyajun
	 * @since 1.0.0
	 *
	 */
	public static Document getDocument(String filePath){
		if (StringUtils.isBlank(filePath)){
			return null;
		}
		File file = new File(filePath);
		if (!file.exists()){
			createEmptyXmlFile(filePath);
		}
		SAXReader saxReader = new SAXReader();
		Document document;
		try {
			document = saxReader.read(file);
		} catch (DocumentException e) {
			return null;
		}
		return document;
	}

	/**
	 * 根据输入流获取xml文档
	 * @date 2017/6/22 21:36
	 * @author huyajun
	 * @since 1.0.0
	 *
	 */
	public static Document getDocument(InputStream inputStream){
		SAXReader reader = new SAXReader();
		Document document;
		try {
			document = reader.read(inputStream);
		} catch (DocumentException e) {
			return null;
		}
		return document;
	}

	/**
	 * 获取root节点
	 * @date 2017/6/22 21:38
	 * @author huyajun
	 * @since 1.0.0
	 *
	 */
	public static Element getRootNode(Document document){
		if (null == document){
			return null;
		}
		Element rootElement = document.getRootElement();
		return rootElement;
	}

	/**
	 * 根据路径获取根节点
	 * @date 2017/6/22 21:42
	 * @author huyajun
	 * @since 1.0.0
	 *
	 */
	public static Element getRootNode(String filePath){
		if (StringUtils.isBlank(filePath)){
			return null;
		}
		Document document = getDocument(filePath);
		if (null == document){
			return null;
		}
		Element element = document.getRootElement();
		return element;
	}


	/**
	 * 获取元素迭代器
	 * @date 2017/6/22 21:48
	 * @author huyajun
	 * @since 1.0.0
	 *
	 */
	public static Iterator<Element> getIterator(Element element){
		if(null == element){
			return null;
		}
		Iterator<Element> iterator = element.elementIterator();
		return iterator;
	}


	/**
	 * 获取子节点
	 * @date 2017/6/22 21:44
	 * @author huyajun
	 * @since 1.0.0
	 *
	 */
	public static Element getChild(Element parentElement,String childName){
		childName = childName.trim();
		if (null == parentElement){
			return null;
		}
		if (StringUtils.isBlank(childName)){
			return null;
		}
		Iterator<Element> iterator = getIterator(parentElement);
		Element childElement = null;
		while (iterator.hasNext()){
			Element element = iterator.next();
			if (element.getName().equalsIgnoreCase(childName)){
				childElement = element;
				break;
			}
		}
		return childElement;
	}

	/**
	 * 获取子节点
	 * @date 2017/6/27 21:11
	 * @author HAY
	 * @since 1.0.0 
	 *
	*/
	public static List<Element> getChildList(Element parentElement){
		if (null == parentElement){
			return null;
		}
		Iterator<Element> iterator = getIterator(parentElement);
		List<Element> childList = Lists.newArrayList();
		while (iterator.hasNext()){
			Element element = iterator.next();
			childList.add(element);
		}
		return childList;
	}

}
