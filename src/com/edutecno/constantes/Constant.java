package com.edutecno.constantes;

public final class Constant {
	public static final String STRING_CONEXION_ORACLE = "oracle.jdbc.driver.OracleDriver";
	public static final String URL_CONEXION_ORACLE = "jdbc:oracle:thin:@//localhost:1521/xe";
	public static final String USUARIO_ORACLE = "CURSO_003";
	public static final String PASS_ORACLE = "003";
	
	public static final String STRING_CONEXION_MYSQL = "com.mysql.cj.jdbc.Driver";
	public static final String URL_CONEXION_MYSQL = "jdbc:mysql://127.0.0.1:3306/instituto";
	public static final String USUARIO_MYSQL = "jorge";
	public static final String PASS_MYSQL = "admin";
	
	public static final String CONSULTA_FORMA_PAGO = "SELECT * FROM forma_pago";
	public static final String INSERTAR_INSCRIPCION = "INSERT INTO inscripcion(id_inscripcion, nombre, telefono,id_curso,id_forma_pago) VALUES (?,?,?,?,?)";
	public static final String PROXIMA_SECUENCIA_MYSQL = "SELECT LAST_INSERT_ID()";
	public static final String PROXIMA_SECUENCIA_ORACLE = "select inscripcion_sec.NEXTVAL from dual";
}
