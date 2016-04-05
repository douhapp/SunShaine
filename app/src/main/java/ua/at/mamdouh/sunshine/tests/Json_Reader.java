package ua.at.mamdouh.sunshine.tests;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Douha on 3/30/2016.
 */
public class Json_Reader {

    public static double getMaxTemp(String jsonUri , int dayIndex) throws JSONException {

        JSONObject weather = new JSONObject(jsonUri);
      //  JSONArray days = weather.getJSONArray("list");
      //  JSONObject dayInfo = days.getJSONObject(dayIndex);
      //  JSONObject tempInfo = dayInfo.getJSONObject("temp");


        return 3;
    }
}
