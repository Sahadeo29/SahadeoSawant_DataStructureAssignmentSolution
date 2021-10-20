package com.GL.GradedAssignment3.Question1;

import java.util.Scanner;

import com.GL.GradedAssignment3.Question1.Stack.FloorStack;

public class Skyscraper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of floors in the building:");
		int number = sc.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.println("Enter the floor size given on day" + (i + 1) + ":");
			int size_of_floor = sc.nextInt();
		}
		FloorStack fs = new FloorStack();
		fs.push(number);
		fs.pop();
		sc.close();
	}
}