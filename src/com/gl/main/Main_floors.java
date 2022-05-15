package com.gl.main;
import java.util.*;
import com.gl.model.Skyscraper;

public class Main_floors {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building:");
		int max = sc.nextInt();
		int [] floors = new int [max];
		for (int i = 1; i < max + 1; i++) {
			System.out.println("enter the floor size given on day : " + i);
			floors[i - 1] = sc.nextInt();
		}
		sc.close();
		Skyscraper obj = new Skyscraper();
		obj.Construction(max, floors);
	}
}
