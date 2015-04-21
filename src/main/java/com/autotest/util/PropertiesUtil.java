package com.autotest.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ²Ù×÷properties Àà
 * 
 * @author peng
 * @version 1.0
 */
public class PropertiesUtil {
	private volatile static PropertiesUtil pUtil = null;
	private static String PropertiesPath = "/var.properties";
	private Properties properties=null;

	private PropertiesUtil() throws IOException {
		InputStream is=null;
		try {
			//FileInputStream inputStream1 = new FileInputStream("out.properties");
			is = PropertiesUtil.class
					.getResourceAsStream(PropertiesPath);
			properties = new Properties();
			properties.load(is);
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}
      
	public static PropertiesUtil getInstance() throws IOException {
		if(pUtil ==null){
			synchronized (PropertiesUtil.class) {
				if(pUtil==null){
					pUtil=new PropertiesUtil();
				}
			}
		}
		return pUtil;
	}
	
	public String getProperty(String key){
		return properties.getProperty(key);
	}

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		System.out.println(PropertiesUtil.getInstance().getProperty("XML.FIle.Path"));
//	}

}
