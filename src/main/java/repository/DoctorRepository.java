/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author ADMIN
 */
import model.Doctor;
import utils.DBContext;

import java.sql.*;
import java.util.*;

public class DoctorRepository {

    public List<Doctor> findAll() throws Exception {
        List<Doctor> list = new ArrayList<>();
        String sql = "SELECT * FROM doctors";

        Connection con = DBContext.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Doctor d = new Doctor();
            d.setDoctorId(rs.getString(1));
            d.setFullName(rs.getString(2));
            list.add(d);
        }
        return list;
    }

    public void insert(Doctor d) throws Exception {
        String sql = "INSERT INTO doctors VALUES (?,?,?,?,?)";
        Connection con = DBContext.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, d.getDoctorId());
        ps.setString(2, d.getFullName());
        ps.setString(3, d.getSpecialty());
        ps.setString(4, d.getEmail());
        ps.setString(5, d.getPhone());

        ps.executeUpdate();
    }
}
