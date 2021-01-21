package com.capgemini.services;
import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientOpeningAmountException;
import com.capgemini.exception.InvalidAccountNumberException;

public class Bank {
	public String createAccount(int accountNumber,int amount) throws InsufficientOpeningAmountException;
	public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException;
	public int[] fundTransfer(int senderAccountNumber,int recieverAcoountNumber,int transferAmount) throws InvalidAccountNumberException, InsufficientBalanceException;
	public int depositAmount(int accountNumber,int amount)throws InvalidAccountNumberException;


}
