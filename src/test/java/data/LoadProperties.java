package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	static String path = System.getProperty(("user.dir")) + "\\src\\main\\java\\properties\\userData.properties";
	public static Properties userData = LoadProperties(path);

	private static Properties LoadProperties(String Path) {
		System.out.println("This" + path);
		
		Properties pro = new Properties();
		
		//Stream for reading the file
		try {
			FileInputStream stream = new FileInputStream(Path);
			try {
				pro.load(stream);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return pro;
		
		
	} 
}
