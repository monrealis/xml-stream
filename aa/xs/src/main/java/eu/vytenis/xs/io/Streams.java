package eu.vytenis.xs.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import eu.vytenis.xs.exc.XsException;

public class Streams {

	public static String readString(InputStream is) {
		return new String(read(is));
	}

	public static byte[] read(InputStream is) {
		try {
			return readThrowsExc(is);
		} catch (IOException e) {
			throw new XsException(e);
		}
	}

	private static byte[] readThrowsExc(InputStream is) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int b;
		while (true) {
			b = is.read();
			if (b <= 0) {
				break;
			}
			bos.write(b);
		}
		return bos.toByteArray();
	}
}
