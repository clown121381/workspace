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
      size=1>&nbsp;&nbsp; ${date1 }&nbsp;&nbsp;</FONT></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=748 border=0 height="515">
  <TBODY>
  <TR>
    <TD vAlign=middle width=170 height="52" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000" align="right">
      <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Income management</font>
      </b></a>
    </TD>
    <TD vAlign=top width=567 height="291" rowspan="7">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <form method="POST" action="/SeaFoodSuperMarket/AddBillDept">
      <!--webbot bot="SaveResults" u-file="E:\ij&#39033;&#30446;1\UI\_private\form_results.txt" s-format="TEXT/CSV" s-label-fields="TRUE" startspan --><input TYPE="hidden" NAME="VTI-GROUP" VALUE="0"><!--webbot bot="SaveResults" endspan i-checksum="43374" --><p align="center"><b><font color="#993333">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bill
      date:${d1 }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Vendor:${vendor }</font></b></p>
      <input type="hidden" name="d1" value="${d1 }"> 
      <input type="hidden" name="d2" value="${d2 }"> 
      <input type="hidden" name="vendor" value="${vendor }"> 
      
      <div align="center">
        <center>
        <table border="1" width="80%" bordercolor="#800000">
          <tr>
            <td width="50%" bgcolor="#FDCC64">
              <p align="center"><b><font color="#800000">Department Name</font></b></td>
            <td width="50%" bgcolor="#FDCC64">
              <p align="center"><b><font color="#800000">Amount</font></b></td>
            <td width="50%" bgcolor="#FDCC64">
              <p align="center"><font color="#800000"><b>Confirm</b></font></td>
          </tr>
          <c:forEach items="${dept_li }" var="d">
	          <tr>
	            <td width="50%" align="center">${d.getDept_name() }</td>
	            <td width="50%" align="center"><input type="text" name="dept_num" size="20" value="$"></td>
	            <td width="50%" align="center"><input type="checkbox" name="dept_chk" value="${d.getDept_id() }" checked></td>
	          </tr>
          </c:forEach>
          <tr>
            <td width="50%" align="center" bgcolor="#FDCC64">sum</td>
            <td width="50%" align="center" bgcolor="#FDCC64"><input type="text" name="T10" size="20"></td>
            <td width="50%" align="center" bgcolor="#FDCC64">&nbsp;</td>
          </tr>
        </table>
        </center>
      </div>
      <p align="center"><font color="#993333"><b>&nbsp;&nbsp;
      </b></font><input type="submit" value="Submit" name="B1" style="color: #800000; font-weight: bold; background-color: #FDCC64">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" value="Reset" name="B2" style="color: #800000; font-weight: bold; background-color: #FDCC64"></p>
    </form>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="52" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000" align="right">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Dept management</font>
    </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="52" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000" align="right">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Report management</font>
    </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="52" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000" align="right">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Vendor management</font>
    </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="52" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000" align="right">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Bill management</font>
    </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="53" bgcolor="#FDCC64" bordercolor="#993333" bordercolorlight="#800000" align="right">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Bill Payment</font>
    </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=middle width=170 height="53" bgcolor="#FDCC64" align="center">
    <p align="left"><a href="#" style="text-decoration: none"><b><font color="#993333" size="3">&nbsp;&nbsp; Backup</font>
    </b></a>
    </TD>
  </TR>
  <TR>
    <TD vAlign=bottom width=746 height="1" colspan="2">
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
