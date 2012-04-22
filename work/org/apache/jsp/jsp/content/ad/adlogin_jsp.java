package org.apache.jsp.jsp.content.ad;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_onkeydown_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_property_onkeydown_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_property_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_onkeydown_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_property_onkeydown_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_reset = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_styleId_method_action.release();
    _jspx_tagPool_html_text_property_onkeydown_nobody.release();
    _jspx_tagPool_html_password_property_onkeydown_nobody.release();
    _jspx_tagPool_html_button_property_onclick.release();
    _jspx_tagPool_html_reset.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_html_html_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_html_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_html_html_0.setPageContext(_jspx_page_context);
    _jspx_th_html_html_0.setParent(null);
    int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
    if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<head>\n");
        out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("<title>login</title>\n");
        out.write("<style type=\"text/css\">\n");
        out.write("<!--\n");
        out.write(".style1 {\n");
        out.write("\tfont-weight: bold;\n");
        out.write("\tcolor:#FFFFFF;\n");
        out.write("\tfont-size: 32pt;\n");
        out.write("}\n");
        out.write(".style2 {font-size: 18px}\n");
        out.write(".style3 {font-size: 16px}\n");
        out.write("-->\n");
        out.write("</style>\n");
        out.write("</head>\n");
        out.write("<script language=\"JavaScript\" type=\"text/JavaScript\">\n");
        out.write("function init(){\n");
        out.write("\tadloginForm.mname.focus();\n");
        out.write("}\n");
        out.write("<!--submit-->\n");
        out.write("function submit(){\n");
        out.write("\tif(mname.firstChild.value==\"\"||password.firstChild.value==\"\") \n");
        out.write("\t{alert(\"plz fill all blanks！\");return;}\n");
        out.write("\t\n");
        out.write("\tvar aff=document.getElementById(\"adloginForm\");\n");
        out.write("\taff.action=\"/FriendFace/adlogin.do\";\n");
        out.write("\taff.submit();\n");
        out.write("}\n");
        out.write("<!--press enter to submit-->\n");
        out.write("function processOnEnter(fld,evt){\n");
        out.write("\tif(isEnterKey(evt)){\n");
        out.write("\t\tadloginForm.submit();\n");
        out.write("\t}\n");
        out.write("}\n");
        out.write("<!--recognize enter key-->\n");
        out.write("function isEnterKey(evt){\n");
        out.write("\tevt=(evt)?evt:(window.event)?window.event:\"\";\n");
        out.write("\tvar theKey;\n");
        out.write("\tif(evt){\n");
        out.write("\t\ttheKey=(evt.which)?evt.which:evt.keyCode;\n");
        out.write("\t}\n");
        out.write("\treturn (theKey==13);\n");
        out.write("}\n");
        out.write("</script>\n");
        out.write("<body onload=\"init()\">\n");
        out.write("<table width=\"900\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FF6633\">\n");
        out.write("<tr><td>\n");
        out.write(" \n");
        out.write("<table width=\"900\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("  \n");
        out.write("  <tr>\n");
        out.write("    <td height=\"20\" bgcolor=\"#FFC7A2\">&nbsp;</td>\n");
        out.write("  </tr>\n");
        out.write("  <tr>\n");
        out.write("    <td>&nbsp;</td>\n");
        out.write("  </tr>\n");
        out.write("  <tr>\n");
        out.write("    <td>\n");
        out.write("\t");
        if (_jspx_meth_html_form_0(_jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t</td>\n");
        out.write("  </tr>\n");
        out.write("</table> \n");
        out.write("  \n");
        out.write("</td></tr>\n");
        out.write("</table>\n");
        out.write("</body>\n");
        int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      return true;
    }
    _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
    return false;
  }

  private boolean _jspx_meth_html_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_form_0.setStyleId("adloginForm");
    _jspx_th_html_form_0.setMethod("post");
    _jspx_th_html_form_0.setAction("adlogin.do");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<table width=\"600\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFC7A2\">  \n");
        out.write("\t\t\t<tr>\n");
        out.write("    \t\t\t<td height=\"50\" colspan=\"2\"><p>&nbsp;<span class=\"style2\">&nbsp;welcome to post advertisement on FriendFace, please login !</span></p>\n");
        out.write("   \t\t\t    </td>\n");
        out.write("  \t\t\t</tr>\n");
        out.write("  \t\t\t\n");
        out.write("\t\t\t<tr>\n");
        out.write("\t\t\t  <td width=\"141\" height=\"50\" align=\"right\"><span class=\"style2\">manager name: </span></td>\n");
        out.write("\t\t      <td id=\"mname\" width=\"457\" height=\"30\">");
        if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t  \t</tr>\n");
        out.write("\t\t  \t<tr>\n");
        out.write("\t\t\t  <td width=\"141\" height=\"50\" align=\"right\"><span class=\"style2\">password: </span></td>\n");
        out.write("\t\t      <td id=\"password\" width=\"457\" height=\"30\">");
        if (_jspx_meth_html_password_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t  \t</tr>\n");
        out.write("\t\t  \t\n");
        out.write("\t\t\t<tr>\n");
        out.write("\t\t\t  <td height=\"50\">&nbsp;</td>\n");
        out.write("\t\t      <td height=\"30\">");
        if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t          ");
        if (_jspx_meth_html_reset_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t  \t</tr>\n");
        out.write("\t\t  \t\n");
        out.write("\t\t  \t<tr>\n");
        out.write("\t\t\t  <td height=\"50\">&nbsp;</td>\n");
        out.write("\t\t      <td height=\"30\">&nbsp;</td>\n");
        out.write("\t\t  \t</tr>\n");
        out.write("\t\t  \t\n");
        out.write("\t\t  \t<tr>\n");
        out.write("\t\t\t  <td height=\"50\">&nbsp;</td>\n");
        out.write("\t\t      <td height=\"30\"><a href=\"/FriendFace/jsp/content/ad/adregister.jsp\">\n");
        out.write("\t\t      If you don't have an account,please register first!</a></td>\n");
        out.write("\t\t  \t</tr>\n");
        out.write("\t  </table>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_styleId_method_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_styleId_method_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_onkeydown_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("mname");
    _jspx_th_html_text_0.setOnkeydown("processOnEnter(this,event)");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_onkeydown_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_property_onkeydown_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_property_onkeydown_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_0.setProperty("password");
    _jspx_th_html_password_0.setOnkeydown("processOnEnter(this,event)");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_property_onkeydown_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_property_onkeydown_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_html_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_0 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_0.setPageContext(_jspx_page_context);
    _jspx_th_html_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_0.setProperty("");
    _jspx_th_html_button_0.setOnclick("submit()");
    int _jspx_eval_html_button_0 = _jspx_th_html_button_0.doStartTag();
    if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_button_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_button_0.doInitBody();
      }
      do {
        out.write("login");
        int evalDoAfterBody = _jspx_th_html_button_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_button_property_onclick.reuse(_jspx_th_html_button_0);
      return true;
    }
    _jspx_tagPool_html_button_property_onclick.reuse(_jspx_th_html_button_0);
    return false;
  }

  private boolean _jspx_meth_html_reset_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:reset
    org.apache.struts.taglib.html.ResetTag _jspx_th_html_reset_0 = (org.apache.struts.taglib.html.ResetTag) _jspx_tagPool_html_reset.get(org.apache.struts.taglib.html.ResetTag.class);
    _jspx_th_html_reset_0.setPageContext(_jspx_page_context);
    _jspx_th_html_reset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    int _jspx_eval_html_reset_0 = _jspx_th_html_reset_0.doStartTag();
    if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_reset_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_reset_0.doInitBody();
      }
      do {
        out.write("reset");
        int evalDoAfterBody = _jspx_th_html_reset_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_reset.reuse(_jspx_th_html_reset_0);
      return true;
    }
    _jspx_tagPool_html_reset.reuse(_jspx_th_html_reset_0);
    return false;
  }
}
