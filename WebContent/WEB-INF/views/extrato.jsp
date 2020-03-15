<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap/4.4.1/bootstrap.min.css"/>
<title>Extrato</title>
</head>
<body>	

	<nav aria-label="breadcrumb">
	  <ol class="breadcrumb">
	    <li class="breadcrumb-item">Home</li>
	    <li class="breadcrumb-item active"><a href="extrato">Extrato</a></li>
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
				      <th scope="col">Data Operação</th>
				      <th scope="col">Tipo Operação</th>
				      <th scope="col">Montante</th>
				    </tr>
				  </thead>
				  <tbody>	  
			        <c:forEach items="${transacoes}" var="trans">
			          <tr>
			            <td>${trans.data_operacao}</td>
			            <td>${trans.tipo_operacao}</td>
					    <c:if test = "${trans.montante >= 0}">
			            	<td class="text-success">R$ ${trans.montante}</td>
				        </c:if>
					    <c:if test = "${trans.montante < 0}">
			            	<td class="text-danger">R$ ${trans.montante}</td>
				        </c:if>
			          </tr>
			        </c:forEach>
				  </tbody>
				</table>	
			</div>
			<div class="col-md-auto">
				<div class="clearfix">
				    <h2 class="float-left">Saldo:</h2>
				    <c:if test = "${saldo >= 0}">
				    	<h2 class="float-right text-success">&nbsp; R$ ${saldo}</h2>
			        </c:if>
				    <c:if test = "${saldo < 0}">
				    	<h2 class="float-right text-danger">&nbsp; R$ ${saldo}</h2>
			        </c:if>
				</div>
			</div>
		</div>		
		
	</div>	
	
</body>
</html>