package lec18;

import java.util.Scanner;

public class Kartik_Bhaiya_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		String s1 = s.next();
		int flip_a = MaxLenofString(s1,'a',k);
		int flip_b = MaxLenofString(s1,'b',k);
		System.out.println(Math.max(flip_a, flip_b));
	}
	public static int MaxLenofString(String str , char ch,int k) {
		int si =0;
		int ei =0;
		int flip = 0;
		int ans=0;
		while(ei<str.length()) {
			//growing
			if(str.charAt(ei)== ch) {
				flip++;
			}
			while(flip>k && si<=ei) {
				if(str.charAt(si)==ch) {
					flip--;
				}
			}
			ans = Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}

}
