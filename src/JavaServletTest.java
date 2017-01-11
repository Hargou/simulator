import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Created by PaloAlto on 1/11/2017.
 */

public class JavaServletTest extends HttpServlet {
        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws IOException, ServletException {
            // Set the response message's MIME type.
            response.setContentType("text/html;charset=UTF-8");

            // Use a ResourceBundle for localized string in "LocalStrings_xx.properties" for i18n.
            // The request.getLocale() sets the locale based on the "Accept-Language" request header.
            ResourceBundle rb = ResourceBundle.getBundle("LocalStrings", request.getLocale());
            // To test other locales.
            //ResourceBundle rb = ResourceBundle.getBundle("LocalStrings", new Locale("fr"));

            // Write the response message, in an HTML document.
            try {
                System.out.println("<!DOCTYPE html>");  // HTML 5
                System.out.println("<html><head>");
                System.out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
                String title = rb.getString("helloworld.title");
                System.out.println("<title>" + title + "</title></head>");
                System.out.println("<body>");
                System.out.println("<h1>" + title + "</h1>");  // Prints "Hello, world!"
                // Set a hyperlink image to refresh this page
                System.out.println("<a href='" + request.getRequestURI() + "'><img src='images/return.gif'></a>");
                System.out.println("</body></html>");
            } finally {
                System.out.close();  // Always close the output writer
            }
        }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        doGet(request, response);
    }
    }
