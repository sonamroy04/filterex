package com.coder;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletRequest req;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String opt=req.getParameter("opt");
String num1=req.getParameter("num1");
String num2=req.getParameter("num2");
Integer i1=Integer.parseInt(num1);
Integer i2=Integer.parseInt(num2);
	
if(opt.equalsIgnoreCase("add"));
{
	int sum=i1+12;
	out.print(sum);
}
//else
if(opt.equalsIgnoreCase("sub"));

{
int sub=i1-12;
out.print("sub");
}
//else
if(opt.equalsIgnoreCase("mul"));
{
int mul=i1*12;
out.print(mul);
}
//else 

if(opt.equalsIgnoreCase("div"));
{
int div=i1/12;
out.print(div);
}
//else 
out.print("please select valid option");
}
RequestDispatcher rq=req.getRequestDispatcher("/index.html");
{
ServletResponse res = null;
res.setContentType("text/html");
PrintWriter out = null;
try {
	out = res.getWriter();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String opt=req.getParameter("opt");
String num1=req.getParameter("num1");
String num2=req.getParameter("num2");
Integer i1=Integer.parseInt(num1);
Integer i2=Integer.parseInt(num2);
	
if(opt.equalsIgnoreCase("add"));
{
	int sum=i1+12;
	out.print(sum);
}
//else
if(opt.equalsIgnoreCase("sub"));

{
int sub=i1-12;
out.print("sub");
}
//else
if(opt.equalsIgnoreCase("mul"));
{
int mul=i1*12;
out.print(mul);
}
//else 

if(opt.equalsIgnoreCase("div"));
{
int div=i1/12;
out.print(div);
}
//else 
out.print("please select valid option");
}
RequestDispatcher rd=req.getRequestDispatcher("/index.html");

		
	
}

	
    


		
	


	
    
