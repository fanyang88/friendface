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

	<script language="JavaScript" type="text/JavaScript">
function save(){
		 var fom=document.getElementById("proForm");
				fom.action="/FriendFace/saveprofile.do";
				fom.submit();
}

<!--press enter to submit-->
function processOnEnter(fld,evt){
	if(isEnterKey(evt)){
		loginForm.submit();
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

 function purchase(adobj){
            var adid=adobj.parentNode.firstChild.value; 
		     window.open("/FriendFace/purchase.do?adid="+adid);
		}
		
</script>

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
<html:form styleId="proForm" enctype="multipart/form-data" method="post" action="index.do">
<table width="500" border="1" bordercolor="#66CC00" align="left">
   <tr>
    <td colspan="2">Profile Picture</td>
  </tr>
  
  <tr>
    <td colspan="2">
    <img src="<bean:write name="loginForm" property="profilePic"/>" width="100" height="70" border="0" align="center"></td>
  </tr>
  
  <tr>
    <td colspan="2">
    <html:file property="picpath">
  <br/>
  </html:file>
  </td>
  </tr>
  
   <tr>
    <td colspan="2">basic infomation</td>
  </tr>
  <tr>
    <td colspan="2"><table width="618" border="0">
      <tr>
        <td width="117">sex </td>
        <td width="491">
        
        <html:select name="loginForm" property="sex" onkeydown="processOnEnter(this,event)">
  							<html:option value="unknown">unknown</html:option>
  							<html:option value="female">female</html:option>
  							<html:option value="male">male</html:option>
  						</html:select>
        </td>
      </tr>
      <tr>
        <td>Birthday</td>
        <td>
        year: <html:select name="loginForm" property="year" onkeydown="processOnEnter(this,event)">
  							<html:option value="1990">1990</html:option><html:option value="1989">1989</html:option><html:option value="1988">1988</html:option>
  							<html:option value="1987">1987</html:option><html:option value="1986">1986</html:option><html:option value="1985">1985</html:option>
  							<html:option value="1984">1984</html:option><html:option value="1983">1983</html:option><html:option value="1982">1982</html:option>
  							<html:option value="1981">1981</html:option><html:option value="1980">1980</html:option><html:option value="1979">1979</html:option>
  							<html:option value="1978">1978</html:option><html:option value="1977">1977</html:option><html:option value="1976">1976</html:option>
  							<html:option value="1975">1975</html:option><html:option value="1974">1974</html:option><html:option value="1973">1973</html:option>
  							<html:option value="1972">1972</html:option><html:option value="1971">1971</html:option><html:option value="1970">1970</html:option>
  						</html:select>
  		month: <html:select name="loginForm" property="month" onkeydown="processOnEnter(this,event)">
  							<html:option value="01">01</html:option><html:option value="02">02</html:option><html:option value="03">03</html:option>
  							<html:option value="04">04</html:option><html:option value="05">05</html:option><html:option value="06">06</html:option>
  							<html:option value="07">07</html:option><html:option value="08">08</html:option><html:option value="09">09</html:option>
  							<html:option value="10">10</html:option><html:option value="11">11</html:option><html:option value="12">12</html:option>	
  						</html:select>
  	    day: <html:select name="loginForm" property="day" onkeydown="processOnEnter(this,event)">
  							<html:option value="01">01</html:option><html:option value="02">02</html:option><html:option value="03">03</html:option>
  							<html:option value="04">04</html:option><html:option value="05">05</html:option><html:option value="06">06</html:option>
  							<html:option value="07">07</html:option><html:option value="08">08</html:option><html:option value="09">09</html:option>
  							<html:option value="10">10</html:option><html:option value="11">11</html:option><html:option value="12">12</html:option>
  							<html:option value="13">13</html:option><html:option value="14">14</html:option><html:option value="15">15</html:option><html:option value="16">16</html:option>
  							<html:option value="17">17</html:option><html:option value="18">18</html:option><html:option value="19">19</html:option>
  							<html:option value="20">20</html:option><html:option value="21">21</html:option><html:option value="22">22</html:option><html:option value="23">23</html:option>
  							<html:option value="24">24</html:option><html:option value="25">25</html:option><html:option value="26">26</html:option>
  							<html:option value="27">27</html:option><html:option value="28">28</html:option><html:option value="29">29</html:option>
  							<html:option value="30">30</html:option>
  						</html:select>				
        </td>
      </tr>
      <tr>
        <td>preference</td>
        <td>
        <html:textarea rows="6" cols="40" name="loginForm" property="preference" onkeydown="processOnEnter(this,event)"/>
        </td>
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
        <td width="491">
        <html:text name="loginForm" property="state" onkeydown="processOnEnter(this,event)"/>
        </td>
      </tr>
      <tr>
        <td>City</td>
        <td>
        <html:text name="loginForm" property="city" onkeydown="processOnEnter(this,event)"/>
        </td>
      </tr>
      <tr>
        <td>Zipcode</td>
        <td><html:text name="loginForm" property="zipCode" onkeydown="processOnEnter(this,event)"/>
        </td>
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
        <td width="491">
        <html:text name="loginForm" property="email" onkeydown="processOnEnter(this,event)"/>
        </td>
      </tr>
      <tr>
        <td>telephone</td>
        <td>
        <html:text name="loginForm" property="telephone" onkeydown="processOnEnter(this,event)"/>
        </td>
      </tr>

    </table></td>
  </tr>
  
  <tr>
    <td align="right"><html:button property="" onclick="save()">submit</html:button></td>
    <td><html:button property="" onclick="history.back()">cancel</html:button></td>
  </tr>

  <tr>
    <td colspan="2">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2">&nbsp;</td>
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

