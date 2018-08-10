package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class InputStreamTest {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("/Users/bedrya/Documents/TwoDArray/File.txt");
		//System.out.println("No of bytes to be read: "+fis.available());
		//System.out.println((char)fis.read());
		//System.out.println((char)fis.read());
		//System.out.println("No of bytes to be read "+fis.available());
		/*
		 * to read the entire file we use 
		 */
		/*int n = fis.read();
		while(n != -1) {  //if not end of file(eof)
			System.out.print((char)n);
			n = fis.read();
			Thread.sleep(100);
			} 
			fis.close();*/
		
		//Another way of reading a file
		/*byte[] b = new byte[fis.available()];//create a byte array with a size of the file
		fis.read(b);  
		String s = new String(b);  //changing the byte to string
		System.out.println(s);
		fis.close();*/
		
		/*
		 * reading line by line
		 */
		InputStreamReader reader = new InputStreamReader(fis); //converts byte stream to character stream
		BufferedReader br = new BufferedReader(reader); //to read the data line by line
		String str = br.readLine();  //reads one line, this method is available in character stream
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
			Thread.sleep(1000);
		}
		fis.close();
		
		}

}
