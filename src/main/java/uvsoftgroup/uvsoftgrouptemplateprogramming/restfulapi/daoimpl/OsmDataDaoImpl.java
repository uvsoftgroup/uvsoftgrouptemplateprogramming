package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.dao.OsmDataDao;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureInputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmExtendedFeatureInputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmExtendedFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmRoadFeatureInputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmRoadFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.utility.BasicQueryAndResultsetCoreImpl;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.utility.JsonObjectMapper;

@Repository
public class OsmDataDaoImpl extends BasicQueryAndResultsetCoreImpl implements OsmDataDao {
	private static final Logger logger = LoggerFactory.getLogger(OsmDataDaoImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	JsonObjectMapper jsonObjectMapper = new JsonObjectMapper();

	/**
	* 
	*/
	public List<OsmRoadFeatureOutputTO> findAllOsmRoad(String jsonOb) throws Exception {
		logger.info("----findAllOsmRoad()--------------");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;
		conn = jdbcTemplate.getDataSource().getConnection();

		OsmRoadFeatureInputTO osmRoadFeatureInputTO = (OsmRoadFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmRoadFeatureInputTO.class);

		StringBuilder query = setOsmRoadFeatureBuildingQueryBuilder(osmRoadFeatureInputTO);

		logger.info("Query:" + query.toString());
		stmt = conn.createStatement();
		rSet = stmt.executeQuery(query.toString());

		List<OsmRoadFeatureOutputTO> list = new ArrayList<OsmRoadFeatureOutputTO>();
		OsmRoadFeatureOutputTO osmRoadFeatureOutputTO = new OsmRoadFeatureOutputTO();
		while (rSet.next()) {
			osmRoadFeatureOutputTO = new OsmRoadFeatureOutputTO();
			setOsmRoadFeatureBuildingOutputTO(rSet, osmRoadFeatureOutputTO);
			list.add(osmRoadFeatureOutputTO);
		}
		if (list.size() > 0 && !list.isEmpty()) {
			logger.info("Number of Record Found:" + list.size());
			return list;
		} else {
			logger.info("No Record Found!");
			return new ArrayList<OsmRoadFeatureOutputTO>(list);
		}
	}

	/**
	* 
	*/
	public List<OsmBasicFeatureOutputTO> findAllOsmBuilding(String jsonOb) throws Exception {
		logger.info("----findAllOsmBuilding()--------------");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;
		conn = jdbcTemplate.getDataSource().getConnection();

		OsmBasicFeatureInputTO osmBasicFeatureInputTO = (OsmBasicFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmBasicFeatureInputTO.class);

		StringBuilder query = setOsmBasicFeatureBuildingQueryBuilder(osmBasicFeatureInputTO);

		logger.info("Query:" + query.toString());
		stmt = conn.createStatement();
		rSet = stmt.executeQuery(query.toString());

		// Geometry geom = null;
		// WKTReader wktr = new WKTReader();

		List<OsmBasicFeatureOutputTO> list = new ArrayList<OsmBasicFeatureOutputTO>();
		OsmBasicFeatureOutputTO osmBuildingOutputTO = new OsmBasicFeatureOutputTO();
		while (rSet.next()) {
			osmBuildingOutputTO = new OsmBasicFeatureOutputTO();
			setOsmBasicFeatureBuildingOutputTO(rSet, osmBuildingOutputTO);
			list.add(osmBuildingOutputTO);
		}
		if (list.size() > 0 && !list.isEmpty()) {
			logger.info("Number of Record Found:" + list.size());
			return list;
		} else {
			logger.info("No Record Found!");
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}
	}

	/**
	    * 
	    */
	public List<OsmBasicFeatureOutputTO> findAllOsmLanduse(String jsonOb) throws Exception {
		logger.info("----findAllOsmLanduse()--------------");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;

		OsmBasicFeatureInputTO osmBasicFeatureInputTO = (OsmBasicFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmBasicFeatureInputTO.class);
		try {
			conn = jdbcTemplate.getDataSource().getConnection();

			StringBuilder query = setOsmBasicFeatureLanduseQueryBuilder(osmBasicFeatureInputTO);

			logger.info("Query:" + query.toString());
			stmt = conn.createStatement();
			rSet = stmt.executeQuery(query.toString());

			List<OsmBasicFeatureOutputTO> list = new ArrayList<>();
			OsmBasicFeatureOutputTO osmBasicFeatureOutputTO = new OsmBasicFeatureOutputTO();

			while (rSet.next()) {
				osmBasicFeatureOutputTO = new OsmBasicFeatureOutputTO();
				setOsmBasicFeatureLanduseOutputTO(rSet, osmBasicFeatureOutputTO);
				list.add(osmBasicFeatureOutputTO);
			}
			if (list.size() > 0 && !list.isEmpty()) {
				logger.info("Number of Record Found:" + list.size());
				return list;
			} else {
				logger.info("No Record Found!");
				return new ArrayList<OsmBasicFeatureOutputTO>(list);
			}
		}

		catch (Exception e) {
			throw new Exception(e);
		}

	}

	/**
	    * 
	    */
	public List<OsmBasicFeatureOutputTO> findAllOsmNature(String jsonOb) throws Exception {
		logger.info("----findAllOsmNature()--------------");

		OsmBasicFeatureInputTO osmBasicFeatureInputTO = (OsmBasicFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmBasicFeatureInputTO.class);

		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;
		conn = jdbcTemplate.getDataSource().getConnection();

		StringBuilder query = setOsmBasicFeatureNatureQueryBuilder(osmBasicFeatureInputTO);

		logger.info("Query:" + query.toString());
		stmt = conn.createStatement();
		rSet = stmt.executeQuery(query.toString());

		List<OsmBasicFeatureOutputTO> list = new ArrayList<OsmBasicFeatureOutputTO>();
		OsmBasicFeatureOutputTO osmBasicFeatureOutputTO = new OsmBasicFeatureOutputTO();

		while (rSet.next()) {
			osmBasicFeatureOutputTO = new OsmBasicFeatureOutputTO();
			setOsmBasicFeatureNatureOutputTO(rSet, osmBasicFeatureOutputTO);
			list.add(osmBasicFeatureOutputTO);
		}
		if (list.size() > 0 && !list.isEmpty()) {
			logger.info("Number of Record Found:" + list.size());
			return list;
		} else {
			logger.info("No Record Found!");
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}
	}

	/**
	    * 
	    */
	public List<OsmExtendedFeatureOutputTO> findAllOsmPlace(String jsonOb) throws Exception {
		logger.info("----findAllOsmPlace()--------------");

		OsmExtendedFeatureInputTO osmExtendedFeatureInputTO = (OsmExtendedFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmExtendedFeatureInputTO.class);

		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;
		conn = jdbcTemplate.getDataSource().getConnection();

		StringBuilder query = setOsmBasicFeaturePlaceQueryBuilder(osmExtendedFeatureInputTO);
		logger.info("Query:" + query.toString());
		stmt = conn.createStatement();
		rSet = stmt.executeQuery(query.toString());

		List<OsmExtendedFeatureOutputTO> list = new ArrayList<OsmExtendedFeatureOutputTO>();
		OsmExtendedFeatureOutputTO osmBuildingOutputTO = new OsmExtendedFeatureOutputTO();

		while (rSet.next()) {
			osmBuildingOutputTO = new OsmExtendedFeatureOutputTO();
			setOsmExtendedFeaturePlaceOutputTO(rSet, osmBuildingOutputTO);
			list.add(osmBuildingOutputTO);
		}
		if (list.size() > 0 && !list.isEmpty()) {
			logger.info("Number of Record Found:" + list.size());
			return list;
		} else {
			logger.info("No Record Found!");
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}
	}

	/**
	    * 
	    */
	public List<OsmExtendedFeatureOutputTO> findAllOsmPoint(String jsonOb) throws Exception {
		logger.info("----findAllOsmPlace()--------------");

		OsmExtendedFeatureInputTO osmExtendedFeatureInputTO = (OsmExtendedFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmExtendedFeatureInputTO.class);

		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;
		conn = jdbcTemplate.getDataSource().getConnection();

		StringBuilder query = setOsmBasicFeaturePointQueryBuilder(osmExtendedFeatureInputTO);

		logger.info("Query:" + query.toString());
		stmt = conn.createStatement();
		rSet = stmt.executeQuery(query.toString());

		List<OsmExtendedFeatureOutputTO> list = new ArrayList<OsmExtendedFeatureOutputTO>();
		OsmExtendedFeatureOutputTO osmBuildingOutputTO = new OsmExtendedFeatureOutputTO();

		while (rSet.next()) {
			osmBuildingOutputTO = new OsmExtendedFeatureOutputTO();
			setOsmExtendedFeaturePointOutputTO(rSet, osmBuildingOutputTO);
			list.add(osmBuildingOutputTO);
		}
		if (list.size() > 0 && !list.isEmpty()) {
			logger.info("Number of Record Found:" + list.size());
			return list;
		} else {
			logger.info("No Record Found!");
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}
	}

	/**
	    * 
	    */
	public List<OsmBasicFeatureOutputTO> findAllOsmRailway(String jsonOb) throws Exception {
		logger.info("----findAllOsmRailway()--------------");

		OsmBasicFeatureInputTO osmBasicFeatureInputTO = (OsmBasicFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmBasicFeatureInputTO.class);

		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;
		conn = jdbcTemplate.getDataSource().getConnection();

		StringBuilder query = setOsmBasicFeatureRailwayQueryBuilder(osmBasicFeatureInputTO);
		logger.info("Query:" + query.toString());
		stmt = conn.createStatement();
		rSet = stmt.executeQuery(query.toString());

		List<OsmBasicFeatureOutputTO> list = new ArrayList<OsmBasicFeatureOutputTO>();
		OsmBasicFeatureOutputTO osmBasicFeatureOutputTO = new OsmBasicFeatureOutputTO();

		while (rSet.next()) {
			osmBasicFeatureOutputTO = new OsmBasicFeatureOutputTO();
			setOsmBasicFeatureRailwayOutputTO(rSet, osmBasicFeatureOutputTO);
			list.add(osmBasicFeatureOutputTO);
		}
		if (list.size() > 0 && !list.isEmpty()) {
			logger.info("Number of Record Found:" + list.size());
			return list;
		} else {
			logger.info("No Record Found!");
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}
	}

	/**
	    * 
	    */
	public List<OsmExtendedFeatureOutputTO> findAllOsmWaterway(String jsonOb) throws Exception {
		logger.info("----findAllOsmWaterway()--------------");

		OsmExtendedFeatureInputTO osmExtendedFeatureInputTO = (OsmExtendedFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmExtendedFeatureInputTO.class);

		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;
		conn = jdbcTemplate.getDataSource().getConnection();
		StringBuilder query = setOsmBasicFeatureWaterwayQueryBuilder(osmExtendedFeatureInputTO);
		logger.info("Query:" + query.toString());
		stmt = conn.createStatement();
		rSet = stmt.executeQuery(query.toString());

		List<OsmExtendedFeatureOutputTO> list = new ArrayList<OsmExtendedFeatureOutputTO>();
		OsmExtendedFeatureOutputTO osmExtendedFeatureOutputTO = new OsmExtendedFeatureOutputTO();

		while (rSet.next()) {
			osmExtendedFeatureOutputTO = new OsmExtendedFeatureOutputTO();
			setOsmExtendedFeatureWaterwayOutputTO(rSet, osmExtendedFeatureOutputTO);
			list.add(osmExtendedFeatureOutputTO);
		}
		if (list.size() > 0 && !list.isEmpty()) {
			logger.info("Number of Record Found:" + list.size());
			return list;
		} else {
			logger.info("No Record Found!");
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}
	}

	public List<OsmExtendedFeatureOutputTO> findAllOsmWaterway2(String jsonOb) throws Exception {
		logger.info("----findAllOsmWaterway2()--------------");

		OsmExtendedFeatureInputTO osmExtendedFeatureInputTO = (OsmExtendedFeatureInputTO) jsonObjectMapper
				.jsonStringToObjectConvertParam(jsonOb, OsmExtendedFeatureInputTO.class);

		StringBuilder query = setOsmBasicFeatureWaterwayQueryBuilder(osmExtendedFeatureInputTO);
		logger.info("Query:" + query.toString());
		List<OsmExtendedFeatureOutputTO> list = new ArrayList<OsmExtendedFeatureOutputTO>();
		jdbcTemplate.query(query.toString(), rs -> {
			while (rs.next()) {
				OsmExtendedFeatureOutputTO osmExtendedFeatureOutputTO = new OsmExtendedFeatureOutputTO();
				try {
					osmExtendedFeatureOutputTO = new OsmExtendedFeatureOutputTO();
					setOsmExtendedFeatureWaterwayOutputTO(rs, osmExtendedFeatureOutputTO);
				} catch (Exception e) {
					e.printStackTrace();
				}
				list.add(osmExtendedFeatureOutputTO);
			}
		});

		if (list.size() > 0 && !list.isEmpty()) {
			logger.info("Number of Record Found:" + list.size());
			return list;
		} else {
			logger.info("No Record Found!");
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}

	}
}
