package com.edutecno.facade;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutecno.dto.CursoDTO;

public class Main {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		List<CursoDTO> lista = new ArrayList<CursoDTO>();
		Facade facade = new Facade();
		lista = facade.obtenerCursos();
		
		System.out.println(lista.get(0).getDescripcion());
		
	}
}
