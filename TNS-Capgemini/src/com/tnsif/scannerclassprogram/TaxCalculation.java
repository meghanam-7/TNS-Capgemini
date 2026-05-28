package com.tnsif.scannerclassprogram;

public class TaxCalculation {

	public void calctax(Person p) {
		if (p.getIncome() <= 2000) {
			p.setTax(0);

		} else if (p.getIncome() > 2000 && p.getIncome() <= 50000) {
			p.setTax(5);
		} else {
			p.setTax(10);
		}
	}
}
