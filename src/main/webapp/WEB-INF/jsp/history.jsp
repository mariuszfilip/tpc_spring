<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ include file="../layout/taglib.jsp" %>

<table class="table">
 <thead>
 	 <tr>
		  	<th>Stopa referencyjna</th>
		  	<th>Stopa lombardowa</th>
		  	<th>Stopa depozytowa</th>
		  	<th>Stopa redyskonta weksli</th>
		  	<th>Data aktualizacji</th>
  	</tr>	
 </thead>
 <tbody> 	 
 	  	<c:forEach items="${lista}" var="stopa">
 	  	 	<tr>
 	  			<td>${stopa.ref}</td>
			  	<td>${stopa.lom}</td>
			  	<td>${stopa.dep}</td>
			  	<td>${stopa.dep}</td>
			  	<td>${stopa.dateUpdate}</td>
 	  		 </tr>	
 	  	</c:forEach>
 </tbody>
</table>