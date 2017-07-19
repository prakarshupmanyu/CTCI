/*
Q6 - Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3 . If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
*/

import java.util.*;

public class q6{
	private String compressedString(String s){
		int curCount = 1;
		char prevChar = s.charAt(0);
		StringBuilder str = new StringBuilder();
		for(int i=1;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch != prevChar){
				str.append(prevChar);
				str.append(String.valueOf(curCount));
				curCount = 1;
			}else{
				curCount++;
			}
			prevChar = ch;
		}
		str.append(prevChar);
		str.append(String.valueOf(curCount));
		if(s.length() > str.toString().length()){
			return str.toString();
		}
		return s;
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		q6 obj = new q6();
		System.out.println(obj.compressedString(str));
	}
}
