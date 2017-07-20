/*
Q4 - Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
*/

import java.util.*;

public class q4{
	private static String checkPermOfStr(String s){
		int[] letters = new int[26];
		int i = 0, numOdd = 0;
		for(i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c >= 'a' && c <= 'z'){	//assumption: lowercase string
				letters[c-'a']++;
			}
		}
		for(int j=0;j < letters.length;j++){
			if(letters[j] % 2 == 1){
				if(numOdd == 1){
					System.out.println("1");
					return "NO";
				}
				numOdd++;
			}
		}
		if(i % 2 == 1 && numOdd == 1){	//length of s is odd, then numOdd should be 1
			return "YES";
		}else if(i % 2 == 0 && numOdd == 0){
			return "YES";
		}
		System.out.println("2");
		return "NO";
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(checkPermOfStr(str));
	}
}
