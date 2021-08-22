package com.edutecno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.edutecno.constantes.Constant;
import com.edutecno.dto.InscripcionDTO;

public class InscripcionDAO {

	public int insertarInscripcion(InscripcionDTO inscripcion) throws ClassNotFoundException, SQLException {
		int maximo = 0;
		String insertarInscripcion = Constant.INSERTAR_INSCRIPCION;
		String consultarProximoId = Constant.PROXIMA_SECUENCIA_ORACLE;
		
		Class.forName(Constant.STRING_CONEXION_ORACLE);
		
		Connection conexion = DriverManager.getConnection(Constant.URL_CONEXION_ORACLE, Constant.USUARIO_ORACLE, Constant.PASS_ORACLE);
		
		try(PreparedStatement sentenciaProxId = conexion.prepareStatement(consultarProximoId); 
				PreparedStatement sentenciaInsert = conexion.prepareStatement(insertarInscripcion)){
			ResultSet idInsert = sentenciaProxId.executeQuery();
			
			if(idInsert.next()) {
				maximo = idInsert.getInt(1);
				sentenciaInsert.setInt(1, maximo);
				sentenciaInsert.setString(2, inscripcion.getNombre());
				sentenciaInsert.setString(3, inscripcion.getTelefono());
				sentenciaInsert.setInt(4, inscripcion.getIdCurso());
				sentenciaInsert.setInt(5,inscripcion.getIdFormaDePago());
				sentenciaInsert.executeUpdate();
			}
		}
		return maximo;
	}
	
}
