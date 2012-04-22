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
	function add(){
		 var fom=document.getElementById("subjectForm");
				fom.action="/FriendFace/addsubject.do";
				fom.submit();
		}

		function view(obj){
			var subid=obj.parentNode.firstChild.value;
			var title=obj.parentElement.parentElement.children[0].innerHTML;
			location.href="/FriendFace/messagelist.do?subid="+subid+"&subtitle="+title;
		
			}
			
			 function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}
		</script>
		
    <html:form styleId="subjectForm" method="post" action="discussionlist.do">
		<table width="671" border="0">
  <tr>
    <td width="222">
    <table width="222" border="0" bgcolor="#CCFF99">
      <tr>
        <td>subject title：</td>
      </tr>
      <tr>
        <td id="subtitle" width="457" height="30">
		      <html:textarea name="subjectForm" property="subtitle">
		      </html:textarea>
		      </td>
      </tr>
       <tr><td>&nbsp;</td></tr>
       <tr> <td>send to：</td> </tr>
      
      <tr> <td>
    <html:select property="receivers" name="subjectForm" size="10" multiple="true">
			 <html:options  collection="friends" property="value"/>
  						</html:select></td> </tr>  
      <tr>
        <td><html:button property="" onclick="add()">submit</html:button>
        </td>
      </tr>
    </table>
    </td>
    <td width="427">
    
    <table align="left" width="100%" border="0">
	<tr align="center">
     <td colspan="4">dicussion topics: </font></td>
      </tr>
	<logic:notEmpty name="sublist">
	 <logic:iterate id="obj" name="sublist">
	 	<tr>
	 		<td>
	 		<bean:write name="obj" property="subtitle"/>
	 		</td>
	 		<td>
	 		<bean:write name="obj" property="starter"/>  
	 		</td>
	 		<td>
	 		<bean:write name="obj" property="date"/>
	 		</td>
	 		
	 		<td>
	 		<input type="hidden" value="<bean:write name='obj' property='subid'/>"/>
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



