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
	<table width="875" border="0">
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
  	 function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}
  	</script>
<html:form styleId="loginForm" method="post" action="index.do">
<table width="500" border="1" bordercolor="#66CC00" align="left">
   <tr>
    <td colspan="2">Profile Picture</td>
  </tr>
  
  <tr>
    <td colspan="2">
    <img src="<bean:write name="loginForm" property="profilePic"/>" width="100" height="70" border="0" align="center">
    </td>
  </tr>
   <tr>
    <td colspan="2">basic infomation</td>
  </tr>
  <tr>
    <td colspan="2"><table width="618" border="0">
      <tr>
        <td width="117">sex </td>
        <td width="491"><bean:write name="loginForm" property="sex"/></td>
      </tr>
      <tr>
        <td>Birthday</td>
        <td><bean:write name="loginForm" property="birthday"/></td>
      </tr>
      <tr>
        <td>preference</td>
        <td><bean:write name="loginForm" property="preference"/></td>
      </tr>
    </table></td>
  </tr>
   <tr>
    <td colspan="2">Address</td>
  </tr>
  <tr>
    <td colspan="2"><table width="618" border="0">
      <tr>
        <td width="117">state: </td>
        <td width="491"><bean:write name="loginForm" property="state"/></td>
      </tr>
      <tr>
        <td>City</td>
        <td><bean:write name="loginForm" property="city"/></td>
      </tr>
      <tr>
        <td>Zipcode</td>
        <td><bean:write name="loginForm" property="zipCode"/></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td colspan="2">Contact</td>
  </tr>
  <tr>
    <td colspan="2"><table width="618" border="0">
      <tr>
        <td width="117">Email</td>
        <td width="491"><bean:write name="loginForm" property="email"/></td>
      </tr>
      <tr>
        <td>telephone</td>
        <td><bean:write name="loginForm" property="telephone"/></td>
      </tr>

    </table></td>
  </tr>
  
  <tr>
    <td colspan="2"><a href="/FriendFace/jsp/content/home/editprofile.jsp">edit profile</td>
  </tr>
  <tr>
    <td colspan="2"><a href="/FriendFace/allfriend.do">friends</td>
  </tr>
  <tr>
    <td colspan="2"><a href="/FriendFace/siplist.do">SIP pages</td>
  </tr>
</table>
</html:form>

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

