package org.programmingInterview;

public class CommonElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr1[]={1,2,3,4,5};
		 int arr2[]={2,5,4,10,9};
		 boolean isDistinct=true;
		 
		for(int i=0;i<arr1.length;i++)
		{	for(int j=0;j<arr2.length;j++)
			
		 if(arr1[i]==arr2[j])
		 {
			 isDistinct=false;
			
			
		 }
		 
		if(isDistinct)
		{
			System.out.println(arr1[i]);
		}
		
		 }
	}
	}


