package leetcode.leetcode;

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



} 