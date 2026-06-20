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

@WebServlet(
        name = "AnnotationTimeServlet",
        urlPatterns = {"/minsk", "/beijing"}
)
public class AnnotationTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userPath = request.getRequestURI();
        String cityName = "";
        ZoneId zoneId = null;
        if (userPath.endsWith("/minsk")) {
            cityName = "Минск";
            zoneId = ZoneId.of("Europe/Minsk");
        } else if (userPath.endsWith("/beijing")) {
            cityName = "Пекин";
            zoneId = ZoneId.of("Asia/Shanghai");
        }

        ZonedDateTime now = ZonedDateTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedTime = now.format(formatter);

        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>Текущее время в городе: " + cityName + "</h1>");
            out.println("<p style='font-size: 24px; color: green;'><b>" + formattedTime + "</b></p>");
            out.println("<br><a href='washington'>Посмотреть время в Вашингтоне</a>");
            out.println("</body></html>");
        }

    }
}
