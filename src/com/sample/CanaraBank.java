package com.sample;

public class CanaraBank extends GreensBank{

	@Override
	public void savings() {
		System.out.println("Savings 7%");
		
	}

	@Override
	public void fixed() {
		System.out.println("fixed 5%");
		
	}
	public static void main(String[] args) {
		CanaraBank c=new CanaraBank();
		c.deposit();
		c.fixed();
		c.savings();
		
	}

}
