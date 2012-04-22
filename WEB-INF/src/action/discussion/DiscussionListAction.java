package action.discussion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import java.util.*;
import java.sql.ResultSet;
import org.apache.struts.util.LabelValueBean;

public class DiscussionListAction extends Action{
	
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
			
			ResultSet rs=AllServices.getFriendList(userid);
			ArrayList<LabelValueBean> friend = new ArrayList<LabelValueBean>();
			friend.add( new LabelValueBean("","") );
			while(rs.next()){
				friend.add( new LabelValueBean( "", rs.getString("FFIRSTNAME")+" "+rs.getString("FLASTNAME")) );
			}
			request.getSession().setAttribute( "friends", friend );
			
			//subject list
			List sublist=AllServices.persubjectList(userid, username);
			request.setAttribute("sublist", sublist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}