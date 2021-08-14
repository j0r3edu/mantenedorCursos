package com.edutecno.facade;

import java.sql.SQLException;
import java.util.List;

import com.edutecno.dao.CursoDAO;
import com.edutecno.dto.CursoDTO;

public class Facade {
	
	public List<CursoDTO> obtenerCursos() throws ClassNotFoundException, SQLException{
		CursoDAO dao = new CursoDAO();
		return dao.obtieneCursos();
	}
	
	
}
