package db;

import java.sql.SQLException;
import java.util.List;

import model.Canzone;

public interface CanzoneDAO {
	
	String ADD_CANZONE = "INSERT IN canzoni (cantante, titolo) VALUES (?,?)";
	
	String TROVA_TUTTI = "SELECT * FROM canzoni";
	String TROVA_UNA_CANZONE = "SELECT * FROM canzoni WHERE id = ?";
	
	String UPDATE_CANZONE = "UPDATE canzoni SET titolo = ? WHERE id = ?";
	
	String DELETE_CANZONE = "DELETE FROM canzoni WHERE id = ?";
	
	void addCanzone(Canzone c) throws SQLException;
	Canzone getCanzoneById(int id) throws SQLException;
	List<Canzone> getCanzoni() throws SQLException;
	void updateCanzone() throws SQLException;
	void deleteCanzone() throws SQLException;
		
	
}
