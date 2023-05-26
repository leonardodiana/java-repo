package controller;

import java.io.IOException;

import fakedb.Database;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/azioni")
public class PresentaAzioni extends HttpServlet {

	Portafoglio portafoglio;
	
	public PresentaAzioni() {
		this.portafoglio = new Portafoglio("Mauro");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		
		request.setAttribute("titoloPagina", "Le nostre Azioni Top");
		request.setAttribute("elencoAzioni", Database.titoloAzionari);
		
		/**inizio pagina*/
		request.getRequestDispatcher("header.jsp").include(request, response);
		/**menu pagina*/
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		request.getRequestDispatcher("lista.jsp").include(request, response);
		
		/**pié di pagina*/
		request.getRequestDispatcher("footer.jsp").include(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	
	
}