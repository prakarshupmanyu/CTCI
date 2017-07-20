/*
Q5 - There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
*/

import java.util.*;

public class q5{
	private boolean oneEditAway(String s, String t){
		if(s.length() == t.length()){
			return checkEqualLengthDiff(s, t);
		}else if(s.length() == t.length() + 1){
			return checkUnequalLengthDiff(s, t);
		}else if(t.length() == s.length() + 1){
			return checkUnequalLengthDiff(t, s);
		}
		return false;
	}

	private boolean checkUnequalLengthDiff(String big, String small){
		int numDiff = 0, smallIndex = 0;
		for(int i=0;i<big.length();i++){
			if(big.charAt(i) != small.charAt(smallIndex)){
				numDiff++;
				i++;
				if(i < big.length() && big.charAt(i) != small.charAt(smallIndex)){
					return false;
				}
			}
			if(numDiff > 1){
				return false;
			}
			smallIndex++;
			if(smallIndex == small.length()){
				break;
			}
		}
		return true;
	}

	private boolean checkEqualLengthDiff(String s, String t){
		int numDiff = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != t.charAt(i)){
				numDiff++;
			}
			if(numDiff > 1){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String t = s.nextLine();
		q5 obj = new q5();
		System.out.println(obj.oneEditAway(str, t));
		s.close();
	}
}
