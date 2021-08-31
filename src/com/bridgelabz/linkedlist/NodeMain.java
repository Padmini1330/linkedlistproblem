package com.bridgelabz.linkedlist;

public class NodeMain 
{

	public static void main(String[] args) 
	{
		
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		LinkedList linkedlist=new LinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.append(myThirdNode);
		linkedlist.insert(myFirstNode,mySecondNode);
		;
		linkedlist.printNodes();
		
		INode searchedKey = linkedlist.search(30);
		if(searchedKey.getKey().equals(30)) {
			System.out.println("Key Found:"+ searchedKey.getKey());
		}
		else {
			System.out.println("Key Not Found");
		}		
		
	}
}
