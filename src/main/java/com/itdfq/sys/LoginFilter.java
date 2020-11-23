package com.itdfq.sys;

import com.itdfq.houtai.model.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// @WebFilter(urlPatterns= {"*.jsp"})
public class LoginFilter extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("1111111111");
		
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		
		
		if ("/login.jsp".equals(url)) {
			chain.doFilter(request, response);
			return;
		}

		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {			
			PrintWriter out = response.getWriter();
			out.print("<script type='text/javascript'>window.parent.location.href='"+contextPath+"/login.jsp';</script>");
			return;
		}
		
		if( !user.getRole().equals("����Ա") && url.contains("admin")) {
			throw new RuntimeException("û�й���ԱȨ�ޣ�");			
		}
				
		chain.doFilter(request, response);
	}
}
