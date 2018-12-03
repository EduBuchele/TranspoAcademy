package br.com.cursojava;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AutorizacaoFilter
 */
public class AutorizacaoFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Roda antes dos servlets
		HttpServletRequest req = (HttpServletRequest) request;
		String path = req.getServletPath();
		if (!path.equals("/login.xhtml")) {
			boolean ok = validarAutorizacao(req);
			if (ok) {
				chain.doFilter(request, response);
			} else {
				HttpServletResponse resp = (HttpServletResponse) response;
				resp.sendRedirect(req.getContextPath() + "/login.xhtml");
			}
		} else {
			chain.doFilter(request, response);
		}
		// Roda depois dos servlets
	}

	private boolean validarAutorizacao(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("usuarioLogado") != null) {
			return true;
		}
		return false;
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
