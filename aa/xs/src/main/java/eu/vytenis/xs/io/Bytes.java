package eu.vytenis.xs.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import eu.vytenis.xs.exc.XsException;

public class Bytes {

	public static byte[] join(byte[] first, byte[] second, byte[] third) {
		return join(Arrays.asList(first, second, third));
	}

	public static byte[] join(List<byte[]> bytesList) {
		try {
			return joinThrowsExc(bytesList);
		} catch (IOException e) {
			throw new XsException(e);
		}

	}

	private static byte[] joinThrowsExc(List<byte[]> bytesList) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		for (byte[] bytes : bytesList) {
			bos.write(bytes);
		}
		return bos.toByteArray();
	}

}
