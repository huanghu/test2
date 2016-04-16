package leetcode;

/**
 * 第3题 Longest Substring Without Repeating Characters
 * @author huanghu
 *
 */
public class LengthOfLongestSubstring {
	public static void main(String[] args){
		String str = "bbbb";
		LengthOfLongestSubstring substring = new LengthOfLongestSubstring();
		int length = substring.lengthOfLongestSubstring(str);
		System.out.println("length " + length);
	}
	
    public int lengthOfLongestSubstring(String s) {
		char[] str2Char = s.toCharArray();
		char[] tempChar = new char[str2Char.length];
		int maxLength = 0;
		int tempMaxLength = 0;
		boolean noRepeat = true;
		int tempCharIndex = 0;
		for (int i = 0; i < str2Char.length; i++) {
			for (int j = 0; j < tempChar.length; j++) {
				//检查tempChar里是否有重复的字符
				if (tempChar[j] == str2Char[i]) {
					tempChar = new char[str2Char.length];
					if (tempMaxLength > maxLength) {
						//判断最大长度的子字符串是否需要更新
						maxLength = tempMaxLength;
					}
					noRepeat = false;
					tempCharIndex = 0;
					break;
				}
			}
			if (noRepeat == true) {
				tempChar[tempCharIndex] = str2Char[i];
				tempCharIndex ++;
			}
			tempMaxLength ++;
		}
		return maxLength;
    }
}
