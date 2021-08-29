package stack;

import linkedlist.INode;

public class MyLinkedList<K> {
		
		
		public INode head;
		public INode tail;
		private INode tempNode;
		
		public MyLinkedList() {
			this.head = null;
			this.tail = null;
			}

		public void add(INode newNode) {
			// TODO Auto-generated method stub
			if(this.tail == null) {
				this.tail = newNode;
			}
			if(this.head == null) {
				this.head = newNode;
			}else {
				INode tempNode = this.head;
				this.head = newNode;
				this.head.setNext(tempNode);
			}
		}
		
		public void printNodes(){
			StringBuffer myNodes = new StringBuffer("My Nodes : ");
			INode tempNode = head;
			while(tempNode.getNext() != null) {
				myNodes.append(tempNode.getKey());
				if(!tempNode.equals(tail)) myNodes.append("->");
				tempNode = tempNode.getNext();
			}
			myNodes.append(tempNode.getKey());
			System.out.println(myNodes);
		}

		public void append(INode newNode) {
			// TODO Auto-generated method stub
			if(this.head == null) {
				this.head = newNode;
			}
			if(this.tail == null) {
				this.tail = newNode;
			}else {
				this.tail.setNext(newNode);
				this.tail = newNode;
			}
		}
		
		
		public void insert(INode myNode , INode newNode) {
			
			INode tempNode = myNode.getNext();
			myNode.setNext(newNode);
			newNode.setNext(tempNode);
	}

		public INode pop() {
		
			INode tempNode = this.head;
			this.head = head.getNext();
			return tempNode;
		}
		
		public INode popLast() {
			
			INode tempNode = head;
			while(!tempNode.getNext().equals(tail)) {
				tempNode = tempNode.getNext();
			}
			this.tail = tempNode;
			tempNode = tempNode.getNext();
			return tempNode;
		}
		
		   class Node{  
		        int data;  
		        Node next;  
		          
		        public Node(int data) {  
		            this.data = data;  
		            this.next = null;  
		        }  
		    }  
		   
		public  INode search(K key) {
			 
		        int i = 1;  
		        boolean flag = false;  
		       
			
			INode tempNode = head;
			while(tempNode != null && tempNode.getNext()  != null) {
				
			     Object data = 30;
				if(tempNode.getKey() == data) {  
	                    flag = true;  
	                    break;  
	                }  
	                i++;  
	                tempNode = tempNode.getNext();  
	            }  
	          
	        if(flag)  
	             System.out.println("Element is present in the list at the position : " + i);
			return tempNode;  
	         
			}
			

}