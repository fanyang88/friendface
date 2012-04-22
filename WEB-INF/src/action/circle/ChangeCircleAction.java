package action.circle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;

import service.AllServices;
import form.FriendForm;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChangeCircleAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			//get data
			String userid=(String) request.getSession().getAttribute("userID");
			FriendForm fform=(FriendForm) form;
			String cname=fform.getCname();
            String fname=String.valueOf(request.getParameter("fname"));
			String lname=String.valueOf(request.getParameter("lname"));
				
				System.out.println(cname+","+fname+","+lname);
				String ocid=AllServices.getCID(userid, fname, lname);
				System.out.println(ocid);
				
			//change friend table
			AllServices.ChangeCircle(userid,ocid,cname,fname,lname);
				
			//routine
			ResultSet rs=AllServices.getcircleList(userid);
			ArrayList<LabelValueBean> circle = new ArrayList<LabelValueBean>();
			circle.add( new LabelValueBean("","") );
			while(rs.next()){
				circle.add( new LabelValueBean( "", rs.getString("CNAME")) );
			}
			request.getSession().setAttribute( "circles", circle );
			List cflist=AllServices.circlefriendList(userid, ocid);
			request.setAttribute("cflist", cflist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			
			fform.setCname("");
			return mapping.findForward("ok");
		}
	}

}