package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void contructorShouldCreateObjectWhenValidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}
	
	@Test
	public void contructorShouldThrowIllegalArgumentExceprionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 20);			
		});
		
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		financing.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceprionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setTotalAmount(200000.0);
		});
		
	}
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		financing.setIncome(3000.0);
		
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(3000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceprionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setIncome(500.0);
		});
		
	}
	
	@Test
	public void setMonthShouldSetDataWhenValidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		financing.setMonths(100);
		
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(100, financing.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceprionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setMonths(75);
		});
		
	}
	
	@Test
	public void entryShouldCalculateCorrecty() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000, financing.entry());
		
	}
	
	@Test
	public void quotaShouldCalculateCorrecty() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000, financing.quota());
		
	}
}
