package servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/*")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 6747677077926573259L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			resp.getWriter().print("Seja bem-vindo!");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String nomeUsuario = req.getParameter("nome");
			nomeUsuario = (!nomeUsuario.isEmpty()) ? nomeUsuario : "Novo Usuário!";

			StringBuilder html = new StringBuilder();
			html.append("<html>");
			html.append(" <head>");
			html.append("  <title>Estudando Servlets - Recuperando dados enviados por parâmetro</title>");
			html.append(" </head>");
			html.append(" <body>");
			html.append("  <h1>Seja bem-vindo, " + nomeUsuario + "!</h1>");
			html.append(" </body>");
			html.append("</html>");

			resp.getWriter().print(html);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}