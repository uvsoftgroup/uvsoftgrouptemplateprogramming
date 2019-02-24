package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmExtendedFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmRoadFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.service.OsmDataService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OsmDataPortalTest {
@Autowired
private OsmDataService osmDataService;
@Test
@Ignore
public void findAllOsmBuildingTestSuite() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"23852\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Medicine\"}";
	String jsonString4 = "{ \"searchLimit\" : 100, \"searchOffsetValue\" : 0}";
	String jsonString5 = "{ \"osmGId\": 186 }";

	//findAllOsmBuildingTestCase(jsonString);
	//findAllOsmBuildingTestCase(jsonString1);
	//findAllOsmBuildingTestCase(jsonString2);
	findAllOsmBuildingTestCase(jsonString3);
	//findAllOsmBuildingTestCase(jsonString4);
	//findAllOsmBuildingTestCase(jsonString5);
}


private void findAllOsmBuildingTestCase(String josnString) throws Exception{
	List<OsmBasicFeatureOutputTO> list=osmDataService.findAllOsmBuilding(josnString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
			s.getOsmGeom())));
}


@Test
@Ignore
public void findAllOsmLandsueTestCase() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"23852\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Medicine\"}";
	String jsonString4 = "{ \"searchLimit\" : 10, \"searchOffsetValue\" : 10}";
	String jsonString5 = "{ \"searchLimit\" : 10}";
	
	findAllOsmLandsueTestCase(jsonString);
	findAllOsmLandsueTestCase(jsonString1);
	findAllOsmLandsueTestCase(jsonString2);
	findAllOsmLandsueTestCase(jsonString3);
	findAllOsmLandsueTestCase(jsonString4);
	findAllOsmLandsueTestCase(jsonString5);
}

private void findAllOsmLandsueTestCase(String jsonString) throws Exception{
	List<OsmBasicFeatureOutputTO> list=osmDataService.findAllOsmLanduse(jsonString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
			s.getOsmGeom())));
}


@Test
@Ignore
public void findAllOsmNatureTestSuite() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"23852\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Medicine\"}";
	String jsonString4 = "{ \"searchLimit\" : 10, \"searchOffsetValue\" : 10}";
	String jsonString5 = "{ \"searchLimit\" : 10}";
	
	findAllOsmNatureTestCase(jsonString);
	findAllOsmNatureTestCase(jsonString1);
	findAllOsmNatureTestCase(jsonString2);
	findAllOsmNatureTestCase(jsonString3);
	findAllOsmNatureTestCase(jsonString4);
	findAllOsmNatureTestCase(jsonString5);
}

private void findAllOsmNatureTestCase(String jsonString) throws Exception{
	List<OsmBasicFeatureOutputTO> list=osmDataService.findAllOsmNature(jsonString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),s.getOsmGeom())));
}


@Test
@Ignore
public void findAllOsmPlaceTestSuite() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"23852\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Medicine\"}";
	String jsonString4 = "{ \"searchLimit\" : 10, \"searchOffsetValue\" : 10}";
	String jsonString5 = "{ \"searchLimit\" : 10}";
	
	findAllOsmPlaceTestCase(jsonString);
	findAllOsmPlaceTestCase(jsonString1);
	findAllOsmPlaceTestCase(jsonString2);
	findAllOsmPlaceTestCase(jsonString3);
	findAllOsmPlaceTestCase(jsonString4);
	findAllOsmPlaceTestCase(jsonString5);
}

private void findAllOsmPlaceTestCase(String jsonString) throws Exception{
	List<OsmExtendedFeatureOutputTO> list=osmDataService.findAllOsmPlace(jsonString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmPopulation():%S,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
			s.getOsmPopulation(),s.getOsmGeom())));
}


@Test
@Ignore
public void findAllOsmPointTestSuite() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"23852\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Medicine\"}";
	String jsonString4 = "{ \"searchLimit\" : 10, \"searchOffsetValue\" : 10}";
	String jsonString5 = "{ \"searchLimit\" : 10}";
	findAllOsmPointTestCase(jsonString);
	findAllOsmPointTestCase(jsonString1);
	findAllOsmPointTestCase(jsonString2);
	findAllOsmPointTestCase(jsonString3);
	findAllOsmPointTestCase(jsonString4);
	findAllOsmPointTestCase(jsonString5);
}

public void findAllOsmPointTestCase(String jsonString) throws Exception{
	List<OsmExtendedFeatureOutputTO> list=osmDataService.findAllOsmPoint(jsonString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmPopulation():%S,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
			s.getOsmPopulation(),s.getOsmGeom())));
}

@Test
@Ignore
public void findAllOsmRailwayTestSuite() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"23852\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Medicine\"}";
	String jsonString4 = "{ \"searchLimit\" : 10, \"searchOffsetValue\" : 10}";
	String jsonString5 = "{ \"searchLimit\" : 10}";
	
	findAllOsmRailwayTestCase(jsonString);
	findAllOsmRailwayTestCase(jsonString1);
	findAllOsmRailwayTestCase(jsonString2);
	findAllOsmRailwayTestCase(jsonString3);
	findAllOsmRailwayTestCase(jsonString4);
	findAllOsmRailwayTestCase(jsonString5);
}

private void findAllOsmRailwayTestCase(String jsonString) throws Exception{
	List<OsmBasicFeatureOutputTO> list=osmDataService.findAllOsmRailway(jsonString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
			s.getOsmGeom())));
}


@Test
@Ignore
public void findAllOsmWaterwayTestSuite() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"23852\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Medicine\"}";
	String jsonString4 = "{ \"searchLimit\" : 10, \"searchOffsetValue\" :0,\"osmName\" : \"Kushiyara River\"}";
	String jsonString5 = "{ \"searchLimit\" : 10}";
	findAllOsmWaterwayTestCase(jsonString);
	findAllOsmWaterwayTestCase(jsonString1);
	findAllOsmWaterwayTestCase(jsonString2);
	findAllOsmWaterwayTestCase(jsonString3);
	findAllOsmWaterwayTestCase(jsonString4);
	findAllOsmWaterwayTestCase(jsonString5);
}


private void findAllOsmWaterwayTestCase(String jsonString) throws Exception{
	List<OsmExtendedFeatureOutputTO> list=osmDataService.findAllOsmWaterway(jsonString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmWidth():%S,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
			s.getOsmWidth(),s.getOsmGeom())));
}


@Test
@Ignore
public void findAllOsmWaterway2TestSuite() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"105561925\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Someshwari\"}";
	String jsonString4 = "{ \"searchLimit\" : 10, \"searchOffsetValue\" :0,\"osmName\" : \"Kushiyara River\"}";
	String jsonString5 = "{ \"searchLimit\" : 5}";
	
	findAllOsmWaterway2TestCase(jsonString);
	findAllOsmWaterway2TestCase(jsonString1);
	findAllOsmWaterway2TestCase(jsonString2);
	findAllOsmWaterway2TestCase(jsonString3);
	findAllOsmWaterway2TestCase(jsonString4);
	findAllOsmWaterway2TestCase(jsonString5);
}

private void findAllOsmWaterway2TestCase(String jsonString) throws Exception{
	List<OsmExtendedFeatureOutputTO> list=osmDataService.findAllOsmWaterway2(jsonString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmWidth():%S,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
			s.getOsmWidth(),s.getOsmGeom())));
}


@Test
@Ignore
public void findAllOsmRoadTestSuite() throws Exception{
	String jsonString = "{}";
	String jsonString1 = "{ \"osmId\" : \"23852\"}";
	String jsonString2 = "{ \"osmId\" : \"23852\", \"osmName\" : \"Medicine\"}";
	String jsonString3 = "{ \"osmName\" : \"Medicine\"}";
	String jsonString4 = "{ \"searchLimit\" : 10, \"searchOffsetValue\" : 10}";
	String jsonString5 = "{ \"searchLimit\" : 10}";
	findAllOsmRoadTestCase(jsonString);
	findAllOsmRoadTestCase(jsonString1);
	findAllOsmRoadTestCase(jsonString2);
	findAllOsmRoadTestCase(jsonString3);
	findAllOsmRoadTestCase(jsonString4);
	findAllOsmRoadTestCase(jsonString5);
}

public void findAllOsmRoadTestCase(String jsonString) throws Exception{
	
	List<OsmRoadFeatureOutputTO> list=osmDataService.findAllOsmRoad(jsonString);
	list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
			+ "getOsmType():%s,getOsmMaxSpeed():%S,getOsmGeom():%s", 
			s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
			s.getOsmMaxSpeed(),s.getOsmGeom())));
}


}
