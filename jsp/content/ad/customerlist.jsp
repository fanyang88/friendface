<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html:html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title></title>
	</head>
	<body>
	
    <table align="left" width="300" border="0">
	
	<tr align="center">
     <td colspan="6" class="style4">best customer: </font></td>
      </tr>
      <logic:notEmpty name="bestlist">
	 <logic:iterate id="bobj" name="bestlist">
	 	   <tr>
	 	    <td><bean:write name="bobj" property="bestcustomer"/></td>
	 		</tr>
	 		<tr>
	 	    <td>
	 	    <img src="<bean:write name="bobj" property="bestcustomerpic"/>" width="100" height="70" border="0" align="center">
	 		</td>
	 		</tr>
	 </logic:iterate>
	</logic:notEmpty>
	
	
      <tr align="center">
     <td colspan="6" class="style4">&nbsp;</font></td>
      </tr>
      
	<tr align="center">
     <td colspan="6" class="style4">customer list: </font></td>
      </tr>
	<tr>
	<td align="center" width="50">name</td>
	<td align="center" width="100">Transaction time</td>
	
	</tr>
	
	<logic:notEmpty name="cuslist">
	 <logic:iterate id="obj" name="cuslist">
	 	<tr>
	 	    <td><bean:write name="obj" property="username"/></td>
	 		<td><bean:write name="obj" property="tdate"/></td>
	 		</tr>
	 </logic:iterate>
	</logic:notEmpty>
	</tr>
</table>

	</body>
</html:html>

