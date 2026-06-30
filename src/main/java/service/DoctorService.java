/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Doctor;
import repository.DoctorRepository;

import java.util.List;

public class DoctorService {

    private DoctorRepository repo = new DoctorRepository();

    // GET ALL
    public List<Doctor> getAll() throws Exception {
        return repo.findAll();
    }

    // ADD DOCTOR
    public void add(Doctor d) {
        try {
            repo.insert(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
