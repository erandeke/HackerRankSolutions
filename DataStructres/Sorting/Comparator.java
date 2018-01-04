
package org.programmingInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/*
 * Sort the player names by their names and age
 * 
 */

class Player
{
	String name;
	int age;
	
	
Player(String name, int age)
{
	this.name=name;
	this.age=age;
}




}

class SortByPlayerName implements Comparator<Player>
{

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		
		return p1.name.compareTo(p2.name);
	}
	
}

class SortByPlayerAge implements Comparator<Player>
{

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		
		return p1.age-p2.age;
	}
	
}





public class CompTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Player> listNew=new ArrayList<Player>();
		listNew.add(new Player("Kedar",10));
		listNew.add(new Player("Rocky",4));
		listNew.add(new Player("Jocky",20));
		
		Collections.sort(listNew, new SortByPlayerName());
	    Iterator<Player> itr=listNew.iterator();
	    while(itr.hasNext())
	    {
	    	Player p=(Player)itr.next();
	    	System.out.println(p.name);
	    	System.out.println(p.age);
	    	
	    }
	    
		
		
		
	}

}
