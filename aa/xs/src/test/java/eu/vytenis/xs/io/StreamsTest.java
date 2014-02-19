package eu.vytenis.xs.io;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import eu.vytenis.xs.exc.XsException;

public class StreamsTest {

	@Test(expected = XsException.class)
	public void readFails() {
		Streams.read(new InputStream() {
			@Override
			public int read() throws IOException {
				throw new IOException();
			}
		});
	}

	@Test
	public void readSucceeds() {
		byte[] bytes = {10, 2, 3, 4, 5};
		assertArrayEquals(bytes, Streams.read(new ByteArrayInputStream(bytes)));
	}

}
