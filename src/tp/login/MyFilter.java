package tp.login;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;

@WebFilter(filterName = "filter", urlPatterns = "/*")
public class MyFilter implements Filter {

	/**
	 * Méthode de filtre
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws java.io.IOException, javax.servlet.ServletException {
//		recup l'url
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		String uri = httpRequest.getRequestURI();
		
//		savoir si le user est authentifié
		UserBean user = (UserBean) httpRequest.getSession().getAttribute("USER");
		
		if (uri.contains("private") && user==null) {
			httpResponse.sendRedirect("../public/login.jsp");
		}
		
		else {
			chain.doFilter(request, response);  //est à faire seulement si tout va bien
		}
	}

	public void init(final FilterConfig filterConfig) {
	}

	public void destroy() {
	}

	public MyFilter() {
		super();
	}

}
