package com.oops.Assign;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sw=new Scanner(System.in);
Savings ss=new Savings();
ss.AmountAvailabe(sw.nextInt(),sw.nextInt());
CurrentAccount ac=new CurrentAccount();
ac.AmountAvailabe(ss.amount);
sw.close();
	}

}

