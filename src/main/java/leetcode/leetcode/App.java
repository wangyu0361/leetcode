package leetcode.leetcode;

import javax.naming.spi.DirStateFactory.Result;

import dataModel.ListNode;
import leetcode.leetcode.Library;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Library library = new Library();
		Comparable[] test = {'a','a','e','h','w','t','y','w','b','c','m'};
		//Comparable[] test = {1,2,4,5,6,7,9};
		Comparable[] result = library.quickSort(test, 0, test.length-1);
		for(int i=0 ; i< result.length ;i++){
			System.out.println(result[i]);
		}
		
		System.out.println(library.binarySearch(library.quickSort(test, 0, test.length-1), 'w', 0, test.length-1) );

		/*ListNode listNode1 = new ListNode(1);
		ListNode temp = new ListNode(2);
		listNode1.next=temp;
		for(int i=3;i<10;i++){
			temp.next=new ListNode(i);
			temp=temp.next;
		}
		


		ListNode listNode2 = new ListNode(77);
		temp=new ListNode(39);
		listNode2.next=temp;
		temp.next=new ListNode(49);
		temp=temp.next;

		for(int i=5;i<10;i++){
			temp.next=new ListNode(i);
			temp=temp.next;
		}

		System.out.println(library.getIntersectionNode(listNode1, listNode2).val);*/
		
		


	}
}
