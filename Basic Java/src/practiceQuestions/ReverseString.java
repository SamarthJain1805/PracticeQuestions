package practiceQuestions;

public class ReverseString {
	
	static void reverseString(char[] s) {
		for(int i =s.length-1;i>=0;i--) {
			if( i==s.length-1) {
				System.out.print("[");
			}if(i==0) {
				System.out.print("\""+s[i]+"\""+"]");
			}else {
			System.out.print("\""+s[i]+"\",");
			}
			}
	
	}

	public static void main(String[] args) {
		char[] s = {'H','e','l','l','o'};
		reverseString(s);
	}

}
