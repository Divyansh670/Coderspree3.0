import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here
        int end = input.length() - 1,start,j;
		String result ="",word = "";
		for(int i= input.length() - 1;i >= 0;i--) {
			if(input.charAt(i) == ' ') {
				start = i + 1;
				word = "";
				for(j = start;j <= end;j++) {
					word += input.charAt(j);
				}
				end  = i - 1;
				result = result + word + " ";
			}
		}
		word = "";
		for(j = 0;j <= end;j++) {
			word = word + input.charAt(j);
		}
		result += word;
		return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
