package com.edutecno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutecno.constantes.Constant;
import com.edutecno.dto.CursoDTO;

public class CursoDAO {
	
	public List obtieneCursos() throws ClassNotFoundException, SQLException {
		List<CursoDTO> listaDeCursos = new ArrayList<CursoDTO>();
		Class.forName(Constant.STRING_CONEXION_ORACLE);
		Connection conexion = null;
		String url = Constant.URL_CONEXION_ORACLE;
		conexion = DriverManager.getConnection(url, Constant.USUARIO_ORACLE, Constant.PASS_ORACLE);
		try(PreparedStatement stmt = conexion.prepareStatement("select * from curso")){
			ResultSet resultado = stmt.executeQuery();
			while(resultado.next()) {
				CursoDTO cursoDTO = new CursoDTO();
				cursoDTO.setIdCurso(resultado.getString("id_curso"));
				cursoDTO.setDescripcion(resultado.getString("descripcion"));
				cursoDTO.setPrecio(resultado.getDouble("precio"));
				listaDeCursos.add(cursoDTO);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return listaDeCursos;
	}
	
}
