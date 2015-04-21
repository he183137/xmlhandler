package com.autotest.main;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import sun.print.resources.serviceui;
import sun.security.jca.GetInstance;


/**
 * 
 * 采用单例模式，装载XML到内存类
 * @author Hepeng
 * @version 1.0
 *
 */
public class XMLReader {
	private  String xmlPath;
	private  Document document;
	private  volatile static XMLReader xmlParse =null;
	
	
	private XMLReader(String xmlPath) throws DocumentException{
		this.xmlPath = xmlPath;
		this.document = initXML();
	}
	
	private Document initXML() throws DocumentException{
		SAXReader reader = new SAXReader();
	    Document document = reader.read(new File(xmlPath));
	    return document;
	}
	
	public static XMLReader getInstance(String xmlPath) throws DocumentException{
		if(xmlParse ==null){
			synchronized (XMLReader.class) {
				if(xmlParse==null){
					xmlParse=new XMLReader(xmlPath);
				}
			}
		}
		return xmlParse;
	}

	public Document getDocument() {
		return document;
	}
	
}
