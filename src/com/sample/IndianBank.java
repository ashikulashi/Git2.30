package com.sample;

public class IndianBank implements StateBank,HDFCBank{

	@Override
	public void current() {
		System.out.println("current 5%");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit 7%");
		
	}

	@Override
	public void savings() {
		System.out.println("savings 9%");
		
	}

	@Override
	public void loan() {
		System.out.println("loan 3%");
		
	}
	public static void main(String[] args) {
		IndianBank i=new IndianBank();
		i.current();
		i.deposit();
		i.loan();
		i.savings();
		
	}

	

		

}
