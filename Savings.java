package com.oops.Assign;
public class Savings {
private int FixedDeposit;
protected int amount;


void AmountAvailabe(int FixedDeposit, int amount) {
	this.FixedDeposit=FixedDeposit;
	this.amount=amount;
	double total=FixedDeposit+amount;
System.out.println("this is fixeddeposit"+total);


}

}