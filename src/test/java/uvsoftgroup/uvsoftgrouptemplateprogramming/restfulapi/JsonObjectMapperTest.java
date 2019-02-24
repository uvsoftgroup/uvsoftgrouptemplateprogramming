package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.Stopage;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.utility.JsonObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonObjectMapperTest {
	JsonObjectMapper jom = new JsonObjectMapper();

	@Test
	@Ignore
	public void getStopageFromJsonStringTestCase() throws JsonParseException, JsonMappingException, IOException {

		String jsonString = "{ \"stId\" : 100, \"stName\" : \"test\" }";
		Stopage stopage = jom.getStopageFromJsonString(jsonString);
		System.out.println(String.format("getStId():%S,getStName():%S", stopage.getStId(), stopage.getStName()));
	}

	@Test
	@Ignore
	public void getStopagesFromJsonStringTestCase() throws JsonParseException, JsonMappingException, IOException {
		String jsonString = "[{ \"stId\" : 100, \"stName\" : \"test\" },{ \"stId\" :101, \"stName\" : \"test1\" }]";
		List<Stopage> stopages = jom.getStopagesFromJsonString(jsonString);
		stopages.forEach(stopage -> System.out
				.println(String.format("getStId():%S,getStName():%S", stopage.getStId(), stopage.getStName())));
	}

	@Test
	@Ignore
	public void getStopagePairFromJsonStringTestCase() throws JsonParseException, JsonMappingException, IOException {

		String jsonString = "{ \"stId\" :100, \"stName\" : \"test\" }";
		Map<Long, Stopage> stopageMap = jom.getStopagePairFromJsonString(jsonString);
		stopageMap.forEach((k, stopage) -> System.out
				.println(String.format("getStId():%S,getStName():%S", stopage.getStId(), stopage.getStName())));
	}

}
