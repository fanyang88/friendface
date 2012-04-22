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
    function confirm(){
		 location.href="/FriendFace/transaction.do";
            }
            
       function cancel(){
		 window.close();
            }      
            </script>
            
	<table width="100%" border="0" bgcolor="#CCFF99">
     
      
      <tr>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>your order has been prepared, please confirm this transaction!
        </td>
      </tr>
      
       <tr>
        <td>
        <html:button property="" onclick="confirm()">confirm</html:button>
        </td>
      </tr>
      
      <tr>
        <td>
        <html:button property="" onclick="cancel()">cancel</html:button>
        </td>
      </tr>
    </table>
    
	</body>
</html:html>

