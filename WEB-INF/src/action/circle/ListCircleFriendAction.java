
package action.circle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;
import form.FriendForm;
import service.AllServices;

import java.sql.ResultSet;
import java.util.*;

public class ListCircleFriendAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String userid=(String) request.getSession().getAttribute("userID");
			String cid=String.valueOf(request.getParameter("cid"));
			System.out.println(cid);
			
			ResultSet rs=AllServices.getcircleList(userid);
			ArrayList<LabelValueBean> circle = new ArrayList<LabelValueBean>();
			circle.add( new LabelValueBean("","") );
			while(rs.next()){
				circle.add( new LabelValueBean( "", rs.getString("CNAME")) );
			}
			request.getSession().setAttribute( "circles", circle );
			
			List cflist=AllServices.circlefriendList(userid, cid);
			request.setAttribute("cflist", cflist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}