package action;

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

import service.AllServices;
import form.LoginForm;

public class SaveProfileAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String userid=(String) request.getSession().getAttribute("userID");
		    String profilepic="";
			LoginForm editForm=(LoginForm)form;
			/////////////////////
			try
			{
				FormFile file=editForm.getPicpath();
				String suffix=file.getFileName().substring(file.getFileName().lastIndexOf(".")+1,file.getFileName().length());
				System.out.println(suffix);
				if(suffix.equals("jpg")||suffix.equals("jpeg")||suffix.equals("bmp"))
				{
					InputStream stream=file.getInputStream();
					String filename="D:/eclipse/project2/FriendFace/jsp/images/userpic/"+file.getFileName();  
					 profilepic="/FriendFace/jsp/images/userpic/"+file.getFileName();
					System.out.println(filename);
					//java.io.File   filepath   =   new   java.io.File(filename);  
					
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
			//////////////////////////
			String sex=editForm.getSex();
			String year=editForm.getYear();
			String month=editForm.getMonth();
			String day=editForm.getDay();
			String birthday=year+"-"+month+"-"+day;
			
			String preference=editForm.getPreference();
			String state=editForm.getState();
			String city=editForm.getCity();
			String zipcode=editForm.getZipCode();
			
			String email=editForm.getEmail();
			String phone=editForm.getTelephone();
			
			AllServices.SaveProfile(userid,profilepic, sex,birthday,preference, state,  city, zipcode,  email, phone);
			return mapping.findForward("ok");
		}
	}

}