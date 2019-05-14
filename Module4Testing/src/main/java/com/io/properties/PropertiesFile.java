package com.io.properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties property = new Properties();
	public static void readProperties() {
		//loading the configuration file
		try {
			InputStream input = new FileInputStream(
					"C:\\Users\\home\\eclipse-workspace\\Module4Testing\\configure.properties");
			property.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
