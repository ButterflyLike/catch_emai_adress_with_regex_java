package emailAdress.regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CatchAddress {
	public static void main(String[] args) {
		try {	
			//this file is a downloaded static html page included email address.
			BufferedReader reader =new  BufferedReader(new FileReader("F:\\test\\email.html"));
				
			String line = "";
			while((line=reader.readLine())!= null) {
				parese(line);
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	private static void parese(String line) {
		Pattern pp = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");
		Matcher mm = pp.matcher(line);
		while(mm.find()) {
			System.out.println(mm.group());
		}	
	}
}

