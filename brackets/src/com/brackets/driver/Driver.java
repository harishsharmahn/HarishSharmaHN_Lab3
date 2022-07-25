package com.brackets.driver;

import com.brackets.service.BalancingBrackets;

public class Driver {

	public static void main(String[] args) 
	{
		BalancingBrackets bb = new BalancingBrackets ();
		String braces = "(([[{}]]))"
				+ "";
		if(bb.findBalance(braces)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

	}


