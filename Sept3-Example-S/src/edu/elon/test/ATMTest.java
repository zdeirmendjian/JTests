package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATMTest {

	@Test
	public void testATMDouble() {
		ATM testATM = new ATM(1000);
		System.out.println(testATM.getBalance());
		assertEquals("Checking Double", 1000.00, testATM.getBalance(),0);
	}


	@Test
	public void testDeposit() {
		Double amount = 35.00;
		ATM testATM = new ATM();
		//System.out.println(testATM.getBalance());
		testATM.deposit(amount); 
		//System.out.println(testATM.getBalance());
		//System.out.println(amount.doubleValue());
		assertEquals("Checking Balance", amount.doubleValue(), testATM.getBalance(),0);	
		}

	@Test
	public void testGetBalance() {
		Double amount = 25.00;
		ATM testATM = new ATM();
		//System.out.println(testATM.getBalance());
		testATM.deposit(amount);
		//System.out.println(testATM.getBalance());
		assertEquals("CheckingBalance", amount.doubleValue(), testATM.getBalance(), 0);
	}

	@Test
	public void testToString() {
		ATM testATM = new ATM();
		testATM.deposit(100);
		System.out.println(testATM.toString());
		assertEquals("Checking To String", "Amount balance is $100.00", testATM.toString());
	}

	@Test
	public void testWithdraw() {
		Double amount = 50.00;
		ATM testATM = new ATM();
		testATM.deposit(75.00);
		System.out.println(testATM.getBalance());
		testATM.withdraw(amount);
		System.out.println(testATM.getBalance());
		assertEquals("Checking balance", 25.00, testATM.getBalance(),0);
	}
	
	@Test
	public void testWithdrawException() {
		Double amount = 20.00;
		ATM testATM = new ATM();
		testATM.deposit(amount);
		System.out.println(testATM.getBalance());
		testATM.withdraw(50.00);
		System.out.println(testATM.getBalance());
		assertEquals("Checking balance", 25.00, testATM.getBalance(),0);
	}

}
