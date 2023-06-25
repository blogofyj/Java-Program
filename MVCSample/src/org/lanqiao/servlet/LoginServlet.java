package org.lanqiao.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lanqiao.dao.LoginDao;
import org.lanqiao.entity.Login;


//控制器层：接受view请求， 并分发给modul处理
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理登录
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("uname");
		String pwd = request.getParameter("upwd");
		
		Login login = new Login(name, pwd);
		
		//调用模型层的 登录功能
		int result = LoginDao.login(login);
		if(result > 0) {
			response.sendRedirect("welcome.jsp");
			
			
		}else if(result == 0) {
			
		}else {//登录失败
			response.sendRedirect("login.jsp");
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
