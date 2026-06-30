/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import repository.AssignmentRepository;

public class AssignmentService {

    private AssignmentRepository repo = new AssignmentRepository();

    // BUSINESS RULE: assign doctor to service
    public void assign(String serviceCode, String doctorId) throws Exception {
        repo.assign(serviceCode, doctorId);
    }
}
