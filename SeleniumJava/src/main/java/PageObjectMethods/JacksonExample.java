
package PageObjectMethods;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample {
	public static List<HashMap<String,String>> getJsonDataToHasmap() throws IOException {
		String jsonContent =FileUtils.readFileToString(new File(System.getProperty("user.dir")+"/src//main//java//jsondata//jsndata.json"
				+ ""),StandardCharsets.UTF_8);
		System.out.println(jsonContent+"  : length "+jsonContent.length()+"first character  ::"+ jsonContent.charAt(0));
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,  new TypeReference<List<HashMap<String, String>>>(){});
		return data;
	}
	
	/////////////////////////////////////////////////////////////////////////////
	

	    private String color;
	    private String type;

	    // standard getters setters
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JacksonExample obj = new JacksonExample();
		obj.color ="";
		

	}

}
