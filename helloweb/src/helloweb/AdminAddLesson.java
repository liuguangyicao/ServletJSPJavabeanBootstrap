package helloweb;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Lesson;
import dao.StudentDao;

/**
 * Servlet implementation class AdminAddClass
 */
@WebServlet("/AdminAddLesson")
public class AdminAddLesson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminAddLesson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		studentdao.adminAddLesson(lesson);
		List<Lesson> lesson2 = studentdao.adminQueryLesson();
		request.setAttribute("lesson", lesson2);
		RequestDispatcher rd = request.getRequestDispatcher("/adminlesson.jsp");
		rd.forward(request,response);
	}

}
