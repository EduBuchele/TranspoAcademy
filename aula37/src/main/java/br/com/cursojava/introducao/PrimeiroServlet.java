package br.com.cursojava.introducao;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		StringBuilder html = new StringBuilder();
		html.append("<!doctype html>").append("<html>").append("<head>").append("<meta charset=\\\"utf-8\">")
				.append("<title> Primeiro Servlet</title>").append("</head>").append("<body>")
				.append("<h1> Meu primeiro Servlet!!! </h1>").append("<h2>")
				.append(sdf.format(new Date()))
				.append("</h2").append("</body>").append("</html>");

		writer.println(html);
	}

}
