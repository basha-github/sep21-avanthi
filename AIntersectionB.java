
public class AIntersectionB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		int[] b = {10,20,2,4,30,40};
	
		int[] ab;
		int index=-1;
		if(a.length < b.length) {
			ab = new int[a.length];
			for(int i=0;i<a.length;i++) {
				if(checkAlreadThere(b,a[i]) == true) {
					ab[++index] = a[i];
				}//if
			}// for
		}// if
		else {
			ab = new int[b.length];
			for(int i=0;i<b.length;i++) {
				if(checkAlreadThere(a,b[i]) == true) {
					ab[++index] = b[i];
				}//if
			}//for
		}// else
		
		// output
		for(int i=0;i<=index;i++) {
			System.out.print(ab[i]+" ");
		}
		
		
	
	}// main
	
	
private static boolean checkAlreadThere(int[] a, int num) {
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == num) return true;
		}
		
		
		return false;
	}

}
