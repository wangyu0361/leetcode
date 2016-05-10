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
		//System.out.println(library.quickSort(test, 0, test.length-1));

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
