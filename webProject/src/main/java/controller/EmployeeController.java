package controller;

import model.dao.EmployeeDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/index.jsp";
    private EmployeeDAO dao;

    public EmployeeController() {
        super();
        dao = new EmployeeDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] employee = new String[5];
        employee[0] = (request.getParameter("name"));
        employee[1] = (request.getParameter("cpf"));
        employee[2] = (request.getParameter("tel"));
        employee[3] = (request.getParameter("address"));
        employee[4] = (request.getParameter("email"));
        
        dao.insert(employee);
    }
}