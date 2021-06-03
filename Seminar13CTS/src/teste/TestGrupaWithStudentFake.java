package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.GetPromovabilitate;
import clase.Grupa;
import dubluri.StudentFake;

public class TestGrupaWithStudentFake {

	@Test
	@Category({GetPromovabilitate.class})
	public void testPromovabilitateAreRestante() {
		Grupa grupaMea = new Grupa(1077);
		
		for(int i = 0; i<8;i++) {
			StudentFake studentFake1 = new StudentFake();
			studentFake1.setValoareGetAreRestante(false);
			grupaMea.adaugaStudent(studentFake1);
		}
		for(int i=0;i<2;i++) {
			StudentFake studentFake2 = new StudentFake();
			studentFake2.setValoareGetAreRestante(true);
			grupaMea.adaugaStudent(studentFake2);
		}
		
		assertEquals(0.8, grupaMea.getPromovabilitate(),0.01);
		
	}

}
