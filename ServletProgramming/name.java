//Write a servlet program to print your Name

import java.io.*;
import javax.servlet.http.*;


public class Hello extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("Gaurav Shrestha");
    }
}
