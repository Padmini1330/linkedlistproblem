package com.bridgelabz.linkedlist;

public class LinkedList 
{
	private INode head;
	private INode tail;
	
	public LinkedList() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public void add(INode newNode) 
	{
		if(this.tail == null) 
		{
			this.tail = newNode;
		}
		if(this.head == null) 
		{
			this.head = newNode;
		}
		else 
		{
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
			
		}
		
	}
	public void append(INode newNode)
	{
		if(this.tail ==null)
		{
			this.tail=newNode;
		}
		if(this.head ==null)
		{
			this.head=newNode;
		}
		else
		{
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
		
	}
	

	public void insert(INode myNode, INode newNode )
	{
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}
	
	public INode pop() 
	{
		INode tempNode=this.head;
		this.head=head.getNext();
		return tempNode;
		
	}
	
	public void popLast() 
	{
		INode previousNode = null, currentNode = head;
		while (currentNode.getNext() != null) 
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(null);
		tail = previousNode;
		System.out.println("Deleted key value: " + currentNode.getKey());
		currentNode = null;
	}
	
	public void printNodes()
	{
		StringBuffer myNodes=new StringBuffer();
		INode tempNode=head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
