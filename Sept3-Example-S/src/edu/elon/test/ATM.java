/*
 * ATM.java version August 29, 2015
 *
 * Copyright (c) 2015 David J. Powell, Elon University.
 * Elon, North Carolina, 27244, U.S.A.
 * All rights reserved.
 *
 */
package edu.elon.test;

import java.text.NumberFormat;

/**
 * Class exercise to work with JUnit to properly handle an exception.
 * Note: this code is intentionally incorrect so you can fix it during
 * testing.
 * 
 * @author dpowell2
 * @version 1.0
 * @since 1.0
 * 
 */
public class ATM {
  private double balance;
  private int numberOfDeposits;
  private int numberOfWithdrawals;

  /**
   * 
   * Default constructor sets balance to 0
   * 
   */
  public ATM() {
    this(0);
  }

  /**
   * Constructor takes a positive value to set the initial balance of
   * the instance.
   * 
   * @param balance non negative amount of money to deposit
   */
  public ATM(double balance) {
    this.balance = balance;
    numberOfDeposits = 1;
    numberOfWithdrawals = 0;
  }

  /**
   * Adds a non negative deposit amount to the account balance.
   * 
   * @param amount a positive value for money to be deposited
   * @throws IllegalArgumentException if requested deposit is less
   *         then 0
   */
  public void deposit(double amount) throws IllegalArgumentException {
    if (amount < 0.0) {
      throw new IllegalArgumentException("Only positive values");
    } else {
      balance = balance + amount;
      numberOfDeposits++;
    }
  }

  /**
   * Gets current amount of money in user account.
   * 
   * @return a double value representing money in the account
   *         available for withdrawal. The balance is guarenteed to
   *         always be >= 0.
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Gets a user readable string containing the account balance.
   * 
   * @return a string is user friendly readable format for the balance
   */
  @Override
  public String toString() {
    String newLine = "\n";
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    return "Amount balance is " + currencyFormat.format(balance);
  }

  /**
   * withdraw requested <code>amount</code>from user balance. Throw an
   * exception if the user does not have the balance to cover the
   * withdrawal.
   * 
   * @param amount double value that is >= current balance
   * @return double value of amount actually withdrawn
   * @throws IllegalArgumentException if request withdraw amount is
   *         less than the amount currently in account balance.
   */
  public double withdraw(double amount) throws IllegalArgumentException {
    if ((amount < 0) || (amount > balance)) {
      throw new IllegalArgumentException("Invalid withdrawal");
    } else {
      balance = balance - amount;
      numberOfWithdrawals++;
    }
    return amount;
  }

}
