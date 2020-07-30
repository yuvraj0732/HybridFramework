package org.uv.support;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utilities {


//	public static  prop;

	public static String getProperty(String propertName) {

		Properties	prop = new Properties();

		try {
			FileInputStream file = new FileInputStream("GlobalProperties.properties");
			prop.load(file);
		} catch (IOException e) {
			System.out.println("Unable to locate properties file");

		}

		String propVal = prop.getProperty(propertName);
		return propVal;
	
}
	
	public static String getCurrentDate() {
		
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
		return date;
	}
       
	public static String getTimeStamp() {
		
		String timestamp= new SimpleDateFormat("HH:mm:ss").format(new Date());
		
		return timestamp;
	}
       
}
