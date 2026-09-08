import java.util.Scanner;
import java.util.Arrays;

import java.util.List;
import java.util.ArrayList;

public class ListDuplicates
{
	public static void main(String args[])
	{
		Integer[] a = { 1,3,4,5,6,4,3,2,3,4,5,6,7,8,9,0};
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(a));
		System.out.println(list);
		for(int i = 0 ;i<list.size(); i++)
		{
			int x = list.get(i);
			while(list.lastIndexOf(x) != i)
			{
				int index = list.lastIndexOf(x);
				System.out.println("deleting " + x);
				list.remove(index);
			}
		}
		System.out.println(list);
	}
}
