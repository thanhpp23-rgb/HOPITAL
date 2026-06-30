/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.MedicalServiceService;
import model.MedicalService;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/medicalservice")
public class MedicalServiceController extends HttpServlet {

    private MedicalServiceService service = new MedicalServiceService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            req.setAttribute("list", service.getAll());

            req.getRequestDispatcher("/WEB-INF/views/medicalservice/list.jsp")
                    .forward(req, resp);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        MedicalService s = new MedicalService();

        s.setServiceCode(req.getParameter("serviceCode"));
        s.setServiceName(req.getParameter("serviceName"));
        s.setCategory(req.getParameter("category"));
        s.setDescription(req.getParameter("description"));
        s.setFee(Double.parseDouble(req.getParameter("fee")));
        s.setDuration(Integer.parseInt(req.getParameter("duration")));
        s.setStatus(req.getParameter("status"));

        service.add(s);

        resp.sendRedirect("medicalservice");
    }
}
