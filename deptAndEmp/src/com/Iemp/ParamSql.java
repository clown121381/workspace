package com.Iemp;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

public class ParamSql {

	public String selectWithParamSql(final Map<String,Object> param) {
		return new SQL(){
			{
				SELECT("*");
				FROM("emps");
				if(param.get("empname") != null)
				{
					WHERE("empname like '%"+param.get("empname")+"%'");
				}
				if(param.get("salary2") != null && param.get("salary1") != null)
				{
					if( (int)param.get("salary2")- (int)param.get("salary1") > 0)
					{
						WHERE("salary between #{salary1} and #{salary2}");
					}
				}
				if(param.get("age") != null){
					WHERE("age = #{age}");
				}
			}
		}.toString();
	}
}
