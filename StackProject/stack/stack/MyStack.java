package stack;

import linkedlist.INode;

public class MyStack {
	
	private final MyLinkedList MyLinkedList;
	public MyStack(){
		
		this.MyLinkedList = new MyLinkedList();
	}
	public void  push(INode myNode) {
		
		MyLinkedList.add(myNode);	
		
	}

	public INode peak() {
		
		return MyLinkedList.head;
		
	}
	public void printStack() {
		MyLinkedList.printNodes();
		
	}
}