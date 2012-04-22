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
	<table width="900" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FF6633">
		<tr><td colspan="2">
 		<%@ include file="/jsp/include/adhead.jsp" %>
    	</td></tr>  
		<tr>
		<td width="20%">
		<table width="200" border="0">
  <tr>
    <td width="203">welcome <%= request.getSession().getAttribute("company") %></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>%nbsp;</td>
  </tr>
</table>

</td>
	<td width="100%" valign="top">
  		
  	<script language="JavaScript" type="text/JavaScript">
         
             function sortbyhits(){
             var flag=1;
             location.href="/FriendFace/sortsales.do?flag="+flag;
             }
             
             function sortbyrevenue(){
             var flag=2;
              location.href="/FriendFace/sortsales.do?flag="+flag;
             }
             
            function view(obj){
           var adid=obj.parentElement.parentElement.children[0].innerHTML;
			window.open("/FriendFace/customerlist.do?adid="+adid);
		}

</script>
		
		<table width="100%" border="0">
  <tr>
    <td>
     <html:form styleId="adForm" method="post" action="saleslist.do">
	<table width="100%" border="0" bgcolor="#FFC7A2">
      <tr>
        <td>total revenue: </td>
      </tr>
      <tr>
        <td><bean:write name="adForm" property="totalrevenue"/></td>
      </tr>
    </table>
    </html:form>
    </td>
  </tr>
  <tr>
    <td>

<table align="left" width="100%" border="0">
	
	<tr align="center">
     <td colspan="6" class="style4">sales report</font></td>
      </tr>
      
      <tr>
	<td colspan="4">&nbsp;</td>
	<td align="center" width="80"><html:button property="" onclick="sortbyhits()">sortby # of transactions</html:button></td>
	<td align="center" width="80"><html:button property="" onclick="sortbyrevenue()">sortby revenue</html:button></td>
	</tr>
	
	
	<tr>
	<td align="center" width="100">No.</td>
	<td align="center" width="100">Item Name</td>
	<td align="center" width="80">Item Picture</td>
	<td align="center" width="100">Revenue</td>
	<td align="center" width="100"># of transactions</td>
	<td align="center" width="100"></td>
	</tr>
	
	<logic:notEmpty name="saleslist">
	 <logic:iterate id="obj" name="saleslist">
	 	<tr>
	 	    <td><bean:write name="obj" property="adid"/></td>
	 		<td><bean:write name="obj" property="itemname"/></td>
	 		<td><img src="<bean:write name="obj" property="itempic"/>" width="100" height="70" border="0" align="center"></td>
	 		<td><bean:write name="obj" property="revenue"/></td>	
	 		<td><bean:write name="obj" property="hits"/></td>	
	 		<td><html:button property="" onclick="view(this)">view customers</html:button></td>
	 	</tr>
	 </logic:iterate>
	</logic:notEmpty>
	</tr>
</table>

</td>
  </tr>
</table>
	<!--end-->
	
			</td>
		</tr>
	</table>
	</body>
</html:html>



