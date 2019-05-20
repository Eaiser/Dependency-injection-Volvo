import java.util.Random;

class Weather {  //create weather class
	
	private static Random random = new Random(System.currentTimeMillis()); //the weather can be various
	public String description;
	public Weather(){
		switch(random.nextInt(4)){ //choose a random number from 0-3
		case 0:
			this.description = "It`s rainy";
			break;
		case 1:
			this.description = "It`s shiny";
		case 2:
			this.description = "Snow is falling!";
			break;
		case 3:
			this.description = "It`s windy";
			break;
		}
	}
}

