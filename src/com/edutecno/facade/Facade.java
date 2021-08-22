package com.edutecno.facade;

import java.sql.SQLException;
import java.util.List;

import com.edutecno.dao.CursoDAO;
import com.edutecno.dao.FormaPagoDAO;
import com.edutecno.dao.InscripcionDAO;
import com.edutecno.dto.CursoDTO;
import com.edutecno.dto.FormaDePagoDTO;
import com.edutecno.dto.InscripcionDTO;


public class Facade {
	
	public List<CursoDTO> obtenerCursos() throws ClassNotFoundException, SQLException{
		CursoDAO dao = new CursoDAO();
		return dao.obtieneCursos();
	}
	
	public List<FormaDePagoDTO> obtenerFormaDePago() throws ClassNotFoundException, SQLException{
		FormaPagoDAO dao = new FormaPagoDAO();
		return dao.obtieneFormasDePago();
	}
	
	public int registrarInscripcion(InscripcionDTO inscripcion) throws ClassNotFoundException, SQLException {
		InscripcionDAO dao = new InscripcionDAO();
		return dao.insertarInscripcion(inscripcion);
		
	}
	
	
	
	
}
