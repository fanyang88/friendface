package action.post;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import java.util.List;

public class PostListAction extends Action{
	
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
			
			List plist=AllServices.getPostList(userid);
			request.setAttribute("plist", plist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}
