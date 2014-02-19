package eu.vytenis.xs.io;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class BytesTest {

	@Test
	public void joinThreeSucceeds() {
		byte[] input1 = {2};
		byte[] input2 = {3, 4};
		byte[] input3 = {};
		byte[] output = {2, 3, 4};
		assertArrayEquals(output, Bytes.join(input1, input2, input3));
	}

	@Test
	public void joinEmptySucceeds() {
		assertArrayEquals(new byte[] {}, Bytes.join(Arrays.<byte[]> asList()));
		assertArrayEquals(new byte[] {}, Bytes.join(Arrays.<byte[]> asList(new byte[] {})));
	}

	@Test
	public void joinSucceeds() {
		byte[] input1 = {2};
		byte[] input2 = {3, 4};
		byte[] input3 = {};
		byte[] output = {2, 3, 4};
		assertArrayEquals(output, Bytes.join(input1, input2, input3));
	}

}
