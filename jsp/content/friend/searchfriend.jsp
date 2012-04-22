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
	var symbol="";
	
	function addfriend(obj){
		
			var uid=obj.parentNode.firstChild.value;
			
			location.href="/FriendFace/addrequest.do?uid="+uid;
		}
		
		
		function confirm(obj1){
		
			var rid=obj1.parentNode.firstChild.value;
			var flag=1;
			symbol="obj1";
			location.href="/FriendFace/addfriend.do?rid="+rid+"&flag="+flag+"&symbol="+symbol;
		}
		
		function cancel(obj1){
		
			var rid=obj1.parentNode.firstChild.value;
			var flag=0;
			symbol="obj1";
			location.href="/FriendFace/addfriend.do?rid="+rid+"&flag="+flag+"&symbol="+symbol;
		}
		
		function disagree(obj2){
		
			var srid=obj2.parentNode.firstChild.value;
			var sipflag=0;
			symbol="obj2";
			location.href="/FriendFace/addfriend.do?srid="+srid+"&sipflag="+sipflag+"&symbol="+symbol;
		}
		
		function agree(obj2){
		
			var srid=obj2.parentNode.firstChild.value;
			var sipflag=1;
			symbol="obj2";
			location.href="/FriendFace/addfriend.do?srid="+srid+"&sipflag="+sipflag+"&symbol="+symbol;
		}
		
		function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}
		
		</script>
		
		
		<table width="100%" border="0">
  <tr>
    <td>
    
    <table align="left" width="100%" border="0">
	
	<tr align="center" bgcolor="#CCFF99">
     <td colspan="2" class="style4"> friend request: </font></td>
      </tr>
	<logic:notEmpty name="requestlist">
	 <logic:iterate id="obj1" name="requestlist">
	 	<tr>
	 	   <td>
	 		<bean:write name="obj1" property="sendername"/> 
	 		wants to add you as friend!</td>
	 		<td>
	 		<input type="hidden" value="<bean:write name='obj1' property='rid'/>"/>
	 	<html:button property="" onclick="confirm(this)">confirm</html:button>
	 	<html:button property="" onclick="cancel(this)">cancel</html:button>
	 </td>
	 	
	 	</tr>
	 	
	 </logic:iterate>
	</logic:notEmpty>
	</tr>
</table>	
   
    </td>
  </tr>
  
  <tr><td colspan="2"> 
   <table align="left" width="100%" border="0">
	
	<tr align="center" bgcolor="#CCFF99">
     <td colspan="2" class="style4"> SIP request: </font></td>
      </tr>
	<logic:notEmpty name="siprequestlist">
	 <logic:iterate id="obj2" name="siprequestlist">
	 	<tr>
	 	   <td>
	 		<bean:write name="obj2" property="sendername"/> 
	 		wants to add join in <bean:write name="obj2" property="sipname"/>  page!</td>
	 		<td>
	 		<input type="hidden" value="<bean:write name='obj2' property='srid'/>"/>
	 	<html:button property="" onclick="agree(this)">confirm</html:button>
	 	<html:button property="" onclick="disagree(this)">cancel</html:button>
	 </td>
	 	
	 	</tr>
	 	
	 </logic:iterate>
	</logic:notEmpty>
	</tr>
</table>
 
  </td></tr>
  <tr><td colspan="2"> </td></tr>
  <tr>
    <td>
  <table align="left" width="100%" border="0">
	
	<tr align="center" bgcolor="#CCFF99">
     <td colspan="4" class="style4">suggested friends: </font></td>
      </tr>
	<logic:notEmpty name="sflist">
	 <logic:iterate id="obj" name="sflist">
	 	<tr>
	 	 <td>
	 	 </td>	
	 		<td>
	 		<img src="<bean:write name="obj" property="profilePic"/>" width="100" height="70" border="0" align="center">
	 		</td>
	 		<td>
	 		<bean:write name="obj" property="firstName"/> <bean:write name="obj" property="lastName"/>
	 		</td>
	 		<td>
	 		<input type="hidden" value="<bean:write name='obj' property='userId'/>"/>
	 	<html:button property="" onclick="addfriend(this)">add friend</html:button></td>
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



