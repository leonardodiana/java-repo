package demo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class DemoFile {

	public static void main(String[] args) {
		try {
			
			URL mioUrl = new URL("https://raw.githubusercontent.com/maboglia/ProgrammingResources/master/tabelle/txt/fintech_glossario.txt");
			
			InputStream openStream = mioUrl.openStream();
			BufferedInputStream bis = new BufferedInputStream(openStream);
			int i;
			PrintWriter pw = new PrintWriter( new File("files/output.txt"));
			while((i = bis.read())!= -1){
				System.out.print((char) i);
				pw.print(i);
			}
			
		}catch (MalformedURLException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
	}

}
}