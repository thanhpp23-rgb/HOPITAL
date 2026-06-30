/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import repository.AppointmentRepository;

public class AppointmentService {

    private AppointmentRepository repo = new AppointmentRepository();

    // BOOK APPOINTMENT (business rules inside repository)
    public void book(String patientId, String serviceCode, String date) throws Exception {
        repo.book(patientId, serviceCode, date);
    }
}
