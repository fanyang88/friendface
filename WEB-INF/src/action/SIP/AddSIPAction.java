package action.SIP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.apache.struts.util.LabelValueBean;

import service.AllServices;
import form.SIPForm;

public class AddSIPAction extends Action{
	
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
			//get data
			String sippic="";
		    SIPForm sipForm=(SIPForm)form;
			
            String sipname=sipForm.getSipname();
            String descript=sipForm.getDescription();
            String[] sharernames= sipForm.getSharers();
            FormFile file=sipForm.getSippicpath();
            
			String picname=file.getFileName();
			  
			  
			if(picname.equals(""))
			{
				sippic="D:/eclipse/project2/FriendFace/jsp/images/default.jpg";
				
			}
			
			else  //upload pic
			{  try
				{
					String suffix=file.getFileName().substring(file.getFileName().lastIndexOf(".")+1,file.getFileName().length());
					System.out.println(suffix);
					if(suffix.equals("jpg")||suffix.equals("jpeg")||suffix.equals("bmp"))
					{
						InputStream stream=file.getInputStream();
						String filename="D:/eclipse/project2/FriendFace/jsp/images/userpic/"+file.getFileName();  
						sippic="/FriendFace/jsp/images/userpic/"+file.getFileName();
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
          
            //insertion to subject table
            int sipid=AllServices.AddSIP(sipname,userid, descript,sippic);
           
            for(int i=0;i<sharernames.length;i++)
            {
            	String fname=sharernames[i].substring(0,sharernames[i].indexOf(" "));
            	String lname=sharernames[i].substring(sharernames[i].indexOf(" ")+1,sharernames[i].length());
            	lname=lname.trim();
            	String receiverid=AllServices.getUserId(fname, lname).getString("USERID");
            	AllServices.AddSIPRequest( sipid, sipname, username,  receiverid);
            }
            
            //
            ResultSet rs=AllServices.getFriendList(userid);
			ArrayList<LabelValueBean> friend = new ArrayList<LabelValueBean>();
			friend.add( new LabelValueBean("","") );
			while(rs.next()){
				friend.add( new LabelValueBean( "", rs.getString("FFIRSTNAME")+" "+rs.getString("FLASTNAME")) );
			}
			request.getSession().setAttribute( "friends", friend );
			
			//sip list
			List siplist=AllServices.SIPList(userid);
			request.setAttribute("siplist", siplist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}