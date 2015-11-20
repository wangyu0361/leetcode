package leetcode.leetcode;

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
		char[] test = {'a','g','e','h','w','t','y','w','b','c','m'};
		System.out.println(library.quickSort(test, 0, test.length-1));
		
	}
}
