package br.com.rafael_Carsoft.dao;

import br.com.rafael_Carsoft.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDao {

    public void createCar(Car car) {
        String sql = "INSERT INTO CAR (NAME) VALUES (?)";

        try {
            Connection con = DriverManager.getConnection("jdbc:h2:~/test");
            System.out.println("Success in ConnectioN!");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, car.getName());
            ps.execute();
            con.close();

        } catch (Exception e) {
            System.out.println("Fail in Connection!");
        }
    }
}