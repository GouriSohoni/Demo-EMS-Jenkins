package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MyPkg.Validator;

public class ValidatorTest {
	
	//public static void main()
	//{
	//	JUnitCore jCore = new JUnitCore();
	//	@SuppressWarnings("unused")
	//	Result result = jCore.run(ValidatorTest.class);
		
	//}
	@Test
    public void TestValidate()
	{
		Boolean actual, expected=true;
		Validator val = new Validator();
		actual = val.Validate("Gouri", "Sohoni");
		assertEquals(expected,actual);
	}
}
