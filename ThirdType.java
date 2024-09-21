
public class ThirdType {
	
	static float getUSDollar(){
		
		return 78.10f;
	}
	static float getUKPound(){
		
		return 110.34f;
	}
	static float getDubaiRiyal(){
	
		return 20.45f;
	}

	public static void main(String[] args) {
		
		float curr = getDubaiRiyal();
		System.out.println("dubai...."+curr);
		
		curr = getUSDollar();
		System.out.println("US Dollar...."+curr);
		

	}

}
