package main;
import java.util.*;

import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;
/**
 * 
 * @author johnpaulthomas
 *Test class for linkedLists of different object types
 *
 */
public class TestLinkedList {

	public static void main(String[] args) {
		System.out.println("String List: ");
		//String List
		GenericLinkedList<String> myList=new GenericLinkedList<>();
		
		GenericNode<String> aNode=new GenericNode<>();
	
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode<String>();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode<String> stringNode=myList.getList();
		do 
		{
			System.out.println(stringNode.getData());
			stringNode=stringNode.getNextNode();
		} while (stringNode!=null);
		System.out.println();
		
		System.out.println("Integer List: ");
		//Integer List
		GenericLinkedList<Integer> intList=new GenericLinkedList<>();
		
		GenericNode<Integer> intNode=new GenericNode<Integer>();
		intNode.setData(1);
		intList.addNode(intNode);
		intNode = new GenericNode<Integer>();
		intNode.setData(2);
		intList.addNode(intNode);
		
		GenericNode<Integer> tempnodeInt=intList.getList();
		do 
		{
			System.out.println(tempnodeInt.getData());
			tempnodeInt=tempnodeInt.getNextNode();
		} while (tempnodeInt!=null);
		
		System.out.println(intList.toString());
		System.out.println();
		
		System.out.println("Double List: ");
		//DoubleList
		GenericLinkedList<Double> doubList=new GenericLinkedList<>();
		
		GenericNode<Double> doubNode=new GenericNode<Double>();
		doubNode.setData(1.10);
		doubList.addNode(doubNode);
		doubNode = new GenericNode<Double>();
		doubNode.setData(2.20);
		doubList.addNode(doubNode);
		doubNode.setData(3.3);
		doubList.addNode(doubNode);
		
		GenericNode<Double> tempnodeDouble=doubList.getList();
		do 
		{
			System.out.println(tempnodeDouble.getData());
			tempnodeDouble=tempnodeDouble.getNextNode();
		} while (tempnodeDouble!=null);
		
		System.out.println(doubList.toString());
	}//end main method

}//end class
