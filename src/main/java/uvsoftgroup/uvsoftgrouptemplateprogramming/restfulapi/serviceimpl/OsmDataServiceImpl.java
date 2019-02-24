package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.dao.OsmDataDao;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmExtendedFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmRoadFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.service.OsmDataService;

@Service
public class OsmDataServiceImpl implements OsmDataService{
	private static final Logger logger=LoggerFactory.getLogger(OsmDataServiceImpl.class);
	@Autowired
	private OsmDataDao osmDataDao;
	
	
	@Override
	public List<OsmRoadFeatureOutputTO> findAllOsmRoad(String jsonOb) throws Exception {
		logger.info("-----findAllOsmRoad----------");
		List<OsmRoadFeatureOutputTO> list=osmDataDao.findAllOsmRoad(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmRoadFeatureOutputTO>(list);	
		}
		
	}
	

	@Override
	public List<OsmBasicFeatureOutputTO> findAllOsmBuilding(String jsonOb) throws Exception {
		logger.info("-----findAllOsmBuilding----------");
		List<OsmBasicFeatureOutputTO> list=osmDataDao.findAllOsmBuilding(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmBasicFeatureOutputTO>(list);	
		}
		
	}

	@Override
	public List<OsmBasicFeatureOutputTO> findAllOsmLanduse(String jsonOb) throws Exception {
		logger.info("-----findAllOsmLanduse----------");
		List<OsmBasicFeatureOutputTO> list=osmDataDao.findAllOsmLanduse(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmBasicFeatureOutputTO>(list);	
		}
	}

	@Override
	public List<OsmBasicFeatureOutputTO> findAllOsmNature(String jsonOb) throws Exception {
		logger.info("-----findAllOsmNature----------");
		List<OsmBasicFeatureOutputTO> list=osmDataDao.findAllOsmNature(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmBasicFeatureOutputTO>(list);	
		}
	}
	
	@Override
	public List<OsmExtendedFeatureOutputTO> findAllOsmPlace(String jsonOb) throws Exception {
		logger.info("-----findAllOsmNature----------");
		List<OsmExtendedFeatureOutputTO> list=osmDataDao.findAllOsmPlace(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);	
		}
	}
	
	
	@Override
	public List<OsmExtendedFeatureOutputTO> findAllOsmPoint(String jsonOb) throws Exception {
		logger.info("-----findAllOsmPoint----------");
		List<OsmExtendedFeatureOutputTO> list=osmDataDao.findAllOsmPoint(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);	
		}
	}
	
	@Override
	public List<OsmBasicFeatureOutputTO> findAllOsmRailway(String jsonOb) throws Exception {
		logger.info("-----findAllOsmRailway----------");
		List<OsmBasicFeatureOutputTO> list=osmDataDao.findAllOsmRailway(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmBasicFeatureOutputTO>(list);	
		}
	}
	
	@Override
	public List<OsmExtendedFeatureOutputTO> findAllOsmWaterway(String jsonOb) throws Exception {
		logger.info("-----findAllOsmWaterway----------");
		List<OsmExtendedFeatureOutputTO> list=osmDataDao.findAllOsmWaterway(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);	
		}
	}
	
	@Override
	public List<OsmExtendedFeatureOutputTO> findAllOsmWaterway2(String jsonOb) throws Exception {
		logger.info("-----findAllOsmWaterway2----------");
		List<OsmExtendedFeatureOutputTO> list=osmDataDao.findAllOsmWaterway2(jsonOb);
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);	
		}
	}
}
