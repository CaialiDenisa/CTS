package suite;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.GetPromovabilitate;
import teste.TestGrupa;
import teste.TestGrupaWithStudentFake;
import teste.TestGrupaWithStudentStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupa.class, TestGrupaWithStudentStub.class, TestGrupaWithStudentFake.class})
@IncludeCategory({GetPromovabilitate.class, SuitaCompleta.class})
public class SuitaCustom {

}
