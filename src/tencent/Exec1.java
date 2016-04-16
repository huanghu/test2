package tencent;

import java.util.Stack;

/**
 * 输入一串字符What are you doing，颠倒输出doing you are What
 * 输入的字符串为char[] input
 * @author huanghu
 *
 */
public class Exec1 {
	//在这个用一个栈去实现
	public static void main(String[] args){
		String arg = "What are you doing";
		char[] input = arg.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		int index = 0;
		for (int i = 0; i < input.length; i++) {
			char c = input[i];
			if (c == ' ') {
				//如果是空格，将前面的字符压入棧
				for (int j = i - 1; j >= index; j--) {
					stack.push(input[j]);
				}
				stack.push(' ');
				index = i + 1;
			}
			
			if (i == input.length - 1&&c != ' ') {
				//如果最后一个字符不为空格，需要这样压入棧
				for (int j = i; j >= index; j--) {
					stack.push(input[j]);
				}
			}
		}
		 
		for (int i = 0; i < input.length; i++) {
			if (stack.isEmpty()) {
				break;
			}
			input[i] = stack.pop();
		}
		
		for (Character character : input) {
			System.out.print(character);
		}
	}
}
