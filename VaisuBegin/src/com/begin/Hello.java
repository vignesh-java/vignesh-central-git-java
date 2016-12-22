package com.begin;

import java.security.acl.LastOwnerException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String next = sc.nextLine();
		
		String str = next.toLowerCase();
		String rep = str.replace(" ", "");
		
		char[] ch = rep.toCharArray();
		
		List<Character> list = new ArrayList<Character>();

		
		for (Character c : ch) {
			
			list.add(c);
			if(list != null){

				if(list.contains('a')){
					list.remove(list.lastIndexOf('a'));
				}
				if(list.contains('e')){
					list.remove(list.lastIndexOf('e'));
				}
				if(list.contains('i')){
					list.remove(list.lastIndexOf('i'));
				}
				if(list.contains('o')){
					list.remove(list.lastIndexOf('o'));
				}
				if(list.contains('u')){
					list.remove(list.lastIndexOf('u'));
				}
			
			}
		
		
			
		}
		String nonVowels = null;
		for (Character character : list) {
			nonVowels = character.toString();
			System.out.print(nonVowels);
		}
		
		
	}
}
