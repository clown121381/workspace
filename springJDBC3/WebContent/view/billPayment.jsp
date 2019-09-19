<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<jsp:include page="top.html"/> 
<HTML><HEAD><TITLE>Captain Fresh Seafood Supermarket : Welcome</TITLE>
<META http-equiv=Content-Type content="text/html; charset=windows-1252">
<META content="Microsoft FrontPage 5.0" name=GENERATOR></HEAD>
<BODY vLink=#ffcc33 aLink=#ffcc33 link=#993333 bgColor=#FFFFCC leftMargin=0 
topMargin=0 rightMargin=0 MARGINHEIGHT="0" MARGINWIDTH="0">
<center>
<TABLE cellSpacing=0 cellPadding=0 width=750 
background="/SeaFoodSuperMarket/view/images/top_band.gif" border=0>
  <TBODY>
  <TR>
    <TD align=right height=25><FONT face=Verdana,Arial,Helvetica 
      size=1>&nbsp;&nbsp; 02/24/2004&nbsp;&nbsp;</FONT></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=748 border=0 height="528">
  <TBODY>
  <TR>
    <TD vAlign=middle width=179 height="42" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
      <p align="left"><b><font color="#993333" size="3">&nbsp;&nbsp; Income management</font></b>
    </TD>
    <TD vAlign=top width=558 height="300" rowspan="7">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <div align="center">
      <center>
      <table border="1" width="88%" bordercolor="#800000">
        <tr>
          <td width="14%" align="center" bgcolor="#FDCC64"><b><font color="#993333">Vendor
            Name</font></b></td>
          <td width="14%" align="center" bgcolor="#FDCC64"><b><font color="#993333">Bill
            Date</font></b></td>
          <td width="15%" align="center" bgcolor="#FDCC64"><b><font color="#993333">Due
            Date</font></b></td>
          <td width="15%" align="center" bgcolor="#FDCC64"><b><font color="#993333">paidFlag</font></b></td>
          <td width="34%" align="center" bgcolor="#FDCC64"><b><font color="#993333">Update</font></b></td>
        </tr>
        <c:forEach items="${bills }" var="b">
	        <tr>
	          <td width="14%" align="center"><font color="#993333">${vendor_name }</font></td>
	          <td width="14%" align="center"><font color="#993333">${b.getBill_date() }</font></td>
	          <td width="15%" align="center"><font color="#993333">${b.getBill_due_date() }</font></td>
		          <td width="15%" align="center">
		       
		                    <p><input type="checkbox" name="C1" value="${b.getBill_id() }"></p>
		      
		          </td>
		          <td width="34%" align="center"><a href="/SeaFoodSuperMarket/Update?vendor_name=${vendor_name }&bill_id=${b.getBill_id() }"><img border="0" src="/SeaFoodSuperMarket/view/images1/depart1.gif" width="43" height="23"></a></td>
	   	   </tr>
        </c:forEach>
        </table>
      </center>
    </div>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=179 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><b><font color="#993333" size="3">&nbsp;&nbsp; Dept management</font></b>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=179 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><b><font color="#993333" size="3">&nbsp;&nbsp; Report management</font></b>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=179 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><b><font color="#993333" size="3">&nbsp;&nbsp; Vendor management</font></b>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=179 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><b><font color="#993333" size="3">&nbsp;&nbsp; Bill management</font></b>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=179 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><b><font color="#993333" size="3">&nbsp;&nbsp; Bill Payment</font></b>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=179 height="43" bgcolor="#FDCC64">
    <p align="left">
    <b><font color="#993333" size="3">&nbsp;&nbsp; Backup</font></b>
    </TD>
  </TR>
  <TR>
    <TD vAlign=bottom width=746 height="1" colspan="2">
    </TD>
  </TR>
  <TR>
    <TD vAlign=bottom width=746 height="122" colspan="2">
      <p><IMG height=24 alt="Captain Fresh Seafood Supermarket" 
      src="images1/home_bot_right.jpg" width=742 
      border=0></p>
    </TD>
  </TR>
      </FORM>
  </TBODY>
</TABLE>
</center>
      </BODY></HTML>
