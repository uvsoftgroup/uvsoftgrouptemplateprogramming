package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GroupingUtils {
	
public static String buildGroupKey(List<String> columnList, ResultSet rSet) throws SQLException{
	
	StringBuilder groupKey=new StringBuilder(), delimiter=new StringBuilder("");
	for(String columnName:columnList){
		groupKey.append(delimiter);
		groupKey.append(rSet.getString(columnName));
		delimiter=new StringBuilder("_");
	}
	return groupKey.toString();

}
}
