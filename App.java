package football.league;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 JSONParser parser = new JSONParser();
         try {
            Object obj = parser.parse(new FileReader("C:/Users/Rajan/Downloads/soccer_teams.json"));
            JSONObject jsonObject = (JSONObject)obj;
           
            CalculateSchedule.printSchedule(jsonObject);
           
         } catch(Exception e) {
            e.printStackTrace();
         }
    }
}
