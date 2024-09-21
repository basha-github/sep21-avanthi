import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		
		int[] a = {1,2,3,4,5,6};
		int[] b = {10,20,2,4,30,40};
	
		int[] aub = new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			aub[index++] = a[i];
		}
		int dup =0;
		for(int i=0;i<b.length;i++) {
			if( checkAlreadThere(a,b[i]) == false) {
				aub[index++] = b[i];	
			}
			else {
				dup++;
			}
			
		}
		
		
		// output
		for(int i=0;i<aub.length-dup;i++) {
			
			System.out.print(aub[i]+" ");
		}
		
		
		
		
	}

private static boolean checkAlreadThere(int[] a, int num) {
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == num) return true;
		}
		
		
		return false;
	}

}
