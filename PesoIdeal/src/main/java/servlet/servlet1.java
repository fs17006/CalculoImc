/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fer
 */
public class servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
            PrintWriter out=response.getWriter();
            
            String nombre,sexo;
            double peso=0.0,altura=0.0,imc;
            int edad=0;
            
            sexo=request.getParameter("sexo");
            nombre=request.getParameter("nombre");
            peso=Double.parseDouble(request.getParameter("peso"));
            altura=Double.parseDouble(request.getParameter("altura"));
            edad=Integer.parseInt(request.getParameter("edad"));
            
            imc=(peso/2.2)/Math.pow(altura, 2);
           // String datos;
           String salida="";
           if(sexo.equals("femenino")){
                if(imc>18.5&&imc<25){
                    salida=""+nombre+" usted esta en el rango optimo"
                            + "\nimc:"+imc
                            +"\nedad:"+edad
                            + "\naltura:"+altura
                            +"\npeso:"+peso;
                }else if(imc>1&&imc<=18.5){
                    salida=nombre+"usted esta en el rango malo"
                            + "\nimc:"+imc
                            +"\nedad:"+edad
                            + "\naltura:"+altura
                            +"\npeso:"+peso
                            +"aumente su indice en la mujer son recomendados por centajes mas altos";
                }else if(imc>=25){
                    salida=nombre+"usted tiene sobrepeso"
                            + "\nimc:"+imc
                            +"\nedad:"+edad
                            + "\naltura:"+altura
                            +"\npeso:"+peso
                            +"\nUsted debe bajar de peso";
                }
            }else if(sexo.equals("masculino")){
                if(imc>10&&imc<25){
                    salida=nombre+"usted esta en el rango optimo"
                            + "\nimc:"+imc
                            +"\nedad:"+edad
                            + "\naltura:"+altura
                            +"\npeso:"+peso;
                }else if(imc>1&&imc<=10){
                    salida=nombre+"usted esta en el rango malo"
                            + "\nimc:"+imc
                            +"\nedad:"+edad
                            + "\naltura:"+altura
                            +"\npeso:"+peso
                            +"\naumente su indice en el hombre son bajos pero no tanto son recomendados por centajes mas altos";
                }else if(imc>=25){
                    salida=nombre+"usted tiene sobrepeso"
                            + "\nimc:"+imc
                            +"\nedad:"+edad
                            + "\naltura:"+altura
                            +"\npeso:"+peso
                            +"\nUsted debe bajar de peso";
                }
                
            }
            
            request.setAttribute("formPeso",salida);
            
            getServletContext().getRequestDispatcher("/datos.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
