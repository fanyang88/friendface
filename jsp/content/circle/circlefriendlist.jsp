<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html:html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK"/>
		<title></title>
	</head>
	<body>
	
	<table width="1050" border="0">
  <tr>
    <td width="900">
    <table width="900" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#66CC00">
		<tr><td colspan="2">
 		<%@ include file="/jsp/include/head.jsp" %>
    	</td></tr>  
		<tr><td width="20%">
		<%@ include file="/jsp/include/navigate.jsp" %>
		</td>
  		<td width="100%" valign="top">
  		
  	<!--content-->
  	<script language="JavaScript" type="text/JavaScript">
      function change(obj){
                var fname=obj.parentElement.parentElement.children[1].innerHTML;
                var lname=obj.parentElement.parentElement.children[2].innerHTML;
                var fom=document.getElementById("friendForm");
				fom.action="/FriendFace/changecircle.do?fname="+fname+"&lname="+lname;
				fom.submit();
				
		}
		
		 function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}
		
</script>


	<table align="left" width="100%" border="0">
	
	<tr align="center" bgcolor="#CCFF99">
     <td colspan="5" class="style4">my friends in this circle: </font></td>
      </tr>
	<logic:notEmpty name="cflist">
	 <logic:iterate id="obj" name="cflist">
	  	<tr>
	 	 <td>
	 	 </td>	
	 		<td>
	 		<bean:write name="obj" property="ffirstname"/> 
	 		</td>
	 		<td>
	 		<bean:write name="obj" property="flastname"/> 
	 		</td>
	 		<html:form styleId="friendForm" method="post" action="addcircle.do">
		
	 		<td> 
	 	
	 		<html:select property="cname" name="friendForm">
			 <html:options  collection="circles" property="value"/>
  						</html:select>
  					
  						 </td> </html:form>	
	 	 <td>
	 	<html:button property="" onclick="change(this)">change circle</html:button>
	 	 	</td>	
	 	</tr>
	 	
	 	
	 </logic:iterate>
	</logic:notEmpty>
	</tr>
</table>


	<!--end-->
	
			</td>
		</tr>
	</table>
    
    </td>
    <td width="150">
    
    <table align="left" width="100%" border="0" >
	<logic:notEmpty name="adlist">
	 <logic:iterate id="adobj" name="adlist">
	 	<tr>
	 		<td><img src="<bean:write name="adobj" property="itempic"/>" width="100" height="70" border="0" align="center"></td>
	 	</tr>
	 	<tr>
	 		<td>
	 		<input type="hidden" value="<bean:write name='adobj' property='adid'/>"/>
	 	<html:button property="" onclick="purchase(this)">purchase</html:button>
	 		</td>
	 	</tr>
	 </logic:iterate>
	</logic:notEmpty>
	</tr>
</table>


    
    </td>
  </tr>
</table>


	
	</body>
</html:html>




