package rosinnii.code;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet that generates an HTML table with employees data.
 * <p>
 * This servlet handles GET requests and displays a page
 * containing a list of employees retrieved from {@link EmployeeList}.
 * </p>
 *
 * @author Osinnii Roman
 * @group KN223L
 * @version 1.0
 * @since 2026-02-18
 */
@WebServlet("/maketable")
public class MakeTableServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello, Page With Table!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Greeting
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet MakeTableServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");

        // Button for return to HomePage
        out.println("<a href=\".\">Back</a> <br /> <br />");

        // Employees table from EmployeeList
        out.println("<table border='1' cellpadding='5' cellspacing='0'>");
        out.println("<tr><th>ID</th><th>Name</th><th>Birthday</th><th>Gender</th><th>Salary</th><th>Language</th></tr>");
        EmployeeList employees = EmployeeList.getInstance();
        for (Employee emp : employees) {
            out.println("<tr>"
                    + "<td>" + emp.getId() + "</td>"
                    + "<td>" + emp.getName() + "</td>"
                    + "<td>" + emp.getBirthdayAsString() + "</td>"
                    + "<td>" + emp.getGenderAsString() + "</td>"
                    + "<td>" + emp.getSalaryCurrencyAsString() + "</td>"
                    + "<td>" + emp.getProgramLanguageAsString() + "</td>"
                    + "</tr>");
        }
        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}
