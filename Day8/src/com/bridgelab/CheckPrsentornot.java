package com.bridgelab;

public class CheckPrsentornot {
	
	public static void main(String[] args) {

		int fulltime = 1;

		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == fulltime)
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");

	}

}
