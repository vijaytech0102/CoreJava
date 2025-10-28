package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array -> statically stored element in the array
		int[] arr= {1,2,4,4,56,5}; // total size in byte==> 24 byte
		char [] chr= {'a', 'b', 'c'}; // total size in byte=> 6 byte
		String [] strArray= {"Hello", "world", "java"}; // total size in byte=>28 bytes 
		double[] dbarry= {1.2, 45.344, 34.456,343.34}; // total sizein byte=> 8x4= 32 
		byte [] btarry= {0,4,6,7,4,6,};// total size in bytes= 1x6=6
		boolean[] br= {true, false, true, false}; // total size in bytes=>1*4=4
		
		// access--> traversing--> visiting each element in the array=> loop-> for loop--> definite number of steps
		for(int i=0; i<br.length; i++)
		{
			System.out.println(br[i]);
		}
		
		// user input
		// int arr[10];
		
		// dynamic memory allocation
		ArrayList<Integer>arlist =new ArrayList<>();
		
		// empty array declartion of size 10		
		// static memory allocation
		int arr1[]=new int[10]; // 4*10= 40 bytes 
		Scanner sc= new Scanner(System.in);
		// input
		for(int i=0; i<arr1.length-1; i++)
		{
			arr1[i]=sc.nextInt();
		}
		// print --> output
		for(int i=0; i<arr1.length-1; i++)
		{
			if(arr1[i]%2!=0)
			{
			System.out.println(arr1[i]);
			}
		}
			
	}

}
