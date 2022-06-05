package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clases.Persona;


/**
 * Servlet implementation class ValidarServlet
 */
@WebServlet(name = "validar", urlPatterns = { "/validar" })
public class ValidarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nombre=request.getParameter("txtNombre");
			int edad=Integer.parseInt(request.getParameter("txtEdad"));
			String direccion = request.getParameter("txtDireccion");
			int tel =Integer.parseInt(request.getParameter("txtTel"));

			if (nombre.equals("")) {
				//va de vuelta para index.jsp por errores
				String errorMessage="Debe ingresar el nombre";
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				//agrego en el request un nuevo objeto (String)
				request.setAttribute("errorMessage",errorMessage);
				rd.forward(request, response);


			}else {

				String errorMessage="";

				request.setAttribute("errorMessage",errorMessage);

				RequestDispatcher rd = request.getRequestDispatcher("ingresar");

				rd.forward(request, response);


			}
		} catch (NumberFormatException e) {
			//vamos al index a notificar el NumberFormatException
			String errorMessage="Edad y Teléfono deben ser números";
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			//agrego en el request un nuevo objeto (String)
			request.setAttribute("errorMessage",errorMessage);
			rd.forward(request, response);
		}
	}
}


