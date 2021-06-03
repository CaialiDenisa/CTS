package teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.GetPromovabilitate;
import categorii.TesteUrgente;
import clase.Grupa;
import clase.Student;

public class TestGrupa {

	
	@Test
	@Category({GetPromovabilitate.class})
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupaNoua= new Grupa(1076);
		Student student1=new Student("Marcel");
		student1.adaugaNota(8);
		student1.adaugaNota(9);
		
		Student student2=new Student("Maria");
		student2.adaugaNota(8);
		student2.adaugaNota(9);
		
		grupaNoua.adaugaStudent(student1);
		grupaNoua.adaugaStudent(student2);
		
		assertEquals(1, grupaNoua.getPromovabilitate(), 0.05);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPromovabilitateError() {
		Grupa grupaNoua = new Grupa(1080);
		grupaNoua.getPromovabilitate();
	}
		
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}

	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorMaiMic() {
		int nrGrupa=100;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorMaiMare() {
		int nrGrupa=11001;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(timeout=500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);	
	}
	
	@Test(timeout=500)
	public void testConstructorExistence() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	
}

