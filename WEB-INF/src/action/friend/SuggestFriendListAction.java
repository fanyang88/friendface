package action.friend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import java.util.List;

public class SuggestFriendListAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String userid=(String) request.getSession().getAttribute("userID");
			//request part
			
			List requestlist=AllServices.requestList(userid);
			request.setAttribute("requestlist", requestlist);
			
			//sip request part
			List siprequestlist=AllServices.siprequestList(userid);
			request.setAttribute("siprequestlist", siprequestlist);
			
			//friends list part
			List sflist=AllServices.showsuggestFriendList(userid);
			request.setAttribute("sflist", sflist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}
