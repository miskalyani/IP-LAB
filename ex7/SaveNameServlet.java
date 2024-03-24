
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SaveNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user's name from the form
        String name = request.getParameter("name");
        
        // Create or retrieve session
        HttpSession session = request.getSession();
        
        // Store user's name in session
        session.setAttribute("username", name);
        
        // Redirect user to the display page
        response.sendRedirect("display.jsp");
    }
}
