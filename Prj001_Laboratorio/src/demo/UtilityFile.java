package demo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Glossario{
	
	String voce;
	String desc;
	String link;
	public Glossario(String voce, String desc, String link) {
		super();
		this.voce = voce;
		this.desc = desc;
		this.link = link;
		
		Glossario g = new Glossario(voce, desc, link);
		ps = conn.prepareStatement
	}
	
	
}

public class UtilityFile {

	public static void main(String[] args) {
		
		Connection conn = DriverManager.getConnection("jdnc:mysql://local/fintech", "root", "");
		
		PreparedStatement ps;
		
		try {
			Files.readAllLines(Paths.get("files/fintech_glossario.txt"), Charset.forName("utf-8"));
			
			readAllLines.forEach
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
