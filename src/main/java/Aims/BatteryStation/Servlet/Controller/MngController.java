package Aims.BatteryStation.Servlet.Controller;

import Aims.BatteryStation.Servlet.Dao.MngDao;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MngController
{
    @Autowired
    MngDao mngDao;

    //http://localhost:8081/API/GetSelect
    
    @RequestMapping( value ="/API/SelectBatteryMstString", method = RequestMethod.GET )
    public List<Map<String, Object>> SelectBatteryMstString( String BatteryId, String UserId ) throws Exception
    {
        Map<String,Object> param    =   new HashMap<String,Object>();
        param.put( "BatteryId", BatteryId );
        param.put( "UserId",    UserId );

        List<Map<String, Object>> lst = mngDao.SelectBatteryMstString( param );
        return lst;
    }

    //http://localhost:8081/API/SelectUserIdString?userid=dltngus36@naver.com
    @RequestMapping( value ="/API/SelectUserIdString", method = RequestMethod.GET )
    public List<Map<String, Object>> SelectUserIdString( String UserId ) throws Exception
    {
        Map<String,Object> param    =   new HashMap<String,Object>();
        param.put( "UserId",    UserId );
        List<Map<String, Object>> lst = mngDao.SelectUserIdString( param );
        return lst;
    }

    @RequestMapping( value ="/API/SelectBatteryMst", method = RequestMethod.POST )
    public List<Map<String, Object>> SelectBatteryMst( @RequestBody HashMap<String,Object> param ) throws Exception
    {
        List<Map<String, Object>> lst = mngDao.SelectBatteryMst( param );
        return lst;
    }

    @RequestMapping( value ="/API/SelectUserId", method = RequestMethod.POST )
    public List<Map<String, Object>> SelectUserId( @RequestBody  HashMap<String,Object> param ) throws Exception
    {
        List<Map<String, Object>> lst = mngDao.SelectUserId( param );
        return lst;
    }


    @SuppressWarnings({ "unchecked" })
    public static JSONObject convertMapToJson(Map<String, Object> map)
    {
        JSONObject json = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet())
        {
            String  key     =   entry.getKey();
            Object  value   =   entry.getValue();
            json.put(key, value);
        }
        return json;
    }
}














