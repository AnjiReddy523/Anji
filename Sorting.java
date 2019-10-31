package javaDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public Sorting(String string) {
		
	}

	public static void main(String[] args) {
		String a = "anji";
		//String b = "siva";
		//String c = "gopi";
	   
		 ArrayList<String> ar = new ArrayList<String>(); 
	        ar.add(a); 
	        //ar.add(b); 
	        //ar.add(c); 
		Collections.sort(ar, Collections.reverseOrder()); 
		/* dSystem.out.println("\nSorted "); */
	        for (int i=0; i<ar.size() ; i++) 
	            System.out.println(ar.get(i));
	}

	
}
