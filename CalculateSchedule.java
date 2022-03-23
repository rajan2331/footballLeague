package football.league;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
class Pair{
	
	private String team1;
	private String team2;
	
	public Pair(String team1,String team2) {
		
		this.team1=team1;
		this.team2=team2;
	}
	
	
}

public class CalculateSchedule {

	protected static void printSchedule(JSONObject json) {
		
		JSONArray teams = (JSONArray) json.get("teams");
		
		List<String> teamList = new ArrayList<String>();
		
		for(int i =0 ; i<teams.size();i++) {
		
		JSONObject jsonObject = (JSONObject)teams.get(i);
			
		teamList.add((String) jsonObject.get("name"));
		}
		List<List<String>> matches = new ArrayList<List<String>>();
		List<String> match =null;
		for(int i=0;i<teamList.size();i++) {
			match = new ArrayList<String>();
			for (int j = 0; j <teamList.size(); j++) {
			
				 if(teamList.get(i)!=teamList.get(j))
				{match.add(teamList.get(i)+" VS "+teamList.get(j));
				 }
			}
			matches.add(match);
			
		}
		
		int maxNofMatches = teams.size()%2==0?teams.size()/2:teams.size()/2+1;
		
			int days = maxNofMatches*(teams.size()-1);
			int j=0;
			int k=0;
			
			for(int i=1;i<=days;i++) {
			System.out.println("Day #"+i);	
				for(List<String> matche:matches) {
					matche.get(j);
					
				}
			}
	}
}
