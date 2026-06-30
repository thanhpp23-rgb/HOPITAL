/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author ADMIN
 */
import model.Patient;
import utils.DBContext;

import java.sql.*;
import java.util.*;

public class PatientRepository {

    public List<Patient> findAll() throws Exception {
        List<Patient> list = new ArrayList<>();
        String sql = "SELECT * FROM patients";

        Connection con = DBContext.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Patient p = new Patient();
            p.setPatientId(rs.getString(1));
            p.setFullName(rs.getString(2));
            list.add(p);
        }
        return list;
    }

    public void insert(Patient p) {

        String sql = "INSERT INTO patients VALUES (?,?,?,?,?)";

        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getPatientId());
            ps.setString(2, p.getFullName());
            ps.setDate(3, p.getDob());
            ps.setString(4, p.getEmail());
            ps.setString(5, p.getPhone());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
