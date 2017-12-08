package tp.login;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tpServlet.GenericTpServlet;

@WebServlet("/public/login")
public class LoginServlet extends GenericTpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}
	
	@Override
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		if ("pwd".equals(request.getParameter("pwd"))) {
			UserBean user = new UserBean(request.getParameter("logname"), new Date());
			request.getSession().setAttribute("USER", user);
			response.sendRedirect("../private/home.jsp");
//			response.getOutputStream().print("Bienvenue à vous ! \n" + user.getLogin() + ", vous êtes connecté(e) depuis le " + user.getLoginDate() + ".");
		}
		else {
//			response.getOutputStream().print("Authorisation refusée.");
			request.getSession().setAttribute("ERROR", "Authentification incorrecte !");
			response.sendRedirect("./login.jsp");
		}
	}

	
}
