package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.GenericServlet;

@WebServlet("/fs")  // This matches the form's action
public class EmployeeServlet extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		// Set content type
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		// Retrieve form parameters
		String empName = req.getParameter("empname");
		String empEmail = req.getParameter("empemail");
		String department = req.getParameter("department");
		String salary = req.getParameter("salary");

		// Build the response
		pw.println("<html><head><title>Employee Info</title></head>");
		pw.println("<body style='font-family: Arial; text-align:center;'>");
		pw.println("<h2>Employee Details Submitted</h2>");
		pw.println("<p><strong>Name:</strong> " + empName + "</p>");
		pw.println("<p><strong>Email:</strong> " + empEmail + "</p>");
		pw.println("<p><strong>Department:</strong> " + department + "</p>");
		pw.println("<p><strong>Salary:</strong> " + salary + "</p>");
		pw.println("</body></html>");
	}
}
