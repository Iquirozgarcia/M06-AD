package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String id;
        String desc;
        int num;
        Date date;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection
                ("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11528292", "sql11528292", "cdSVDBfDWn");
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("SELECT ID, DESCR, NUM, DATE FROM M6_TABLA2");
        while (rs.next()){
            id = rs.getString("ID");
            desc = rs.getString("DESCR");
            num = rs.getInt("NUM");
            date = rs.getDate("DATE");

            System.out.println("ID: " + id);
            System.out.println("Desc: " + desc);
            System.out.println("Num: " + num);
            if (date != null)
                System.out.println("Date: " + date.toString());

        }

        PreparedStatement prstmt = conn.prepareStatement("INSERT INTO M6_TABLA2 (DESCR, NUM, DATE) VALUES (?,?,?)");
        prstmt.setString(1,"Segundo Insert");
        prstmt.setInt(2, 2);
        prstmt.setDate(3, Date.valueOf("2022-02-13"));
        prstmt.execute();
        rs.close();
        stat.close();
        conn.close();


    }
}