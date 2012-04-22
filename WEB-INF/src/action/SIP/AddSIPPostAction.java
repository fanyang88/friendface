package action.SIP;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import java.util.List;

import service.AllServices;
import form.SIPForm;

public class AddSIPPostAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String userid=(String) request.getSession().getAttribute("userID");
			String username=(String) request.getSession().getAttribute("username");
			String sipid=(String) request.getSession().getAttribute("sipid");
		    
			//get userpic
			ResultSet rs=AllServices.getProfile(userid);
			String userpic=rs.getString("PROFILEPIC");
			
			String sippostpic="";
			SIPForm sipform=(SIPForm)form;
			/////////////////////
			FormFile file=sipform.getSippostpicpath();
			String picname=file.getFileName();
			if(picname.equals(""))
			{
				sippostpic="D:/eclipse/project2/FriendFace/jsp/images/postpic/default.jpg";
			}
			
			else
			{
				try
				{
					String suffix=file.getFileName().substring(file.getFileName().lastIndexOf(".")+1,file.getFileName().length());
					System.out.println(suffix);
					if(suffix.equals("jpg")||suffix.equals("jpeg")||suffix.equals("bmp"))
					{
						InputStream stream=file.getInputStream();
						String filename="D:/eclipse/project2/FriendFace/jsp/images/postpic/"+file.getFileName();  
						sippostpic="/FriendFace/jsp/images/postpic/"+file.getFileName();
						System.out.println(filename);
						
						OutputStream bos=new FileOutputStream(filename);
						int bytesRead=0;
						byte[] buffer=new byte[8192];
						
						while((bytesRead=stream.read(buffer,0,8192))!=-1)
						{
							bos.write(buffer,0,bytesRead);
						}
						bos.close();
					}
						
				}catch(IOException ioe)
				{
					ioe.printStackTrace();
				}
			}
			
			//////////////////////////
			String sipptitle=sipform.getSipptitle();
			AllServices.AddSIPPost(sipptitle,userid, username,userpic,sippostpic,sipid);
			
			///
			
			//String sipid=String.valueOf(request.getParameter("sipid"));
             rs=AllServices.getSIPInfo(sipid);
			
			//transfer form to jsp
            SIPForm sipForm=(SIPForm)form;
            sipForm.setDescription(rs.getString("DESCRIPTION"));
            sipForm.setSipname(rs.getString("SIPNAME"));
            sipForm.setSippic(rs.getString("SIPPIC"));
			request.setAttribute("sIPForm",sipForm);
			request.getSession().setAttribute( "sipid", sipid );
			
			
			//sip list
			List sipplist=AllServices.SIPPostList(sipid);
			request.setAttribute("sipplist", sipplist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}
