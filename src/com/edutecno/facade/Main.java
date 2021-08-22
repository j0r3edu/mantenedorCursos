package com.edutecno.facade;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutecno.dao.FormaPagoDAO;
import com.edutecno.dto.CursoDTO;
import com.edutecno.dto.FormaDePagoDTO;
import com.edutecno.dto.InscripcionDTO;

public class Main {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		List<CursoDTO> lista = new ArrayList<CursoDTO>();
		Facade facade = new Facade();
		lista = facade.obtenerCursos();
		for (CursoDTO cursoDTO : lista) {
			System.out.println(cursoDTO);
		}
		
		List<FormaDePagoDTO> listaFormaPago = new ArrayList<FormaDePagoDTO>();
		listaFormaPago = facade.obtenerFormaDePago();
		for (FormaDePagoDTO formaDePagoDTO : listaFormaPago) {
			System.out.println(formaDePagoDTO);
		}
		
		InscripcionDTO inscripcion = new InscripcionDTO();
		inscripcion.setNombre("Juan navaja");
		inscripcion.setTelefono("454545454");
		inscripcion.setIdCurso(1);
		inscripcion.setIdFormaDePago(1598);
		int resultadoInsert = facade.registrarInscripcion(inscripcion);
		
	}
}
