package com.Array;
import java.util.TreeSet;
public class SecondLargestInTreeAndArray {

	public static void main(String[] args) {
		int[] ar=new int[] {12,45,3,89,2,16,1};
		TreeSet<Integer > tr=new TreeSet<>();
		for(int i=0; i<ar.length; i++) {
			
			tr.add(ar[i]);
		}
		System.out.println(tr);
		System.out.println(tr.descendingSet());
		
		}
 	}


