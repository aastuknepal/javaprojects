package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

public class servletDemo extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpResponse res)
        throws ServletException, IOException{
        RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
        dispatcher.forward(req, res);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException{
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        System.out.println("username " + username);
        System.out.println("password " + password);
        
        // login logic 
        
        PrintWriter writer = res.getWriter();
        writer.print("login successful");
        writer.close();
    }
}


<html>
    <form action="login" method="POST">
        Username: <input type = "text" name = "username"/><br>
        Password: <input type = "password" name = "password"/> <br>
        <input type = "submit"/>
    </form>
</html>
