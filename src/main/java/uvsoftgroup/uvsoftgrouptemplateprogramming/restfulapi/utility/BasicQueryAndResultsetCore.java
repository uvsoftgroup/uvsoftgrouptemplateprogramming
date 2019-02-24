package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.utility;

import java.sql.ResultSet;

import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureInputTO;
import uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model.OsmBasicFeatureOutputTO;


public interface BasicQueryAndResultsetCore {
	public void setOsmBasicFeatureBuildingOutputTO(ResultSet rSet, OsmBasicFeatureOutputTO osf) throws Exception;
	public StringBuilder setOsmBasicFeatureBuildingQueryBuilder(OsmBasicFeatureInputTO osmBasicFeatureInputTO) throws Exception;
	public StringBuilder setOsmBasicFeatureNatureQueryBuilder(OsmBasicFeatureInputTO osmbinputto) throws Exception;
	public StringBuilder setOsmBasicFeatureRailwayQueryBuilder(OsmBasicFeatureInputTO osmbinputto) throws Exception;

}
