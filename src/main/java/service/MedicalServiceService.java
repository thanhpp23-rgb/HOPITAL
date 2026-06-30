/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.MedicalService;
import repository.MedicalServiceRepository;

import java.util.List;

public class MedicalServiceService {

    private MedicalServiceRepository repo = new MedicalServiceRepository();

    // GET ALL
    public List<MedicalService> getAll() {
        return repo.findAll();
    }

    // INSERT
    public void add(MedicalService s) {
        repo.insert(s);
    }

    // SEARCH
    public List<MedicalService> search(String keyword) {
        return repo.search(keyword);
    }
}
