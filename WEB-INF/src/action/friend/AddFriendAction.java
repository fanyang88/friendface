package action.friend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;


public class AddFriendAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String userid=(String) request.getSession().getAttribute("userID");
			String symbol=String.valueOf(request.getParameter("symbol"));
		    //get data
			if(symbol.equals("obj1"))
			{
				String rid=String.valueOf(request.getParameter("rid"));
				String flag=String.valueOf(request.getParameter("flag"));
				if(!rid.equals("")&&!flag.equals(""))
					AllServices.AddFriend(rid, flag);
				
			}
			else if(symbol.equals("obj2"))
			{
				System.out.println(symbol);
				String srid=String.valueOf(request.getParameter("srid"));
				String sipflag=String.valueOf(request.getParameter("sipflag"));
				System.out.println(srid+" "+sipflag);
				
				if(!srid.equals("")&&!sipflag.equals(""))
					AllServices.AddSIP(userid, srid, sipflag);
			}
			else{}
            
			return mapping.findForward("ok");
		}
	}

}
