package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTeste {
	Student student = null;
	
	@Before
	public void setUp() {
		student = new Student();
	}

	@Test
	public void testApelConstructorCuParametru() {
		String nume = "Ionica";
		Student student = new Student(nume);
		//if(nume != student.getNume()) {
		//	fail("Nume incorect!");
		//}
		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume = "Student";
		Student student = new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelInitializareListaConstructorFaraParametru() {
		//Student student = new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaLista() {
		//Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testMarimeLista() {
		//Student student = new Student();
		int nota = 4;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetareNume() {
		//Student student = new Student();
		String nume="Gigel";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testCalculMedie() {
		student.adaugaNota(7);
		student.adaugaNota(6);
		assertEquals(6.5, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculMedieCuONota() {
		int nota = 7;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testVerificaRestanta() {
		int nota1= 7;
		int nota2= 4;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificaZeroRestante() {
		int nota1= 7;
		int nota2= 6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificaRestantaFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerificaAruncareExceptie() {
		int index = -1;
		student.getNota(index);	
	}
}
	
//	@Test
//	public void testGetNotaShouldThrowException() {
//		try{
//			student.getNota(-1);
//			fail("nu trebuia sa se ajunga aici");
//		} catch {IndexOutOfBoundsException err){
//			
//		}
//		
//}
//}
