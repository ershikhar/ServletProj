
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            int user=Integer.parseInt(request.getParameter("user"));
            out.println("<h2> Welcome "+(1+user)+"</h2>");
        } finally {            
            out.close();
        }
    }
}