import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BiographyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the name of the person from the query parameter
        String name = request.getParameter("name");
        
        // For simplicity, let's assume the biography is hardcoded for each person
        String biography = "";
        if (name != null) {
            biography = switch (name) {
                case "Mahendra Singh Dhoni" -> "Mahendra Singh Dhoni, commonly known as MS Dhoni, is a former Indian cricketer and captain of the Indian national cricket team.";
                case "Kamal Hassan" -> "Kamal Haasan is an Indian actor, dancer, film director, screenwriter, producer, playback singer, lyricist, and politician.";
                case "AR Rahman" -> "AR Rahman is an Indian composer, singer, and music producer who has won numerous awards for his music, including two Academy Awards, two Grammy Awards, a BAFTA Award, a Golden Globe, and four National Film Awards.";
                case "Virat Kohli" -> "Virat Kohli is an Indian cricketer and former captain of the Indian national cricket team. He is considered one of the best batsmen in the world.";
                default -> "Biography not available.";
            };
        } else {
            biography = "Biography not available.";
        }
        
        // Set the biography as a request attribute
        request.setAttribute("biography", biography);
        
        // Forward the request to the biography.jsp page
        request.getRequestDispatcher("biography.jsp").forward(request, response);
    }
}
