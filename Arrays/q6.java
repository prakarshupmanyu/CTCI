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
