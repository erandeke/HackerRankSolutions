package org.programmingInterview;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="google";
		String t="character";
		int cnt=0;
		char arr[]=s.toCharArray();
	     char arr1[]=t.toCharArray();
	     for(int i=0;i<t.length();i++){
	    	 
	    	 for(int j=i+1;j<t.length();j++)
	    	 {
	    		  if(arr1[i]==arr1[j])
	    		  {
	    			  System.out.println("dups"+arr1[j]);
	    			  cnt++;
	    			  System.out.println(cnt);
	    			  break;
	    		  }
	    		 
	    	 }
	    	 
	     }
	
		
		
		
		for(int i=0; i<s.length();i++)

		{
			for(int j=i+1;j<s.length();j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate"+arr[j]);
					break;
				}
				
			}
			
			
			
			
		}
		
	}

}
