//GenericServlet Class:
//implements Servlet, ServletConfig and Serializable interfaces.
//It provides the implementation of all the methods of these interfaces except the service method.
//GenericServlet class can handle any type of request so it is protocol-independent.
//You may create a generic servlet by inheriting the GenericServlet class and providing 
//the implementation of the service method.

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class GenericServlet
 */
public class GenericServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenericServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<b>Poda dei </b>");
		out.print("</body></html>");

	}

}
