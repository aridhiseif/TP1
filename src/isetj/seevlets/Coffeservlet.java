package isetj.seevlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Coffeservlet
 */
@WebServlet("/Coffeservlet")
public class Coffeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Coffeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String typeremarque = request.getParameter("n0");
		String texteremarque = request.getParameter("n1");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>Coffee shop</title>");
		out.println("<body><img alt='' src='download.jfif'>");
		out.println("<p><i>merci de nous avoir fait parvenir la remarque :</i></p>");
		out.println("<b>"+typeremarque+"</b><br>");
		out.println("<b>"+texteremarque+"</b><br>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
