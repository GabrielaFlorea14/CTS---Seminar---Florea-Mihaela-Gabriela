package cts.unit_testing.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import cts.unit_testing.clase.*;
import cts.unit_testing.clase.*;

public class PersoanaGetVarstaTests {

	@Test
	public void testGetVarstaRight() {
		Persoana p = new Persoana("Tiberiu", "5010216410030");
		assertEquals(22, p.getVarsta());
	}

	@Test
	public void testGetVarstaBoundaryNouNascut() {
		Persoana p = new Persoana("Tiberiu", "5230521410030");
		assertEquals(0, p.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryAnul2000() {
		Persoana p = new Persoana("Tiberiu", "5000101410030");
		assertEquals(23, p.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryAnul1900() {
		Persoana p = new Persoana("Tiberiu", "1000101410030");
		assertEquals(123, p.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryAnul1999() {
		Persoana p = new Persoana("Tiberiu", "2991231410030");
		assertEquals(23, p.getVarsta());
	}
	
	@Test(expected = MyException.class)
	public void testGetVarstaError() {
		Persoana p = new Persoana("Tiberiu", "5230525410030");
		p.getVarsta();
	}
	
	@Test(timeout = 100)
	public void testGetVarstaPerformance() {
		Persoana p = new Persoana("Andrei", "5010216410030");
		p.getVarsta();
	}
}