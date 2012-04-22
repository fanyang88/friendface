package action.discussion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import form.SubjectForm;

public class AddSubjectAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			//String userid=(String) request.getSession().getAttribute("userID");
			//get data
			String receivers="";
            SubjectForm subjectForm=(SubjectForm)form;
			
            String subtitle=subjectForm.getSubtitle();
            String[] rnames= subjectForm.getReceivers();
            for(int i=0;i<rnames.length;i++)
            {
            	String fname=rnames[i].substring(0,rnames[i].indexOf(" "));
            	String lname=rnames[i].substring(rnames[i].indexOf(" ")+1,rnames[i].length());
            	lname=lname.trim();
            	String uid=AllServices.getUserId(fname, lname).getString("USERID");
            	receivers=receivers+uid+",";
            }
            receivers=receivers.substring(0,receivers.length()-1);
            String starter=(String) request.getSession().getAttribute("username");

            //insertion to subject table
            AllServices.AddSubject(starter,subtitle, receivers);
			return mapping.findForward("ok");
		}
	}

}