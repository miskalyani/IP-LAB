import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ConvertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve temperature in Celsius from the form
        String celsiusString = request.getParameter("celsius");
        
        if (celsiusString != null && !celsiusString.isEmpty()) {
            try {
                // Convert Celsius to Fahrenheit
                double celsius = Double.parseDouble(celsiusString);
                double fahrenheit = (celsius * 9 / 5) + 32;
                
                // Set the converted temperature in the request attribute
                request.setAttribute("result", fahrenheit);
                request.getRequestDispatcher("result.jsp").forward(request, response);
            } catch (NumberFormatException e) {
                // If invalid input is provided
                request.setAttribute("error", "Invalid input. Please enter a valid temperature.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } else {
            // If no input is provided
            request.setAttribute("error", "Please enter a temperature.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
