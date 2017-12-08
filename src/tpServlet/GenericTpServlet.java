package tpServlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.util.HttpUtil;

abstract public class GenericTpServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	abstract protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
//		response.getOutputStream().print(" GET");
		HttpUtil.logParameters(request);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
		response.getOutputStream().print(" POST ");
		HttpUtil.logParameters(request);
		try {
			HttpUtil.convertParameters(request);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
