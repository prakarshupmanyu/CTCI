import java.io.*;
import java.util.*;

public class q2{
	private static boolean isPermutation(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		int[] lcount = new int[128];
		for(int i = 0;i < s.length();i++){
			int c = (int) s.charAt(i);
			lcount[c]++;
		}
		for(int i = 0;i < t.length();i++){
			int c = (int) t.charAt(i);
			lcount[c]--;
			if(lcount[c] < 0){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		if(isPermutation(str1, str2)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
