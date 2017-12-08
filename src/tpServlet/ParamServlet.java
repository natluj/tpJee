package tpServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.util.HttpUtil;

@WebServlet("/servlet/testparam1")
public class ParamServlet extends GenericTpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getOutputStream().print("Look at the params !");
	}

}
