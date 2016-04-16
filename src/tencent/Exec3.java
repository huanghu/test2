package tencent;

import java.util.Stack;


/**
 * 构建一个单向链表，1)初始化，2)插入a-z, 3)倒序 
 * 分别输出正序和倒序的值
 * @author huanghu
 *
 */
public class Exec3 {
	
	public static void main(String[] args){
		String[] a = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		OneDirectionExec3 oneDirection = new OneDirectionExec3(a);
		
		Node node = oneDirection.firstNode;
		Node nodeNext = node.next;
		Node tempNode = null;
		node.next = null;
		while (nodeNext != null) {
			tempNode = nodeNext.next;
			nodeNext.next = node;
			node = nodeNext;
			nodeNext = tempNode;
		}
		
		Node currentNode = node;
		while (currentNode != null) {
			System.out.println(currentNode.value);
			currentNode = currentNode.next;
		}
	}
}
