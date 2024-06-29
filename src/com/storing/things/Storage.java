package com.storing.things;

import java.util.ArrayList;
import java.util.List;

/*  Class where we can operate with things we have, add them into Storage, 
	take from there and show all things are available at the moment
*/
public class Storage {
	
	List<Thing> things = new ArrayList<>();
	
	public void addThing(Thing thing){
		things.add(thing);
	}
	
	public Thing takeThing(Thing thing){
		Thing takenThing = null;;
		if(things.contains(thing)){
			int index = things.indexOf(thing);
			takenThing = things.get(index);
			things.remove(index);
		}
		return takenThing;
	}
	
	public List showAvailableThings(){
		return things;
	}

	@Override
	public String toString() {
		return "Storage [things=" + things + "]";
	}
	
}
