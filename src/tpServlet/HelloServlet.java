package tpServlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/hello")
public class HelloServlet extends GenericTpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public HelloServlet() {
		super();
	}

	
	/*@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().print("Hello get ! " + new Date());
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().print("Hello post ! " + new Date());
	}*/

	@Override
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().print("Hello " + new Date());
	}


}
