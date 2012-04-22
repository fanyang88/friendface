package action;

import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;

public class TransactionAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String username= request.getSession().getAttribute("username").toString();
			String userid=request.getSession().getAttribute("userID").toString();
			String adid=request.getSession().getAttribute("TID").toString();
			ResultSet rs=AllServices.getProfile(userid);
			String userpic=rs.getString("PROFILEPIC");
			AllServices.transaction(userid, adid,username, userpic);
			return mapping.findForward("ok");
		}
	}

}
