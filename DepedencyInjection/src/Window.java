

class Window {  	//create Window class which contain object weather
	
	private Weather weather;  
									//I applied constructor injection here
	public Window(Weather weather){  //window constructor, component in the window is a Weather, 
		this.weather=weather;			
	}								//the weather is a dependence for each window which means window is dependent for weather
	public void lookOut()   //looking out the window
	{
	System.out.println(this.weather.description);  //prints a description of the weather
	}
}


	