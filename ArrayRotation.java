
public class ArrayRotation {

	public static void main(String[] args) {
	
		int[] num = {1,2,3,4,5,6};
		//6 1 2 3 4 5
		//5 6 1 2 3 4
		// 4 5 6 1 2 3
		int n=1;
		while(1==1) {
			
			int temp = num[num.length-1];
			for(int i=num.length-1;i>0;i--) {
				num[i]=num[i-1];// num[5]---num[4]
			}
			num[0]=temp;
			if(n==3) break;
			n++;
			
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
