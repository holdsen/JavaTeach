import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/washington"})
public class XmlTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime now = ZonedDateTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedTime = now.format(formatter);

        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>Текущее время в городе: Вашингтон</h1>");
            out.println("<p style='font-size: 24px; color: blue;'><b>" + formattedTime + "</b></p>");
            out.println("<br><a href='minsk'>В Минск</a> | <a href='beijing'>В Пекин</a>");
            out.println("</body></html>");
        }

    }
}