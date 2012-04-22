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
  		
  	<!--content-->
<script language="JavaScript" type="text/JavaScript">
    function submit(){
		 var fom=document.getElementById("adForm");
				fom.action="/FriendFace/adcreate.do";
				fom.submit();
            }
            
            function ADdelete(obj){
            var adid=obj.parentNode.firstChild.value;
            alert(adid);
		     location.href="/FriendFace/addelete.do?adid="+adid;  
		}

</script>
		
		<table width="100%" border="0">
  <tr>
    <td>
    
     <html:form styleId="adForm" method="post" enctype="multipart/form-data" action="adcreate.do">
	<table width="100%" border="0" bgcolor="#FFC7A2">
      <tr>
        <td>post an advertisement: </td>
      </tr>
      <tr>
        <td>advertisement name:  
        <html:text name="adForm" property="itemname"/>
         </td> 
      </tr>
      <tr>
        <td> advertisement pic: 
         <html:file property="adpicpath">
        </html:file>
         </td> 
      </tr>
      <tr>
        <td> unit price:  
        <html:text name="adForm" property="unitprice"/>
         </td>
         </tr>
         <tr>
          <td> keywords:  
        <html:text name="adForm" property="keyword"/>
         </td>
         </tr>
         <tr>
        <td>
       <html:button property="" onclick="submit()">create</html:button>
        </td>
      </tr>
    </table>
    </html:form>
    
    
    </td>
  </tr>
  <tr>
    <td>
<table align="left" width="100%" border="0">
	<tr align="center">
     <td colspan="4" class="style4">all advertisements:  </font></td>
      </tr>
	<logic:notEmpty name="adlist">
	 <logic:iterate id="obj" name="adlist">
	 	<tr>
	 	 <td>
	 	 <bean:write name="obj" property="itemname"/> 
	 	 </td>	
	 		<td>
	 		<img src="<bean:write name="obj" property="itempic"/>" width="100" height="70" border="0" align="center">
	 		</td>
	 		<td>
	 		<bean:write name="obj" property="adate"/> 
	 		</td>
	 		<td>
	 		<input type="hidden" value="<bean:write name='obj' property='adid'/>"/>
	 	<html:button property="" onclick="ADdelete(this)">delete</html:button></td>
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

