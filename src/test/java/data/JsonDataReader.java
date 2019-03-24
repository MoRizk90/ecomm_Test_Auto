package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsonDataReader {
	
	public String firstName, lastName, email, password;
	
	public void jsonReader() throws FileNotFoundException, IOException, ParseException {
		
		String filePath =System.getProperty("user.dir") + "\\src\\test\\java\\data\\userData.json";
		System.out.println("The file path is : " + filePath);
		File srcFile = new File(filePath);
		JSONParser Jparser = new JSONParser();
		JSONArray jarrArray = (JSONArray) Jparser.parse(new FileReader(srcFile));
		
		for(Object jsonObj : jarrArray) {
			JSONObject person = (JSONObject) jsonObj ;
			firstName = (String) person.get("firstname");
			System.out.println(firstName);
			
			lastName = (String) person.get("lastName");
			System.out.println(lastName);
			
			email = (String) person.get("Email");
			System.out.println(email);
			
			password = (String) person.get("password");
			System.out.println(password);
		}
		
	}

}
