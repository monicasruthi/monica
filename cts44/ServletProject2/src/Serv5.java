import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/Serv5")
public class Serv5 extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv5() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
//response.getWriter().append("Served at: ").append(request.getContextPath());
//String name=request.getParameter("name");
//String department=request.getParameter("department");
//String designation=request.getParameter("designation");
ServletContext ctx=this.getServletContext();
RequestDispatcher rd=ctx.getRequestDispatcher("/Serv6");
 String mobile="7043234578";
 String emailid="niobuvgfy@gmail.com";
//request.setAttribute("name", name);
//request.setAttribute("department", department);;
//request.setAttribute("designation", designation);
request.setAttribute("mobile", mobile);
request.setAttribute("emailid",emailid);
rd.forward(request, response);


}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}