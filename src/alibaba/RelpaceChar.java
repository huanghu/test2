package alibaba;

/**
 * 输入"##今天是##星期五###"
 * 输出"今天是,星期五"
 * @author huanghu
 *
 */
public class RelpaceChar {
	public static void main(String[] args){
		String str = "##今天是#####星期五####";
		String newStr = trim(str, '#');
		newStr = replace(newStr, '#');
		System.out.println(newStr);
	}
	
	private static String replace(String oldStr, char split){
		String newStr = new String();
		newStr = trim(oldStr, split);
		char[] newChars = newStr.toCharArray();
		//处理中间的#
		char[] tempChars = new char[newStr.length()];
		for (int i = 0, j =0; i < newChars.length; i++) {
			if (i == 0 && newChars[i] != split) {
				tempChars[j] = newChars[i];
				j ++;
				continue;
			}
			if (newChars[i] == split && newChars[i - 1] == split) {
				//非第一个#，不写入新字符串
				continue;
			}
			if (newChars[i] == split && newChars[ i -1] != split) {
				tempChars[j] = ',';
				j++;
				continue;
			}
			tempChars[j] = newChars[i];
			j ++;
		}
		
		newStr = new String(tempChars);
		return newStr;
	}
	
	private static String trim(String oldStr, char split){
		String newStr = oldStr;
		int frontIndex = 0;
		char[] value = oldStr.toCharArray();
		//去掉前面的split
		while (true) {
			if (value[frontIndex] != split || frontIndex == oldStr.length()) {
				break;
			}
			if (value[frontIndex] == split) {
				frontIndex ++;
			}
		}
		newStr = oldStr.substring(frontIndex, oldStr.length());
		int backIndex = newStr.length() - 1;
		value = newStr.toCharArray();
		//去掉后面的split
		while (true) {
			if (value[backIndex] != split || backIndex < 0) {
				break;
			}
			if (value[backIndex] == split) {
				backIndex --;
			}
		}
		newStr = newStr.substring(0, backIndex + 1);
		return newStr;
	}
}
