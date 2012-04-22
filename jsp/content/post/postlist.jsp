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
		 var fom=document.getElementById("postForm");
				fom.action="/FriendFace/addpost.do";
				fom.submit();
            }
            
            function view(obj){
            var pid=obj.parentNode.firstChild.value;
           window.open("/FriendFace/commentlist.do?pid="+pid);
		
		}
		
		 function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}

</script>
		
		<table width="100%" border="0">
  <tr>
    <td>
     <html:form styleId="postForm" enctype="multipart/form-data" method="post" action="addpost.do">
	<table width="100%" border="0" bgcolor="#CCFF99">
      <tr>
        <td>add a post: <html:text name="postForm" property="ptitle"/></td>
      </tr>
      
        <tr>
        <td>
         <html:file property="postpicpath">
         <br/>
        </html:file>
          </td>
      </tr>
      
       <tr>
        <td>
         <html:button property="" onclick="create()">post</html:button>
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
     <td colspan="3" class="style4">all posts: </font></td>
      </tr>
	<logic:notEmpty name="plist">
	 <logic:iterate id="obj" name="plist">
	 <tr>
	 <td><bean:write name="obj" property="postername"/> </td>
	 <td><bean:write name="obj" property="ptitle"/></td>
	 <td><bean:write name="obj" property="date"/></td>
	 </tr>
	 
	 <tr>
	 <td>
	 <img src="<bean:write name="obj" property="posterpic"/>" width="50" height="50" border="0" align="center">
	 </td>
	 <td><img src="<bean:write name="obj" property="postpic"/>" width="100" height="100" border="0" align="center">
	 </td>
	 <td><input type="hidden" value="<bean:write name='obj' property='pid'/>"/>
	 <html:button property="" onclick="view(this)">comments</html:button>
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

