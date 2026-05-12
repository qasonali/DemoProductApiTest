package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	protected Properties prop = new Properties();

	public ConfigReader() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/test/resources/Config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public Object getBaseURL() {
	
		return prop.get("baseUrl");
	}
}
