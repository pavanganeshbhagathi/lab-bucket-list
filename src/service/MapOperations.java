package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations 
{
	Map<Integer,TouristPlace> add(TouristPlace places)
	{
		Map<Integer,TouristPlace> map=new HashMap<>();
		map.put(null, places);
		return map;
		
	}
	Map<Integer,TouristPlace> sortRandomly(TouristPlace places)
	{
		Map<Integer,TouristPlace> map=new HashMap<>();
		map.put(null, places);
		return map;
	
		
		
	}

	public Object reset(HashMap<Integer,TouristPlace> places) {
		
		Map<Integer,TouristPlace> resetPlaces=new TreeMap<>();
		resetPlaces.clear();
		return resetPlaces;
		
	}
	public Map<Integer, TouristPlace> remove(TouristPlace places){
		
		Map<Integer,TouristPlace> map=new HashMap<>();
		map.remove(places);
		return map;
	}
	public Map<Integer,TouristPlace> sortAlphabetically(TouristPlace places){
		Map<Integer,TouristPlace> sortAlphabeticallyPlaces=new TreeMap<>();
		 sortAlphabeticallyPlaces.put( null, places);
		return  sortAlphabeticallyPlaces;
		
	}
	
}
