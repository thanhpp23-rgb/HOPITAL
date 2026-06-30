/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author ADMIN
 */
import model.MedicalService;
import utils.DBContext;

import java.sql.*;
import java.util.*;

public class MedicalServiceRepository {

    public List<MedicalService> findAll() {
        List<MedicalService> list = new ArrayList<>();

        String sql = "SELECT * FROM medical_services";

        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                MedicalService s = new MedicalService();

                s.setServiceCode(rs.getString("service_code"));
                s.setServiceName(rs.getString("service_name"));
                s.setCategory(rs.getString("category"));
                s.setDescription(rs.getString("description"));
                s.setFee(rs.getDouble("fee"));
                s.setDuration(rs.getInt("duration"));
                s.setStatus(rs.getString("status"));

                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void insert(MedicalService s) {

        String sql = "INSERT INTO medical_services VALUES (?,?,?,?,?,?,?)";

        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getServiceCode());
            ps.setString(2, s.getServiceName());
            ps.setString(3, s.getCategory());
            ps.setString(4, s.getDescription());
            ps.setDouble(5, s.getFee());
            ps.setInt(6, s.getDuration());
            ps.setString(7, s.getStatus());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<MedicalService> search(String keyword) {

        List<MedicalService> list = new ArrayList<>();

        String sql = "SELECT * FROM medical_services WHERE service_code LIKE ? OR service_name LIKE ?";

        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                MedicalService s = new MedicalService();

                s.setServiceCode(rs.getString("service_code"));
                s.setServiceName(rs.getString("service_name"));
                s.setCategory(rs.getString("category"));
                s.setDescription(rs.getString("description"));
                s.setFee(rs.getDouble("fee"));
                s.setDuration(rs.getInt("duration"));
                s.setStatus(rs.getString("status"));

                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
