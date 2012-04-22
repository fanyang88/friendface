package action.SIP;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import java.util.*;
import java.sql.ResultSet;
import form.SIPForm;

public class SIPDetailAction extends Action{
	
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
			String sipid=String.valueOf(request.getParameter("sipid"));
            ResultSet rs=AllServices.getSIPInfo(sipid);
			
			//transfer form to jsp
            SIPForm sipForm=(SIPForm)form;
            sipForm.setDescription(rs.getString("DESCRIPTION"));
            sipForm.setSipname(rs.getString("SIPNAME"));
            sipForm.setSippic(rs.getString("SIPPIC"));
			request.setAttribute("sIPForm",sipForm);
			request.getSession().setAttribute( "sipid", sipid );
			
			
			//sip list
			List sipplist=AllServices.SIPPostList(sipid);
			request.setAttribute("sipplist", sipplist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}