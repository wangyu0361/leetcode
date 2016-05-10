package leetcode.leetcode;

import dataModel.ListNode;

public class Library{



	/***
	 * quick sort algorithm to sort a char array, the idea is partition the array into 2 parts : left part less than an element ( randomly pick, usually the fist or last element)
	 *  right part greater or equal to one element.
	 *  Then recursively partition on both side until there is only one element in the partitioned array ( lo == hi) then get the result 
	 * @param p
	 * @param lo
	 * @param hi
	 * @return
	 */
	public char[] quickSort (char[] p,int lo,int hi){

		if(lo<hi){
			int index= partition(p,lo,hi);
			quickSort(p,lo,index-1);
			quickSort(p,index+1,hi);			

		}

		return p;
	} 

	public int partition (char[] p,int lo,int hi) {
		int returnme=0;
		char pivot= p[hi];
		int i=lo;
		int j=hi-1;
		while(i<=j){
			if(p[i]<pivot){
				i++;
				continue;
			}
			else if(p[j]>=pivot){
				j--;
				continue;
			}
			exch(p,i,j);

		}
		returnme=i;
		exch(p,hi,i);
		return returnme;
	}

	public void exch(char[] p,int a,int b){
		char temp;
		if(a<p.length && b<p.length){
			temp=p[a];
			p[a]=p[b];
			p[b]=temp;			
		}

	}


	/***
	 * Write a program to find the node at which the intersection of two singly linked lists begins.

	For example, the following two linked lists:

	A:		a1 → a2
                                           ↘
                 	c1 → c2 → c3
                                           ↗            
	B:b1 → b2 → b3

	begin to intersect at node c1.

	Notes:

	If the two linked lists have no intersection at all, return null.
	The linked lists must retain their original structure after the function returns.
	You may assume there are no cycles anywhere in the entire linked structure.
	Your code should preferably run in O(n) time and use only O(1) memory .
	 * 
	 * 
	 */

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null || headB==null){
			return null;
		}
				
		ListNode a = headA;
		ListNode b = headB;

		while(a.val!=b.val){
			if(a.next==null){
				a=headA;
			}
			else{
				a=a.next;
			}

			if(b.next==null){
				b=headB;
			}
			else{
				b=b.next;
			}
		}
		return a ;
	}

	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		if(headA==null || headB==null){
			return null;
		}

		int aLength=0;
		int bLength=0;
		int start=0;
		ListNode a = headA;
		ListNode b= headB;
		while(a!=null){
			aLength++;
			a=a.next;
		}
		while(b!=null){
			bLength++;
			b=b.next;
		}  
		a=headA;
		b=headB;

		if(aLength>=bLength){
			start=aLength-bLength;
			while(start>0){
				a=a.next;
				start--;
			}

		}
		else{
			start=bLength-aLength;
			while(start>0){
				b=b.next;
				start--;
			}
		}

		while(a!=null){
			if(a==b){
				break;
			}
			else{
				a=a.next;
				b=b.next;
			}
		}
		return a;
	}
	
	
	public char[] bucketSort(char[] tar){
		
		return tar;
	}

} 