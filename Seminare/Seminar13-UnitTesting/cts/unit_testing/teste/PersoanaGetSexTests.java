package cts.unit_testing.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import cts.unit_testing.clase.*;
import cts.unit_testing.clase.*;

public class PersoanaGetSexTests {

	@Test
	public void testGetRightSexMasc() {
		Persoana p = new Persoana("Tiberiu", "5010216410030");
		assertEquals("M", p.getSex());
	}
	
	@Test
	public void testGetRightSexFem() {
		Persoana p = new Persoana("Ana", "6010216410030");
		assertEquals("F", p.getSex());
	}
	
	@Test
	public void testGetBoundarySexMasc() {
		Persoana p = new Persoana("Andrei", "1010216410030");
		assertEquals("M", p.getSex());
	}
	
	@Test
	public void testGetCrossCheckSex() {
		Persoana p = new Persoana("Andrei", "4010216410030");
		assertEquals(verificaParitate(p.CNP), p.getSex());
	}
	
	private String verificaParitate(String CNP) {
		int numar = Integer.parseInt(CNP.charAt(0) + "");
		if(numar % 2 != 0) {
			return "M";
		}
		else {
			return "F";
		}
	}
	
	@Test(expected = MyException.class)
	public void testGetSexError() {
		Persoana p = new Persoana("Andrei", "9010216410030");
		p.getSex();
	}
	
	@Test(timeout = 100)
	public void testGetSexPerformance() {
		Persoana p = new Persoana("Andrei", "5010216410030");
		p.getSex();
	}
}