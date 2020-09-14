package com.lti.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.lti.code.Arithmetic;

public class TestArithmetic {
	private Arithmetic arth;
	
	public void init() {
		arth = new Arithmetic();
		
	}
	
	public void testsum() {
		assertEquals(10, arth.sum(4,6));
	}
	
	
	

}
