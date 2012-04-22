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
    function create(){
		 var fom=document.getElementById("circleForm");
				fom.action="/FriendFace/addcircle.do";
				fom.submit();
            }
            
            function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}
		
            function view(obj, val){
            var cid=obj.parentNode.firstChild.value;
            if(val==1)
		    {
		       if(cid=="1")
		       {alert("can't delete *friend* circle"); return;}
		       else
		       location.href="/FriendFace/deletecircle.do?cid="+cid;
		    }
		    else
		    location.href="/FriendFace/circlefriendlist.do?cid="+cid;
		}

</script>
		
		<table width="100%" border="0">
  <tr>
    <td>
     <html:form styleId="circleForm" method="post" action="addcircle.do">
	<table width="100%" border="0" bgcolor="#CCFF99">
      <tr>
        <td>create a new circle: </td>
      </tr>
      <tr>
        <td>
        <html:text name="circleForm" property="cname"/>
		      <html:button property="" onclick="create()">create</html:button>
        </td>
      </tr>
    </table>
    </html:form>
    </td>
  </tr>
  <tr>
    <td>
<table align="left" width="100%" border="0">
	
	<tr align="center" bgcolor="#CCFF99">
     <td colspan="4" class="style4">my circles: </font></td>
      </tr>
	<logic:notEmpty name="clist">
	 <logic:iterate id="obj" name="clist">
	 	<tr>
	 	 <td>
	 
	 	 </td>	
	 	 
	 		<td id="cname">
	 		<bean:write name="obj" property="cname"/> 
	 		</td>
	 		
	 		<td>
	 		<input type="hidden" value="<bean:write name='obj' property='cid'/>"/>
	 		 <a href="#" onclick="view(this, 2)">friends in this circle</a>
	 	 </td>
	 	 
	 	 <td>
	 	 <input type="hidden" value="<bean:write name='obj' property='cid'/>"/>
	 	  <a href="#" onclick="view(this, 1)">delete</a>
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









