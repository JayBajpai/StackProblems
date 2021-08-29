package stack;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import linkedlist.INode;
import linkedlist.MyNode;

public class MyStackTest2 {

	@Test
	public void test() {

		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyStack myStack = new MyStack();
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = myStack.pop();
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode,pop);
		Assert.assertEquals(mySecondNode,peak);
	}

}