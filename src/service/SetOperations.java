package service;

import java.io.IOException;
import java.util.HashSet;
import model.TouristPlace;

//PROGRESSION 4
public class SetOperations{
	HashSet<TouristPlace> set=new HashSet<TouristPlace>();
	
	public HashSet<TouristPlace> add(TouristPlace places) throws IOException {
		set.add(places);
		return set;
	}
	
	public HashSet<TouristPlace> remove(TouristPlace places) throws IOException {	
		set.remove(places);
		return set;
	}
	
	public Object sortByDestination(HashSet<TouristPlace> places) throws IOException {	
	return 0;
	}

	public Object sortByRank(HashSet<TouristPlace> places) throws IOException {		
		
		return 0;
	}
	
	public Object reset(HashSet<TouristPlace> places) throws IOException {	
		set.clear();
		return set;
	}
	
}