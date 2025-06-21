package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader 
{
	private static Properties properties;
	
	static 
	{
		try {
			FileInputStream fis=new FileInputStream("/Users/sangamesh/eclipse-workspace/Selenium/resources/config.properties");
			
			properties=new Properties();
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	public static String get(String key)
	{
		return properties.getProperty(key);
	}

}
