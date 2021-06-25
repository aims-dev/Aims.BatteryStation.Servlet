package Aims.BatteryStation.Servlet.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.json.simple.JSONArray;

import java.util.Map;
import java.util.List;

@Mapper
public interface MngDao
{
    JSONArray SelectBatteryMstString( Map<String,Object> param ) throws Exception;
    JSONArray SelectUserIdString( Map<String,Object> param ) throws Exception;

    JSONArray SelectBatteryMst( Map<String,Object> param  ) throws Exception;
    JSONArray SelectUserId( Map<String,Object> param ) throws Exception;
    // String selectList(Map<String,Object> param ) throws
    // String selectList(Map<String,Object> param ) throws Exception;

}
