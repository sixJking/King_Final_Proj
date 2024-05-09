package com.example:demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SubmitCommissionServlet", urlPatterns = {"/submitCommission"})
public class SubmitCommissionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // Get form data
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String description = req.getParameter("description");

        // Database connection string
        String jdbcUrl = "jdbc:mysql://localhost:3306/submitcommission";
        String jdbcUser = "user";
        String jdbcPass = "test";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPass)) {
            String sql = "INSERT INTO commissions (name, email, description) VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, description);
            pstmt.executeUpdate();

            int result = statement.executeUpdate();

            if (result > 0) {
                response.sendRedirect("thankYouPage.html");
            } else {
                response.getWriter().println("Error: Unable to submit commission.");
            }

            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new ServletException("DB Connection error", e);
    }
}