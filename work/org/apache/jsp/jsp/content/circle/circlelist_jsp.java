package org.apache.jsp.jsp.content.circle;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class circlelist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
    _jspx_dependants.add("/jsp/include/head.jsp");
    _jspx_dependants.add("/jsp/include/navigate.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_property_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_styleId_method_action.release();
    _jspx_tagPool_html_text_property_name_nobody.release();
    _jspx_tagPool_html_button_property_onclick.release();
    _jspx_tagPool_logic_notEmpty_name.release();
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
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
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t<head>\n");
          out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\"/>\n");
          out.write("\t\t<title></title>\n");
          out.write("\t</head>\n");
          out.write("\t<body>\n");
          out.write("\t\n");
          out.write("\t<table width=\"1050\" border=\"0\">\n");
          out.write("  <tr>\n");
          out.write("    <td width=\"900\">\n");
          out.write("    <table width=\"900\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#66CC00\">\n");
          out.write("\t\t<tr><td colspan=\"2\">\n");
          out.write(" \t\t");
          out.write("\n");
          out.write("\n");
          out.write("<head>\n");
          out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
          out.write("<table width=\"227\" border=\"0\" align=\"center\">\n");
          out.write("  <tr>\n");
          out.write("    <td width=\"221\"><img src=\"/FriendFace/jsp/images/title.jpg\" width=\"900\" height=\"250\" border=\"0\"></td>\n");
          out.write("  </tr>\n");
          out.write("</table>\n");
          out.write("</head>\n");
          out.write("\n");
          out.write("\n");
          out.write("    \t</td></tr>  \n");
          out.write("\t\t<tr><td width=\"20%\">\n");
          out.write("\t\t");
          out.write("\t\n");
          out.write("<table width=\"200\" border=\"0\">\n");
          out.write("  <tr>\n");
          out.write("    <td width=\"203\">welcome ");
          out.print( request.getSession().getAttribute("username") );
          out.write("</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td><a href=\"logout.do\">logout</a></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td><a href=\"index.do\"><img src=\"/FriendFace/jsp/images/home.jpg\" name=\"Image1\" width=\"147\" height=\"36\" border=\"0\"></img></a></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td><a href=\"postlist.do\"><img src=\"/FriendFace/jsp/images/activity.jpg\" name=\"Image2\" width=\"147\" height=\"36\" border=\"0\"></img></a></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td><a href=\"discussionlist.do\"><img src=\"/FriendFace/jsp/images/message.jpg\" name=\"Image3\" width=\"147\" height=\"36\" border=\"0\"></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td><a href=\"sugfriendlist.do\"><img src=\"/FriendFace/jsp/images/friend.jpg\" name=\"Image4\" width=\"147\" height=\"36\" border=\"0\"/></a></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td><a href=\"circlelist.do\"><img src=\"/FriendFace/jsp/images/group.jpg\" name=\"Image5\" width=\"147\" height=\"36\" border=\"0\"/></a></td>\n");
          out.write("  </tr>\n");
          out.write("</table>\n");
          out.write("\n");
          out.write("\n");
          out.write("\t\t</td>\n");
          out.write("  \t\t<td width=\"100%\" valign=\"top\">\n");
          out.write("  \t\t\n");
          out.write("  \t<!--content-->\n");
          out.write("<script language=\"JavaScript\" type=\"text/JavaScript\">\n");
          out.write("    function create(){\n");
          out.write("\t\t var fom=document.getElementById(\"circleForm\");\n");
          out.write("\t\t\t\tfom.action=\"/FriendFace/addcircle.do\";\n");
          out.write("\t\t\t\tfom.submit();\n");
          out.write("            }\n");
          out.write("            \n");
          out.write("            function purchase(adobj){\n");
          out.write("            var adid=adobj.parentNode.firstChild.value; \n");
          out.write("\t\t     window.open(\"/FriendFace/purchase.do?adid=\"+adid);\n");
          out.write("\t\t}\n");
          out.write("\t\t\n");
          out.write("            function view(obj, val){\n");
          out.write("            var cid=obj.parentNode.firstChild.value;\n");
          out.write("            if(val==1)\n");
          out.write("\t\t    {\n");
          out.write("\t\t       if(cid==\"1\")\n");
          out.write("\t\t       {alert(\"can't delete *friend* circle\"); return;}\n");
          out.write("\t\t       else\n");
          out.write("\t\t       location.href=\"/FriendFace/deletecircle.do?cid=\"+cid;\n");
          out.write("\t\t    }\n");
          out.write("\t\t    else\n");
          out.write("\t\t    location.href=\"/FriendFace/circlefriendlist.do?cid=\"+cid;\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("</script>\n");
          out.write("\t\t\n");
          out.write("\t\t<table width=\"100%\" border=\"0\">\n");
          out.write("  <tr>\n");
          out.write("    <td>\n");
          out.write("     ");
          if (_jspx_meth_html_form_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td>\n");
          out.write("<table align=\"left\" width=\"100%\" border=\"0\">\n");
          out.write("\t\n");
          out.write("\t<tr align=\"center\" bgcolor=\"#CCFF99\">\n");
          out.write("     <td colspan=\"4\" class=\"style4\">my circles: </font></td>\n");
          out.write("      </tr>\n");
          out.write("\t");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
          _jspx_th_logic_notEmpty_0.setName("clist");
          int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
          if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\n');
              out.write('	');
              out.write(' ');
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
              _jspx_th_logic_iterate_0.setId("obj");
              _jspx_th_logic_iterate_0.setName("clist");
              int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
              if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object obj = null;
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_0.doInitBody();
                }
                obj = (java.lang.Object) _jspx_page_context.findAttribute("obj");
                do {
                  out.write("\n");
                  out.write("\t \t<tr>\n");
                  out.write("\t \t <td>\n");
                  out.write("\t \n");
                  out.write("\t \t </td>\t\n");
                  out.write("\t \t \n");
                  out.write("\t \t\t<td id=\"cname\">\n");
                  out.write("\t \t\t");
                  if (_jspx_meth_bean_write_0(_jspx_th_logic_iterate_0, _jspx_page_context))
                    return;
                  out.write(" \n");
                  out.write("\t \t\t</td>\n");
                  out.write("\t \t\t\n");
                  out.write("\t \t\t<td>\n");
                  out.write("\t \t\t<input type=\"hidden\" value=\"");
                  if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, _jspx_page_context))
                    return;
                  out.write("\"/>\n");
                  out.write("\t \t\t <a href=\"#\" onclick=\"view(this, 2)\">friends in this circle</a>\n");
                  out.write("\t \t </td>\n");
                  out.write("\t \t \n");
                  out.write("\t \t <td>\n");
                  out.write("\t \t <input type=\"hidden\" value=\"");
                  if (_jspx_meth_bean_write_2(_jspx_th_logic_iterate_0, _jspx_page_context))
                    return;
                  out.write("\"/>\n");
                  out.write("\t \t  <a href=\"#\" onclick=\"view(this, 1)\">delete</a>\n");
                  out.write("\t \t \t</td>\t\n");
                  out.write("\t \t</tr>\n");
                  out.write("\t \t\n");
                  out.write("\t ");
                  int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                  obj = (java.lang.Object) _jspx_page_context.findAttribute("obj");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
                return;
              }
              _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_0);
            return;
          }
          _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_0);
          out.write("\n");
          out.write("\t</tr>\n");
          out.write("</table>\n");
          out.write("\n");
          out.write("</td>\n");
          out.write("  </tr>\n");
          out.write("</table>\n");
          out.write("\t<!--end-->\n");
          out.write("\t\n");
          out.write("\t\t\t</td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t</table>\n");
          out.write("    \n");
          out.write("    </td>\n");
          out.write("    <td width=\"150\">\n");
          out.write("     <table align=\"left\" width=\"100%\" border=\"0\" >\n");
          out.write("\t");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
          _jspx_th_logic_notEmpty_1.setName("adlist");
          int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
          if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\n');
              out.write('	');
              out.write(' ');
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
              _jspx_th_logic_iterate_1.setId("adobj");
              _jspx_th_logic_iterate_1.setName("adlist");
              int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
              if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object adobj = null;
                if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_1.doInitBody();
                }
                adobj = (java.lang.Object) _jspx_page_context.findAttribute("adobj");
                do {
                  out.write("\n");
                  out.write("\t \t<tr>\n");
                  out.write("\t \t\t<td><img src=\"");
                  if (_jspx_meth_bean_write_3(_jspx_th_logic_iterate_1, _jspx_page_context))
                    return;
                  out.write("\" width=\"100\" height=\"70\" border=\"0\" align=\"center\"></td>\n");
                  out.write("\t \t</tr>\n");
                  out.write("\t \t<tr>\n");
                  out.write("\t \t\t<td>\n");
                  out.write("\t \t\t<input type=\"hidden\" value=\"");
                  if (_jspx_meth_bean_write_4(_jspx_th_logic_iterate_1, _jspx_page_context))
                    return;
                  out.write("\"/>\n");
                  out.write("\t \t");
                  if (_jspx_meth_html_button_1(_jspx_th_logic_iterate_1, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t \t\t</td>\n");
                  out.write("\t \t</tr>\n");
                  out.write("\t ");
                  int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
                  adobj = (java.lang.Object) _jspx_page_context.findAttribute("adobj");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
                return;
              }
              _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_1);
            return;
          }
          _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_1);
          out.write("\n");
          out.write("\t</tr>\n");
          out.write("</table>\n");
          out.write("    \n");
          out.write("    </td>\n");
          out.write("  </tr>\n");
          out.write("</table>\n");
          out.write("\n");
          out.write("\n");
          out.write("\t\n");
          out.write("\t</body>\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
        return;
      }
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_html_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_form_0.setStyleId("circleForm");
    _jspx_th_html_form_0.setMethod("post");
    _jspx_th_html_form_0.setAction("addcircle.do");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<table width=\"100%\" border=\"0\" bgcolor=\"#CCFF99\">\n");
        out.write("      <tr>\n");
        out.write("        <td>create a new circle: </td>\n");
        out.write("      </tr>\n");
        out.write("      <tr>\n");
        out.write("        <td>\n");
        out.write("        ");
        if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t      ");
        if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </td>\n");
        out.write("      </tr>\n");
        out.write("    </table>\n");
        out.write("    ");
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
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setName("circleForm");
    _jspx_th_html_text_0.setProperty("cname");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_0);
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
    _jspx_th_html_button_0.setOnclick("create()");
    int _jspx_eval_html_button_0 = _jspx_th_html_button_0.doStartTag();
    if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_button_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_button_0.doInitBody();
      }
      do {
        out.write("create");
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

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_0.setName("obj");
    _jspx_th_bean_write_0.setProperty("cname");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_1.setName("obj");
    _jspx_th_bean_write_1.setProperty("cid");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_2.setName("obj");
    _jspx_th_bean_write_2.setProperty("cid");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_3.setName("adobj");
    _jspx_th_bean_write_3.setProperty("itempic");
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
    return false;
  }

  private boolean _jspx_meth_bean_write_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_4.setName("adobj");
    _jspx_th_bean_write_4.setProperty("adid");
    int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
    if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
    return false;
  }

  private boolean _jspx_meth_html_button_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_1 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_1.setPageContext(_jspx_page_context);
    _jspx_th_html_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_html_button_1.setProperty("");
    _jspx_th_html_button_1.setOnclick("purchase(this)");
    int _jspx_eval_html_button_1 = _jspx_th_html_button_1.doStartTag();
    if (_jspx_eval_html_button_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_button_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_button_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_button_1.doInitBody();
      }
      do {
        out.write("purchase");
        int evalDoAfterBody = _jspx_th_html_button_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_button_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_button_property_onclick.reuse(_jspx_th_html_button_1);
      return true;
    }
    _jspx_tagPool_html_button_property_onclick.reuse(_jspx_th_html_button_1);
    return false;
  }
}
