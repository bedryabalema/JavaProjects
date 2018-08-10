package io;

import java.io.FileOutputStream;

public class StreamFile {
	/*
	 * when we add true, it will be appending mode, that it wont delete the data but append 
	 * it if we run it once again
	 */

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/bedrya/Documents/TwoDArray/File.txt");
		//FileOutputStream fos = new FileOutputStream("/Users/bedrya/Documents/TwoDArray/File.txt",true);//to write everytime we save(appending mood)
		String str = " Helen is the best java programmer,\n\ror atleast she is wants to be";
		//change this str to byte form since FileOutputStream recognizes byte forms only
		byte[] b = str.getBytes();
		fos.write(b);
		System.out.println("file saved!");
		fos.close();

	}

}
