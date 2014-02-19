package eu.vytenis.xs.io;

import java.nio.charset.Charset;

public class Strings {
	public static Charset UTF8;
	static {
		UTF8 = Charset.forName("UTF-8");
	}

	public static byte[] getBytes(String text) {
		return text.getBytes(UTF8);
	}

}
