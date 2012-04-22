package action.Advertisement;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import service.AllServices;
import form.AdForm;


public class CreateADAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("company")== null)
			return mapping.findForward("adlog");
		else
		{
			String inc=(String) request.getSession().getAttribute("company");
			String adpic="";
			AdForm adform=(AdForm)form;
			FormFile file=adform.getAdpicpath();
			String picname=file.getFileName();
			
			if(!picname.equals(""))
			{
				try
				{
					String suffix=file.getFileName().substring(file.getFileName().lastIndexOf(".")+1,file.getFileName().length());
					System.out.println(suffix);
					if(suffix.equals("jpg")||suffix.equals("jpeg")||suffix.equals("bmp"))
					{
						InputStream stream=file.getInputStream();
						String filename="D:/eclipse/project2/FriendFace/jsp/images/adpic/"+file.getFileName();  
						adpic="/FriendFace/jsp/images/adpic/"+file.getFileName();
						System.out.println(filename);
						
						OutputStream bos=new FileOutputStream(filename);
						int bytesRead=0;
						byte[] buffer=new byte[8192];
						
						while((bytesRead=stream.read(buffer,0,8192))!=-1)
						{
							bos.write(buffer,0,bytesRead);
						}
						bos.close();
					
						String itemname=adform.getItemname();
						String price=adform.getUnitprice();
						String keywords=adform.getKeyword();
						AllServices.AdCreate(itemname,adpic, inc, price, keywords);
					}
						
				}catch(IOException ioe)
				{
					ioe.printStackTrace();
				}
			}
			
			else
			{}
			
			List list=AllServices.ADList(inc);
			request.setAttribute("adlist", list);
			
			return mapping.findForward("ok");
		}
	}

}