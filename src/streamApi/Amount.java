package streamApi;

import java.text.DecimalFormat;

public class Amount {

    public static String roundDown(double amount) {
        // multiply → floor → divide back
        double truncated = Math.floor(amount * 10) / 10.0;  // <-- FIXED LOGIC
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(truncated);  
    }

    public static void main(String[] args) {
        double amount = 1842.81;
        System.out.println(roundDown(amount));  // Output: 1842.80
        
        int arr[]= {1,2,3,4,2,2,3,2,3,4,3};
        for(int i=0; i<arr.length; i++)
        {
        	for(int j=i+1; j<arr.length; j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			System.out.println(arr[i]);
        		}
        	}
        }
    }    
}
