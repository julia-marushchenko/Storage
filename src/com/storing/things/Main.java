package com.storing.things;

public class Main {
	
	// main method to run the application
	public static void main(String [] str) {
		
		// Thing for usage
		Thing thing1 = new Pants("Pants", Material.SILK);
		Thing thing2 = new Pants("Pants with lines", Material.SYNTETIC);
		Thing thing3 = new Shirt("Shirt", Material.COTTON);
		Thing thing4 = new Shirt("Polo-Shirt", Material.COTTON);
		Thing thing5 = new Shirt("T-Shirt", Material.SYNTETIC);
		Thing thing6 = new Shirt("Blue Shirt", Material.COTTON);
		
		// Creating Storage for holding things
		Storage storage = new Storage();
		
		// Adding thing to Storage
		storage.addThing(thing1);
		storage.addThing(thing2);
		storage.addThing(thing3);
		storage.addThing(thing4);
		storage.addThing(thing5);
		storage.addThing(thing6);
		
		// Showing things we have with method showAvailableThings() from class Storage
		System.out.println(storage.showAvailableThings());
		
		// Taking Polo-Shirt from storage
		Thing takenThing = storage.takeThing(thing4);
		
		// Information about thing we have picked up from Storage
		System.out.println(takenThing.toString());
		
		// Checking Storage that Polo-Shirt is not there anymore
		System.out.println(storage.showAvailableThings());
		
		// Adding Polo-Shirt back to Storage
		storage.addThing(takenThing);
		
		/* Checking Storage that Polo-Shirt is back to the Storage.
		 * It is in the end of the list of things are in the Storage
		 */
		System.out.println(storage.showAvailableThings());
		
		// Taking pants with lines from the Storage
		Thing pantsWithLines = storage.takeThing(thing2);
		
		// Checking Storage that Pants with lines are not there anymore
		System.out.println(storage.showAvailableThings());
		
		//Taking Blue Shirt from the Storage
		Thing shirtBlue = storage.takeThing(thing6);
		
		//Checking Storage that Blue Shirt is not there anymore
		System.out.println(storage.showAvailableThings());
		
		//Placing Blue Shirt and Pants with lines back to Storage
		storage.addThing(pantsWithLines);
		storage.addThing(shirtBlue);
		
		// Checking Storage that all thing are there
		System.out.println(storage.showAvailableThings());
		
	}

}
