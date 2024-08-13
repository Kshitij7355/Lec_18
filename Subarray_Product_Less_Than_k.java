package lec18;

public class Subarray_Product_Less_Than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4};
		int k =10;
		System.out.println(Product(arr,k));
		

	}
	public static int Product(int[]arr,int k) {
		int ans = 0;
		int ei = 0;
		int si = 0;
		int p =1;
		while(ei<arr.length) {
			//growing
			p*=arr[ei];
			//Shrinking
			while(p>=k && si<=ei) {
				p= p/arr[si];
				si++;
			}
			
			
			// ans update
			ans = ans+(ei-si+1);
			ei++;
			
		}
		return ans;
	}

}
