package com.gl.model;
import java.util.*;

public class Skyscraper {
	
	public void sortArray(int [] array, int l, int r) {

		if (l != r) {
			int mid = (l + r) / 2;
			sortArray(array, l, mid);
			sortArray(array, mid + 1, r);
			conquerArray(array, l, mid, r);
		}
	}
	
	public void conquerArray(int [] array, int l, int m, int r) {
		
		int len1 = m - l + 1;
		int len2 = r - m;
		
		int [] leftarr = new int[len1];
		int [] rightarr = new int[len2];
		
		for (int i = 0; i < len1; i++) {
			leftarr[i] = array[l + i];
		}
		for (int i = 0; i < len2; i++) {
			rightarr[i] = array[m + 1 + i];
		}
		
		int i = l, j = 0, k = 0;
		
		while (j < len1 && k < len2) {
			if (leftarr[j] <= rightarr[k])
				array[i++] = leftarr[j++];
			else 
				array[i++] = rightarr[k++];
		}

		while (j < len1) {
			array[i++] = leftarr[j++]; 
		}
		
		while (k < len2) {
			array[i++] = rightarr[k++];
		}
	}
	
	public void Construction(int max, int [] arr) {
		 Stack<Integer>stack = new Stack<>();
		 int [] new_arr = new int[max];
		 boolean status = false;
		 int y = max;
		
		for (int i = 1; i < max + 1; i++) {
			status = false;
			if (arr[i - 1] == y) {
				status = true;
				stack.push(arr[i - 1]);
			}
			else
				stack.push(arr[i - 1]);
			
			if (status == true) 
				System.out.println("Day: " + i);
			else 
				System.out.println("Day: " + i + "\n");
			
			while (status) {
				for (int l = 0; l < new_arr.length && !stack.isEmpty(); l++)
					new_arr[l] = stack.pop();
				sortArray(new_arr, 0, new_arr.length - 1);
				for (int j = 0; j < new_arr.length; j++) {
					stack.push(new_arr[j]);
				}
				
				if (!stack.isEmpty()) {
					while (y == stack.peek() && stack.peek() != 0) {
							System.out.print(stack.pop() + " ");
							status = true;
							y--;
						}
					System.out.println("");
					if (y != stack.peek())
						status = false;
				}
			}
		}
	}
}
