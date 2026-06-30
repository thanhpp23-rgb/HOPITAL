/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.DoctorService;
import model.Doctor;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/doctor")
public class DoctorController extends HttpServlet {

    private DoctorService service = new DoctorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            req.setAttribute("list", service.getAll());

            req.getRequestDispatcher("/WEB-INF/views/doctor/list.jsp")
                    .forward(req, resp);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Doctor d = new Doctor();

        d.setDoctorId(req.getParameter("doctorId"));
        d.setFullName(req.getParameter("fullName"));
        d.setSpecialty(req.getParameter("specialty"));
        d.setEmail(req.getParameter("email"));
        d.setPhone(req.getParameter("phone"));

        service.add(d);

        resp.sendRedirect("doctor");
    }
}
