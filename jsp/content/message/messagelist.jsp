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
  	<script type="text/javascript">
	function send(){
		        var fom=document.getElementById("subjectForm");
		        fom.action="/FriendFace/addmessage.do";
				fom.submit();
		        
		}
		
		 function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}
		
		</script>
		
  		<table width="100%" border="0">
  <tr>
    <td>
    <table align="left" width="100%" border="0" >
	<tr align="center">
     <td colspan="3">topic: <bean:write name="subjectForm" property="subtitle"/> </td>
      </tr>
	<logic:notEmpty name="mlist">
	 <logic:iterate id="obj" name="mlist">
	 	<tr>
	 		<td>
	 		<bean:write name="obj" property="mcontent"/>
	 		</td>
	 		<td>
	 		<bean:write name="obj" property="sname"/>  
	 		</td>
	 		<td>
	 		<bean:write name="obj" property="date"/>
	 		</td>
	 	</tr>
	 	
	 </logic:iterate>
	</logic:notEmpty>
	</tr>
</table>
    </td>
  </tr>
  
  <tr><td colspan="3"></td>
  </tr> 
  <tr>
  
  <table  width="100%" border="0" bgcolor="#CCFF99">
   <html:form styleId="subjectForm" method="post" action="addmessage.do">
   <td> message: 
   </td>
  <td>
   <html:textarea rows="6" cols="40" property="mcontent" ></html:textarea>	  	
  </td>
  <td>
  <input type="hidden" value="<bean:write name='subjectForm' property='subjectid'/>"/>
  <html:button property="" onclick="send()">send</html:button>
  </td>
   </html:form>
   
   </table>
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

