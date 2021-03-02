package org.hexa;

import java.util.LinkedHashSet;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		Set<Integer> li=new LinkedHashSet<Integer>();
		
		li.add(30);
		li.add(40);
		li.add(90);
		li.add(79);
		li.add(56);
		
	System.out.println(li);
	
	
	for ( Integer x: li) {
		System.out.println(li);}}}