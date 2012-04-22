<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html:html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<style type="text/css">
<!--
.style1 {
	font-weight: bold;
	color:#FFFFFF;
	font-size: 32pt;
}
.style2 {font-size: 18px}
.style3 {font-size: 16px}
-->
</style>
</head>
<script language="JavaScript" type="text/JavaScript">
function init(){
	registerForm.firstName.focus();
}
<!--submit-->
function submit(){
	if(mname.firstChild.value==""||password.firstChild.value==""||company.firstChild.value=="") {
		alert("manager name or password or company can't be empty");
		return;
	}
	var aff=document.getElementById("managerForm");
	aff.action="/FriendFace/adregister.do";
	aff.submit();
}
<!--press enter to submit-->
function processOnEnter(fld,evt){
	if(isEnterKey(evt)){
		managerForm.submit();
	}
}
<!--recognize enter key-->
function isEnterKey(evt){
	evt=(evt)?evt:(window.event)?window.event:"";
	var theKey;
	if(evt){
		theKey=(evt.which)?evt.which:evt.keyCode;
	}
	return (theKey==13);
}
</script>
<body onload="init()">
<table width="900" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FF6633">
<tr><td>
 
<table width="900" border="0" align="center" cellpadding="0" cellspacing="0">
  
  <tr>
    <td height="20" bgcolor="#FFC7A2">&nbsp;</td>
  </tr>
  <tr>
    <td>
	<html:form styleId="managerForm" method="post" action="adregister.do">
		<table width="600" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFC7A2">  
			<tr>
    			<td height="50" colspan="2"><p>&nbsp;<span class="style2">&nbsp;welocme post advertisement on friend face, please register!</span></p>
   			    </td>
  			</tr>
  			
			<tr>
			  <td width="141" height="50" align="right"><span class="style2">manager name (*): </span></td>
		      <td id="mname" width="457" height="30"><html:text property="mname" onkeydown="processOnEnter(this,event)"></html:text></td>
		  	</tr>
		  	
		  	<tr>
			  <td width="141" height="50" align="right"><span class="style2">company (*): </span></td>
		      <td id="company" width="457" height="30"><html:text property="company" onkeydown="processOnEnter(this,event)"></html:text></td>
		  	</tr>
		  
			<tr>
			  <td height="50" align="right"><span class="style2">password (*): </span></td>
		      <td id="password" height="30"><html:password property="password" onkeydown="processOnEnter(this,event)"></html:password></td>
		  	</tr>
		  
			<tr>
			  <td height="50">&nbsp;</td>
		      <td height="30"><html:button property="" onclick="submit()">submit</html:button>
	          <html:reset>reset</html:reset></td>
		  	</tr>
		  	
		  	<tr>
			  <td height="50">&nbsp;</td>
		      <td height="30">&nbsp;</td>
		  	</tr>
		  	
		  	<tr>
			  <td height="50">&nbsp;</td>
		      <td height="30"><a href="/FriendFace/jsp/content/ad/adlogin.jsp">
		      I have an account,go to log in!</a></td>
		  	</tr>
	  </table>
	</html:form>
	</td>
  </tr>
</table> 
  
</td></tr>
</table>
</body>
</html:html>








