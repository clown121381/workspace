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
background="/springJDBC3/view/images/top_band.gif" border=0>
  <TBODY>
  <TR>
    <TD align=right height=25><FONT face=Verdana,Arial,Helvetica 
      size=1>&nbsp;&nbsp; ${date1 }&nbsp;&nbsp;</FONT></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=748 border=0 height="333">
  <TBODY>
  <TR>
    <TD vAlign=middle width=170 height="42" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
      <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Income management</font> </b></a>
    </TD>
    <TD vAlign=top width=567 height="299" rowspan="7">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <p align="center">&nbsp;</p>
    <form method="POST" action="/springJDBC3/AddDept">
      <!--webbot bot="SaveResults" u-file="E:\ij&#39033;&#30446;1\UI\_private\form_results.txt" s-format="TEXT/CSV" s-label-fields="TRUE" startspan --><input TYPE="hidden" NAME="VTI-GROUP" VALUE="0"><!--webbot bot="SaveResults" endspan i-checksum="43374" -->
      <p align="center"><b><font color="#993333">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      Bill Date:</font></b><input type="text" value="${date2 }" name="T1" size="20"></p>
      <p align="center"><font color="#993333"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      </b></font><b><font color="#993333">Bill Due Date</font></b><font color="#993333"><b>:<input type="text" value="${date2 }" name="T2" size="20"></b></font></p>
      <p align="center"><font color="#993333"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      Vendor:<select size="1" name="D1">
      	<c:forEach  items="${vendor_li}" var="v">
        	<option value="${v.getVendor_id() }">${v.getVendor_name() }</option>
      	</c:forEach>    
      </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" value="new Vendor" name="B3" style="background-color: #FDCC64; color: #800000; font-weight: bold"></b></font></p>
      <p align="center"><input type="submit" value="Add Department Item" name="B1" style="color: #800000; font-weight: bold; background-color: #FDCC64">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" value="Reset" name="B2" style="color: #800000; font-weight: bold; background-color: #FDCC64"></p>
    </form>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="42" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Dept management</font> </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Report management</font> </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Vendor management</font> </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Bill management</font> </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="43" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Bill Payment</font> </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="43" bgcolor="#FDCC64"><a href="#" style="text-decoration: none">
    <b><font color="#993333" size="3">&nbsp;&nbsp; Backup</font> </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=bottom width=746 height="34" colspan="2">
    </TD>
  </TR>
  <TR>
    <TD vAlign=bottom width=746 height="122" colspan="2">
      <p><IMG height=24 alt="Captain Fresh Seafood Supermarket" 
      src="/SeaFoodSuperMarket/view/images1/home_bot_right.jpg" width=742 
      border=0></p>
    </TD>
  </TR>
      </FORM>
  </TBODY>
</TABLE>
</center>
      </BODY></HTML>
