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
	function submit(){
		 var fom=document.getElementById("sIPForm");
				fom.action="/FriendFace/addsip.do";
				fom.submit();
		}

		function view(obj){
			var sipid=obj.parentNode.firstChild.value;
			location.href="/FriendFace/sipdetail.do?sipid="+sipid;
			}
			
			 function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}
		</script>
		<table width="671" border="0">
  <tr>
    <td width="300">
      <html:form styleId="sIPForm" enctype="multipart/form-data" method="post" action="addsip.do">
    <table width="100%" border="0" bgcolor="#CCFF99">
     <tr>
        <td>create SIP page：</td>
      </tr>
      <tr>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>SIP page name：</td>
      </tr>
      <tr>
        <td><html:text name="sIPForm" property="sipname"></html:text></td>
      </tr>
      <tr>
        <td>upload profile pic for this SIP page：</td>
      </tr>
       <tr><td>
        <html:file property="sippicpath"><br/></html:file>
       </td></tr>
       <tr>
        <td>description：</td>
      </tr>
       <tr>
        <td><html:textarea rows="5" cols="30" name="sIPForm" property="description"></html:textarea></td>
      </tr>
       <tr> <td>invit：</td> </tr>
      
      <tr> <td>
    <html:select property="sharers" name="sIPForm" size="8" multiple="true">
			 <html:options  collection="friends" property="value"/>
  						</html:select></td> </tr>  
      <tr>
        <td><html:button property="" onclick="submit()">submit</html:button>
        </td>
      </tr>
    </table>
    </html:form>
    
    </td>
    <td width="300">
    
    <table align="left" width="100%" border="0">
	<tr align="center">
     <td colspan="3">my sip pages: </font></td>
      </tr>
	<logic:notEmpty name="siplist">
	 <logic:iterate id="obj" name="siplist">
	 	<tr>
	 		<td>
	 		<bean:write name="obj" property="sipname"/>
	 		</td>
	 		<td>
	 		<img src="<bean:write name="obj" property="sippic"/>" width="50" height="50" border="0" align="center">
	 		</td>
	 		
	 		<td>
	 		<input type="hidden" value="<bean:write name='obj' property='sipid'/>"/>
	 	<html:button property="" onclick="view(this)">view</html:button>
	 		</td>
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
	</table></td>
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





