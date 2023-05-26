package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO{
	
	private Connessione miaConn = new Connessione();
	private Connection conn = miaConn.getConn();
	
	private Statement statement;
	private PreparedStatement ps;
	
	private ResultSet rs;
	
	
	
	@Override
	public void addCanzone(Canzone c) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Canzone getCanzoneById(int id) throws SQLException {
		
		return null;
	}

	@Override
	public List<Canzone> getCanzoni() throws SQLException {
		List<Canzone> canzoni = new ArrayList<>();
		statement = conn.createStatement();
		this.rs = statement.executeQuery(TROVA_TUTTI);
		while(rs.next()) {
			int id =rs.getInt("id");
			String titolo = rs.getString("titolo");
			String cantante = rs.getString("cantante");
			
			Canzone c = new Canzone();
			c.setId(id);
			c.setTitolo(titolo);
			c.setCantante(cantante);
			
			canzoni.add(c);
			
			System.out.println(rs.getString("titolo"));
		}
		
		return canzoni;
	}

	@Override
	public void updateCanzone() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCanzone() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
