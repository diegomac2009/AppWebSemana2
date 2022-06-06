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
 * Servlet implementation class IngresarServlet
 */
@WebServlet(name = "ingresar", urlPatterns = { "/ingresar" })
public class IngresarServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       
	Long contador = (long)0;
		
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarServlet() {
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
		
		contador++;
		Long identificador = contador;
		String nombre=request.getParameter("txtNombre");
		int edad=Integer.parseInt(request.getParameter("txtEdad"));
		String direccion = request.getParameter("txtDireccion");
		int tel =Integer.parseInt(request.getParameter("txtTel"));
		
		
		Persona p=new Persona(identificador, nombre ,edad, direccion, tel);
		//salvamos en el Request scope
		request.setAttribute("p", p);		
		RequestDispatcher rd = request.getRequestDispatcher("/MostrarDato.jsp");
		
		
		rd.forward(request, response);
		
		
	}

}

