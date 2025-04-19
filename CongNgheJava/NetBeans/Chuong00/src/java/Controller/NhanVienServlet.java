/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import Model.NhanVien;
import Model.NhanVienDAO;
import com.google.gson.Gson;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.List;

/**
 *
 * @author sonpt
 */
@WebServlet(name = "NhanVienServlet", urlPatterns = {"/api/ds_nhanvien"})
public class NhanVienServlet extends HttpServlet {

    private final Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        try {
            List<NhanVien> list = new NhanVienDAO().getAll(); // new đối tượng, lấy đối tượng gọi getAll sau đó gán cho list
            response.getWriter().write(gson.toJson(list));
            System.out.println("Test: doGet: Done");
        
        } catch (Exception e) {
            response.setStatus(500);
            response.getWriter().write("{\"error\":\"" + e.getMessage() + "\"}");
            System.out.println("Test: doGet: Fail");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) throws IOException {
        
        try (BufferedReader reader = request.getReader()) {
            NhanVien nv = gson.fromJson(reader, NhanVien.class);
            new NhanVienDAO().add(nv);
            response.setContentType("application/json");
            response.getWriter().write("{\"status\":\"success\"}");
        
        } catch (Exception e) {
            response.setStatus(500);
            response.getWriter().write("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

}
