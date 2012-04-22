package action.post;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import java.sql.ResultSet;
import service.AllServices;
import form.PostForm;

public class AddPostAction extends Action{
	
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
		    //get userpic
			ResultSet rs=AllServices.getProfile(userid);
			String userpic=rs.getString("PROFILEPIC");
			
			String postpic="";
			PostForm PForm=(PostForm)form;
			/////////////////////
			FormFile file=PForm.getPostpicpath();
			String picname=file.getFileName();
			if(picname.equals(""))
			{
				postpic="D:/eclipse/project2/FriendFace/jsp/images/postpic/default.jpg";
			}
			
			else
			{
				try
				{
					//FormFile file=PForm.getPostpicpath();
					String suffix=file.getFileName().substring(file.getFileName().lastIndexOf(".")+1,file.getFileName().length());
					System.out.println(suffix);
					if(suffix.equals("jpg")||suffix.equals("jpeg")||suffix.equals("bmp"))
					{
						InputStream stream=file.getInputStream();
						String filename="D:/eclipse/project2/FriendFace/jsp/images/postpic/"+file.getFileName();  
						postpic="/FriendFace/jsp/images/postpic/"+file.getFileName();
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
			String ptitle=PForm.getPtitle();	
			AllServices.AddPost(userid, username, userpic, postpic, ptitle);
			
			return mapping.findForward("ok");
		}
	}

}