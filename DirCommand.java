package io;

import java.io.File;

public class DirCommand {
	/*
	 * we are getting each contents in the directory
	 */

	public static void main(String[] args) throws Exception {
		File f = new File("/Users/bedrya/Documents/TwoDArray/src");
		if(f.isDirectory()) {
			String[] fNames = f.list();
			for(String file:fNames) {
				System.out.println(file);
				File ff = new File(f,file);  //to print the sub directories
				if(ff.isDirectory()) {    
					String[] fn = ff.list();
					for(String s:fn) {
						System.out.println("--"+s);
						Thread.sleep(200);
					}
				}
				Thread.sleep(400);
			}
		}

	}

}
