package com.nt.test;

import com.nt.components.Bank;
import com.nt.factory.BankFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Bank bank=BankFactory.checkInterest("HDFC");
		bank.rateOfInterest();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		Bank bank2=BankFactory.checkInterest("SBI");
		bank2.rateOfInterest();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		Bank bank3=BankFactory.checkInterest("HSBC");
		bank3.rateOfInterest();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		Bank bank4=BankFactory.checkInterest("ICICI");
		bank4.rateOfInterest();

	}

}
