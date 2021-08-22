<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="com.edutecno.dto.CursoDTO"%>
<%@page import="com.edutecno.dto.FormaDePagoDTO"%>
<% 
	List<CursoDTO> cursos;
	List<FormaDePagoDTO> formasPago;
	
	cursos = (List)request.getAttribute("cursos");
	formasPago = (List) request.getAttribute("formasPago");
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Cursos: 
	<select name="idCurso">
		<% 
			for(CursoDTO dto : cursos){
		%>
			<option value="<%=dto.getIdCurso()%>">
				<%=dto.getDescripcion()%>
			</option>
		<%
			}	
		%>
	</select>
</body>
</html>