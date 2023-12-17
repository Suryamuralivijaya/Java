import java.io.*;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Servletinterface
 */
public class Servletinterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletinterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config){ //initializes the servlet
		this.config=config;
		System.out.println("servlet is initialized");		
		// TODO Auto-generated method stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); // want the response in HTML format
		PrintWriter out=response.getWriter(); //using get writer write the response in out
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");
	}
	public void destroy() {
		System.out.println("servlet is destroyed");}
	public ServletConfig getServletConfig(){return config;}
	public String getServletInfo(){return "copyright 2007-1010";}

		// TODO Auto-generated method stub
	}

