package test;
import static org.junit.Assert.*;
import org.junit.Test;
import logic.BasicCalculations;

public class TestBasicCalculations {
	@Test
	public void TestDivision(){
		BasicCalculations TestDivision = new BasicCalculations();
		double output = TestDivision.PerfectDivision(20,5);
		assertEquals((double)4, output, 0);
	}
	

	@Test
	public void TestSum(){
		BasicCalculations TestSum = new BasicCalculations();
		int output = (int) TestSum.PerfectSum(10,10);
		assertEquals(21, output, 0);
	}
		
}
