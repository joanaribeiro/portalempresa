<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap/4.4.1/bootstrap.min.css"/>
<title>Funcionários</title>
</head>
<body>

	<nav aria-label="breadcrumb">
	  <ol class="breadcrumb">
	    <li class="breadcrumb-item">Home</li>
	    <li class="breadcrumb-item active"><a href="funcionarios">Funcionários</a></li>
	  </ol>
	</nav>
	
	<div class="container mb-3">
	
		<div class="row mb-3">
			<div class="col-md">
				<h1>Portal Empresa - Soma</h1>	
			</div>
			<div class="col-md">
				<a href="extrato" class="btn btn-dark">Extrato</a>
				<a href="funcionarios" class="btn btn-dark">Funcionarios</a>
			</div>		
		</div>
				
		<div class="row mb-3 justify-content-md-center">
			<div class="col-7">
				<table class="table">
				  <thead class="thead-dark">
				    <tr>
				      <th scope="col">Matrícula</th>
				      <th scope="col">Nome</th>
				      <th scope="col">Função</th>
				    </tr>
				  </thead>
				  <tbody>	  
			        <c:forEach items="${funcionarios}" var="func">
			          <tr>
			            <td>${func.matricula}</td>
			            <td>${func.nome}</td>
			            <td>${func.funcao}</td>
			          </tr>
			        </c:forEach>
				  </tbody>
				</table>	
			</div>
		</div>	
		
	</div>	
	
</body>
</html>