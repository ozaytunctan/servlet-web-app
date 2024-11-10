package com.otunctan.webapp._11.expLanguage;

import com.otunctan.webapp.model.Department;
import com.otunctan.webapp.model.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Expression Language Example.
 *
 * @author otunctan
 */
@WebServlet(value = "/exp-language")
public class ExpressionLanguage extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Employee employee = new Employee();
        employee.setFirstName("Özay");
        employee.setLastName("TUNÇTAN");
        employee.setAge(30);

        Department department = new Department();
        department.setId(1);
        department.setName("SOFTWARE");
        department.setCode("001");
        employee.setDepartment(department);

        request.setAttribute("employee", employee);

        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/pages/employee/employee.jsp");
        dispatcher.forward(request, response);

    }
}
