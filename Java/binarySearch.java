//BINARY SEARCH BY USER INPUT
import java.util.*;
import java.io.*;
public class searching{
	public static int binarySearch(int arr[],int x){
        int low=0;
		int high = arr.length-1;
		while(low <= high){
			int mid = (low+high)/2;
			if(arr[mid] == x){
				return mid;
			}
			if(arr[mid]<x){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		} 
		return -1;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter the array size: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element of array: ");
		for(int i = 0;i<n;i++){
        arr[i]=sc.nextInt();
		}
        System.out.println("enter the searched element: ");
        int x=sc.nextInt();
		
		int result = binarySearch(arr,x);
		if(result == -1){
        System.out.println("Searched element not found in array");	
		}else{
			System.out.println("searched element is found in: "+ result);
		}
	}
}
