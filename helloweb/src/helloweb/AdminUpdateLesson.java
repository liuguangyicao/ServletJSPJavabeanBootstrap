package helloweb;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Lesson;
import dao.StudentDao;

/**
 * Servlet implementation class AdminClass
 */
@WebServlet("/AdminUpdateLesson")
public class AdminUpdateLesson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdateLesson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		StudentDao studentdao = new StudentDao();
		List<Lesson> lesson = studentdao.adminQueryLesson();
		request.setAttribute("lesson", lesson);
		RequestDispatcher rd = request.getRequestDispatcher("/adminlesson.jsp");
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		StudentDao studentdao = new StudentDao();
		Lesson lesson = new Lesson();
		lesson.setClass_term(request.getParameter("class_term"));
		lesson.setClass_name(request.getParameter("class_name"));
		lesson.setClass_major(request.getParameter("class_major"));
		studentdao.adminUpdateLesson(lesson);
		List<Lesson> lesson2 = studentdao.adminQueryLesson();
		request.setAttribute("lesson", lesson2);
		RequestDispatcher rd = request.getRequestDispatcher("/adminlesson.jsp");
		rd.forward(request,response);
		
	}

}
