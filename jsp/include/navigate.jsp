<%@ page contentType="text/html; charset=UTF-8" %>	
<table width="200" border="0">
  <tr>
    <td width="203">welcome <%= request.getSession().getAttribute("username") %></td>
  </tr>
  <tr>
    <td><a href="logout.do">logout</a></td>
  </tr>
  <tr>
    <td><a href="index.do"><img src="/FriendFace/jsp/images/home.jpg" name="Image1" width="147" height="36" border="0"></img></a></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><a href="postlist.do"><img src="/FriendFace/jsp/images/activity.jpg" name="Image2" width="147" height="36" border="0"></img></a></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><a href="discussionlist.do"><img src="/FriendFace/jsp/images/message.jpg" name="Image3" width="147" height="36" border="0"></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><a href="sugfriendlist.do"><img src="/FriendFace/jsp/images/friend.jpg" name="Image4" width="147" height="36" border="0"/></a></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><a href="circlelist.do"><img src="/FriendFace/jsp/images/group.jpg" name="Image5" width="147" height="36" border="0"/></a></td>
  </tr>
</table>

