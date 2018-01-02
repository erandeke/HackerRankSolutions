package org.programmingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Book
{
	String name;
	int id;
	int quantity;
	float f;
	
	Book(String name,
	int id,
	int quantity,
	float f)
	{
		this.name=name;
		this.id=id;
		this.quantity=quantity;
		this.f=f;
		
	}
	
	
}
public class CustomizedObjectAsValueorKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1= new Book("raghav",1,100,3.0f);
	Book b2=new Book("mmaghav",1,200,3.0f);
		Book b3=new  Book("aaaghav",1,100,3.0f);
		
		Map<Integer,Book> sample=new TreeMap<Integer, Book>();
		sample.put(1, b1);
		sample.put(10, b2);
		sample.put(2,b3);
		
		for(Map.Entry<Integer, Book> m:sample.entrySet())
		{
			Book b=m.getValue();
			  System.out.println(m.getKey());
			System.out.println(b.name+""+b.id+""+b.quantity);
		}
		
	   //Customized Object as key...
		/*
		Map<Book,Integer> samplenew=new TreeMap<Book, Integer>();
		samplenew.put(b1, 10);
		samplenew.put(b2, 5);
		samplenew.put(b3,20);
		for(Map.Entry<Book, Integer> m:samplenew.entrySet())
		{
			
			System.out.println("key"+m.getKey());
			System.out.println(m.getValue());
			
		}
		
		
		*/
	
		
	}

}
