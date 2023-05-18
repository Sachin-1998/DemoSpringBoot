package com.nt.factory;

import com.nt.components.Bank;
import com.nt.components.HdfcBank;
import com.nt.components.HsbcBank;
import com.nt.components.IciciBank;
import com.nt.components.SbiBank;

public class BankFactory 
{
	public static Bank checkInterest(String bankType)
	{
		Bank bank=null;
		if(bankType.equalsIgnoreCase("SBI"))
		   bank=new SbiBank();
		else if(bankType.equalsIgnoreCase("HDFC"))
			bank=new HdfcBank();
		else if(bankType.equalsIgnoreCase("HSBC"))
            bank=new HsbcBank();
		else if(bankType.equalsIgnoreCase("ICICI"))
			bank=new IciciBank();
		else throw new IllegalArgumentException("Invalid Bank Type");
		
		return bank;
		
	}

}
