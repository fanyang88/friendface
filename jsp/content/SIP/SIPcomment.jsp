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
	<script language="JavaScript" type="text/JavaScript">
    function create(){
		 var fom=document.getElementById("sipcommentForm");
				fom.action="/FriendFace/addsippcomment.do";
				fom.submit();
            }
            </script>
	
		<table width="300" border="0">
  <tr>
    <td>
    
    <table align="left" width="100%" border="0">
	<tr align="center" bgcolor="#CCFF99">
     <td colspan="2" class="style4">all comments: </font></td>
      </tr>
	<logic:notEmpty name="sipcmlist">
	 <logic:iterate id="obj" name="sipcmlist">
	 <tr>
	 <td><bean:write name="obj" property="sipcommentername"/> </td>
	 <td><bean:write name="obj" property="sipcmcontent"/></td>
	 </tr>
	 <tr>
	 <td>&nbsp;</td>
	 <td><bean:write name="obj" property="sipcmdate"/></td>
	 </tr>
	 
	 </logic:iterate>
	</logic:notEmpty>
	</tr>
</table>
    
    </td>
  </tr>
  <tr>
    <td>
    
 <html:form styleId="sipcommentForm"  method="post" action="addsippcomment.do">
	<table width="100%" border="0" bgcolor="#CCFF99">
      <tr>
        <td>comment:<html:text name="sIPForm" property="sipcmcontent"/>
        <html:button property="" onclick="create()">send</html:button>
        </td>
      </tr>
    </table>
    </html:form>

</td>
  </tr>
</table>

	</body>
</html:html>



