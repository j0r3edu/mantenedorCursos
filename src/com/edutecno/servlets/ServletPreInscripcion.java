package com.edutecno.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edutecno.dto.CursoDTO;
import com.edutecno.dto.FormaDePagoDTO;
import com.edutecno.facade.Facade;

/**
 * Servlet implementation class ServletPreInscripcion
 */
@WebServlet("/preInscripcion")
public class ServletPreInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CursoDTO> listaCursos = new ArrayList<CursoDTO>();
		List<FormaDePagoDTO> listaFormaPago = new ArrayList<FormaDePagoDTO>();
		Facade facade = new Facade();
		
		try {
			listaCursos = facade.obtenerCursos();
			listaFormaPago = facade.obtenerFormaDePago();
			
			request.setAttribute("cursos", listaCursos);
			request.setAttribute("formasPago", listaFormaPago);
			
			for (FormaDePagoDTO formaDePagoDTO : listaFormaPago) {
				System.out.println("soy un servlet:::");
				System.out.println(formaDePagoDTO);
			}
			
			request.getRequestDispatcher("inscripcion.jsp").forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
