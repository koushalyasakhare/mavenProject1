package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
public static String readProperties(String key1) throws FileNotFoundException {
		
		String val="";
		
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\utility\\PropReader.java";
		
		Properties prop =new Properties();
		
		FileInputStream fis =new FileInputStream(path);
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		val =prop.getProperty(key1);
		
		return val;
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		PropReader pr =new PropReader();
		
		System.out.println(readProperties("URL"));
		
	}

}



