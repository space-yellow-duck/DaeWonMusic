package com.DaewonMusic.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/app/*")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String,Controller> controllerMap = new HashMap<>();
	
    public MainController() {
    	controllerMap.put("/app/joinpage", new JoinPageController());
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
