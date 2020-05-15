package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.TouristPlace;

public class ListOperations{
	
	
	public List<TouristPlace> add(TouristPlace places)
	{
	        ArrayList<TouristPlace> al=new ArrayList<>();
	        al.add(places);
	        
	        return al;
		
	}
	public List<TouristPlace> remove(TouristPlace places)
	{
		ArrayList<TouristPlace> rl=new ArrayList<>();
		rl.remove(places);
		return null;
		
	}
	public Object sortByDestination(List<TouristPlace> places)
	{
		
		List<TouristPlace> list=new ArrayList<>();
		
		List<TouristPlace>  sortedlist=list.stream().sorted((d1,d2)->d1.getDestination().compareTo(d2.getDestination())).collect(Collectors.toList());
		return sortedlist;

	}
	public Object sortByRank(List<TouristPlace> places)
	{
		ArrayList<TouristPlace> list=new ArrayList<>();
/*Comparator<Integer> c=(a,b)->(a.getRank()<b.getRank())?-1:(a.getRank()>b.getRank())?1:0;
		
		 Collections.sort(list,c);*/
		
		list.sort((a,b)->a.getRank().compareTo(b.getRank()));
		return list;
		
	}
	public Object reset(List<TouristPlace> places)
	{
		
		ArrayList<TouristPlace> list=new ArrayList<>();
		list.clear();
		return list;
		
	}
}