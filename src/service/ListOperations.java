package service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import model.TouristPlace;

public class ListOperations
{
	List<TouristPlace> list=new ArrayList<TouristPlace>();
	public List<TouristPlace> add(TouristPlace places) throws IOException 
	{
		list.add(places);
		return list;
	}
	
	public List<TouristPlace> remove(TouristPlace places) throws IOException
	{	
		list.remove(places);
		return list;	
	}
	
	//lambda operations
    public Object sortByDestination(List<TouristPlace> places) throws IOException 
    {		
      places.sort((TouristPlace p1,TouristPlace p2)-> p1.getDestination().compareTo(p2.getDestination()));
      return places;	
    }
	
    public Object sortByRank(List<TouristPlace> places) throws IOException
    {	
    	places.sort((TouristPlace p1,TouristPlace p2)-> p1.getRank().compareTo(p2.getRank()));
         return places;
    }

    public Object reset(List<TouristPlace> places) throws IOException 
	{		
		list.clear();
		return list;	
	}

}