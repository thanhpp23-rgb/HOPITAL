/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author ADMIN
 */
import utils.DBContext;
import java.sql.*;

public class AppointmentRepository {

    public boolean isDuplicate(String patientId, String serviceCode, String date) throws Exception {

        String sql = "SELECT * FROM appointments WHERE patient_id=? AND service_code=? AND appointment_date=?";
        Connection con = DBContext.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, patientId);
        ps.setString(2, serviceCode);
        ps.setString(3, date);

        return ps.executeQuery().next();
    }

    public void book(String patientId, String serviceCode, String date) throws Exception {

        String check = "SELECT status FROM medical_services WHERE service_code=?";
        Connection con = DBContext.getConnection();
        PreparedStatement ps = con.prepareStatement(check);
        ps.setString(1, serviceCode);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (!rs.getString(1).equals("Available")) {
                throw new Exception("Service not available");
            }
        }

        if (isDuplicate(patientId, serviceCode, date)) {
            throw new Exception("Duplicate appointment");
        }

        String sql = "INSERT INTO appointments VALUES (NULL,?,?,?,?)";
        PreparedStatement ps2 = con.prepareStatement(sql);

        ps2.setString(1, patientId);
        ps2.setString(2, serviceCode);
        ps2.setString(3, date);
        ps2.setString(4, "Pending");

        ps2.executeUpdate();
    }
}
