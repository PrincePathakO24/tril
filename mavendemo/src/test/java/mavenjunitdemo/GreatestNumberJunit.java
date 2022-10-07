package mavenjunitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mavenmaindemo.GreatestNumber;

public class GreatestNumberJunit {
	
	@Test
	public void Greatest1()
	{
		assertEquals(1,GreatestNumber.greatest(10,5));
	}
}
