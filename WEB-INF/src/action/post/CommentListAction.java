package action.post;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import java.util.List;

public class CommentListAction extends Action{
	
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
			String pid=String.valueOf(request.getParameter("pid"));
			request.getSession().setAttribute("PID",pid);
			
			List cmlist=AllServices.getCommentList(pid);
			request.setAttribute("cmlist", cmlist);
			
			return mapping.findForward("ok");
		}
	}

}
