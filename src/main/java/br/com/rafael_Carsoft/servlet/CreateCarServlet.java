package br.com.rafael_Carsoft.servlet;

import br.com.rafael_Carsoft.dao.CarDao;
import br.com.rafael_Carsoft.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String carName = req.getParameter("car-name");

        Car car = new Car();
        System.out.println(carName);

        new CarDao().createCar(car);

        req.getRequestDispatcher("index.html").forward(req, resp);
    }
}