package soap;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serve")
public class ServeTxtFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServeTxtFile() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * serves a file from the text directory
		 * the getParameter is file
		 * ie. "?file=somefile.txt"
		 */
		String filename = request.getParameter("file");
		RequestDispatcher view = request.getRequestDispatcher("text/"+filename);
		response.setCharacterEncoding("UTF-8");
		view.forward(request, response);
	}
}
