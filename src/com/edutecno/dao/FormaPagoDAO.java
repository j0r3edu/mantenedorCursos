package com.edutecno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutecno.constantes.Constant;
import com.edutecno.dto.FormaDePagoDTO;

public class FormaPagoDAO {
	
	public List obtieneFormasDePago() throws ClassNotFoundException, SQLException {
		List<FormaDePagoDTO> formasDePago = new ArrayList<FormaDePagoDTO>();
		
		
		Class.forName(Constant.STRING_CONEXION_ORACLE);
		Connection conexion = null;
		String url = Constant.URL_CONEXION_ORACLE;
		conexion = DriverManager.getConnection(url, Constant.USUARIO_ORACLE, Constant.PASS_ORACLE);
		
		try(PreparedStatement stmt = conexion.prepareStatement(Constant.CONSULTA_FORMA_PAGO)){
			ResultSet resultado = stmt.executeQuery();
			while(resultado.next()) {
				FormaDePagoDTO formaDePago = new FormaDePagoDTO();
				formaDePago.setIdFormaDePago(resultado.getInt("id_forma_pago"));
				formaDePago.setDescripcion(resultado.getString("descripcion"));
				formasDePago.add(formaDePago);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return formasDePago;
	}
}
