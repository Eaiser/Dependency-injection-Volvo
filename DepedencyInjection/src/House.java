import java.util.ArrayList;
import java.util.List;

public class House {			//create House class
	
	List<Window> windows = new ArrayList<>(); //house has windows
	public House(Weather weather){  //create a constructor
		windows.add(new Window(weather));  //create 4 windows
		windows.add(new Window(weather));
		windows.add(new Window(weather));
		windows.add(new Window(weather));
	}
	public void lookOutTheWindows(){
		for(Window window : windows){ //window for every window
		window.lookOut();
		}
	}
	
	public static void main(String [] args) {		
	 Weather weather = new Weather (); //create our dependence
	 
	 House house = new House(weather);  //build a house, inject the dependency thru weather constructor 
	 house.lookOutTheWindows();
	}
 }
//It is virtually impossible to have different weather in each window in one house so that is why 
//I use dependency injection because without the dependency injection, the weather can be different in each window.
