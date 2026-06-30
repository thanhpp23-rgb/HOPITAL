/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author ADMIN
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String format(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }
}
