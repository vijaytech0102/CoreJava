package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample {

	public static int linearSearch(int arr[], int target)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			if(target==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array -> statically stored element in the array
		int[] arr= {1,2,4,4,56,5}; // total size in byte==> 24 byte
		char [] chr= {'a', 'b', 'c'}; // total size in byte=> 6 byte
		String [] strArray= {"Hello", "world", "java"}; // total size in byte=>28 bytes 
		double[] dbarry= {1.2, 45.344, 34.456,343.34}; // total sizein byte=> 8x4= 32 
		byte [] btarry= {0,4,6,7,4,6,};// total size in bytes= 1x6=6
		boolean[] br= {true, false, true, false}; // total size in bytes=>1*4=4
		int [][]tarr= {{1,2,3},
				      {56,45,34},
				       {32,12,45}};
		
		
		
								
		
		int search=56;
		int pos=0;
		int index=linearSearch(arr,56);
		pos=index+1;
		System.out.println("element found at Index:"+index+arr[index]+pos);
		
//		System.out.println("Element found at index:"+index+"position:"+pos+"element:"+arr[pos-1]);
		// output-->Element found at index:4 position:5 element:56
		
		// access--> traversing--> visiting each element in the array=> loop-> for loop--> definite number of steps
//		for(int i=0; i<br.length; i++)
//		{
//			System.out.println(br[i]);
//		}
		
		// user input
		// int arr[10];
		
		// dynamic memory allocation
		ArrayList<Integer>arlist =new ArrayList<>();
		
		// empty array declartion of size 10		
		// static memory allocation
//		int arr1[]=new int[10]; // 4*10= 40 bytes 
		Scanner sc= new Scanner(System.in);
//		// input
//		for(int i=0; i<arr1.length-1; i++)
//		{
//			arr1[i]=sc.nextInt();
//		}    
//		
//		// print --> output    
//		for(int i=0; i<arr1.length-1; i++)
//		{
//			if(arr1[i]%2!=0)
//			{
//			  System.out.println(arr1[i]);
//			}
//		}
		
		// 2D array--> Array having two dimension-->1.Row, 2.Column
		// 2d array declaration
		// 3*3--> 9 elements
		// 9*int=> 9*4=36 bytes
		// row length--> 3
		// column length-->3
		int ar[][]=new int[3][3];
		// 1 2 3
		// 4 5 6
		// 7 8 9
		// static way
		// user input
		System.out.println("Enter the elements in the array");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		// access or display each element
		int sum=0;
		
		for(int i=0; i<3; i++)
		{
			int rowsum=0;
			int clsum=0;
			for(int j=0; j<3; j++)
			{
				sum=sum+ar[i][j];
				rowsum+=ar[i][j];
				clsum+=ar[j][i];
//				System.out.print(ar[i][j]+" ");
			}
			System.out.println("Row sum"+i+":"+rowsum);
			System.out.println("Colum sum"+":"+clsum);
//			System.out.println();
		}
		System.out.println("Matrix sum of each element:"+sum);
		
		int find=5;
		int row=0,col=0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(ar[i][j]==find)
				{
					row=i;
					col=j;
				}
				System.out.print(ar[j][i]);
			}
			System.out.println();
		}
		System.out.println("Element found at"+"row:"+row+" col:"+col+ "Element:"+ar[row][col]);
		
		// 1.sum of each element in the matrix
		// 2. Row-wise  sum
		// 3. Column-wise sum
		// 4. Transpose of matrix --> 
		// 5. Diagonal sum --> diagonal1 and diagonal 2
		// 6. Matrix multiplication( two matrices)
		// 7. Addition of two matrix
		int d1=0;
		int d2=0;
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar.length; j++)
			{
				if(i==j)
				{
					d1=d1+ar[i][j];
				}
				if(i+j==ar.length-1)
				{
					d2+=ar[i][j];
				}
			}
		}
		System.out.println("Diagonal sum1:"+d1+ "Diagonal sum2:"+d2);
		
	}
		 int A[][]= {{1,2},{4,5}};
		 int B[][]= {{4,5},{8,9}};
		 
		 
		 
}
