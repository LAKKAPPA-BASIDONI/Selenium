package jsondata;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsondataclass {
	
	public List<HashMap<String,String>> getJsonDataToHasmap() throws IOException {
		String jsonContent =FileUtils.readFileToString(new File(System.getProperty("user.dir")+"/src//main//java//jsondata//jsndata.json"
				+ ""),StandardCharsets.UTF_8);
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,  new TypeReference<List<HashMap<String, String>>>(){});
		return data;
	}

}
