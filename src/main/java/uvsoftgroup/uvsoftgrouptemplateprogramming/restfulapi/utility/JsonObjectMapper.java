package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.utility;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.Stopage;

public class JsonObjectMapper {

	/**
	 * 
	 * @param jsonObj
	 * @param valueType
	 * @return
	 * @throws Exception
	 */
	public <T> T jsonStringToObjectConvertParam(String jsonObj, Class<T> valueType) throws Exception {
		T outObj = null;
		String decodedUrl = URLDecoder.decode(jsonObj, "UTF-8");
		jsonObj = decodedUrl;
		ObjectMapper mapper = new ObjectMapper();
		outObj = (T) mapper.readValue(jsonObj, valueType);

		return outObj;
	}
	
    /**
     * 
     * @param json
     * @param valueType
     * @return
     * @throws Exception
     */
	public static <T> List<T> parseJsonArray(String json, Class<T> valueType)throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Class<T[]> arrayClass = (Class<T[]>) Class.forName("[L" +valueType.getName() + ";");
		T[] objects = mapper.readValue(json, arrayClass);
		return Arrays.asList(objects);
	}
	/**
	 * 
	 * @param jsonString
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public Stopage getStopageFromJsonString(String jsonString) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper objectMapper=new ObjectMapper();
		Stopage stopage =objectMapper.readValue(jsonString, Stopage.class);  	
		// from the file system
		// Stopage stopage= objectMapper.readValue(new File("path/json_car.json"), Stopage.class);
		// from the URL
		 // Stopage stopage= objectMapper.readValue(new URL("path/json_car.json"), Stopage.class);
		return stopage;
	}
	
	/**
	 * 
	 * @param jsonCarArray
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public List<Stopage> getStopagesFromJsonString(String jsonStopageArray) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper objectMapper=new ObjectMapper();
		List<Stopage> listStopage = objectMapper.readValue(jsonStopageArray, new TypeReference<List<Stopage>>(){});
		return listStopage;
	}
	
    /**
     * 
     * @param jsonString
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
	public Map<Long,Stopage> getStopagePairFromJsonString(String jsonString) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper objectMapper=new ObjectMapper();
		Map<Long, Stopage> mapStopage = objectMapper.readValue(jsonString, new TypeReference<Map<Long,Stopage>>(){});
		return mapStopage;
	}
	
}
