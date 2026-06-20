


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/check-age"})
public class AgeCheckServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ageParam = request.getParameter("age");
        PrintWriter out = response.getWriter();
        if (ageParam != null && !ageParam.trim().isEmpty()) {
            try {
                int age = Integer.parseInt(ageParam);
                if (age >= 18) {
                    out.println("<h3>Вы совершеннолетний (18+).</h3>");
                } else if (age < 0) {
                    out.println("<h3>Ошибка: возраст не может быть отрицательным!</h3>");
                } else {
                    out.println("<h3>Вы несовершеннолетний.</h3>");
                }
            } catch (NumberFormatException var6) {
                out.println("<h3>Ошибка: введите корректное числовое значение для возраста!</h3>");
            }

        } else {
            out.println("<h3>Ошибка: параметр 'age' не передан!</h3>");
        }
    }
}
