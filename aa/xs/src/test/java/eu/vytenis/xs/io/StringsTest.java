package eu.vytenis.xs.io;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringsTest {

	@Test
	public void getBytesSucceeds() {
		assertEquals(7, Strings.getBytes("dešimt").length);
	}

}
