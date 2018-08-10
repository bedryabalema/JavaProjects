package io;

import java.io.File;
import java.util.Date;

public class IoFile {
	/*
	 * java,io.File is used for getting file or folder information
	 */
	public static void main(String[] args) {
		File f = new File("src/Counter.java"); //pointing to a file or directory
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		Long t = f.lastModified();
		Date d = new Date(t);
		System.out.println(d);

	/*
	 * can create, delete or rename a file or directory
	 */
	File ff = new File("/Users/bedrya/Documents/TwoDArray/xyz"); //creates a folder xyz
	if(!ff.exists()||ff.isFile()) {
		ff.mkdir();
	}
	

}}
