import java.util.*;

public class q3{
	private static char[] urlify(char[] s, int n){
		int spaceCount = 0;
		for(int i=0;i<s.length;i++){
			if(s[i] == ' '){
				spaceCount++;
			}
		}
		int index = n + spaceCount*2;
		char[] str = new char[index+1];
		str[index] = '\0';
		for(int i=n-1;i>=0;i--){
			if(s[i] == ' '){
				str[--index] = '0';
				str[--index] = '2';
				str[--index] = '%';
			}else{
				str[--index] = s[i];
			}
		}
		return str;
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int n = s.nextInt();
		char[] sArr = str.toCharArray();
		System.out.println(urlify(sArr, n));
	}
}
