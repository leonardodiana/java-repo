package repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Game;

public class GameDAO {

	Connessione miaConn;
	Connection conn;
	Statement stat;//contenitore per le istruzioni;
	ResultSet rs;//contenitore per risultati;
	
	public GameDAO() {
		this.miaConn = new Connessione();
		this.conn = miaConn.getConn();
	}
	public List<Game> getAllGames() throws SQLException{
		List<Game> giochi = new ArrayList<>();
		
		String query = "select * from games";
		this.stat = this.conn.createStatement();
		
		this.rs= this.stat.executeQuery(query);
		while(this.rs.next()) {//gira finchè ci sono record
		
		Game giocoTemp = new Game();
		giocoTemp.setId(rs.getInt("id"));
		giocoTemp.setGame(rs.getString("game"));
		giocoTemp.setGenre(rs.getString("genre"));
		giocoTemp.setPublisher(rs.getString("publisher"));
		giocoTemp.setOriginalPlatform(rs.getString("original_platform"));
		giocoTemp.setYear(rs.getInt("year"));
		
		giochi.add(giocoTemp);		
		
		}
		
		
		return giochi;
	}
}
