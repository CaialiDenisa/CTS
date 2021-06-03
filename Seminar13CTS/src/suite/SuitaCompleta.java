package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TestGrupaWithStudentFake;
import teste.TestGrupaWithStudentStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaWithStudentFake.class, TestGrupaWithStudentStub.class, TestGrupaWithStudentFake.class})
public class SuitaCompleta {
	
}
