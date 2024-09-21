
public class FourthType {
	
	static float getCountryCuurency(String country){
		
		if(country.equalsIgnoreCase("US")) {
			return 78.10f;
		}
		else if(country.equalsIgnoreCase("UK")) {
			return 100.20f;
		}
		else if(country.equalsIgnoreCase("UAE")) {
			return 20.45f;
		}
		
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
	
		
		float curr = getCountryCuurency("UK");
		System.out.println("UK Currency--->"+curr);
	}

}
