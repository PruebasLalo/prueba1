package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    
        throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            String nombre = request.getParameter ("nombre");
            String appaterno = request.getParameter ("appaterno");
            String apmaterno = request.getParameter ("apmaterno");
            String direccion = request.getParameter ("direccion");
            String edad = request.getParameter ("edad");
            String sexo = request.getParameter ("sexo");
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Mi nombre es: "+nombre+" "+appaterno+" "+apmaterno);
            out.println("<br>");
            out.println("Tengo "+edad+" años");
            out.println("<br>");
            out.println("Vivo en: "+direccion);
            out.println("<br>");
            out.println("Soy: "+sexo);
            out.println("<br>");
            out.println("</body>");
            out.println("</html>");
        }
}