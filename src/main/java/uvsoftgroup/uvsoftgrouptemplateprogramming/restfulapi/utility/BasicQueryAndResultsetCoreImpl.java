package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.utility;

import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureInputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmExtendedFeatureInputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmExtendedFeatureOutputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmRoadFeatureInputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmRoadFeatureOutputTO;

public class BasicQueryAndResultsetCoreImpl implements BasicQueryAndResultsetCore {
	private static final Logger logger = LoggerFactory.getLogger(BasicQueryAndResultsetCoreImpl.class);
	
	
	public StringBuilder setOsmRoadFeatureBuildingQueryBuilder(OsmRoadFeatureInputTO osmRoadFeatureInputTO)
			throws Exception {
		
		StringBuilder query = new StringBuilder();
		String queryPart="SELECT os.*,ST_AsText(os.geom) as stringGeomValue from osm_roads as os where 1=1 ";
		query.append(queryPart);
		query.append(setOsmRoadFeatureQueryBuilder(osmRoadFeatureInputTO));
		return query;


	}
	

	public StringBuilder setOsmBasicFeatureRailwayQueryBuilder(OsmBasicFeatureInputTO osmbinputto) throws Exception {
		StringBuilder query = new StringBuilder();
		String queryPart="SELECT os.gid,os.osm_id,os.name, os.type, ST_AsText(os.geom) as stringGeomValue from osm_railways as os where 1=1 ";
		query.append(queryPart);
		query.append(setOsmBasicCommonFeatureQueryBuilder(osmbinputto));
		return query;

	}

	public StringBuilder setOsmBasicFeatureWaterwayQueryBuilder(OsmBasicFeatureInputTO osmbinputto) throws Exception {
		StringBuilder query = new StringBuilder();
		String queryPart="SELECT os.gid,os.osm_id,os.name, os.type,os.width, ST_AsText(os.geom) as stringGeomValue from osm_waterways as os where 1=1 ";
		query.append(queryPart);
		query.append(setOsmBasicCommonFeatureQueryBuilder(osmbinputto));
		return query;

	}
	
	public StringBuilder setOsmBasicFeatureNatureQueryBuilder(OsmBasicFeatureInputTO osmbinputto) throws Exception {
		StringBuilder query = new StringBuilder();
		String queryPart="SELECT os.gid,os.osm_id,os.name, os.type, ST_AsText(os.geom) as stringGeomValue from osm_natural as os where 1=1 ";
		query.append(queryPart);
		query.append(setOsmBasicCommonFeatureQueryBuilder(osmbinputto));
		return query;

	}

	public StringBuilder setOsmBasicFeaturePlaceQueryBuilder(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO)
			throws Exception {

		StringBuilder query = new StringBuilder();
		String queryPart="SELECT os.gid,os.osm_id,os.name, os.type, os.population, ST_AsText(os.geom) as stringGeomValue from osm_places as os where 1=1 ";
		query.append(queryPart);
		query.append(setOsmBasicCommonFeatureQueryBuilder(osmExtendedFeatureInputTO));
		return query;

	}

	public StringBuilder setOsmBasicFeatureLanduseQueryBuilder(OsmBasicFeatureInputTO osmbinputto) throws Exception {

		StringBuilder query = new StringBuilder();
		String queryPart="SELECT os.gid,os.osm_id,os.name, os.type, ST_AsText(os.geom) as stringGeomValue from osm_landuse as os where 1=1 ";
		query.append(queryPart);
		query.append(setOsmBasicCommonFeatureQueryBuilder(osmbinputto));
		return query;

	}

	public StringBuilder setOsmBasicFeatureBuildingQueryBuilder(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws Exception {
		StringBuilder query = new StringBuilder();
		String queryPart="SELECT os.gid,os.osm_id,os.name, os.type, ST_AsText(os.geom) as stringGeomValue from osm_buildings as os where 1=1 ";
		query.append(queryPart);
		query.append(setOsmBasicCommonFeatureQueryBuilder(osmBasicFeatureInputTO));
		return query;


	}

	public StringBuilder setOsmBasicFeaturePointQueryBuilder(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO)
			throws Exception {
		StringBuilder query = new StringBuilder();
		String queryPart="SELECT os.gid,os.osm_id,os.name, os.type,os.timestamp, ST_AsText(os.geom) as stringGeomValue from osm_points as os where 1=1 ";
		query.append(queryPart);
		query.append(setOsmBasicCommonFeatureQueryBuilder(osmExtendedFeatureInputTO));
		return query;

	}

	
	public void setOsmRoadFeatureBuildingOutputTO(ResultSet rSet, OsmRoadFeatureOutputTO osf) throws Exception {
		setOsmBasicRoadFeatureOutputTO(rSet, osf);
	}
	
	
	public void setOsmBasicFeatureRailwayOutputTO(ResultSet rSet, OsmBasicFeatureOutputTO osf) throws Exception {
		setOsmBasicCommonFeatureOutputTO(rSet, osf);
	}
	
	public void setOsmBasicFeatureLanduseOutputTO(ResultSet rSet, OsmBasicFeatureOutputTO osf) throws Exception {
		setOsmBasicCommonFeatureOutputTO(rSet, osf);
	}

	public void setOsmBasicFeatureBuildingOutputTO(ResultSet rSet, OsmBasicFeatureOutputTO osf) throws Exception {
		setOsmBasicCommonFeatureOutputTO(rSet, osf);
	}

	public void setOsmBasicFeatureNatureOutputTO(ResultSet rSet, OsmBasicFeatureOutputTO osf) throws Exception {
		setOsmBasicCommonFeatureOutputTO(rSet, osf);
	}

	public void setOsmExtendedFeaturePointOutputTO(ResultSet rSet, OsmExtendedFeatureOutputTO osf) throws Exception {
		setOsmExtendedCommonFeatureOutputTO(rSet, osf);
		osf.setOsmTimestamp(rSet.getString("timestamp"));

	}
	
	public static void setOsmExtendedFeatureWaterwayOutputTO(ResultSet rSet, OsmExtendedFeatureOutputTO osf) throws Exception {
		setOsmExtendedCommonFeatureOutputTO(rSet, osf);
		osf.setOsmWidth(rSet.getDouble("width"));

	}
	

	public void setOsmExtendedFeaturePlaceOutputTO(ResultSet rSet, OsmExtendedFeatureOutputTO osf) throws Exception {
		setOsmExtendedCommonFeatureOutputTO(rSet, osf);
		osf.setOsmPopulation(rSet.getDouble("population"));

	}
	public void setOsmBasicRoadFeatureOutputTO(ResultSet rSet, OsmRoadFeatureOutputTO osf) throws Exception {
		osf.setOsmGId(rSet.getLong("gid"));
		osf.setOsmId(rSet.getString("osm_id"));
		osf.setOsmName(rSet.getString("name"));
		osf.setOsmType(rSet.getString("type"));
		osf.setOsmMaxSpeed(rSet.getDouble("maxspeed"));
		osf.setOsmGeom(rSet.getString("stringGeomValue"));
	}
	
	
	public static void setOsmExtendedCommonFeatureOutputTO(ResultSet rSet, OsmExtendedFeatureOutputTO osf) throws Exception {
		osf.setOsmGId(rSet.getLong("gid"));
		osf.setOsmId(rSet.getString("osm_id"));
		osf.setOsmName(rSet.getString("name"));
		osf.setOsmType(rSet.getString("type"));
		osf.setOsmGeom(rSet.getString("stringGeomValue"));
	}

	public void setOsmBasicCommonFeatureOutputTO(ResultSet rSet, OsmBasicFeatureOutputTO osf) throws Exception {
		osf.setOsmGId(rSet.getLong("gid"));
		osf.setOsmId(rSet.getString("osm_id"));
		osf.setOsmName(rSet.getString("name"));
		osf.setOsmType(rSet.getString("type"));
		osf.setOsmGeom(rSet.getString("stringGeomValue"));
	}
	
	public String setOsmRoadFeatureQueryBuilder(OsmRoadFeatureInputTO osmbinputto) throws Exception {

		StringBuilder query = new StringBuilder();
		
		query.append(" and os.name is not null ");

		if (osmbinputto.getOsmId() != null) {
			query.append(" and os.osm_id ILIKE ('%" + osmbinputto.getOsmId() + "%')");
		}

		if (osmbinputto.getOsmName() != null) {
			query.append(" and os.name ILIKE ('%" + osmbinputto.getOsmName() + "%')");
		}

		if (osmbinputto.getOsmType() != null) {
			query.append(" and os.type ILIKE ('%" + osmbinputto.getOsmType() + "%')");
		}

		query.append(" ORDER BY  os.osm_id ");

		if (osmbinputto.getSearchLimit() != null || osmbinputto.getSearchOffsetValue() != null) {
			query.append(" LIMIT " + osmbinputto.getSearchLimit() + " OFFSET "
					+ osmbinputto.getSearchOffsetValue());
		}

		else {
			query.append(" LIMIT 10 OFFSET 0 ");
		}

		return query.toString();

	}
	
	public String setOsmBasicCommonFeatureQueryBuilder(OsmBasicFeatureInputTO osmbinputto) throws Exception {

		StringBuilder query = new StringBuilder();
		
		query.append(" and os.name is not null ");
       /*
		if (osmbinputto.getOsmGId() != null || osmbinputto.getOsmGId()!=0) {
			query.append(" and os.gid IN ("+osmbinputto.getOsmGId()+")");
		}
		*/
		
		if (osmbinputto.getOsmId() != null) {
			query.append(" and os.osm_id ILIKE ('%" + osmbinputto.getOsmId() + "%')");
		}

		if (osmbinputto.getOsmName() != null) {
			query.append(" and os.name ILIKE ('%" + osmbinputto.getOsmName() + "%')");
		}

		if (osmbinputto.getOsmType() != null) {
			query.append(" and os.type ILIKE ('%" + osmbinputto.getOsmType() + "%')");
		}

		query.append(" ORDER BY  os.osm_id ");

		if (osmbinputto.getSearchLimit() != null || osmbinputto.getSearchOffsetValue() != null) {
			query.append(" LIMIT " + osmbinputto.getSearchLimit() + " OFFSET "
					+ osmbinputto.getSearchOffsetValue());
		}

		else {
			query.append(" LIMIT 10 OFFSET 0 ");
		}

		return query.toString();

	}
	
	
	public String setOsmExtendedCommonFeatureQueryBuilder(OsmExtendedFeatureInputTO osmbinputto) throws Exception {

		StringBuilder query = new StringBuilder();
		
		query.append(" and os.name is not null ");
		
		if (osmbinputto.getOsmGId() != null ||osmbinputto.getOsmGId()!=0) {
			query.append(" and os.gid IN ("+osmbinputto.getOsmGId()+")");
		}

		if (osmbinputto.getOsmGId() != null) {
			query.append(" and os.gid IN ("+osmbinputto.getOsmGId()+")");
		}
		
		if (osmbinputto.getOsmId() != null) {
			query.append(" and os.osm_id ILIKE ('%" + osmbinputto.getOsmId() + "%')");
		}

		if (osmbinputto.getOsmName() != null) {
			query.append(" and os.name ILIKE ('%" + osmbinputto.getOsmName() + "%')");
		}

		if (osmbinputto.getOsmType() != null) {
			query.append(" and os.type ILIKE ('%" + osmbinputto.getOsmType() + "%')");
		}

		query.append(" ORDER BY  os.osm_id ");

		if (osmbinputto.getSearchLimit() != null || osmbinputto.getSearchOffsetValue() != null) {
			query.append(" LIMIT " + osmbinputto.getSearchLimit() + " OFFSET "
					+ osmbinputto.getSearchOffsetValue());
		}

		else {
			query.append(" LIMIT 10 OFFSET 0 ");
		}

		return query.toString();

	}
	

}
