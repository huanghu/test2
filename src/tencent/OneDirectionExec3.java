package tencent;


public class OneDirectionExec3 {
	
	Node firstNode;
	
	public OneDirectionExec3(){}
	
	public OneDirectionExec3(String[] a){
		Node preNode = null;
		for (int i = 0; i < a.length; i++) {
			if(firstNode == null){
				firstNode = new Node();
				firstNode.value = a[i];
				preNode = firstNode;
			}else {
				Node node = new Node();
				node.value = a[i];
				preNode.next = node;
				preNode = node;
			}

		}
	}
}
