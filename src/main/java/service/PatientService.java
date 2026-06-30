/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Patient;
import repository.PatientRepository;

import java.util.List;

public class PatientService {

    private PatientRepository repo = new PatientRepository();

    public List<Patient> getAll() throws Exception {
        return repo.findAll();
    }

    public void add(Patient p) {
        try {
            repo.insert(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
