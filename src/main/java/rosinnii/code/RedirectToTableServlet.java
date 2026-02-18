package rosinnii.code;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Servlet that redirect user to table.html.
 * @author Osinnii Roman
 * @group KN223L
 * @version 1.0
 * @since 2026-02-18
 */
@WebServlet("/redirect-table")
public class RedirectToTableServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String path = request.getContextPath() + "/table.html";
        response.sendRedirect(path);
    }
}
