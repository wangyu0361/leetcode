package leetcode.leetcode;

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
		char[] test = {'a','a','e','h','w','t','y','w','b','c','m'};
		System.out.println(library.quickSort(test, 0, test.length-1));
		ListNode listNode = new ListNode(1);
		ListNode temp = new ListNode(2);
		listNode.next=temp;
		for(int i=3;i<10;i++){
			temp.next=new ListNode(i);
			temp=temp.next;
		}


	}
}
