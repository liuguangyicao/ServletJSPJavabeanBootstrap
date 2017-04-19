package helloweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.Grade;
import bean.Lesson;
import dao.StudentDao;
import java.util.*;
/**
 * Servlet implementation class AdminQueryClass
 */
@WebServlet("/AdminDeleteGrade")
public class AdminDeleteGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDeleteGrade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(session == null || !((String)session.getAttribute("username")).equals("admin")) {
			response.sendRedirect("login.jsp");
			return;
		} 
		response.sendRedirect("admingrade.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		StudentDao studentdao = new StudentDao();
		Lesson lesson = new Lesson();
		lesson.setClass_name(request.getParameter("class_name"));
		lesson.setClass_term(request.getParameter("class_term"));
		lesson.setClass_major(request.getParameter("class_major"));
		String student_class_id = studentdao.adminQueryLesson(lesson);
		if(student_class_id.equals("")) {
			
		} else {
			studentdao.adminDeleteGrade(student_class_id, request.getParameter("student_id"), request.getParameter("class_score"));
		}
		RequestDispatcher rd = request.getRequestDispatcher("/admingrade.jsp");
		rd.forward(request,response);
	}

}
