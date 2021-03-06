package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmExtendedFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmRoadFeatureOutputTO;
@Service
public interface OsmDataService {
	public List<OsmRoadFeatureOutputTO> findAllOsmRoad(String jsonOb) throws Exception;
	
	public List<OsmBasicFeatureOutputTO> findAllOsmBuilding(String jsonOb) throws Exception;
	public List<OsmBasicFeatureOutputTO> findAllOsmLanduse(String jsonOb) throws Exception;
	public List<OsmBasicFeatureOutputTO> findAllOsmNature(String jsonOb) throws Exception;
	public List<OsmBasicFeatureOutputTO> findAllOsmRailway(String jsonOb) throws Exception;
	
	public List<OsmExtendedFeatureOutputTO> findAllOsmWaterway(String jsonOb) throws Exception;
	public List<OsmExtendedFeatureOutputTO> findAllOsmPlace(String jsonOb) throws Exception;
	public List<OsmExtendedFeatureOutputTO> findAllOsmPoint(String jsonOb) throws Exception;
	public List<OsmExtendedFeatureOutputTO> findAllOsmWaterway2(String jsonOb) throws Exception;
}
