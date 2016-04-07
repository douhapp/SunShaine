package ua.at.mamdouh.sunshine.tests;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Douha on 3/30/2016.
 */
public class Test1 {


    public static void main(String[] args) {

        Json_Uri json_uri = new Json_Uri();

        String weatherUri = json_uri.jsonOutput();

        System.out.println(weatherUri);

        //-change here--------------------

        try {
            JSONObject weather = new JSONObject(weatherUri);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
