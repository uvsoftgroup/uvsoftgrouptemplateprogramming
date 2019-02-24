package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmExtendedFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmRoadFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.service.OsmDataService;

@RestController
@RequestMapping("/osmdata")
public class OsmDataController {
	@Autowired
	private OsmDataService osmDataService;

	@RequestMapping(value = "/osmroads", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@ResponseBody
	public List<OsmRoadFeatureOutputTO> findAllOsmRoad(
			@RequestParam("osmRoadFeatureInputTO") String osmRoadFeatureInputTO) throws Exception {
		List<OsmRoadFeatureOutputTO> list = osmDataService.findAllOsmRoad(osmRoadFeatureInputTO);
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmRoadFeatureOutputTO>(list);
		}
	}

	@RequestMapping(value = "/osmbuildings", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@ResponseBody
	public List<OsmBasicFeatureOutputTO> findAllOsmBuilding(
			@RequestParam("osmBasicFeatureInputTO") String osmBasicFeatureInputTO) throws Exception {
		List<OsmBasicFeatureOutputTO> list = osmDataService.findAllOsmBuilding(osmBasicFeatureInputTO);
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}
	}

	@RequestMapping(value = "/osmlanduses", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@ResponseBody
	public List<OsmBasicFeatureOutputTO> findAllOsmLanduse(
			@RequestParam("osmBasicFeatureInputTO") String osmBasicFeatureInputTO) throws Exception {
		List<OsmBasicFeatureOutputTO> list = osmDataService.findAllOsmLanduse(osmBasicFeatureInputTO);
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}
	}

	@RequestMapping(value = "/osmnatures", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@ResponseBody
	public List<OsmBasicFeatureOutputTO> findAllOsmNature(
			@RequestParam("osmBasicFeatureInputTO") String osmBasicFeatureInputTO) throws Exception {
		List<OsmBasicFeatureOutputTO> list = osmDataService.findAllOsmNature(osmBasicFeatureInputTO);
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}
	}

	@RequestMapping(value = "/osmrailways", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@ResponseBody
	public List<OsmBasicFeatureOutputTO> findAllOsmRailway(
			@RequestParam("osmBasicFeatureInputTO") String osmBasicFeatureInputTO) throws Exception {
		List<OsmBasicFeatureOutputTO> list = osmDataService.findAllOsmRailway(osmBasicFeatureInputTO);
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}
	}

	@RequestMapping(value = "/osmplaces", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@ResponseBody
	public List<OsmExtendedFeatureOutputTO> findAllOsmPlace(
			@RequestParam("osmExtendedFeatureInputTO") String osmExtendedFeatureInputTO) throws Exception {
		List<OsmExtendedFeatureOutputTO> list = osmDataService.findAllOsmPlace(osmExtendedFeatureInputTO);
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}
	}

	@RequestMapping(value = "/osmpoints", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@ResponseBody
	public List<OsmExtendedFeatureOutputTO> findAllOsmPoint(
			@RequestParam("osmExtendedFeatureInputTO") String osmExtendedFeatureInputTO) throws Exception {
		List<OsmExtendedFeatureOutputTO> list = osmDataService.findAllOsmPoint(osmExtendedFeatureInputTO);
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}
	}

	@RequestMapping(value = "/osmwaterways", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@ResponseBody
	public List<OsmExtendedFeatureOutputTO> findAllOsmWaterway(
			@RequestParam("osmExtendedFeatureInputTO") String osmExtendedFeatureInputTO) throws Exception {
		List<OsmExtendedFeatureOutputTO> list = osmDataService.findAllOsmWaterway(osmExtendedFeatureInputTO);
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}
	}

}
