/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.PatientService;
import model.Patient;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Date;

@WebServlet("/patient")
public class PatientController extends HttpServlet {

    private PatientService service = new PatientService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            req.setAttribute("list", service.getAll());

            req.getRequestDispatcher("/WEB-INF/views/patient/list.jsp")
                    .forward(req, resp);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Patient p = new Patient();

        p.setPatientId(req.getParameter("patientId"));
        p.setFullName(req.getParameter("fullName"));
        p.setDob(Date.valueOf(req.getParameter("dob")));
        p.setEmail(req.getParameter("email"));
        p.setPhone(req.getParameter("phone"));

        service.add(p);

        resp.sendRedirect("patient");
    }
}
