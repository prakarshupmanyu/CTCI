import java.io.*;
import java.util.*;

public class q1{
	private static boolean isUniqueChars(String s){
		if(s.length() > 128){
			return false;
		}
		boolean[] map = new boolean[128];
		for(int i=0;i < s.length();i++){
			int c = s.charAt(i);
			if(map[c]){
				return false;
			}
			map[c] = true;
		}
		return true;
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(isUniqueChars(str)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		s.close();
	}
}
