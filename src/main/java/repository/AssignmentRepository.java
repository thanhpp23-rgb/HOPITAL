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

public class AssignmentRepository {

    public void assign(String serviceCode, String doctorId) throws Exception {

        String checkService = "SELECT * FROM medical_services WHERE service_code=?";
        Connection con = DBContext.getConnection();
        PreparedStatement ps1 = con.prepareStatement(checkService);
        ps1.setString(1, serviceCode);

        if (!ps1.executeQuery().next()) {
            throw new Exception("Service not found");
        }

        String sql = "INSERT INTO assignments VALUES (?,?,NOW())";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, serviceCode);
        ps.setString(2, doctorId);

        ps.executeUpdate();
    }
}
