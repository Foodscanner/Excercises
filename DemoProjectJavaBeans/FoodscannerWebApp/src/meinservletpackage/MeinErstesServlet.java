package meinservletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MeinErstesServlet
 */
@WebServlet({ "/MeinErstesServlet", "/HalloServlet" })
public class MeinErstesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MeinErstesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    public void doGet( HttpServletRequest requ, HttpServletResponse resp )
    throws ServletException, IOException
    {
       resp.setContentType( "text/html" );
       PrintWriter out = resp.getWriter();
       out.println( "<html>" );
       out.println( "<h3> Hallo, mein erstes Servlet meldet sich </h3>" );
       out.println( "<a href='/MeineWebAppRoot/'>zur&uuml;ck</a>" );
       out.println( "</html>" );
       out.close();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
